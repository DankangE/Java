package Level_0.day5;

class str_in_str{
    public int solution(String str1, String str2) {
        int answer = 0;

        if(str2.length() > str1.length()){   // 예외처리
            answer = 2;
        }
        else{
            answer = 2;
            for(int i=0; i < str1.length()-(str2.length()-1); i++){    // str1길이를 넘어가지 않게 설정
                if(str1.substring(i, i+str2.length()).equals(str2))    // 비교
                {
                    answer = 1;
                }
            }
        }

        return answer;
    }
}


// 다른 사람 풀이 ㄷㄷ

// class Solution {
//     public int solution(String str1, String str2) {
//         return (str1.contains(str2)? 1: 2);
//     }
// }