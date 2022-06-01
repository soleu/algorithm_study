package Array;
// 등수구하기
import java.util.Scanner;

public class ComputeRank {
    public int[] solution(int num, int[] arr) {
        int[] answer = new int[num];

        //find max num
        int rank = 1;
        while (rank <= num) {
            int max = 0;
            for (int i = 0; i < num; i++) {
                if (arr[i] > max && answer[i] == 0) max = arr[i];
            }
            int cnt = 0;
            for (int i = 0; i < num; i++) {
                if (answer[i] == 0 && max == arr[i]) {
                    answer[i] = rank;
                    cnt++;
                }
            }
            rank += cnt;
        }
        return answer;
    }

    public static void main(String[] args) {
        ComputeRank m = new ComputeRank();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        for (int x : m.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
