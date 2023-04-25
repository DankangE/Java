package Level_0.day10;

// 두 수의 나눗셈
public class cotest0_24 {
    public static int solution(int num1, int num2) {
        int answer = 0;
        double ans = ((double)num1 / num2) * 1000;
        System.out.println(ans);
        answer = (int) ans;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(7, 3));
    }
}
