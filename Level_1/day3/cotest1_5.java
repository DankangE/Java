package Level_1.day3;

// 나머지가 1이 되는 수 찾기 https://school.programmers.co.kr/learn/courses/30/lessons/87389?language=java
public class cotest1_5 {
    public static int solution(int n) {
        int answer = 0;
        int i = 1;
        while(true)
        {
            if(n % i == 1)
            {
                answer = i;
                break;
            }
            i++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
