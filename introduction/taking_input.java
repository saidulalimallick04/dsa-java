import java.util.Scanner;

public class taking_input {
    

    public static void main(String[] code){

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter Anything you Want: ");
            String users_input = scan.nextLine();
            
            System.out.printf("User Enter: "+ users_input);
        }
    }
}
