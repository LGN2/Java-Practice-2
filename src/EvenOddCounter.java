public class EvenOddCounter {
    public static void main(String[] args){
        Integer start = 1;
        Integer end = 10;
        Integer evenCount = 0;
        Integer oddCount = 0;

        for (int i = start; i <= end; i++){
            if (i % 2 ==0){
                evenCount++;
            }else {
                oddCount++;
            }
        }
        IO.println("Even Numbers Count:"+evenCount);
        IO.println("Odd Numbers Count:"+oddCount);
    }
}
