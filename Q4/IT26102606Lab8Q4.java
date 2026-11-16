import java.util.Scanner;

public class IT26102606Lab8Q4 {
    public static void main(String[] args) {
        
        int userInput;
        int searchID;
        
        boolean status = true;
        boolean found = false;
        
        // Declare the Array with size of 6
        int[] studentsArray = new int[6];
        
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Input Student IDs into the array
        for (int count = 0; count < studentsArray.length; count++) {
            
            while (status) {
                System.out.print("Enter Student ID for Student " + (count + 1) + ": ");
                userInput = input.nextInt();
                
                if (userInput > 0) {
                    studentsArray[count] = userInput; // Store the Positive Student ID
                    break;
                } else {
                    System.out.println("Error: Please Enter ONLY Positive Numbers");
                }
            }
        }
        
        
        System.out.print("\nEnter a Student ID to Search: ");
        searchID = input.nextInt();
        
        
        for (int count = 0; count < studentsArray.length; count++) {
            if (studentsArray[count] == searchID) {
                found = true;
                break;
            }
        }
        
        System.out.println();
        
        
        if (found) {
            System.out.println("Student is Available");
        } 
        else {
            System.out.println("Student is Not Available");
        }
        
    }
}