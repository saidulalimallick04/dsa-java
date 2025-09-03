import java.util.Scanner;
public class do_while_loop {
    
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.println("----------------------------Do While Loop-----------------------------");
            int choice = 1;
            do{
                try{
                    System.out.print("Enter 0 to exit\n  >>");
                    choice = scan.nextInt();
                    System.err.println("\nYou Have Entered: "+choice);  
                }
                catch(Exception e){
                    System.err.println("Invalid Input, Please Enter an Integer Value");
                    scan.next(); // Clear the invalid input
                }                  
            }while(choice != 0);
            
            System.out.println("Exit...............");
        }

        
    }
}
