package Level_0.day13;

public class cotest0_39 {
    public int solution(int number, int n, int m) {
        int answer = 0;

        if(number % m == 0 && number % n == 0)
        {
            answer = 1;
        }
        else
        {
            answer = 0;
        }
        return answer;
    }
}
