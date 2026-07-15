public class DecimalToBinary {
    public static void main(String[] args){
        Integer number;
        Integer org = number;
        String binary = "";
        Integer remainder;

        while (number > 0){
            remainder = number % 2;
            binary = remainder + binary;
            number = number / 2;
        }
        IO.println();

    }
}
