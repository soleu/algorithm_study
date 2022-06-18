package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Curriculum {
    public String solution(String essential, String subjects) {
        String answer = "NO";
        Queue<Character> queue = new LinkedList<>();

        for (char x : essential.toCharArray()) {
            queue.offer(x);
        }

        for (char x : subjects.toCharArray()) {
            if (queue.contains(x) && x == queue.peek()) queue.poll();
        }
        if (queue.isEmpty()) answer = "YES";
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Curriculum main = new Curriculum();
        String essential = scanner.next();
        String subjects = scanner.next();
        System.out.println(main.solution(essential, subjects));
    }
}
