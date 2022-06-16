package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class AllAnagram {
    public int solution(String str1, String str2) {
        int answer = 0;
        int rp = str2.length();
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < str2.length(); i++) {
            char x = str2.charAt(i);
            char y = str1.charAt(i);
            map2.put(x, map2.getOrDefault(x, 0) + 1);
            map1.put(y, map1.getOrDefault(y, 0) + 1);
        }
        boolean flag = true;
        for (char x : map2.keySet()) {
            if (map1.get(x) != map2.get(x)) flag = false;
        }
        if (flag) answer++;

        for (
                int i = 0; i < str1.length() - str2.length(); i++) {
            char y = str1.charAt(i);
            char endChar = str1.charAt(rp);
            flag = true;

            //뒤에꺼 빼고
            map1.put(y, map1.getOrDefault(y, 0) - 1);
            if (map1.get(y) == 0) map1.remove(str1.charAt(i));
            //앞에서 넣기
            map1.put(endChar, map1.getOrDefault(endChar, 0) + 1);
            rp++;

            for (char x : map2.keySet()) {
                if (map1.get(x) != map2.get(x)) flag = false;
            }
            if (flag) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        AllAnagram main = new AllAnagram();
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        System.out.println(main.solution(str1, str2));
    }
}
