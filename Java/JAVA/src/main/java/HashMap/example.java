package HashMap;

import java.util.HashMap;

public class example {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int answer = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : A) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        while (true) {
            if (!map.containsKey(answer)) return answer;
            answer++;
        }
    }


    public static void main(String[] args) {
        example e = new example();
        int[] arr = {-1, -3};
//        int[] arr = {1, 3, 6, 4, 1, 2};
        System.out.println(e.solution(arr));
    }
}
