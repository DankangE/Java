package Level_0.day12;

// 문자열 뒤의 n글자 https://school.programmers.co.kr/learn/courses/30/lessons/181910
public class cotest0_33 {
    public String solution(String my_string, int n) {
        String answer = "";
        answer = my_string.substring(my_string.length()-n);
        return answer;
    }
}
