package Level_0.day7;

public class cotest0_16 {
    public static int solution(String[] s1, String[] s2) {
        int answer = 0;
        int cnt = 0;

        for(int i=0; i<s1.length; i++)
        {
            for(int j=0; j<s2.length; j++)
            {
                if(s1[i].equals(s2[j]))  // == 는 객체만 비교, 문자열은 비교하지 않아 틀림
                {
                    cnt++;
                }
            }
        }

        answer = cnt;
        return answer;
    }
    
    
    public static void main(String[] args) {
        String[] a1 =  {"a", "b", "c"}; //{"n", "omg"};  //
        String[] a2 = {"com", "b", "d", "p", "c"}; //{"m", "dot"};  //

        System.out.println(solution(a1, a2));
    }
}
