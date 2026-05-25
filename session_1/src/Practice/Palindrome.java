package Practice;

public class Palindrome {
    public static void main(String[] args) {
        int x = 121;

        boolean ans = isPalindrome(x);
        System.out.println(ans);
    }

    static boolean isPalindrome(int x){
        boolean ans = false;
        if (x<0){
            return ans;
        }
        int og = x;
        int rem = 0, rev = 0;

        while (x>0){
            rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }
        if (rev == og) {
            ans =  true;
        }

        return ans;
    }
}
