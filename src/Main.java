
public class Main {
    public static void main(String[] args) {
        String s1 = "care";
        String s2 = "race";


        AnagramChecker checker = new AnagramChecker();
        if (checker.isAnagrams(s1, s2)) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }


    }


}