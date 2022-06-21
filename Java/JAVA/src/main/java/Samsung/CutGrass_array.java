package Samsung;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CutGrass_array {
    public long solution(int n, int m, int d, int[][] place, int[] oil) {
        long answer = 0;
        Integer[] place_arr = new Integer[n * m];

        int cnt = 0;
        //일차원 배열 넣기
        for (int l = 0; l < n; l++) {
            for (int j = 0; j < m; j++) {
                place_arr[cnt] = place[l][j];
                cnt++;
            }
        }

        Arrays.sort(place_arr, Collections.reverseOrder());
        int idx = 0;
        for (int i = 0; i < d; i++) {
            //일차마다 1cm씩 자라기
            for (int l = 0; l < n * m; l++) {
                place_arr[l]++;
            }
//            //최고 순위 일수만큼 뽑기
            int sum = 0;
            for (int j = 0; j < oil[i]; j++) {
                if (idx >= n * m) idx = 0;
                sum += place_arr[idx] - 1;
                place_arr[idx] = 1;
                idx++;
            }
            answer += (i + 1) * sum;
        }
        return answer;
    }

    public static void main(String[] args) {
        CutGrass_array main = new CutGrass_array();
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
