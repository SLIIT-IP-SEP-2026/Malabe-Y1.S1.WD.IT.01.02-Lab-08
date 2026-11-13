import java.util.Scanner; 

public class IT26102567Lab8Q4{
	public static void main(String[] args);
	Scanner input = new Scanner(System.in);
	int[] studentsArray = new int[8]
	int count = 0
	
	//Input 8 valid positive Student IDs 
	while(count < 8){
		System.out.print("Enter Student ID (" + (count + 1)  + "/6): ");
		int id = input.nextInt();
		
		if (id <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                studentsArray[count] = id;
                count++;
            }
        }

        // Ask user to enter a Student ID to search
        System.out.print("Enter a Student ID to Search: ");
        int searchId = input.nextInt();

        // Search for the Student ID in the array
        boolean found = false;
        for (int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i] == searchId) {
                found = true;
                break;
            }
        }

        // Display search results based on whether the student was found
        if (found) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }

        input.close();
    }
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
