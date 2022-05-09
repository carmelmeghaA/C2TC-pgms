import java.util.Scanner;

public class TRANSPOSE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the no of rows: ");
		int r=sc.nextInt();
		System.out.println("Enter the no of columns: ");
		int c=sc.nextInt();
		System.out.println("Enter the elements");
		
        int [][] A1=new int[r][c];
        for(int i=0;i<r;i++)
        {
        	for(int j=0;j<c;j++)
        		A1[i][j]=sc.nextInt();
        }
        for(int i=0;i<r;i++)
        	for(int j=0;j<c;j++)
        	{
        		System.out.println(A1[i][j]+"\t");
        	}
        System.out.println();
        		
	 for(int i=0;i<c;i++)
     	for(int j=0;j<r;j++)
     	{
     		System.out.print(A1[j][i]);
     	}
     System.out.println();
     		
	}
	}

