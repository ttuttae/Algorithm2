import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        // 대문자 -> 소문자 32빼면 돼 반대는 +32
        for(int i = 0; i<a.length();i++){
            char c = a.charAt(i);
           if(Character.isUpperCase(c)){
               result += Character.toLowerCase(c);
           }else{
               result += Character.toUpperCase(c);
           }
        }System.out.print(result);
    }
}