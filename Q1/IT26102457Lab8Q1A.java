import java.util.Scanner;
public class IT26102457Lab8Q1A
{
	public static void main(String[]args)
    {
		Scanner input=new Scanner(System.in);
		
		int i;
		System.out.println("Enter the 5 Numbers :");
		int number[]=new int[5];
		for(i=0;i<number.length;i++){
			System.out.print("Enter the number "+(i+1)+": ");
			number[i]=input.nextInt();
		    }
			
		System.out.println(" ");
        System.out.println("Array in Reverse Order:");
        for(i=number.length-1;i>=0;i--){
            System.out.print(number[i]+"  ");
		}			
			
	} 	
}