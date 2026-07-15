public class ArmstrongNumberChecker {
    public static void main(String[] args){
        Integer number = 153;
        Integer org = number;
        Integer digit;
        Integer sum = 0;
        Integer count = 0;

        while (number != 0){
            count++;
            number = number / 10;
        }
        while (number != 0){
            digit = number % 10;
            int power = 1;
            for (int i = 1; i <= count; i++){
                power *= digit;
            }
            sum += power;
            number = number / 10;
        }
        IO.println("Number:"+org);

        if (sum.equals(org)){
            IO.println("The Number is an Armstrong Number.");
        }else {
            IO.println("The Number is Not an Armstrong Number.");
        }
    }
}
