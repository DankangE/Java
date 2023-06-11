package Level_1.day8;
import java.util.Arrays;

//나누어 떨어지는 숫자 배열 https://school.programmers.co.kr/learn/courses/30/lessons/12910
public class cotest1_16 {
    public static int[] solution(int[] arr, int divisor) {
        int n = 0, m = 0;
        int error = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                n++;
                error++;
            }
        }
        if(n == 0)
        {
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[n];
        

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                answer[m] = arr[i];
                m++;
            }
        }
        Arrays.sort(answer);

        return answer;
    }
    
    public static void main(String[] args) {
        int[] a = {3, 2, 7};
        System.out.println(Arrays.toString(solution(a, 10)));
    }
}
