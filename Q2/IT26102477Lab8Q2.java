public class IT26102477Lab8Q2{
    public static void main(String [] args){
	
	int arrayA[] = {10,20,30,40,50};
	int arrayB[] = {34,67,12,89,12};
	
	int[] arrayC = new int[5];
	
	for(int count = 0; count < arrayA.length; count++) {
		arrayC[count] = arrayA[count] + arrayB[count];
	}
	
    System.out.println("\nA Arrary contents: ");
	for(int count = 0; count < arrayA.length; count++) {
	    System.out.print(arrayA[count] + " ");
	}
	System.out.println();
	
	System.out.println("\nB Arrary contents: ");
	for(int count = 0; count < arrayB.length; count++) {
	    System.out.print(arrayB[count] + " ");
	}
	System.out.println();
	
	System.out.println("\nC Arrary contents (A + B): ");
	for(int count = 0; count < arrayC.length; count++) {
	    System.out.print(arrayC[count] + " ");
	}
	}
	}