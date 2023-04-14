package Level_0.day8;

public class cotest0_17 {
    
    public static int solution(String my_string) {
        String[] arr = my_string.split(" ");  //; 공백으로 나누기
        int answer = Integer.parseInt(arr[0]);

        for(int i=1; i<arr.length; i+=2)     // 숫자(0) 연산자(1) 숫자(2) 연산자(3) 숫자(4)
        {
            if(arr[i].equals("+"))
            {
                answer += Integer.parseInt(arr[i+1]);
            }
            else
            {
                answer -= Integer.parseInt(arr[i+1]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String your_string = "3 + 4";
        int ans = solution(your_string);
        System.out.println(ans);
    }
}
