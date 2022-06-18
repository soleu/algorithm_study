package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Crane {
    public int solution(int n, int[][] arr, int m, int[] moves) {
        int answer = 0;
        int[] pos = new int[n];

        Stack<Integer> stack = new Stack<>();
        for (int move : moves) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[j][i] != 0 && i == move - 1) {
                        if (!stack.empty() && stack.peek() == arr[j][i]) {
                            answer += 2;
                            stack.pop();
                        } else stack.push(arr[j][i]);
                        arr[j][i] = 0;
                        break;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Crane c = new Crane();
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int m = scanner.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < moves.length; i++) {
            moves[i] = scanner.nextInt();
        }

        System.out.println(c.solution(n, arr, m, moves));
    }
}
