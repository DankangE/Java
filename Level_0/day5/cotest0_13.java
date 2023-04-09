package Level_0.day5;

import java.util.stream.Stream;

public class cotest0_13 {

    public static int solution(int n) {
        int answer = 0;

        int[] digits = Stream.of(String.valueOf(n).split(""))
	       .mapToInt(Integer::parseInt)
               .toArray();

        for(int i=0; i<digits.length;i++)
        {
            answer += digits[i];
        }
        
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(12345));
    }

    
}