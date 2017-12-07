import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Coder04122017 implements ActionListener{

    JTextField jtfPlaintext;
    JTextField jftCifertext;

    Coder04122017() {
        JFrame jfrm = new JFrame("A simple code machine");
        jfrm.getContentPane().setLayout(new FlowLayout());
        jfrm.setSize(340,120);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jlabPlaintext = new JLabel("Plain text: ");
        JLabel jlabCifertext = new JLabel("Cipher text: ");
        jtfPlaintext = new JTextField(20);
        jftCifertext = new JTextField(20);

        jtfPlaintext.setActionCommand("Encode");
        jftCifertext.setActionCommand("Decode");

        jtfPlaintext.addActionListener(this);
        jftCifertext.addActionListener(this);

        jfrm.add(jlabPlaintext);
        jfrm.add(jtfPlaintext);
        jfrm.add(jlabCifertext);
        jfrm.add(jftCifertext);

        JButton jbtnEncode = new JButton("Encode");
        JButton jbtnDecode = new JButton("Decode");
        JButton jbtnReset = new JButton("Reset");

        jbtnEncode.addActionListener(this);
        jbtnDecode.addActionListener(this);
        jbtnReset.addActionListener(this);

        jfrm.getContentPane().add(jbtnEncode);
        jfrm.getContentPane().add(jbtnDecode);
        jfrm.getContentPane().add(jbtnReset);

        jfrm.setVisible(true);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Encode")) {
            StringBuilder str = new StringBuilder(jtfPlaintext.getText());
            for (int i = 0; i <str.length(); i++) {
                str.setCharAt(i,(char) (str.charAt(i)+1));
            }
            jftCifertext.setText(str.toString());
        } else if (e.getActionCommand().equals("Decode")) {
            StringBuilder str = new StringBuilder(jftCifertext.getText());
            for (int i = 0; i < str.length(); i++) {
                str.setCharAt(i, (char) (str.charAt(i)-1));
            }
            jtfPlaintext.setText(str.toString());
        } else {
            jtfPlaintext.setText("");
            jftCifertext.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Coder04122017();
            }
        });
    }
}
