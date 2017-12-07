import java.io.IOException;
import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) throws IOException {

        Scanner line = new Scanner(System.in);
        char ch = line.next().charAt(0);
        int x = 0;
        while (true) {
            if (ch != '.') {
                if (ch == ' ') {
                    x += 1;
                }
            } else {
                System.out.println(x);
            }
                break;
            }
        }

}
