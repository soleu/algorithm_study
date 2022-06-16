package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TypeOfOutput {
    public ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int rp = k;
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        answer.add(map.size());

        for (int i = 0; i < n - k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) - 1);
            if (map.get(arr[i]) == 0) map.remove(arr[i]);
            map.put(arr[rp], map.getOrDefault(arr[rp], 0) + 1);
            rp++;
            answer.add(map.size());
        }
        return answer;
    }

    public static void main(String[] args) {
        TypeOfOutput main = new TypeOfOutput();
        int n, k;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        k = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        for (int x : main.solution(n, k, arr)) {
            System.out.print(x + " ");
        }
    }
}
