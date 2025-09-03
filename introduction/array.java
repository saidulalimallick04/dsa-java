import java.util.Scanner;

public class array {
    
    public static void main(String[] args) {
        System.out.println("Here We Understand How array Works");

        try(Scanner scan = new Scanner(System.in)){
            System.err.print("Enter Size of array: ");
            int size = scan.nextInt();

            int[] array = new int[size];

            for(int i =0; i<array.length; i++){
                System.out.print("Enter value_"+(i+1)+": ");

                array[i] = scan.nextInt();

            }
            System.out.print("The Array: [ ");
            for(int element : array){
                System.err.print(element+"  ");
            }
            System.out.print("]");
        }

    }
}
