package Naver;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Point2D {
    public int x;
    public int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class N4 {
    public int solution(Point2D[] A) {
        int answer = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                for (int k = j + 1; k < A.length; k++) {
                    if (A[i].x == A[j].x && A[i].x == A[k].x) answer++;
                    if (A[i].y == A[j].y && A[i].y == A[k].y) answer++;
                    if (A[i].x + A[i].y == A[j].x + A[j].y && A[j].x + A[j].y == A[k].x + A[k].y) answer++;
                    if (Math.abs(A[i].x - A[i].y) == Math.abs(A[j].x - A[j].y) && Math.abs(A[j].x - A[j].y) == Math.abs(A[k].x - A[k].y))
                        answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        N4 n1 = new N4();
        Point2D[] A = {new Point2D(0, 0), new Point2D(1, 1), new Point2D(2, 2),
                new Point2D(3, 3), new Point2D(3, 2), new Point2D(4, 2),
                new Point2D(5, 1)
        };
        System.out.println(n1.solution(A));
    }
}
