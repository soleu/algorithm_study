package sorting;

import java.util.Scanner;

public class BubbleSort {
    public String Solution(int[] arr) {
        String answer = "";

        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - (j + 1); i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
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
