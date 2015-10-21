import java.util.Scanner;
class Expt1 {
	public static void main(String args[]){
		
		Scanner src=new Scanner(System.in);
		
		int n=src.nextInt(),k=src.nextInt(),count=0;
		
		for(int i=0;i<n;i++)
		{
			if(src.nextInt()%k==0){
				count++;
			}
		}
		System.out.println(count);
			
	}
} 
