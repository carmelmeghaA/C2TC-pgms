import java.util.Scanner;

public class CAPATALIZING {
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string 1: ");
	String s1=sc.nextLine();
	System.out.println("Enter the string 2: ");
	String s2=sc.nextLine();
	System.out.println(s1.substring(0,1).toUpperCase()
						+s1.substring(1)
						+" "
						+Character.toUpperCase(s2.charAt(0))
						+s2.substring(1));
						
	}
}
