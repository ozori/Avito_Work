import java.util.Scanner;

/**
 * Created by psoops on 21.08.2017.
 */
public class Work21For1 {
    public static void main(String[] args) {

        //Задача №1: Сумма чисел от 100 до 199
        int a, b;

        for (a = 100, b = 0; a < 200; a++) {
            b = b + a;
        }
        System.out.println(b);

        //Задача №2: Сумма чисел от -99 до 99 по модулю
        int c, d;
        for (c = -99, d = 0; c < 100; c++) {
            d = d + Math.abs(c);
        }
        System.out.println("\n" + d);

        //Задача №3: Сумма квадратов всех однозначных чисел
        int e, f;
        for (e = 1, f = 0; e < 10; e++) {
            f = e * e + f;
        }
        System.out.println("\n" + f);

        //Залача №4: Вычислить сумму случайных 10 чисел (я решила сделать целые числа от 0 до 50)
        int g, h;
        int i = 0;
        for (g = 0, h = (int) (Math.random() * 50); g < 11; g++) {
            i = i + h;
        }
        System.out.println("\n" + i);

        //Задача №5: Вычисть сумму 10 чисел, введеных с клавиатуры
        Scanner line = new Scanner(System.in);
          int j,k,l;
          for (j = 0, l=0; j < 10; j++) {
               k = line.nextInt();
               l = l+k;
        }
        System.out.println("\n"+ l);
    }
}