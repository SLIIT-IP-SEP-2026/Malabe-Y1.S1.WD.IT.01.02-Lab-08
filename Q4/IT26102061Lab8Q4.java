import java.util.Scanner;
public class IT26102061Lab8Q4{
	public static void main(String[] args){
		int num=1;
		Scanner input=new Scanner(System.in);
		int studentsArray[]=new int[8];
		
		for(int i =0;i<studentsArray.length;i++){
			while(true){
				System.out.print("Enter Student ID for Student "+num+" : ");
				studentsArray[i]=input.nextInt();
				if(studentsArray[i]>0){
					studentsArray[i]=studentsArray[i];
					num++;
					break;
				}
				else{
					System.out.println("Error : Please Enter ONLY Positive Numbers");
				}
			}
		}
		
		System.out.print("\nEnter a Student ID to Search : ");
		int checkID=input.nextInt();
		
		System.out.println();
		
		//for check available or not
		boolean available=false;
		
		for(int i=0;i<studentsArray.length;i++){
			if(checkID==studentsArray[i]){
				System.out.println("Student is Available");
				available =true;
				break;
			}
		}
		
		if(available==false){
			System.out.println("Student is Not Available");
		}
	}
}
				
			