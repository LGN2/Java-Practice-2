public class LargestNumberFinder {
    public static void main(String[] args){
        int [] numbers = {20,30,40,50,89};
        int largest = 0;
        int number;
        for (int i = 1; i < numbers.length; i++){
            number = numbers[i];
            if (number > largest){
                largest = number;
            }
        }
        IO.println("Largest Number:"+largest);

    }
}
