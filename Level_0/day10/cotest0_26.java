package Level_0.day10;

// 짝수의 합
public class cotest0_26 {
    public int solution(int n) {
        int answer = 0;

        for(int i = 0; i <= n; i += 2)
        {
            answer = i + answer;
        }
        return answer;
    }
}
