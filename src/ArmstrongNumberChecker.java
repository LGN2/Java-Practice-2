public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        Integer number = 153;
        Integer org = number;
        Integer digit;
        Integer sum = 0;
        Integer count = 0;

        Integer temp = number;

        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        temp = number;

        while (temp != 0) {
            digit = temp % 10;
            int power = 1;
            for (int i = 1; i <= count; i++) {
                power *= digit;
            }
            sum += power;
            temp = temp / 10;
        }
        IO.println("Number:" + org);

        if (sum.equals(org)) {
            IO.println("The Number is an Armstrong Number.");
        } else {
            IO.println("The Number is Not an Armstrong Number.");
        }
    }
}
