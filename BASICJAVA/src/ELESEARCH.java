import java.util.Scanner;

public class ELESEARCH {
	public static void main(String[] args)
	{
	int flag=-1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size");
	int size=sc.nextInt();
	System.out.println("Enter the elements: ");
	int arr[]=new int [size];
	
	for(int i=0;i<size;i++)
		arr[i]=sc.nextInt();
	System.out.println("Enter the element to be searched: ");
	int key=sc.nextInt();
	for(int i=0;i<size;i++)
	{
		if(arr[i]==key)
		{
			flag=i;
			break;
		}
	}

		if(flag!=-1)
			System.out.println("Index position of "+key+" is: "+flag);
		else
			System.out.println("Element not found");
}
}


