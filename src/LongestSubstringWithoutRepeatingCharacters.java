
import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int cnt = 1;
        int currentPtr = 0;

        if(s.length() < 2) return s.length();

        HashMap<Character, Integer> chars = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (chars.get(c) == null) {
                chars.put(c, i);

            } else {
                if (i - currentPtr > cnt) {
                    cnt = i - currentPtr;
                }
                if (currentPtr <  chars.get(c) + 1) {
                    currentPtr =  chars.get(c) + 1;
                }
                chars.put(c, i);


            }
        }
        if (s.length() - currentPtr > cnt) {
            cnt = s.length() - currentPtr;
        }

        return (cnt == 0) ? s.length() : cnt;
    }

    public static void main(String[] args) {
        String s = "a";
        System.out.println(lengthOfLongestSubstring(s));

    }
}