package Level_0.day10;

// 배열의 평균값
public class cotest0_27 {
    public static double solution(int[] numbers) {
        double answer = 0;
        int total = 0;
        double count = 0;

        for(int i = 0; i < numbers.length; i++)
        {
            total = numbers[i] + total;
            count++;
        }
        System.out.println(total);
        System.out.println(count);
        answer = (double) total / count;
        return answer;
    }

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9,10};
        double res = solution(num);
        System.out.println(res);
    }
}
