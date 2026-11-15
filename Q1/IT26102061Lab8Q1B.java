import java.util.Scanner;
public class  IT26102061Lab8Q1B{
	public static void main(String[] args){
		int number=1;
		Scanner input=new Scanner(System.in);
		int myArray[]=new int[5];
		
		System.out.println("Enter 5 Numbers :");
		for(int i=0;i<myArray.length;i++){
			System.out.print("Enter Number "+number+" : ");
			myArray[i]=input.nextInt();
			number++;
		}
		System.out.println("\nmyArray Contents : ");
		for(int i=0;i<myArray.length;i++){
			System.out.print(myArray[i]+" ");
		}
		
		int evenArray[]=new int[5];
		int index=0;
		
		for(int i=0;i<myArray.length;i++){
			if(myArray[i]%2==0){
				evenArray[index]=myArray[i];
				index++;
			}
		}
		System.out.println();
		System.out.println("\nevenArray Contents : ");
		
		for(int i=0;i<evenArray.length;i++){
			System.out.print(evenArray[i]+" ");
		}
		
	}
}
			