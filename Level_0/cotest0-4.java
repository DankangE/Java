package Level_0;

class paper {
    public int solution(int M, int N) {
        int answer = 0;
        int height = M-1;     // 세로로 자르는 수
        int width = (N-1) * M;   // 가로로 자르는 수

        answer = width + height;

        return answer;
    }
}
