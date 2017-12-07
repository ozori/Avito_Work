public class Time {
    public static void main(String[] args) {
        String a = "Olya";
        String b = "OlyaZorina";

        char[] cha = new char[a.length()];
        char[] chb = b.toCharArray();

        int ia = a.length();
        int ib = b.length();
        int ic = ib-ia;

        char[] chc = new char[ic];

        int y = 0;

        for (int x=a.length(); x<chb.length;x++) {
            chc[y]=chb[x];
            y++;
        }
        for (int i = 0; i<chc.length;i++) {
            System.out.print(chc[i]);
        }

    }


}

