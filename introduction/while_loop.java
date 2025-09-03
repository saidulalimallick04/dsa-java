import java.util.Scanner;

public class while_loop{

    public static void main(String[] args) {
        
        try(Scanner scan = new Scanner(System.in)){

            System.out.println("-------------Let's Explore While Loop-------------");
            System.err.print("Enter Starting Point: ");
            int startingPoint = scan.nextInt();
            System.err.print("Enter Starting Point: ");
            int endingPoint = scan.nextInt();

            int i = startingPoint;
            while (i<=endingPoint) { 
                System.out.println(i);
                i++;
            }


            scan.close();
        }
        
    }
}