import javax.swing.*;

public class Work23For3_1 {
    public static void main(String[] args) {

        //Задача №1: Среднее арифметическое 10 случайных чисел
        double a,b,c=0;
        for (a=0,b=0;a<10;a++) {
            int e = 1 + (int)(Math.random()*10);
            b+=e;
        }
        c=b/10;
        System.out.println(c);
        JOptionPane.showMessageDialog(null,"Среднее арифметическое 10 случайных чисел = " + c);


        //Задача №2: Среднее геометрическое 5 чисел от 1 до 1,3, количество знаков после запятой - 2.
        double x,y,z=1;
        for (x=0,y=0;x<5;x++) {
            y = 1+Math.random()*0.3;
            z*=y;
            System.out.println(z);
        }
        z=Math.sqrt(z);
        System.out.printf("\n"+"%.2f",z);
        JOptionPane.showMessageDialog(null,"Среднее геометрическое 5 чисел от 1 до 1,3 = " + z); //не знаю как сделать в этой функции вывод 2х знаков после запятой

        //Задача №3: Вычислить среднюю оценку по физике в клкссе в 15 человек
        double l,m,n=0;
        for (l=0;l<15;l++) {
            m = 1 + (int)(Math.random()*6);
            n+=m;
        }
        n/=15;
        System.out.printf("\n"+"%.1f",n);
        JOptionPane.showMessageDialog(null, "Средняя оценка по физике в классе из 15 человек: " + n);

    }
}
