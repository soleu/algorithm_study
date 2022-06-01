package Array;
//점수계산
import java.util.Scanner;

public class CalculateScore {
    public int solution(int n, int[] arr) {
        int answer = 0;
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                cnt++;
                answer += cnt;
            } else {
                cnt = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        CalculateScore m = new CalculateScore();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(m.solution(n, arr));
    }
}
