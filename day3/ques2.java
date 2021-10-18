import java.util.Date;
import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args){
    int num=0;
      System.out.println("Enter the number: ");
    Scanner in = new Scanner(System.in);
    num = in.nextInt();
    int count = 0;
        int i,sumEven=0,sumOdd=0;
        while (num != 0) {
        int r = num%10;
        if(r%2 == 0)
            sumEven =sumEven+r;

        else{
            sumOdd=sumOdd+r;
            }
            num = num/10;
    }
        System.out.println(sumEven);
        System.out.println(sumOdd);
}
    }
