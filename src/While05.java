import java.util.Scanner;

public class While05 {
    public static void main(String[] args) {

        Scanner line = new Scanner(System.in);
        System.out.println("Введите высоту треугольника");

        int height = line.nextInt();


        while (height>0) {
            int j = 0;
            int i = 0;
            while (i < height) {
                System.out.print("0");
                i++;
            }
            while (j < i*2+1) {
                System.out.print("^");
                j++;
            }
            System.out.print("\n");
            height--;
        }
    }
}
