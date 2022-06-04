package Array;
// 임시반장 정하기
// 반복문을 어떻게 쓰느냐 -> flag없이 break로 중복 제거 가능
// 어렵따... 다시 풀어보기
import java.util.Scanner;

public class TemporaryClassLeader {
    public int solution(int n, int[][] arr) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        count++;
                        break;
                    }
                }
            }
            if (max < count) {
                max = count;
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        TemporaryClassLeader m = new TemporaryClassLeader();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n + 1][6];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < 6; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println(m.solution(n, arr));
    }
}
