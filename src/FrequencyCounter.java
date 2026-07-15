public class FrequencyCounter {
    public static void main(String[] args){
        Integer number = 122333;
        Integer org = number;
        Integer targetDigit = 3;
        Integer count = 0;
        Integer digit;

        while (number != 0){
            digit = number % 2;
            if (digit.equals(targetDigit)){
                count++;
            }
            number = number / 10;
        }
        IO.println("Number:" +org);
        IO.println("Target Digit:" +targetDigit);
        IO.println("Frequency:" +count);
    }
}
