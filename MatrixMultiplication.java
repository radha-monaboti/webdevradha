import java.util.Scanner;
public class MatrixMultiplication{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int[][] a=new int[2][2];
int[][] b=new int[2][2];
int[][] result=new int[2][2];
System.out.println("Enter elements of first 2*2 matrix:");
for(int i=0;i<2;i++)
for(int j=0;i<2;j++)
a[i][j]=sc.nextInt();
System.out.println("Enter elements of second 2*2 matrix:");
for(int i=0;i<2;i++)
for(int j=0;j<2;j++)
b[i][j]=sc.nextInt();
for(int i=0;i<2;i++)
for(int j=0;j<2;j++)
for(int k=0;k<2;k++)
result[i][j]+=a[i][k]*b[k][j];
System.out.println("Resultant matrix:");
for(int i=0;i<2;i++){
	
for(int j=0;j<2;j++)
System.out.println(result[i][j]+" ");
System.out.println();
}
sc.close();
}
}