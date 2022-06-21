package Samsung;

import java.util.PriorityQueue;
import java.util.Scanner;

class Grass implements Comparable<Grass> {
    int x;
    int y;
    int length;

    public Grass(int x, int y, int length) {
        this.x = x;
        this.y = y;
        this.length = length;
    }

    @Override
    public int compareTo(Grass o) {
        return this.length <= o.length ? 1 : -1;
    }
}

public class CutGrass_priority {
    public long solution(int n, int m, int d, int[][] place, int[] oil) {
        long answer = 0;
        PriorityQueue<Grass> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                priorityQueue.offer(new Grass(i, j, place[i][j]));
            }
        }

        for (int i = 0; i < d; i++) {
            //일차마다 1cm씩 자라기
            for (int l = 0; l < priorityQueue.size(); l++) {
                Grass grass = priorityQueue.poll();
                priorityQueue.offer(new Grass(grass.x, grass.y, grass.length++));
                System.out.print(grass.length+" ");
            }

            //최고 순위 일수만큼 뽑기
            int sum = 0;
            for (int j = 0; j < oil[i]; j++) {
                Grass grass = priorityQueue.poll();
                sum += grass.length - 1;
                priorityQueue.offer(new Grass(grass.x, grass.y, 1));
            }
            answer += (i + 1) * sum;
            System.out.println(answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        CutGrass_priority main = new CutGrass_priority();
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        int n, m, d;
        long[] answers = new long[T];
        for (int t = 0; t < T; t++) {
            n = scanner.nextInt();
            m = scanner.nextInt();
            d = scanner.nextInt();
            int[][] place = new int[n][m];
            int[] oil = new int[d];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    place[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0; i < d; i++) {
                oil[i] = scanner.nextInt();
            }
            answers[t] = main.solution(n, m, d, place, oil);
        }
        for (int i = 0; i < T; i++) {
            System.out.println("#" + (i + 1) + " " + answers[i]);
        }
    }
}
