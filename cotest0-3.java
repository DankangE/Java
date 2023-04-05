class continuity {
    public int[] TotalNum(int num, int total) {
        int[] number = new int[num];
        
        // 연속된 수들의 가운데 숫자 = total / num

        int sum = num * (1 + num) / 2;  // (1부터 3까지의 합 = 6) if(num == 4) : sum = 10 
        int start_num = (total - sum) / num;  // 연속된 수의 시작점

        for(int i=1; i<num+1; i++){
                number[i - 1] = i + start_num;  // 시작점 + 1씩 늘려가면서 저장
        }

        return number;
    }
}
