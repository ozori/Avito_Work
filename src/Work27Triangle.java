import java.util.Scanner;

public class Work27Triangle {
    public static void main(String[] args) {

        Scanner line = new Scanner(System.in);
        int a;

        int x,y,z;
        x=1;
        for (a = line.nextInt(); a>0; a--) {
            for (y=a;y>0;y--) {
                System.out.print("x");
            }
            for (z=0; z<x-1; z++) {
                System.out.print("0");
            }
            System.out.println();
            x++;
        }

    }
}
