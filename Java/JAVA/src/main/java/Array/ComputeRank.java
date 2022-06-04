package Array;
// 등수구하기
// 이중포문으로 최대값을 구하는 연산없이 상대 비교로만 해결할 수 있음
import java.util.Scanner;

public class ComputeRank {
    public int[] solution(int num, int[] arr) {
        int[] answer = new int[num];

        //find max num
        int rank = 1;
//        while (rank <= num) {
//            int max = 0;
//            for (int i = 0; i < num; i++) {
//                if (arr[i] > max && answer[i] == 0) max = arr[i];
//            }
//            int cnt = 0;
//            for (int i = 0; i < num; i++) {
//                if (answer[i] == 0 && max == arr[i]) {
//                    answer[i] = rank;
//                    cnt++;
//                }
//            }
//            rank += cnt;
//        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if(arr[i]<arr[j])rank++;
            }
            answer[i]=rank;
            rank=1;
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
