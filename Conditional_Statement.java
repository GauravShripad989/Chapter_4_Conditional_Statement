package Chapter_4_Conditional_Statement.Chapter_4_Conditional_Statement;
import java.util.Scanner;
public class Conditional_Statement {
    public static void main(String[] args) {
        //if else (All)
        int age = 62;
        if(age>=18 && age <= 60){
            System.out.println("You can Drive");
        }else {
            System.out.println("You cannot drive Yet");
        }



        // If - else ladder

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int ageInt = sc.nextInt();
        if(ageInt >= 60){
            System.out.println("You are too experienced");
        } else if (ageInt >= 40) {
            System.out.println("You are experienced");
        } else if (ageInt >= 21) {
            System.out.println("You are fresher");
        } else if (ageInt >= 18) {
            System.out.println("Finish your education first");
        } else if(ageInt < 18){
            System.out.println("Are you still a Baby ?");
        }

        //nested if
        System.out.println("Enter your age: ");
        int ageSub = sc.nextInt();
        System.out.println("Enter your Sub: ");
        int Sub = sc.nextInt();
        if(ageSub >= 18){
            if (Sub >= 1000){
                System.out.println("Lucky you have "+ Sub + " at the age of "+ageSub);
            } else {
                System.out.println("Keep it up");
            }
        } else {
            System.out.println("Start it when time is write");
        }


    }
}
