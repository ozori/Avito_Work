public class Work22For2 {
    public static void main(String[] args) {

        //Задача №1: Вычислить произведние чисел от 1 до 10
        int a,b;
        for (a=2,b=1;a<=10;b*=a++);
        System.out.println(b);

        //Задача №2: Вычислить произведение 5 случайнх чисел от 1 до 10
        int c,d,e;
        e=1;
        d=1;
        for (c=0,d=1; c<5;e=1+(int)(Math.random()*10),d*=e,c++);
        System.out.println(d);

        //Задча №3: Цены за последние 5 лет - не понятен смысл

    }
}
