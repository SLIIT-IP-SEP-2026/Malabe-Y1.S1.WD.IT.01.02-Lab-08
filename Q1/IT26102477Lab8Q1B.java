import java.util.Scanner;
public class IT26102477Lab8Q1B{
    public static void main(String [] args){
	
	int j = 0;
	
	int[] evenArray = new int[5];
	int[] myArray = new int[5];
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter 5 number: ");
	
	for(int i=0; i<5; i++) {
		System.out.println("Enter number " + (i + 1) + " : ");
		myArray[i] = input.nextInt();
	}
	System.out.println();
	System.out.println("myArray contents: ");
	
	for(int i=0; i<5; i++) {
		System.out.print(myArray[i] + " ");
	} 
	for(int i=0; i<5; i++) {
		if (myArray[i] % 2 ==0) {
			evenArray[j] = myArray[i];
			j++;
		}
	}
	System.out.println();
	System.out.println("evenArray Contents:");
	for(int i = 0; i < evenArray.length; i++) {
		System.out.print(evenArray[i] + " ");
	}
	System.out.println();
	}
	}