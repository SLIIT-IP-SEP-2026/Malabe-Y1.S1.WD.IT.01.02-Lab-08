import java.util.Scanner;

public class IT26102385Lab8Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int[]myArray=new int[5];
		
		System.out.print("Enter the 5 numbers:");
		
		for(int i=0;i<5;i++){
			System.out.print("enter the number"+(i+1)+":");
			myArray[i]=input.nextInt();
		}
		System.out.println();
		System.out.println("Array in Reverse order");
		
	for(int i=4;i>=0;i--){
		System.out.print(myArray[i]+" ");
	}
	}
}

