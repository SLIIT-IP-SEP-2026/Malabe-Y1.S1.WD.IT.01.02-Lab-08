public class IT26102000Lab8Q2{
	
	public static void main(String[] args){
		
		//creating arrays
		int[] A = {10,20,30,40,50};
		int[] B = {34,67,12,89,12};
		int[] C = new int[5];
		
		//calculating A+B and storing in Array C
		for(int i = 0; i < 5; i++){
			
			C[i] = A[i] + B[i];
		}
		
		//Displaying array content
		System.out.println("A array contents: ");
		for(int i = 0; i < 5; i++){
			System.out.print(A[i] + " " );
		}
		
		System.out.println();
		
		System.out.println("\nB array contents: ");
		for(int i = 0; i < 5; i++){
			System.out.print(B[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("\nC array contents (A+B): ");
		for(int i = 0; i < 5; i++){
			System.out.print(C[i] + " ");
		}
		
		System.out.println();
	}
}