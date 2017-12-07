import java.io.IOException;
import java.util.Scanner;

public class Work26While_Home2 {
    public static void main(String[] args) throws IOException {

        int a, b = 0;

        Scanner line = new Scanner(System.in);


        System.out.println("Введите любое число на наджмите Enter, когда надоест - введите '0' и Enter");

        do {
            a = line.nextInt();
            if (a % 2 != 0) {
                b += a;
            }
        } while (a != 0);
        System.out.println(b);
    }
}