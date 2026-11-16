import java.util.Scanner;
public class IT26102480Lab8Q1B{
	public static void main (String[]args){
		
		//create new scanner
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 Numbers");
		
		int count= 0;
		
		//create array 
		
		int myArray[]= new int[5];
		int evenArray[] = new int[5];
		
		//input valuve to array
		for(int i=0 ; i<myArray.length ; i++){  
			System.out.print("Enter the Number"+(i+1)+ " : ");
			myArray[i]=sc.nextInt();
			System.out.println();
			
			if(myArray[i]%2 ==0 ){
				evenArray[count] = myArray[i];
				count++;
			}
		}
		
		
		//display main array values
		System.out.println("\nmyArray Contents:");
		for ( int i=0; i< myArray.length ; i++){
			System.out.print(myArray[i] + " ");
		}
		
		System.out.println();
		
		//display even array values
		System.out.println("\nevenArray Contents:");
		for ( count=0; count < evenArray.length ; count++){
			System.out.print(evenArray[count] + " ");
		}
		
		
		
		
		
		
	}
}