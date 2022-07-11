package programmers;

// 앞에서 부터 하면 뒤에가 얼마나 감소할지 모름
public class Number1 {
    public int solution(int[] grade) {
        int answer = 0;
        for (int i = grade.length - 1; i > 0; i--) {
            if (grade[i - 1] > grade[i]) {
                answer += grade[i - 1] - grade[i];
                grade[i - 1] = grade[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Number1 main = new Number1();
        int[] grade = {11, 3, 2};
//        int[] grade = {3, 2, 3, 6, 4, 5};
        System.out.println(main.solution(grade));
    }
}
