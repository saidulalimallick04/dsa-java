import java.util.Scanner;

public class SumOfArray {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Size of Array:");
        int n=sc.nextInt();

        int[] array=new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter Num_"+(i+1)+":");
            array[i]=sc.nextInt();
        }
        int sum=0;

        for(int i=0;i<n;i++){
            sum+=array[i];
        }
        System.out.println("Sum of All Elements: "+sum);

        sc.close();
    }
}
