import java.util.Scanner;
public class IT26100181Lab8Q2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Making array A and array B...
		int[] A = {10,20,30,40,50};
		int[] B = {34,67,12,89,12};
		
		//Getting totals by creating array C...
		int[] C = new int[5];
		for(int i = 0; i < C.length; i++){
			C[i] = A[i] + B[i];
		}
		
		//Printing the arrays...
		System.out.println("A array Contents : ");
		for(int i = 0; i < C.length; i++){
			System.out.print(A[i] + " ");
		}
		System.out.println();
		
		System.out.println();
		System.out.println("B array Contents : ");
		for(int i = 0; i < C.length; i++){
			System.out.print(B[i] + " ");
		}
		System.out.println();
		
		System.out.println();
		System.out.println("C array Contents (A + B): ");	
		for(int i = 0; i < C.length; i++){
			System.out.print(C[i] + " ");
		}
	}
}
