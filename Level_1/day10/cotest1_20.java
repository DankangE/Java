package Level_1.day10;
// 제일 작은 수 제거하기 https://school.programmers.co.kr/learn/courses/30/lessons/12935

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class cotest1_20 {
    public static int[] solution(int[] arr) {
        int[] answer = {};
        int index = 0;

        if(arr.length == 1) {
            answer[0] = -1;
            return answer;
        }

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] < arr[index]) {
                index = i;
            }
        }

        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        }
 
        List<Integer> result = IntStream.of(arr)    // IntStream
                                        .boxed()
                                        .collect(Collectors.toList());
        result.remove(index);
 
        return result.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
    }

    public static void main(String[] args) {
        int[] a = { 6, 2, 3, 4, 5 };
 
        a = solution(a);
        System.out.println(Arrays.toString(a));
    }
}
