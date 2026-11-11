public class IT26102405Lab8Q2 {

	public static void main(String[] args) {
	
		int[] arrayA = {10, 20, 30, 40, 50};
		int[] arrayB = {34, 67, 12, 89, 12};
		int[] arrayC = new int[5];
	
		for (int i = 0; i < arrayC.length; i++) {
			arrayC[i] = arrayA[i] + arrayB[i];
		}
		
		System.out.println("A Array Contents:");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print(arrayA[i] + " ");
		}
		
		System.out.println();
		System.out.println("\nB Array Contents:");
		for (int i = 0; i < arrayB.length; i++) {
			System.out.print(arrayB[i] + " ");
		}
		
		System.out.println();
		System.out.println("\nC Array Contents (A + B):");
		for (int i = 0; i < arrayC.length; i++) {
			System.out.print(arrayC[i] + " ");
		}
	
	}

}