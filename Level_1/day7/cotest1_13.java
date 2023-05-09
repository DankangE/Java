package Level_1.day7;

// 두 정수 사이의 합 https://school.programmers.co.kr/learn/courses/30/lessons/12912#
public class cotest1_13 {
    public static long solution(int a, int b) {
        long answer = 0;
        
        if(a < b)
        {
            for(long i = a; i <= b; i++)
        {
            answer = answer + i;
        }
        }
        else if(a > b){
            for(long i = b; i <= a; i++)
        {
            answer = answer + i;
        }
        }
        else if(a == b)
        {
            return a;
        }
        
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(13, 10));
    }
}
