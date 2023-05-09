package Level_1.day7;

// 콜라츠 추측
// 1-1. 입력된 수가 짝수라면 2로 나눕니다. 
// 1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다. 
// 2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다. 

public class cotest1_14 {
    public static int solution(int num) {
        int answer = 0;
        long n = (long) num;
        int cnt = 0;
        
        if(num == 1)
        {
            return 0;
        }
        
        while(cnt != 501)
        {
            if(n % 2 == 0)
            {
                n = n / 2;
            }
            else
            {
                n = (n*3) + 1;
            }
            cnt++;

            if(n == 1)
            {
                answer = cnt;
                break;
            }
        }
        if(cnt == 501)
        {
            answer = -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(1));
    }
}
