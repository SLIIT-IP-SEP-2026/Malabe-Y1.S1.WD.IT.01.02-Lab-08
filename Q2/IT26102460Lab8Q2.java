public class IT26102460Lab8Q2{
	public static void main(String[] args){
		int A [] ={10, 20, 30, 40, 50};
		int B [] ={34, 67, 12, 89, 12};
		int C [] = new int[5];
		
		//Adding A and B
		for(int i=0; i <= 4 ; i++){
			C[i] = A[i] + B[i];
		}
		//Printing A array
		System.out.println("\nA Array contents:");
		for(int a=0; a < A.length; a++){
			System.out.print(A[a] +" ");
		}
		
		//Printing B array
		System.out.println("\nB Array contents:");
		for(int b=0; b < B.length; b++){
			System.out.print(B[b] +" ");
		}
		
		//Printing C array
		System.out.println("\nC Array contents (A+B):");
		for(int c=0; c < C.length; c++){
			System.out.print(C[c] +" ");
		}
	}
	
}