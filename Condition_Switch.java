package Chapter_4_Conditional_Statement.Chapter_4_Conditional_Statement;
import java.util.Scanner;
public class Condition_Switch {
    public static void main(String[] args) {
        //Switch statement
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter a Number : ");
        int num2 = sc.nextInt();
        int sum = 0;

        System.out.println("What operation you want to do :");
        System.out.println("1 : Addition");
        System.out.println("2 : Subtraction");
        System.out.println("3 : Multiplication");
        System.out.println("4 : Division");

        int choice = sc.nextInt();

        //switch case
        switch (choice){
            case 1: 
                sum = num1 + num2;
                break;
                
            case 2:
                sum = num1 - num2;
                break;
                
            case 3:    
                sum = num1 * num2;
                break;
                
            case 4:    
                sum = num1 / num2;
                break;
                
            default:
                System.out.println("Error Entry");
        }
        System.out.println(sum);
    }
}
