import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DZ23102017 {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 4 любые фразы");
        String frase1 = read.readLine();
        String frase2 = read.readLine();
        String frase3 = read.readLine();
        String frase4 = read.readLine();

        int key1 = 18;
        int key2 = 22;
        int key3 = 1008;
        int key4 = -22;

        String start1 = "";
        String start2 = "";
        String start3 = "";
        String start4 = "";
        String finish1 = "";
        String finish2 = "";
        String finish3 = "";
        String finish4 = "";

        for (int i = 0; i < frase1.length(); i++) {
            start1 = start1 + (char) (frase1.charAt(i) ^ key1);
        }
        for (int i = 0; i < frase2.length(); i++) {
            start2 = start2 + (char) (frase2.charAt(i) ^ key2);
        }
        for (int i = 0; i < frase3.length(); i++) {
            start3 = start3 + (char) (frase3.charAt(i) ^ key3);
        }
        for (int i = 0; i < frase4.length(); i++) {
            start4 = start4 + (char) (frase4.charAt(i) ^ key4);
        }
        int startLenght1 = start1.length();
        int startLenght2 = start2.length();
        int startLenght3 = start3.length();
        int startLenght4 = start4.length();

        char[] result1 = new char[startLenght1];
        char[] result2 = new char[startLenght2];
        char[] result3 = new char[startLenght3];
        char[] result4 = new char[startLenght4];

        char[] itog1 = new char[startLenght1];
        char[] itog2 = new char[startLenght2];
        char[] itog3 = new char[startLenght3];
        char[] itog4 = new char[startLenght4];

        for (int x1 = 0; x1 < startLenght1; x1++) {
            result1[x1] = start1.charAt(x1);
        }
        for (int x2 = 0; x2 < startLenght2; x2++) {
            result2[x2] = start2.charAt(x2);
        }
        for (int x3 = 0; x3 < startLenght3; x3++) {
            result3[x3] = start3.charAt(x3);
        }
        for (int x4 = 0; x4 < startLenght4; x4++) {
            result4[x4] = start4.charAt(x4);
        }

        int y,z;
        for (y = 0, z = startLenght1-1; y < startLenght1; y++, z--) {
                itog1[y] = result1[z];
            System.out.print(itog1[y]);
        }
        System.out.println();
        for (y = 0, z = startLenght2-1; y < startLenght2; y++, z--) {
            itog2[y] = result2[z];
            System.out.print(itog2[y]);
        }
        System.out.println();
        for (y = 0, z = startLenght3-1; y < startLenght3; y++, z--) {
            itog3[y] = result3[z];
            System.out.print(itog3[y]);
        }
        System.out.println();
        for (y = 0, z = startLenght4-1; y < startLenght4; y++, z--) {
            itog4[y] = result4[z];
            System.out.print(itog4[y]);
        }
        System.out.println();

        for (int k = 0; k < frase1.length(); k++) {
            finish1 = finish1 + (char) (start1.charAt(k) ^ key1);
        }
        System.out.println(finish1);

        for (int k = 0; k < frase2.length(); k++) {
            finish2 = finish2 + (char) (start2.charAt(k) ^ key2);
        }
        System.out.println(finish2);

        for (int k = 0; k < frase3.length(); k++) {
            finish3 = finish3 + (char) (start3.charAt(k) ^ key3);
        }
        System.out.println(finish3);

        for (int k = 0; k < frase4.length(); k++) {
            finish4 = finish4 + (char) (start4.charAt(k) ^ key4);
        }
        System.out.println(finish4);

    }
}
