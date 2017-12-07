import javax.swing.*;
import java.util.Scanner;

public class Work24Sqrt_2 {
    public static void main(String[] args) {

        Scanner line = new Scanner(System.in); //не работает всплывающее окно, если использовать сканнер
        int a,b,c;
        a = 2;
        b = 15;
        c = 3;

//        System.out.println("Введите число a");
//        a = line.nextInt();
//        System.out.println("Введите число b");
//        b = line.nextInt();
//        System.out.println("Введите число с");
//        c = line.nextInt();

        System.out.println("Дескриминант имеет вид:" + "\nD = " + b + "^2" + " - 4 * " + a + " * "+ c);

        int D = b*b - 4*a*c; //почему эту формулу не встал Double?
        if (D>0) {
            double x1 = (-b + Math.sqrt(D))/(2*a);
            double x2 = (-b - Math.sqrt(D))/(2*a);
            System.out.println("Расчет первого корня:" + "\n-"+b+" + √"+D+" / 2 * "+a);
            System.out.println("Расчет второго корня:" + "\n-"+b+" - √"+D+" / 2 * "+a);
            System.out.println("Значение первого корня: " + x1);
            System.out.println("Значение второго корня: " + x2);
            JOptionPane.showMessageDialog(null, "Уравнение имеет вид:" + "\n" + //не выходит окошко
                    a + "x^2" + "+" + b + "x" + "+" + c +
                    "\nДескриминант имеет вид:" + "\nD = " + b + "^2" + " - 4 * " + a + " * "+ c +
                    "\nРасчет первого корня:" + "\n-"+b+" + √"+D+" / 2 * "+a +
                    "\nРасчет второго корня:" + "\n-"+b+" - √"+D+" / 2 * "+a +
                    "\nЗначение первого корня: " + x1 +
                    "\nЗначение второго корня: " + x2);
        } else if (D==0) {
            double x = -(b/(2*a));
            System.out.println("Расчет корня:" + "\n-"+b+" / 2 * "+a);
            System.out.println("Значение корня: " + x);
            JOptionPane.showMessageDialog(null, "Уравнение имеет вид:" + "\n" + //не выходит окошко
                    a + "x^2" + "+" + b + "x" + "+" + c +
                    "\nДескриминант имеет вид:" + "\nD = " + b + "^2" + " - 4 * " + a + " * "+ c +
                    "\nРасчет корня:" + "\n-"+b+" / 2 * "+a +
                    "\nЗначение корня: " + x);
        }   else {
            System.out.println("Уравнение не имеет корней");
            JOptionPane.showMessageDialog(null, "Уравнение имеет вид:" + "\n" + //не выходит окошко
                    a + "x^2" + "+" + b + "x" + "+" + c +
                    "\nДескриминант имеет вид:" + "\nD = " + b + "^2" + " - 4 * " + a + " * "+ c +
                    "\nУравнение не имеет корней");
        }
    }
}
