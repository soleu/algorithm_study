package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SavePrincess {
    public int solution(int n, int k) {
        int answer = 0;
        int cnt = 1;
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while (queue.size() > 1) {
            int temp = queue.poll();
            if (cnt % k != 0) queue.offer(temp);
            cnt++;
        }
        answer = queue.poll();
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SavePrincess main = new SavePrincess();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(main.solution(n, k));
    }
}
