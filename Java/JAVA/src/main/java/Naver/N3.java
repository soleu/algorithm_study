package Naver;

import java.util.ArrayList;

class Edge {
    public int x;
    public int y;

    public Edge(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class N3 {
    int solution(int N, int[] A, int[] B) {
        int answer = 0;
        int rank = 1;
        int[] weight = new int[N + 1];
        int[] vertices = new int[N + 1];
        ArrayList<Edge> edges = new ArrayList<>();

        for (int i = 1; i <= A.length; i++) {
            edges.add(new Edge(A[i - 1], B[i - 1]));
           vertices[A[i-1]]++;
           vertices[B[i-1]]++;

        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (vertices[i] < vertices[j]) rank--;
            }
            weight[i] = rank;
            rank = N;
        }

        for (int i = 0; i < edges.size(); i++) {
            System.out.println(weight[i+1]);
            answer += weight[edges.get(i).x] + weight[edges.get(i).y];
        }
        return answer;
    }

    public static void main(String[] args) {
        N3 n1 = new N3();
        int n = 5;
        int[] A = {2, 2, 1, 2};
        int[] B = {1, 3, 4, 4};
        System.out.println(n1.solution(n, A, B));
    }
}
