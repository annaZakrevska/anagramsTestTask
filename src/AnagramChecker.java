
import java.util.HashMap;
import java.util.Locale;

public class AnagramChecker {
    boolean isAnagrams(String str1, String str2) throws IllegalArgumentException {

        if (str1 == null || str2 == null) {
            throw new IllegalArgumentException("Input contains null values");
        } else {
            str1 = str1.toLowerCase(Locale.ROOT);
            str2 = str2.toLowerCase(Locale.ROOT);
            HashMap<Character, Integer> map = new HashMap<>();

            if (str1.length() == str2.length()) {
                for (char letter : str1.toCharArray()) {
                    if (map.containsKey(letter)) {
                        map.put(letter, map.get(letter) + 1);
                    } else {
                        map.put(letter, 1);
                    }
                }
                for (char letter : str2.toCharArray()) {
                    if (map.containsKey(letter)) {
                        if (map.get(letter) == 0) {
                            return false;
                        }
                        map.put(letter, map.get(letter) - 1);
                    } else {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
