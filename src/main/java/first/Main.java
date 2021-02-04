package first;
import java.util.*;
import maths.Arithmetic;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		Arithmetic arth=new Arithmetic();
		System.out.println("Sum : "+arth.add(a,b));
		System.out.println("Difference : "+arth.sub(a,b));
		System.out.println("Product : "+arth.mul(a,b));
		System.out.println("Division : "+arth.div(a,b));
		sc.close();
	}
}