package Level_1.day8;

// 서울에서 김서방 찾기 https://school.programmers.co.kr/learn/courses/30/lessons/12919?language=java
public class cotest1_15 {
    public static String solution(String[] seoul) {
        String answer = "";
        int index = 0;

        for(int i=0; i<seoul.length; i++) {
            if(seoul[i].equals("Kim"))
            {
                index = i;
                break;
            }
        }

        answer = "김서방은 " + String.valueOf(index) + "에 있다";
        return answer;
    }

    public static void main(String[] args) {
        String[] s = {"Jane", "Kim"};
        System.out.println(solution(s));
    }
}
