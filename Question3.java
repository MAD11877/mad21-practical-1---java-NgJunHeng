import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
     System.out.println("Enter a number: ");
    Scanner in = new Scanner(System.in);
    int num1 = in.nextInt();
    int total1 = num1 * num1 ;

    System.out.println(num1 + " x " + num1 + " is " + total1);


    
  }
}
