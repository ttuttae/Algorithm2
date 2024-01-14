class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int hap = 1;
        int gop = 0;
        for(int i = 0;i<num_list.length;i++){
            hap*=num_list[i];
            gop+=num_list[i] ;
        }
        gop=gop*gop;
            
        if(hap<gop){
            answer = 1;
        }else if(hap>gop){
            answer = 0;
        }
        
        return answer;
    }
}