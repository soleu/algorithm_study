package programmers;

import java.util.Scanner;

public class Number2 {
    public int[][] solution(int n, boolean horizontal) {
        int[][] answer = new int[n][n];
        int posX = 0;
        int posY = 0;
        int count = 1;
        answer[posY][posX] = count++;
        while (count <= n*n) {
            if (horizontal) {
                if (posX + 1 >= n) return answer;
                answer[posY][++posX] = count++;
                while (posX > posY) {
                    answer[++posY][posX] = count++;
                }
                while (posX > 0) {
                    answer[posY][--posX] = count++;
                }
            } else {
                if (posY + 1 >= n) return answer;
                answer[++posY][posX] = count++;
                while (posY > posX) {
                    answer[posY][++posX] = count++;
                }
                while (posY > 0) {
                    answer[--posY][posX] = count++;
                }
            }
            horizontal = !horizontal;
        }
        return answer;
    }

    public static void main(String[] args) {
        Number2 main = new Number2();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int[] x : main.solution(n, false)) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
