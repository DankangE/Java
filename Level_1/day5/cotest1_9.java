package Level_1.day5;

import java.util.Arrays;

// 자연수 뒤집어 배열로 만들기 https://school.programmers.co.kr/learn/courses/30/lessons/12932
public class cotest1_9 {
    public static int[] solution(long n) {
        String temp = Long.toString(n);
        int[] answer = new int[temp.length()];
        int[] digits = new int[temp.length()];

        for(int i=0; i<temp.length(); i++)
        {
            digits[i] = temp.charAt(i) - '0';
        }
        System.out.println(Arrays.toString(digits));

        for(int i=0; i<temp.length(); i++)
        {
            answer[i] = digits[temp.length()-i-1];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12345)));
    }
}
