import java.util.Scanner;
  
    public class IT26101754Lab8Q4 {
	
	    public static void main(String[] args) {
		
		int userInput;
		int searchID;
		
		boolean status = true;
		boolean found = false;
		
		int[] studentsArray = new int[8];
		
		Scanner Sc = new Scanner(System.in);
		
		for (int count = 0; count < studentsArray.length; count++) {
		
		   while (status) {
		   
		        System.out.print("Enter Status ID for Student " + (count + 1) + " : ");
				userInput = Sc.nextInt();
				
				if (userInput > 0) {
				
				    studentsArray[count] = userInput;
					break;
				}
                else {
                   System.out.println("Error : please Enter ONLY Positive Numbers");
                }
            }
        }

        System.out.println();

        System.out.print("Enter a Student ID to Search : ");
        searchID = Sc.nextInt();

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
		