package Level_0.day3;

import java.util.*;

class StringSort {
    public String solution(String my_string) {
        String answer = "";

        my_string = my_string.toLowerCase(); // 대문자 -> 소문자
        char[] charArr = my_string.toCharArray(); // String to Char Array
        Arrays.sort(charArr);
        String result = new String(charArr); // 또는 String.valueOf(charArr);

        answer = result;

        return answer;
    }
}


// 다른 사람 풀이

// import java.util.*;
// class Solution {
//     public String solution(String my_string) {
//         char[] c = my_string.toLowerCase().toCharArray();
//         Arrays.sort(c);
//         return new String(c);
//     }
// }
