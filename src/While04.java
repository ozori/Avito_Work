import java.util.Scanner;

public class While04 {
    public static void main(String[] args) {

        Scanner line = new Scanner(System.in);

        System.out.println("Введите ширину прямоугольника");
        int m = line.nextInt();

        System.out.println("Введите высоту прямоугольника");
        int n = line.nextInt();

        char eight = '8';

        while (n>0) {
            int a = m;
            while (a>0) {
                System.out.print(eight);
                a--;
            }
            System.out.print("\n");
            n--;
        }
    }
}
