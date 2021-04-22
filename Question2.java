  import java.util.Scanner;
  import java.text.DecimalFormat;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    
    // System.out.println("Input height in meters");
    Scanner in = new Scanner(System.in);
    double height1 = in.nextDouble();

    //  System.out.println("Input weight in kilograms");
    double weight1 = in.nextDouble();

    DecimalFormat df = new DecimalFormat("#.#");
    double bmi = weight1 / (height1*height1);

    System.out.println(df.format(bmi));
  }
}
