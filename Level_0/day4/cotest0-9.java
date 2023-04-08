package Level_0;

class germ_growth {
    public int solution(int n, int t) {
        int answer = 0;
        int grow = (int)Math.pow(2, t);

        answer = n * grow;
        
        return answer;
    }
}
