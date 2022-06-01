package Array;

import java.util.Scanner;

public class RockScissorPaper {
    public String solution(int num, int[][] arr) {
        String answer = "";
        for (int i = 0; i < num; i++) {
            if (arr[0][i] == arr[1][i]) answer += 'D';
            else if ((arr[0][i] == 1 && arr[1][i] == 3) || (arr[0][i] == 2 && arr[1][i] == 1) || (arr[0][i] == 3 && arr[1][i] == 2)) {
                answer += 'A';
            } else {
                answer += 'B';
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        RockScissorPaper m = new RockScissorPaper();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[2][num];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < num; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (char aChar:m.solution(num,arr).toCharArray()) {
            System.out.println(aChar);
        }
    }
}

