import java.util.Scanner;

public class IT26102567Lab7Q1A {
    public static void main(String[] args) {
        
        // Create new scanner object to input from the keyboard
        Scanner input = new Scanner(System.in);
        
        // Declare variables
        int mark1, mark2, mark3, mark4;
        double avg;
        String grade = "";
        
        // Input the subject marks
        System.out.println("Enter marks for four subjects:");
        
        System.out.print("Enter Subject Mark 1: ");
        mark1 = input.nextInt();
        
        System.out.print("Enter Subject Mark 2: ");
        mark2 = input.nextInt(); 
        
        System.out.print("Enter Subject Mark 3: ");
        mark3 = input.nextInt(); 
        
        System.out.print("Enter Subject Mark 4: ");
        mark4 = input.nextInt();
        
        // Calculate the average
        avg = (mark1 + mark2 + mark3 + mark4) / 4.0;
        
        // Determine the overall grade
        if (avg >= 75) {
            grade = "Distinction";
        } 
        else if (avg >= 50) {
            grade = "Credit";
        } 
        else {
            grade = "Fail";
        }
        
        // Display output (moved outside the if-else block)
        System.out.println();
        System.out.println("Average is: " + avg);
        System.out.println("Overall Grade is: " + grade);
        
    }
}