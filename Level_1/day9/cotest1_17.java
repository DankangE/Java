package Level_1.day9;

// 핸드폰 번호 가리기 https://school.programmers.co.kr/learn/courses/30/lessons/12948
public class cotest1_17 {
    public static String solution(String phone_number) {
        String answer = "";
        char ch = '*';

        StringBuilder sb = new StringBuilder(phone_number); // 문자열의 특정 인덱스에 있는 문자를 효율적으로 교체

        for (int i = 0; i < phone_number.length()-4; i++) {
            sb.setCharAt(i, ch);
        }

        answer = sb.toString();
        
        return answer;
    }

        //--------- 다른 사람 풀이 --------//
//      public String solution(String phone_number) {
//      char[] ch = phone_number.toCharArray();
//      for(int i = 0; i < ch.length - 4; i ++){
//          ch[i] = '*';
//      }
//      return String.valueOf(ch);
//      }

    public static void main(String[] args) {
        System.out.println(solution("01033334444"));
    }
}
