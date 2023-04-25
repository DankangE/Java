package Level_0.day10;

// 각도기
public class cotest0_25 {
    public int solution(int angle) {
        int answer = 0;
        if(angle < 90 && angle > 0)
        {
            answer = 1;
        }
        else if(angle == 90)
        {
            answer = 2;
        }
        else if(angle < 180 && angle > 90)
        {
            answer = 3;
        }
        else if(angle == 180)
        {
            answer = 4;
        }
        return answer;
    }
}
