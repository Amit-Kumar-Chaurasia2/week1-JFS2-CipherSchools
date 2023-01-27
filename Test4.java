import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {
        //Get user Division and Print his Rank

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Division ");

        int div = sc.nextInt();

        switch(div) {
        case1:
            System.out.println("First Rank");
            break;

        case2:
            System.out.println("Second Rank");
            break;

        case3:
            System.out.println("Third Rank");
        
        default:
            System.out.println("No Rank"); 
            break;
        }
    }
    
}
