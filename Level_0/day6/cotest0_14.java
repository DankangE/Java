package Level_0.day6;

import java.util.Arrays;

// n의 배수 고르기
public class cotest0_14 {
    public static int[] solution(int n, int[] numlist) {
        int cnt = 0;
        int ans = 0;

        for(int i=0; i<numlist.length; i++)
        {
           if(numlist[i] % n == 0) 
           {
            cnt++;
           }
        }

        int[] answer = new int[cnt]; // 배열 크기 cnt에 맞게 설정

        for(int i=0; i<numlist.length; i++)
        {
            if(numlist[i] % n == 0)
            {
                answer[ans] = numlist[i];
                ans++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,7,8,9,10,11,12};
        int[] arr2 = Arrays.copyOf(solution(3, arr), 10);
        arr2 = solution(3, arr);
        System.out.println(arr2);
    }
}
