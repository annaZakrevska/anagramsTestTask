import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s1 = "care";
        String s2 = "race";

        Main m = new Main();
        System.out.println(m.isAnagrams(s1, s2));
    }


    boolean isAnagrams(String str1, String str2) {
        boolean res = false;
        if (str1.length() == str2.length()) {
            char[] stringArr1 = str1.toCharArray();
            char[] stringArr2 = str2.toCharArray();
            Arrays.sort(stringArr1);
            Arrays.sort(stringArr2);
            if (Arrays.equals(stringArr1, stringArr2)) {
                res = true;
            }
        } else {
            res =  false;
        }
        return res;
    }
}