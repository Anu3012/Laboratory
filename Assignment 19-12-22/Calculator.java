package basic;
import java.util.Scanner;
public class Calculator {
	public static int addition(int a, int b)
	{
		int result=a+b;
		result result;
	}
	public static int substraction(int a ,int b)
	{
		int c;
		if(a>b)
		{
			c=a-b;
		}
		else
		{
			c=b-a;
		}
		return c;
	}
	public static int multiply (int a,int b)
	{
		int mul=a*b;
		return mul;
	}
	public static int division (int  a ,int b)
	{
		double div;
		if(a>b)
		{
			div=a/b;
		}
		else
		{
			div=b/a;
		}
		return div;
	}

	public static void main(String[] args) {
		int choice,num1,num2,res;
		Scanner sc= new Scanner(System.in);
		System.out.println("Which operation do you want to perform:");
		System.out.println("1)Addition /n 2)Substraction /n 3)Multiplication /n 4)Division");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter the 1st digit:");
			num1=sc.nextInt();
			System.out.println("Enter the 2nd number:");
			num2=sc.nextInt();
			res=Calculator.addition(num1,num2);
			System.out.println("Addition is:"+res);
			break;
		case 2:
			System.out.println("Enter the 1st digit:");
			num1=sc.nextInt();
			System.out.println("Enter the 2nd number:");
			num2=sc.nextInt();
			res=Calculator.substraction(num1,num2);
			System.out.println("Substraction is:"+res);
			break;
		case 3:
			System.out.println("Enter the 1st digit:");
			num1=sc.nextInt();
			System.out.println("Enter the 2nd number:");
			num2=sc.nextInt();
			res=Calculator.multiply(num1,num2);
			System.out.println("Multiplication is:"+res);
			break;
		case 4:
			System.out.println("Enter the 1st digit:");
			num1=sc.nextInt();
			System.out.println("Enter the 2nd number:");
			num2=sc.nextInt();
			res=Calculator.division(num1,num2);
			System.out.println("Division is:"+res);
			break;
		}
		

	}

}
