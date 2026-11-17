import java.util.Scanner;
public class IT26102477Lab8Q1A{
    public static void main(String [] args){
	
	int[] myArray = new int[5];
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter 5 number: ");
	
	for(int i=0; i<5; i++) {
		System.out.println("Enter number " + (i + 1) + " : ");
		myArray[i] = input.nextInt();
	}
	System.out.println();
	System.out.println("Array in Reverse order:");
	
	for(int i=4; i>=0; i--) {
		System.out.print(myArray[i] + " ");
	} 
	System.out.println();
	}
	}