package Level_1.day2;

// 자릿수 더하기 https://school.programmers.co.kr/learn/courses/30/lessons/12931
public class cotest1_4 {
    public static int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        //int[] num = new int[str.length()];

        for (int i = 0; i < str.length(); i++)
        {
            System.out.println(str.charAt(i));
            answer += Integer.valueOf(str.charAt(i)) - 48;
        }

        // for (int i = 0; i < str.length(); i++)
        // {
        //     System.out.println(num[i]);
        // }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(123456789));
    }
}
