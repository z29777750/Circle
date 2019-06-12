import java.io.*;
public class Circle{    
	public static void main(String args[]) throws Exception
	{  
		String getbr;
		double radius,area;
		double pi=3.14159;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Radius：");
		getbr = br.readLine();
		radius=Double.parseDouble(getbr);
		area=pi*radius*radius;
		System.out.println("Area："+area);  
		
	}
}
