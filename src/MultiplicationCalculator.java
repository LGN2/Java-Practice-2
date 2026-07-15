public class MultiplicationCalculator {
    public static void main(String[] args) {
        Integer start = 1;
        Integer end = 5;
        Integer result = 1;

        for (int i = start; i <= end; i++) {
            result *= i;
        }
        IO.println("multiplication Result:" + result);

    }
}
