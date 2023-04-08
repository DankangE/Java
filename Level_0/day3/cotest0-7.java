package Level_0.day3;

import java.util.Arrays;
// Arrays.toString(int배열) : 문자열 배열로 변환
// equals() 메서드를 사용하여 특정 값이랑 비교
class number7 {
    public int solution(int[] array) {
        int answer = 0;
        String str = Arrays.toString(array);
        for(int i=0; i<str.length(); i++ ){   // str 길이(문자열 길이)
            if(str.charAt(i) == '7'){        // charAt() 함수는 문자열에서 특정 인덱스에 위치하는 유니코드 단일문자를 반환
                answer++;
            }
            // if(str.equals("7"))   // 이 if문은 전체에서 7을 찾으므로 X
            // {answer++;}
        }

        return answer;
    }
}

// 다른 사람 풀이

// import java.util.*;
// import java.util.stream.Collectors;

// class Solution {
//     public int solution(int[] array) {
//         return (int) Arrays.stream(
//                         Arrays.stream(array)        // 스트림 생성
//                                 .mapToObj(String::valueOf)     // 기본형 특화 스트림을 Stream으로 변환해주는 메서드
//                                 .collect(Collectors.joining())   // 스트림에서 작업한 결과를 하나의 스트링으로 이어 붙일 수 있습니다.
//                                 .split("")
//                 )
//                 .filter(s -> s.equals("7"))   // 필터(filter)은 스트림 내 요소들을 하나씩 평가해서 걸러내는 작업
//                 .count();
//     }
// }
