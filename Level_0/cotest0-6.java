package Level_0;

class Strcut {

    public String[] solution(String my_str, int n) {
        int cnt = (my_str.length() + n - 1) / n;  // 나눠지는 문자열 수를 계산
        String[] answer = new String[cnt];

        for(int i=0; i < cnt; i = i++){
            int start = i * n;
            int end = 0;

            if(start + n >= my_str.length()){    // 문자열 나머지가 생기면 
                end = my_str.length();           // end를 문자열 마지막에 배치
            }
            else{
                end = start + n;     // 시작 위치 + 길이
            }

            answer[i] = my_str.substring(start, end);
        }

        return answer;
    }

}


// public class Return {
//     public static void main(String[] args) {
//         Strcut sol = new Strcut();
//         sol.solution("abc1Addfggg4556b", 6);

//     }
// }