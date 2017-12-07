import java.util.Scanner;

public class Work28Mas {
    public static void main(String[] args) {
        //Элементы массива, которые больше предыдущего

//        int[] mas = {25,28,58,65,47,23,1,4,88, 1,1,1,1,1,5,4,7,8,4};
//
//        for (int x = 0; x<mas.length-1; x++) {
//            if (mas[x]<mas[x+1]) System.out.println(mas[x+1]);
//        }

        //Разделить элементы массива на максимальный

//        double[] mas = {5,60,69,1,78,4,50};
//        double y = 0;
//        for (int i = 0; i < mas.length-1; i++) {
//            if (mas[i]<mas[i+1] && mas[i+1]>y) {
//                y = mas[i+1];
//            }
//        }
//        for (int j = 0; j <mas.length;j++) {
//            double m = mas[j] / y;
//            System.out.println(m);
//        }

        //Вывести в порядке возрастания цифры, из которых состоит число

        Scanner line = new Scanner(System.in);
        String a = line.next();
        int b = a.length();
        int[] mas = new int[b];

        for (int i = 0; i < b; i++) {
            mas[i] = Integer.parseInt(String.valueOf(a.charAt(i)));
            //System.out.print(mas[i]);
        }
        //System.out.println();
        //int[] result = new int[mas.length];
        int j,l,x;

        for (j = mas.length - 1; j > 0; j--) {
            for (l = 0; l < j; l++) {
                if ( mas[l] > mas[l+1]) {
                    x = mas[l];
                    mas[l] = mas[l+1];
                    mas[l+1] = x;
                }
            }

        }
        for (int y = 0; y < mas.length; y++) {
            System.out.print(mas[y]);
        }

    }
}
