public class While02 {
    public static void main(String[] args) {

        char dollar = '$';

        int a = 0;


//        while (a < 10) {
//
//            for (int i = 0; i < 10; i++) {
//                System.out.print(dollar);
//            }
//            System.out.print("\n");
//
//            a++;
//        }

        while (a < 10) {
            int b = 0;
            while (b < 10) {
                System.out.print(dollar); //спросить почему так не работает, потому что b надо объявлять в цикле
                b++;
            }
            System.out.print("\n");
            a++;
        }
    }
}
