import java.util.Scanner;
public class IT26102061Lab8Q3{
	public static void main(String[] args){
		
		Scanner input=new Scanner(System.in);
		int array[]=new int[6];
		int num=1,index=0;
		
		for(int i=0;i<array.length;i++){
			
			while(true){
				System.out.print("Enter a Positive Number ("+num+"/6) : ");
				index=input.nextInt();
				if(index>0){
					array[i]=index;
					num++;
					break;
					
				}
				else{
					System.out.println("Error : Please Enter ONLY Positive Numbers");
				}
				
			}
			
		}
		
		System.out.println();
		System.out.println("Array Contents :");
		
		for(int value : array){
			System.out.print(value+" ");
		}
		
		//maximum number
		
		int max=array[0];
		for(int i=0;i<array.length;i++){
			if(array[i]>max){
				max=array[i];
			}
		}
		System.out.println();
		System.out.println("\nThe Maximum Number Entered : "+max);
	}
}
			
				