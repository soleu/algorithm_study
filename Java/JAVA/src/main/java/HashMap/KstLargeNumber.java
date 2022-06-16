package HashMap;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class KstLargeNumber {
    public int solution(int n, int k, int[] arr) {
        int answer = -1;
        TreeSet<Integer> treeSet = new TreeSet<Integer>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    treeSet.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int cnt = 0;
        for (int x : treeSet) {
            cnt++;
            if (cnt == k) return x;
        }
        return answer;
    }

    public static void main(String[] args) {
        KstLargeNumber main = new KstLargeNumber();
        int n, k;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        k = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(main.solution(n, k, arr));
    }
}
