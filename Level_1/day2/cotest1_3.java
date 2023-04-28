package Level_1.day2;

// 짝수와 홀수 https://school.programmers.co.kr/learn/courses/30/lessons/12937
public class cotest1_3 {
    public String solution(int num) {
        String answer = "";
        if(num % 2 == 0)
        {
            answer = "Even";
        }
        else
        {
            answer = "Odd";
        }
        return answer;
    }
}
