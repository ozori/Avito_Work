public class While03 {
    public static void main(String[] args) {

        for (int i = 0, j = 1; i < 9; i++, j++) {

            for (int k = 1; k < 10; k++) {
                int mum = k * j;
                System.out.print(mum + " ");
            }
            System.out.print("\n");

        }

        System.out.print("\n");

        int j = 1;
        while (j < 10) {
            int k = 1;
            while (k < 10) {
                int mum = k * j;
                k++;
                System.out.print(mum + " ");
            }
            j++;
            System.out.print("\n");

        }
    }
}
