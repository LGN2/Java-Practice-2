public class FibonacciSequence {
    public static void main(String[] args){
        Integer first = 0;
        Integer second = 1;
        Integer next;


        IO.println(first + " " + second + " ");

        for (int count = 3; count <= 15; count++){
            next = first + second;
            IO.println(next + " ");

            first = second;
            second = next;
        }
    }
}
