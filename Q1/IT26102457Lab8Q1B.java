import java.util.Scanner;
public class IT26102457Lab8Q1B
{
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		int i;
		
		int number[]=new int[5];
		int evennumber[]=new int[5];
		
		for (i=0;i<number.length;i++){
			System.out.print("Enter Number "+(i+1)+" :");
            number[i]=input.nextInt();
		}
        System.out.println(" ");
        System.out.println("myArray contents:");
		
		
        for(i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
		}
		
		
        System.out.println(" ");
        System.out.println("evenArray Contents :");
		
		
		for(i=0;i<number.length;i++){
			if(number[i]%2==0){
				evennumber[i]=number[i];
			}
		}
        
        for (i=0;i<evennumber.length;i++){
            System.out.print(evennumber[i]+" ");
        }			
	}
}