public class NumberReversal {
    public static void main(String[] args) {
        Integer num = 12345;
        Integer revNum = 0;
        Integer digit;
        Integer org = num;
        while (num != 0) {
            digit = num % 10;
            revNum = revNum * 10 + digit;
            num = num / 10;
        }
        IO.println("Reversed Number:" + revNum);
        IO.println("Original Number:" + org);
    }
}
