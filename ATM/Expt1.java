import java.util.*;
public class Expt1 {
	public static void main(String args[]){
		
		Scanner src=new Scanner(System.in);
		
		float x=src.nextFloat();
		float y=src.nextFloat();
		
		if(x%5!=0 | (x+0.5)>y)
			System.out.println(y);
		else System.out.println(y-(x+0.5));
	}
}
