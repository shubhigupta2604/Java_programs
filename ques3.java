import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = sc.nextInt();

        if(marks>=90)
            System.out.println("Your Grade is A \nExcellent");
        else if(marks>=75)
            System.out.println("Your Grade is B \nGood");
        else if(marks>=60)
            System.out.println("Your Grade is C \nPass");
        else
            System.out.println("Fail");
    }
} 
