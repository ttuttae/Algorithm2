class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] sum = new int[included.length+1];
        sum[0] =a;
        for(int i = 0 ; i < included.length;i++){
            sum[i+1]=sum[i]+d;
            if(included[i]==true){
                answer+=sum[i];
            }
        }
        return answer;
    }
}