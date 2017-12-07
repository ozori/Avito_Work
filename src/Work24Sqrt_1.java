import javax.swing.*;
import java.util.Scanner;

public class Work24Sqrt_1 {
    public static void main(String[] args) {

        Scanner line = new Scanner(System.in);
        int a,b,c;

        System.out.println("Введите число a");
        a = line.nextInt();
        System.out.println("Введите число b");
        b = line.nextInt();
        System.out.println("Введите число с");
        c = line.nextInt();

        System.out.println("Дескриминант имеет вид:" + "\nD = " + b + "^2" + " - 4 * " + a + " * "+ c);

        int D = b*b - 4*a*c;
        if (D>0) {
            double x1 = (-b + Math.sqrt(D))/(2*a);
            double x2 = (-b - Math.sqrt(D))/(2*a);
            System.out.println("Расчет первого корня:" + "\n-"+b+" + √"+D+" / 2 * "+a);
            System.out.println("Расчет второго корня:" + "\n-"+b+" - √"+D+" / 2 * "+a);
            System.out.println("Значение первого корня: " + x1);
            System.out.println("Значение второго корня: " + x2);
        } else if (D==0) {
            double x = -(b/(2*a));
            System.out.println("Расчет корня:" + "\n-"+b+" / 2 * "+a);
            System.out.println("Значение корня: " + x);
        }   else {
            System.out.println("Уравнение не имеет корней");
        }
    }
}
