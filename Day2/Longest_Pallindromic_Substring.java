package Day2;


public class Longest_Pallindromic_Substring {
    public static String Substring(String s){
        String ans = "";
        for(int i =0;i<s.length();i++){
            String odd = Expand(s,i,i);
            String even = Expand(s, i, i+1);

            if(odd.length() > ans.length())ans = odd;
            if(even.length()>ans.length()) ans = even;
        }
        return ans;
    }
    public static String Expand(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }
    public static void main(String[] args) {
        String s = "cbbd";
        System.out.print(Substring(s));
    }
}
