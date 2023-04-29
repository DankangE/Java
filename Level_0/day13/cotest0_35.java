package Level_0.day13;

// 배열 원소의 길이 https://school.programmers.co.kr/learn/courses/30/lessons/120854
public class cotest0_35 {
    public int[] solution(String[] strlist) {
        int x = strlist.length;
        int[] y = new int[x];
        //int z = 0;

        for(int i = 0; i<x; i++) {
            y[i] = strlist[i].length();
        }

        //int[] answer = {z};
        return y;
    }
}
