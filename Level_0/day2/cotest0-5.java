package Level_0;

// substring(int startIndex) 
// startIndex부터 끝까지의 문자열을 리턴합니다.

// substring(int startIndex, int endIndex)
// startIndex부터 endIndex 전까지 리턴
class Strpush{
    public int solution(String A, String B) {
        int answer = 0;
        String strA = A;

        for(int i=0; i<A.length(); i++){
            if(strA.equals(B)){    // B와 비교
                return answer;
            }

            String pushstring = strA.substring(strA.length()-1);   // 마지막 문자열을 가져옴
            strA = pushstring + strA.substring(0, strA.length()-1);  // 원래 문자열의 마지막 문자열 + 원래 문자열의 마지막을 뺀 문자열

            answer++; // 카운팅 +1
        }

        return -1;  // for문이 끝나면 -1 리턴
    }
}



// return (B+B).indexOf(A); 을 사용하는 방법이 있음