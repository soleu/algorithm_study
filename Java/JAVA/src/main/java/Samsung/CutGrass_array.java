package Samsung;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

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

    public static void main(String[] args) throws IOException {
        CutGrass_array main = new CutGrass_array();
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File file = new File("/Users/pine_lee/Desktop/PROJECT/Algorithm/Java/JAVA/src/main/java/Samsung/sample.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br_f = new BufferedReader(fr);

        int T = Integer.parseInt(br_f.readLine());
        int n, m, d;
        long[] answers = new long[T];
        for (int t = 0; t < T; t++) {
            String[] token = br_f.readLine().split(" ");
            n = Integer.parseInt(token[0]);
            m = Integer.parseInt(token[1]);
            d = Integer.parseInt(token[2]);
            int[][] place = new int[n][m];
            int[] oil = new int[d];
            for (int i = 0; i < n; i++) {
                String[] token1 = br_f.readLine().split(" ");
                for (int j = 0; j < token1.length; j++) {
                    place[i][j] = Integer.parseInt(token1[j]);
                }
            }
            String[] token2 = br_f.readLine().split(" ");
            for (int i = 0; i < token2.length; i++) {
                oil[i] = Integer.parseInt(token2[i]);
            }
            answers[t] = main.solution(n, m, d, place, oil);
        }
        for (int i = 0; i < T; i++) {
            System.out.println("#" + (i + 1) + " " + answers[i]);
        }
    }
}

