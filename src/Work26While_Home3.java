import java.util.Scanner;

public class Work26While_Home3 {
    public static void main(String[] args) {

        // нарисовать равнобедренный треугольник высотой, равной выбору пользователя

                Scanner line = new Scanner(System.in);
        System.out.println("Введите высоту трегольника");

        int lenght = line.nextInt(); //число от пользователя на высоту треугольника

        for (int i = 0; i < lenght; i++) {

            for(int j = 0; j < lenght - i; j++) { //этот цикл я заставила работаь + 1 раз
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) { //это цикл я заставила работать - 1 раз
                System.out.print("^");
            }
            System.out.println("\n");
        }
    }
}
