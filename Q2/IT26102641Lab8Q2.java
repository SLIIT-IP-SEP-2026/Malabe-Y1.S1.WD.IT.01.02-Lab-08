public class IT26102641Lab8Q2 {
    public static void main(String[] args) {
       
	    int[] A = {10, 20, 30, 40, 50};
        int[] B = {34, 67, 12, 89, 12};
        int[] C = new int[5];
		
		// Add A + B and put in C
		
        for (int a = 0; a < 5; a++) {
            C[a] = A[a] + B[a];
        }
        System.out.println("A Array Contents:");
       
     	for (int a = 0; a < 5; a++) {
            System.out.print(A[a] + " ");
        }
        System.out.println();
        System.out.println("B Array Contents:");
        
		for (int a = 0; a < 5; a++) {
            System.out.print(B[a] + " ");
        }
        System.out.println();
        System.out.println("C Array Contents (A + B):");
        
		for (int a = 0; a < 5; a++) {
            System.out.print(C[a] + " ");
        }
    }
}