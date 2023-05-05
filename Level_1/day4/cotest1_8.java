package Level_1.day4;

// 정수 제곱근 판별 https://school.programmers.co.kr/learn/courses/30/lessons/12934
public class cotest1_8 {
    public static long solution(long n) {
        long answer = 0;
        int x;

        if(Math.sqrt(n) == (int)Math.sqrt(n))
        {
            x = (int) Math.sqrt(n);
            answer = (long) Math.pow(x+1, 2);
        }
        else
        {
            answer = -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(4));
    }
}
