import java.util.Scanner;
public class FactorialRecursion
{
static int factorial(int n)
{
if(n==0)
return 1;
else
return n*factorial(n-1);
}
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int n= sc.nextInt();
System.out.println("factorial of"+n+"is:"+factorial(n));
sc.close();
}
}