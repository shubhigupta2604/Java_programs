import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character ");
        char ch = sc.next().charAt(0);
        if(Character.isLetter(ch)) {
            if (ch == 'A' || ch =='a' || ch =='E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' ||  ch == 'o' || ch == 'U' || ch =='u')
                System.out.println("Char is Vowel");
            else
                System.out.println("Char is  Consonant");
        }
        else
            System.out.println("Invalid input");
    }
} 
