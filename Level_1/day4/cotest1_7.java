package Level_1.day4;

// 문자열 내 p와 y의 개수 https://school.programmers.co.kr/learn/courses/30/lessons/12916
public class cotest1_7 {
    boolean solution(String s) {
        boolean answer = true;
        int cnt = 0;

        char[] arr = s.toCharArray();

        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] == 'p' || arr[i] == 'P')
            {
                cnt++;
            }
            else if(arr[i] == 'y' || arr[i] == 'Y')
            {
                cnt--;
            }
        }

        if(cnt != 0)
        {
            answer = false;
        }

        System.out.println("Hello Java");

        return answer;
    }
}
