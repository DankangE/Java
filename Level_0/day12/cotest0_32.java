package Level_0.day12;

// 문자열 앞의 n글자 https://school.programmers.co.kr/learn/courses/30/lessons/181907
public class cotest0_32 {
    public String solution(String my_string, int n) {
        String answer = "";
        answer = my_string.substring(0, n);
        return answer;
    }
}
