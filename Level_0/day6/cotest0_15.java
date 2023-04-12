package Level_0.day6;

import java.util.stream.Stream;

// 숫자 찾기
public class cotest0_15 {
    public static int solution(int num, int k) {
        int answer = 0;

        int[] digits = Stream.of(String.valueOf(num).split(""))
	       .mapToInt(Integer::parseInt)
               .toArray();

        for (int i=0; i<digits.length; i++)
        {
            if(k == digits[i])
            {
                answer = i+1;
                break;
            }
            else{
                answer = -1;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(29183, 1));
    }
}
