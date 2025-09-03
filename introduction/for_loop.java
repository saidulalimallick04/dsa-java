import java.util.Scanner;

public class for_loop {
    

    public static void main(String[] args){
        System.out.println("\n\n-----------------Let's Exlpore For Loop-----------------");

        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter Beginning Point: ");
            int startingPoint = scan.nextInt();

            System.out.print("Enter Ending Point: ");
            int endingPoint = scan.nextInt();

            for(int i = startingPoint; i<=endingPoint; i++){
                if(i == startingPoint){
                    System.out.println("Start = "+i);
                }
                else if (i == endingPoint) {
                    System.out.println("\t"+i+ " = End");
                }
                else{
                    System.err.println("\t"+i);
                }
            }        
        }
    }
}
