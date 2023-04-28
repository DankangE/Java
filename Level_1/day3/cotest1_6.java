package Level_1.day3;

// x만큼 간격이 있는 n개의 숫자 https://school.programmers.co.kr/learn/courses/30/lessons/12954
public class cotest1_6 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for(int i=0; i<n; i++)
        {
            answer[i] = x*((long)i+1);
        }
        return answer;
    }
}
