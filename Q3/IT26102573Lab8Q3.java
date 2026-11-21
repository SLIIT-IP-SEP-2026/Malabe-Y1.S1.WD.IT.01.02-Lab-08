import java.util.Scanner;
public class IT26102573Lab8Q3{
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		
		int[] num = new int[7];
		int i;
		
	    for( i = 1 ; i<=6 ; i++){
			System.out.print("Enter a Positive number (" + i +"/6) : ");
		    int num1 = input.nextInt();
			
			if(num1<=0){
				System.out.println("Error : Please Enter ONLY Positive Numbers");
				i--;
			}	
			else{
				num[i] = num1;
			}
			
		    
	    }
		System.out.println("Array Constents :");
		for( i = 1 ; i<=6 ; i++){
		    System.out.print( num[i] + " ");
		    
		}

		int max = num[0];

        for (i = 1; i < 6; i++) {
            if (num[i] > max) {
            max = num[i];
            }
        }
        System.out.println();
        System.out.println("The Maximum Number Entered: " + max);
	}	 
}