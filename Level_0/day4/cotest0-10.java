package Level_0.day4;

class cotest {
    public int solution(int n) {
        int answer = 2;
        int cnt=0;

        for(int i=1; i<1001; i++)
        {
            if(n == i*i){
                cnt++;
            }
        }
        if(cnt == 1){
            answer = 1;
        }
        return answer;
    }
}
