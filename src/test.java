import java.util.Arrays;

public class test {

    String enmg = "Й+ИЕАШКЕЗ+ЖОКОЪЖЕЗ+ДЕАО%%%\n" +
            "Є6ХШЭѕЧШЪ6ЫУЧУїЫШЪ6ЩШЭУ\n" +
            "ЀГДѣЙѣгДѠОДѡЖПКПѣПИ\n" +
            "ЍѮМѬѧЕИВКГЗѧОЙѮОПВБИВЗЙ\n" +
            "ЖЃЉЄЇѷЂѶѶЉЎЋЉЌЉЃЉЎ\n" +
            "ѐѼѵѶЁЇbѽѼѹѿbѶЉЇѲѿЎЍbѹѲѰЂѲn\n" +
            "cmcmcmcmcmcmcmcmmѱѳЍЌѷѽЂmѱѾѶѽa\n" +
            "ьИѭѤѣЖКxМѣѨѫѠxѩЛПѭѥКѨѪИѨt\n" +
            "ѾѝФЯCђієџѝјёўѓCћCСіќјѓM";

    int key = 11;
    int key1 = (int) Math.sqrt(484);
    int key2 = 3 * 11;
    int key3 = (int) Math.round(6.63 * 6.63);
    int key4 = 55;
    int key5 = 66;
    int key6 = 77;
    int key7 = 88;
    int key8 = 99;

    String str = "";
    String str1 = "";
    String str2 = "";
    String str3 = "";
    String str4 = "";
    String str5 = "";
    String str6 = "";
    String str7 = "";
    String str8 = "";

    String[] s = enmg.split("\n");

    String a = s[0];
    String a1 = s[1];
    


    void testo(String a, String b) {



        for (int i = 0; i < s.length; i++) {

            if (i == 0) {
                for (int l = 0; l < s[i].length(); l++) {
                    str = str + (char) (s[i].charAt(l) ^ key);
                }
                System.out.println(str);
            } else if (i == 1) {
                for (int l = 0; l < s[i].length(); l++) {
                    str1 = str1 + (char) (s[i].charAt(l) ^ key1);
                }
                System.out.println(str1);
            } else if (i == 2) {
                for (int l = 0; l < s[i].length(); l++) {
                    str2 = str2 + (char) (s[i].charAt(l) ^ key2);
                }
                System.out.println(str2);
            } else if (i == 3) {
                for (int l = 0; l < s[i].length(); l++) {
                    str3 = str3 + (char) (s[i].charAt(l) ^ key3);
                }
                System.out.println(str3);
            } else if (i == 4) {
                for (int l = 0; l < s[i].length(); l++) {
                    str4 = str4 + (char) (s[i].charAt(l) ^ key4);
                }
                System.out.println(str4);
            } else if (i == 5) {
                for (int l = 0; l < s[i].length(); l++) {
                    str5 = str5 + (char) (s[i].charAt(l) ^ key5);
                }
                System.out.println(str5);
            } else if (i == 6) {
                for (int l = 0; l < s[i].length(); l++) {
                    str6 = str6 + (char) (s[i].charAt(l) ^ key6);
                }
                System.out.println(str6);
            } else if (i == 7) {
                for (int l = 0; l < s[i].length(); l++) {
                    str7 = str7 + (char) (s[i].charAt(l) ^ key7);
                }
                System.out.println(str7);
            } else if (i == 8) {
                for (int l = 0; l < s[i].length(); l++) {
                    str8 = str8 + (char) (s[i].charAt(l) ^ key8);
                }
                System.out.println(str8);
            }
        }
    }
}
