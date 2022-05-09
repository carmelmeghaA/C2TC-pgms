import java.util.Scanner;

public class STRINGLENGTH_CANCAT {
	public static void main(String [] ags)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String string=sc.nextLine();
		System.out.println("the length of the string is "+string.length());
		System.out.println("Enter the string for cancatination: ");
		String a=sc.nextLine();
		String b=sc.nextLine();
		
		System.out.println(a+b);
	}
}

