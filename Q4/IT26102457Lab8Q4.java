import java.util.Scanner;
public class IT26102457Lab8Q4
{
	public static void main(String[]args)
	
	{
		Scanner input=new Scanner(System.in);
		int studentid[]=new int[8];
	    int i=1;
		int enterid;
		
		
		for(i=0;i<studentid.length;i++){
			System.out.print("Enter the ID for Student "+(i+1)+": ");
			studentid[i]=input.nextInt();
			if(studentid[i]<=0){
				
				System.out.println("Error : Please Enter ONLY Postive Numbers");
				i=i-1;
			}
		}
		
		
	    System.out.println(" ");
		System.out.print("Enter a Student ID to Search: ");
		enterid=input.nextInt();
		System.out.println(" ");
		
		boolean found = false;
        for (i=0; i < studentid.length; i++) {
            if (studentid[i] == enterid) {
                found = true;
                break;
            }
        }
        
        
        if (found) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }
		
	}
}