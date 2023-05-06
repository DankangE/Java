package Level_0.day14;

// flag에 따라 값 반환하기 https://school.programmers.co.kr/learn/courses/30/lessons/181933
public class cotest0_40 {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;

        if(flag == true)
        {
            answer = a + b;
        }
        else
        {
            answer = a - b;
        }
        return answer;
    }
}
