package Level_1.day6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

// 정수 내림차순 배치 https://school.programmers.co.kr/learn/courses/30/lessons/12933
public class cotest1_11 {
    public long solution(long n) {
        long answer = 0;
        String[] str = Long.toString(n).split("");

        Arrays.sort(str, Collections.reverseOrder());

        String ans = "";

        for(String s : str)
        {
            ans += s;
        }

        answer = Long.parseLong(ans);
        return answer;
    }
}
