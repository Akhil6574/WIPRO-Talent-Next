//palindrome using while loop
import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=a;
        int rev=0;
        while(a>0){
            rev=rev*10+a%10;
            a=a/10;
        }
        if(b==rev){
            System.err.println("is palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
