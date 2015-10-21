import java.util.*;
	public class Expt1 {
		public static void main(String args[]){
			
			Scanner src=new Scanner(System.in);
			byte temp;
			
			while((temp=src.nextByte())!=42)
			{
				System.out.println(temp);
			}
		}
	}
