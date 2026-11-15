import java.util.Scanner;
public class  IT26102402Lab8Q2{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int[] A = {10,20,30,40,50};
		int[] B = {34,67,12,89,12};
		int[] C = new int[5];
		
		System.out.println("A array contents: ");
		
		for(int i = 0; i<5; i++){
			System.out.print(A[i] + " ");
			
		}
		System.out.println();
		System.out.println("\nB array contents: ");
		
		for(int i = 0; i<5; i++){
			System.out.print(B[i] + " ");
		}
		
		
		for(int i = 0; i<5; i++){
			C[i] = A[i] + B[i];
		}
		System.out.println();
		System.out.println("\nC array contents (A+B): ");
		
		for(int i = 0; i<5; i++){
			System.out.print(C[i] + " ");
		}
		
	}
}