public class IT26102061Lab8Q2{
	public static void main(String[] args){
		int arrayA[]={10,20,30,40,50};
		int arrayB[]={34,67,12,89,12};
		int arrayC[]=new int[5];
		
		System.out.println("\nA Array Contents : ");
		for(int value : arrayA){
			System.out.print(value+" ");
		}
		
		System.out.println();
		System.out.println("\nB Array Contents : ");
		for(int value : arrayB){
			System.out.print(value+" ");
		}
		
		//add the content of array A and B and store it in a new array
		for(int i=0;i<arrayC.length;i++){
			arrayC[i]=arrayA[i]+arrayB[i];
		}
		
		System.out.println();
		System.out.println("\nC Array Contents (A + B) : ");
		for(int value : arrayC){
			System.out.print(value+" ");
		}
	}
}
		
		