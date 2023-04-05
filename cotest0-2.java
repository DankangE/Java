class Nextnumber {

    // 등차수열이면 common[1] - common[0]를 마지막 값에 더하기
    // 등비수열이면 common[1] / common[0]를 마지막 값에 곱하기
    public static int main(int[] common) {
        int number = 0;
        if(common[1] - common[0] == common[2] - common[1])      // 등차수열인지 확인
            {
                number = common[common.length-1] + (common[1] - common[0]);
            }
        else
            {
                number = common[common.length-1] * common[1] / common[0];
            }
        return number;
    }
}
