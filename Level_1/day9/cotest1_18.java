package Level_1.day9;

// 음양 더하기 https://school.programmers.co.kr/learn/courses/30/lessons/76501
public class cotest1_18 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i = 0; i < absolutes.length; i++) {
            if(signs[i] == true) {
                answer = answer + absolutes[i];
            }
            else {
                answer = answer - absolutes[i];
            }
            
        }
        return answer;
    }
}
