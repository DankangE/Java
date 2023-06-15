package Level_1.day10;

// 없는 숫자 더하기 https://school.programmers.co.kr/learn/courses/30/lessons/86051
public class cotest1_19 {
    public int solution(int[] numbers) {
        int answer = 45;

        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < 10; j++) {
                if(numbers[i] == j)
                {
                    answer = answer - j;
                }
            }
        }
        return answer;
    }
}
