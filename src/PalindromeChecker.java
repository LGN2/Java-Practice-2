public class PalindromeChecker {
    public static void main(String[] args) {
        Integer num = 1221;
        Integer org = num;
        Integer rev = 0;
        Integer digit;
        while (num != 0) {
            digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        IO.println("Number:" + org);
        if (org.equals(rev)) {
            IO.println("The number is a palindrome");
        } else {
            IO.println("The number is not a palindrome");
        }
    }
}
