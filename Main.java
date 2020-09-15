import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input 
    Scanner input = new Scanner (System.in);
    // ask for the x coordinate of the first point 
    System.out.println ("Please enter in the x coordinate of the first point");
    //declare a variable to store x1
    int x1 = input.nextInt();
    //ask for the y coordinate of the first point 
    System.out.println ("Please enter in the y coordinate of the first point");
    //declare a variable to store y1
    int y1 = input.nextInt();
    //ask for the x coordinate of the second point 
    System.out.println ( "Please enter in the x coordinate of the second point");
    //declare a variable to store x2
    int x2 = input.nextInt();
    //ask for the y coordinate of the second point
    System.out.println ("Please enter in the y coordinate of the second point");
    //declare a variable to store y2
    int y2 = input.nextInt();
    // declare a variable to store slope 
    double slope = (y2 - y1) / (x2 - x1);
    // show the slope of the line
    System.out.println ("The slope of your line would be " + slope +  ".");

    
  }
}
