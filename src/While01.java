import java.util.Scanner;

public class While01 {
    public static void main(String[] args) {

        Scanner line = new Scanner(System.in);

        System.out.println("Введите фразу");

        String word = line.next();

        System.out.println("Введите чколиество вывода строк");

        String a1 = line.next();

        int a2 = Integer.parseInt(a1);

        while (a2 > 0) {
            System.out.println(word);
            a2--;
        }
    }
}
