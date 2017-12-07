import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

class StopWatch implements ActionListener {

    JLabel jlab;
    long start; // holds the start time in milliseconds
    JButton jbtnStartStop; // a start or stop button
    JButton jbtnStop;

    StopWatch() {

        // Create a new JFrame container.
        JFrame jfrm = new JFrame("A Simple Stopwatch");

        // Specify FlowLayout for the layout manager.
        jfrm.getContentPane().setLayout(new FlowLayout());

        // Give the frame an initial size.
        jfrm.setSize(230, 90);

        // Terminate the program when the user closes the application.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make one button.
        jbtnStartStop = new JButton("Start");
        jbtnStop = new JButton("Stop");

        // Add action listeners.
        jbtnStartStop.addActionListener(this);
        jbtnStop.addActionListener(this);

        // Add the buttons to the content pane.
        jfrm.getContentPane().add(jbtnStartStop);
        jfrm.getContentPane().add(jbtnStartStop);

        // Create a text-based label.
        jlab = new JLabel("Press Start to begin timing.");

        // Add the label to the frame.
        jfrm.getContentPane().add(jlab);

        // Display the frame.
        jfrm.setVisible(true);
    }

    // Handle button events.
    public void actionPerformed(ActionEvent ae) {
        Calendar cal = Calendar.getInstance(); // get the current system time

        if(ae.getActionCommand().equals("Start")) {
            // Store start time.
            start = cal.getTimeInMillis();
            jlab.setText("Stopwatch is Running...");
            jbtnStartStop.setText("Stop");
        }
        else {
            // Compute the elapsed time.
            jlab.setText("Elapsed time is "
                    + (double) (cal.getTimeInMillis() - start)/1000);
            jbtnStartStop.setText("Start");
        }
    }

    public static void main(String args[]) {

        // Create the frame on the event dispatching thread.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new StopWatch();
            }
        });
    }

}