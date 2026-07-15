public class DigitCounter {
    public static void main(String[] args) {
        Integer number = 123456;
        Integer org = number;
        Integer count = 0;

        while (number != 0) {
            number = number / 10;
            count++;
        }
        IO.println("Number:" + org);
        IO.println("Number of digits:" + count);
    }
}
