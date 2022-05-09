import java.util.Arrays;
import java.util.Scanner;

public class ANAGRAM {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sring 1: ");
		String str1=sc.next();
		System.out.println("Enter the sring 2: ");
		String str2=sc.next();
		char [] ch1=str1.toCharArray();
		Arrays.sort(ch1);
			String sorted1=new String(ch1);
		char [] ch2=str2.toCharArray();
		Arrays.sort(ch2);
			String sorted2=new String(ch2);
		if(sorted1.equalsIgnoreCase(sorted2))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
	}
	}
