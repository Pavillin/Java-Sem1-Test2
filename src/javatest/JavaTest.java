package javatest;

import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class JavaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         /**
          * This is test #2 for the Programming Fundamentals course (COMP1030).
          * 
          * For this test, insert the code under each comment.  If code is not
          * directly under the comment, it will not be marked.  For this test,
          * you are allowed to use anything that you bring into the test, but you 
          * are not allowed any communication with others or online research.
          */
         
         /**
          * Question 1 - Print your name to the screen followed by the phrase 
          * "-I'm going to do great on this test"
          * 1 Mark
          */
         System.out.println("Question 1 - 1 Mark");
         System.out.println("Dylan Sprague-I'm going to do great on this test");
         
         
         /**
          * Question 2 - using the flow chart provided in class, build the program
          * here.  For the method, define it below (after the main method)                     
          * 4 Marks
          */
         System.out.println("\nQuestion 2 - 4 Marks");
         Scanner keyboard = new Scanner(System.in);
         System.out.print("Enter the meal cost before tax: ");
         double meal = keyboard.nextDouble();
         double Tip = getTip(meal);
         double Tax = meal*0.13;
         double total = meal+Tip+Tax;
         System.out.printf("The cost of the meal is $%.2f, the tip is $%.2f, the tax is $%.2f, and the overall total is $%.2f.", meal, Tip, Tax, total);
         
         
         
         /**
          * Question 3 - Prompt the user to enter a whole number.  Based on 
          * the number entered by the user, create the pattern below.
          *
            Enter the number of rows: 5
            *****
            ****
            ***
            **
            *
          * 3 Marks
          */
         System.out.println("\nQuestion 3 - 3 Marks");
         System.out.printf("Enter the number of rows: ");
         int rows = keyboard.nextInt();
        
         for (int i=1; i<=rows; i++)
         {
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
         }
         
         /**
          * Question 4 - Continously ask the user to enter a number.  When
          * they enter a number that is evenly divisible by 7, end the loop and 
          * print "aced it" to the screen. 
          * 3 Marks 
          */
         System.out.println("\nQuestion 4 - 3 Marks");
         System.out.print("Enter a number: ");
         double number = keyboard.nextDouble();
         while (number % 7 != 0)
         {
             System.out.print("Enter a number: ");
             number = keyboard.nextDouble();
         }
         System.out.println("aced it");
         
    }
    
    /**
     * Question 2 - Put the method header here
     */
    public static double getTip (double meal)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the tip %(1 is 100%): ");
        double tipPercent = keyboard.nextDouble();
        return meal * tipPercent;
    }
    
}
