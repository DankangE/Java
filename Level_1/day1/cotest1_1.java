package Level_1.day1;

// 평균 구하기 https://school.programmers.co.kr/learn/courses/30/lessons/12944
public class cotest1_1 {
    public double solution(int[] arr) {
        double answer = 0;
        int total = 0;
        

        for(int i = 0; i < arr.length; i++)
        {
            total = total + arr[i];
        }

        answer = ((double) total / arr.length);
        
        return answer;
    }
}

