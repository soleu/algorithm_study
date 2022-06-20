package Naver;

public class N1 {
    int solution(int N) {
        int largest = 0;
        int shift =N;
        int temp = N;
        for (int i = 1; i < 30; i++) {
                int index = (temp & 1); //맨끝자 isolation
            System.out.println(index +"i");
                temp = ((temp >> 1) | (index << 29));
            System.out.println(temp);
            if (temp > largest) {
                largest = temp;
                shift = i;
            }
        }
        System.out.println(largest);
        return shift;
    }

    public static void main(String[] args) {
        N1 n1 = new N1();
        int n = 123;
        System.out.println(n1.solution(n));
    }
}
