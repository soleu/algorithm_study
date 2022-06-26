package Samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CutGrass_array {
    private static void quickSort(int[] arr, int start, int end) {
        int part = partition(arr, start, end);
        if (start < part - 1) quickSort(arr, start, part - 1);
        if (end > part) quickSort(arr, part, end);
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[(start + end) / 2];
        while (start <= end) {
            while (arr[start] > pivot) start++;
            while (arr[end] < pivot) end--;
            if (start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        return start;
    }

    private static void swap(int[] arr, int start, int end) {
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
        return;
    }

    public long solution(int n, int m, int d, int[][] place, int[] oil) {
        long answer = 0;
        int[] place_arr = new int[n * m];

        int cnt = 0;
        //일차원 배열 넣기
        for (int l = 0; l < n; l++) {
            for (int j = 0; j < m; j++) {
                place_arr[cnt] = place[l][j];
                cnt++;
            }
        }

        quickSort(place_arr, 0, place_arr.length - 1);
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
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int n, m, d;
        long[] answers = new long[T];
        for (int t = 0; t < T; t++) {
            String[] token = br.readLine().split(" ");
            n = Integer.parseInt(token[0]);
            m = Integer.parseInt(token[1]);
            d = Integer.parseInt(token[2]);
            int[][] place = new int[n][m];
            int[] oil = new int[d];
            for (int i = 0; i < n; i++) {
                String[] token1 = br.readLine().split(" ");
                for (int j = 0; j < token1.length; j++) {
                    place[i][j] = Integer.parseInt(token1[j]);
                }
            }
            String[] token2 = br.readLine().split(" ");
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

