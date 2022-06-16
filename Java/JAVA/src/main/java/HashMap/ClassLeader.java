package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class ClassLeader {
    public char solution(int n, String arr) {
        char answer = arr.charAt(0);
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : arr.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (char x : map.keySet()) {
            if (map.get(x) > max) {
                answer = x;
                max = map.get(x);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ClassLeader main = new ClassLeader();
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        String arr = scan.next();
        System.out.println(main.solution(n, arr));
    }
}
