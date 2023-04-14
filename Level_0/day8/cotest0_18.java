package Level_0.day8;

// 가장 큰 수 찾기
public class cotest0_18 {

    public static int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = 0;
        int max_index = 0;

        for(int i=0; i<array.length; i++)
        {
            if( max < array[i]) {
				max = array[i];
				max_index = i;
			}
        }

        answer[0] = max;
        answer[1] = max_index;

    
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 3};

        System.out.println(solution(arr));
    }
}
