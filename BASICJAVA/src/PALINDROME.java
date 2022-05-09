import java.util.Scanner;

public class PALINDROME {
	public static void main(String [] a)
	{
	Scanner sc=new Scanner (System.in);
	
	System.out.println("Enter the number: ");
	int num=sc.nextInt();
	int num1=num,rem=0,sum=0;
	
	while(num>0)
	{
		rem=num%10;
		sum=(sum*10)+rem;
		num=num/10;
	}
	if(sum==num1)
	{
		System.out.println("its palindrome");
	}
	else
	{
		System.out.println("not a palindrome ");
	}
		
	}
}
