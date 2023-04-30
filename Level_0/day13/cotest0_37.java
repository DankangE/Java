package Level_0.day13;

// 첫 번째로 나오는 음수 https://school.programmers.co.kr/learn/courses/30/lessons/181896
public class cotest0_37 {
    public int solution(int[] num_list) {
        int answer = 0;

        for(int i = 0; i < num_list.length; i++)
        {
            if(num_list[i] < 0)
            {
                answer = i;
                break;
            }
            else{
                answer = -1;
            }
        }
        return answer;
    }
}
