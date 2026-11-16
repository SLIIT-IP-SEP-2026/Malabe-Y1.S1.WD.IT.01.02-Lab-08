import java.util.Scanner;
public class IT26102457Lab8Q3
{
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		int number[]=new int[6];
		int i;
		
		
		for(i=0;i<number.length;i++){
			System.out.print("Enetr a postive Number ("+(i+1)+"/6):");
			number[i]=input.nextInt();
			if(number[i]<=0){
				System.out.println("Error : Please Enter Only postive Numbers");
				i=i-1;
			}
		}
		
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Array Contents: ");
		
		for (i=0;i<number.length;i++){
			System.out.print(number[i]+" ");
		}	
		
		int maxnumber = number[0]; 
		
		for (i = 1; i < number.length; i++) {
			if (number[i] > maxnumber) {
				maxnumber = number[i]; 
			}
		System.out.println(" ");
		}		
		System.out.print("The Maximun Number Entered : "+maxnumber);
		
	}
}