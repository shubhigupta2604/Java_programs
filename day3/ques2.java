import java.util.Date;
import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args){
    int num=0;
      System.out.println("Enter the number: ");
    Scanner in = new Scanner(System.in);
    num = in.nextInt();
    int n=num;
    int count = 0;

    while (num != 0) {
        // num = num/10
        num /= 10;
        ++count;
    }
    int i,sumEven=0,sumOdd=0;
      for(i=1;i<=count;i++){
        if (i % 2 == 0)
            sumEven += n % 10;
        else
            sumOdd += n % 10;
        n /= 10;
    }

      System.out.println(sumEven);
      System.out.println(sumOdd);
}
    }
