package Level_1.day6;

// 하샤드 수 https://school.programmers.co.kr/learn/courses/30/lessons/12947
public class cotest1_12 {
    public boolean solution(int x) {
        boolean answer = true;
        int a;
        int b = x;
        int sum=0;

        while(x != 0)
        {
            a = x%10;
            sum += a;
            x = x/10;
        }

        if(b % sum == 0)
        {
            answer = true;
        }
        else
        {
            answer = false;
        }

        return answer;
    }
}
