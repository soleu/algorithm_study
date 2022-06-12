package TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CommonElement {
    public ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < n; i++) {
            int lp = 0, rp = m - 1;
            int mid;
            while (lp <= rp) {
                mid = (lp + rp) / 2;
                if (arr1[i] == arr2[mid]) {
                    answer.add(arr1[i]);
                    break;
                } else if (arr1[i] > arr2[mid]) {
                    lp = mid + 1;
                } else {
                    rp = mid - 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        CommonElement s = new CommonElement();
        Scanner scan = new Scanner(System.in);
        int n, m;
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
