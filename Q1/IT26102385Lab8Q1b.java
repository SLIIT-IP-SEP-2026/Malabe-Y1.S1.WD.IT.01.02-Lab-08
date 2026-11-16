import java.util.Scanner;
public class IT26102385Lab8Q1b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int[]myArray=new int[5];
		int[]evenArray=new int[5];
		
		System.out.println("Enter the 5 numbers:");
		
		for(int i=0;i<5;i++){
			System.out.print("enter the number"+(i+1)+":");
			myArray[i]=input.nextInt();
		}
		System.out.println();
		System.out.println("my Array contents");
		
	for(int i=0;i<5;i++){
		System.out.print(myArray[i]+" ");
	}
	System.out.println();
	int j=0;
	for(int i=0;i<5;i++){
		if(myArray[i]%2==0);{
			evenArray[j]=myArray[i];
			j++;
		}
	}
	System.out.println();
	System.out.println("evenArray contents:");
	for(int i =0;i<5;i++){
		System.out.print(evenArray[i]+"");
	}
	}
}

