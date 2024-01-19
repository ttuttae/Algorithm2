class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        
        for(int i = 0; i <code.length();i++){
            char asd = code.charAt(i);
            
            if(mode == 0 ){
                if( asd == '1'){
                    mode = 1;
                }
                else {
                    if(i%2 == 0){
                        answer += asd;
                    }
                }
            }
            else if (mode == 1){
                if (asd =='1'){
                    mode = 0;
                }else {
                    if(i%2 ==1){
                        answer +=asd;
                    }
                }
            }
             
            
            
        }
        if(answer.length() == 0) {
                answer = "EMPTY";
            }
        return answer;
    }
}