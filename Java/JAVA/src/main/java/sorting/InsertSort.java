package sorting;

import java.util.Scanner;

public class InsertSort {
    public String Solution(int[] arr) {
        String answer = "";
        for (int idx = 1; idx < arr.length; idx++) {
            for (int i = 0; i < idx; i++) {
                if (arr[idx] < arr[i]) {
                    int temp = arr[idx];
                    for (int j = idx - 1; j >= i; j--) { //역순으로 넣기
                        arr[j + 1] = arr[j];
                    }
                    arr[i] = temp;
                }
            }
        }

        for (int x : arr) {
            answer += x + " ";
        }
        return answer;
    }

    public static void main(String[] args) {
        InsertSort m = new InsertSort();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(m.Solution(arr));
    }
}
