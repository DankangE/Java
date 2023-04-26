package Level_0.day11;

// 양꼬치 https://school.programmers.co.kr/learn/courses/30/lessons/120830
public class cotest0_28 {
    public int solution(int n, int k) {
        int answer = 0;

        answer = (n * 12000) + (k * 2000) - ((n/10) * 2000);
        return answer;
    }
}
