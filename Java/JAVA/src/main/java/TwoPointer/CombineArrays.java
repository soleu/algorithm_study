package TwoPointer;

import java.util.Scanner;

public class CombineArrays {
    public int[] solution(int n, int m, int[] arr1, int[] arr2) {
        int[] answer = new int[n + m];
        int lp = 0, rp = 0, idx = 0;
        while (lp < n || rp < m) {
            if (lp < n && rp < m) {
                if (arr1[lp] < arr2[rp]) {
                    answer[idx] = arr1[lp];
                    lp++;
                } else {
                    answer[idx] = arr2[rp];
                    rp++;
                }
            } else if (lp < n) {
                answer[idx] = arr1[lp];
                lp++;
            } else {
                answer[idx] = arr2[rp];
                rp++;
            }
            idx++;
        }
        return answer;
    }

    public static void main(String[] args) {
        CombineArrays s = new CombineArrays();
        int n, m;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scan.nextInt();
        }
        m = scan.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = scan.nextInt();
        }
        for (int num : s.solution(n, m, arr1, arr2)) {
            System.out.print(num + " ");
        }
    }
}
