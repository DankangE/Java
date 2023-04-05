class Babytalk {
    public static void main(String[] args) {}
     
    public int babytalk(String[] babbling){
        int answer = 0;               // 단어 카운팅
        if ( babbling.length <= 100) {    // 0 < babbling <= 100
            for (int i = 0; i < babbling.length; i ++) {

                  if ( babbling[i].length() <= 15) {        // 배열 수 <= 15
                      String Talk = babbling[i];
                    // split(String regex);
                    // -> 구분자를 바탕으로 배열 형식으로 문자열을 잘라줍니다
                      String [] talkbabbling = Talk.split("aya|ye|woo|ma"); // 문자열 가르기 split함수 -> 4개 찾기
                      if (talkbabbling.length == 0) {      // 카운팅
                         answer ++;
                      }
                  }
            }
        }
        return answer;
    }
}