package Day2;

public class Valid_pallindrome {
    public static boolean check(String s){
        StringBuffer x = new StringBuffer();
        for(int i =0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                x.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        int left = 0;
            int right = x.length()-1;
            while(left<=right){
                if(x.charAt(left)!=x.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
            return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.print(check(s));
    }
}
