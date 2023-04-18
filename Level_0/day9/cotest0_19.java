package Level_0.day9;

// 편지 쓰기
public class cotest0_19 {

    public static int solution(String message) {
        int answer = 0;
        answer = message.length() * 2;

        return answer;
    }

    public static void main(String[] args) {
        String msg = "happy birthday!";

        System.out.println(solution(msg));
    }
}