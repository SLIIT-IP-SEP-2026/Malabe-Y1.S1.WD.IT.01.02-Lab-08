import java.util.Scanner;
public class IT26102573Lab8Q4{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		int[]num = new int[9];
		int i ;
		for( i = 1 ; i<=8 ; i++){
			System.out.print("Enter Student ID for Student "+ i + " : ");
			num[i]  = input.nextInt();
			if(num[i] <= 0 ){
				System.out.println("Error : Please Enter ONLY Positive Numbers");
				i--;
			}
		
		
		}
		System.out.print("Enter a Student ID to Search : ");
		int ID = input.nextInt();
		boolean found = false;

        for(i = 1; i <= 8; i++) {
            if(num[i] == ID) {
                found = true;
                break;
            }
        }

        if(found) {
            System.out.println("Student is Available");
        }
        else {
            System.out.println("Student is not Available");
        }
	}
}