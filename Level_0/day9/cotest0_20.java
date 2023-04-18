package Level_0.day9;

import java.util.ArrayList;
import java.util.Arrays;

public class cotest0_20 {
    
    public static int[] solution(int n) {
       
        // // int j=0;
        // // int k=0;

        // // for(int i=1; i<=n; i++)
        // // {
        // //     if(n%i == 0)
        // //     {
        // //         j++;
        // //     }
        // // } 
        // // int[] answer = new int[j];
        // // for(int i=1; i<=n; i++)
        // // {
            
        // //     if(n%i == 0)
        // //     {
        // //         answer[k]=i; 
        // //         k++;
        // //     }
        // // }

        // return answer;

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i =1; i<=Math.sqrt(n); i++){
            if(n%i==0){
                if(n/i == i){
                    list.add(i);
                }
                else{
                    list.add(i);
                    list.add(n/i);
                }
            }
        }
        list.sort(null);

        return list.stream().mapToInt(i ->i).toArray();
    }
    

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(25)));
    }
}
