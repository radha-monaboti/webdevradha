import java.util.Scanner;
public class Sumof5subjects{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
//Declare individual variables
int S1,S2,S3,S4,S5,total;
double percentage;
//Taking input for 5 subjects
System.out.print("enter marks for subject 1:");
       S1=sc.nextInt();
System.out.print("enter marks for subject 2:");
       S2=sc.nextInt();
System.out.print("enter marks for subject 3:");
       S3=sc.nextInt();
System.out.print("enter marks for subject 4:");
       S4=sc.nextInt();
System.out.print("enter marks for subject 5:");
       S5=sc.nextInt();
//Calculate total and percentage
total=S1+S2+S3+S4+S5;
percentage=(double)total/5;
//Display result
System.out.println("Total marks="+total);
System.out.println("percentage="+percentage+"%");
       sc.close();
    }
}