package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    public String solution(String str1, String str2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char x : str1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (char x : str2.toCharArray()) {
            map2.put(x, map2.getOrDefault(x, 0) + 1);
        }
        for (char x : map.keySet()) {
            if (map.get(x) != map2.get(x)) {
                answer = "NO";}
        }
        return answer;
    }

    public static void main(String[] args) {
        Anagram main = new Anagram();
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        System.out.println(main.solution(str1, str2));
    }
}
