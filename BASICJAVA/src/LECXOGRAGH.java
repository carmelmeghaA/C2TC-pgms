import java.util.Scanner;

public class LECXOGRAGH {
	public static void main(String [] a)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string 1: ");
		String s1=sc.next();
		System.out.println("Enter the string 2: ");
		String s2=sc.next();
		if(s1.compareTo(s2)>0)
			System.out.println("yes lecxographically larger.");
		else
			System.out.println("no, its not lecxographically larger. ");
	}

}
