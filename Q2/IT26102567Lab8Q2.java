public class IT26102567Lab8Q2{
	public static void main(String[] args){
		
		//Initailize arrays A and B with pre-defined values
		int[] A = {10, 20, 30, 40, 50};
		int[] B = {34, 67, 12, 89, 12};
		
		//Declare array C of size 5
		int[] C = new int[5]; 
		
		//Calculate A + B and store results in array C
		for(int i = 0; i < 5; i++){
			C[i] = A[i] + B[i];
		}
		
		//Print contents of array A 
		System.out.println("Array A Contents:  ");
		for(int i = 0; i < A.length; i++){
			System.out.print(A[i] + "  ");
			
		}
		System.out.println(); //Move on to the next line
		
		//Print contents of array B 
		System.out.println("Array B Contents:  ");
		for(int i = 0; i < B.length; i++){
			System.out.print(B[i] + "  ");
			
		}
		System.out.println(); //Move on to the next line
		
		//Print contents of array C
		System.out.println("Array C Contents (A + B):  ");
		for(int i = 0;  i < C.length; i++){
			System.out.print(C[i] + "  ");
			
		}
		System.out.println(); //Move on to the next line
		
	}
	
}