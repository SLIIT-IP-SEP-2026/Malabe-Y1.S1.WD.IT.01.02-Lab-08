import java.util.Scanner;

public class IT26102567Lab7Q1B {
    
    public static void main(String[] args) {
        
        // Create new scanner object to input from the keyboard
        Scanner input = new Scanner(System.in);
        
        // Loop the process for 3 students (removed the incorrect semicolon)
        for (int i = 1; i <= 3; i++) {
            
            System.out.println("Student " + i);
            System.out.print("Enter marks: ");
            
            // Read four space-separated subject marks on a single line
            int mark1 = input.nextInt();
            int mark2 = input.nextInt();
            int mark3 = input.nextInt();
            int mark4 = input.nextInt(); // Fixed typo: inpit -> input
            
            // Calculate the average
            double avg = (mark1 + mark2 + mark3 + mark4) / 4.0;
            
            String grade; 
            if (avg >= 75) {
                grade = "Distinction";
            } 
            else if (avg >= 50) { // Fixed misplaced bracket issue
                grade = "Credit";
            } 
            else {
                grade = "Fail";
            }
            
            // Display the results 
            System.out.println("Average is: " + avg);
            System.out.println("Overall grade is: " + grade);
            System.out.println(); // Blank line between students
        }
        
        // Close the scanner resource after the loop finishes
        input.close();
    }
}

