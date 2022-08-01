package sorting;

import java.util.Scanner;

public class SelectionSort {
    public String Solution(int[] arr) {
        String answer = "";
        for (int j = 0; j < arr.length; j++) {
            int min = Integer.MAX_VALUE;
            int idx = j;
            for (int i = j; i < arr.length; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                    idx = i;
                }
            }
                int temp = arr[idx];
                arr[idx] = arr[j];
                arr[j] = temp;
        }
        for (int x : arr) {
            answer += x + " ";
        }
        return answer;
    }

    public static void main(String[] args) {
        SelectionSort m = new SelectionSort();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(m.Solution(arr));
    }
}
