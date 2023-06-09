package strings;

import java.util.Arrays;

public class Anagram {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        if (Arrays.equals(s1, t1))
            return true;

        return false;
    }

    public static void main(String[] args) {
        Anagram a = new Anagram();
        System.out.println(a.isAnagram("car", "rat"));
    }

}
