import java.util.Scanner;
class Multi
{
public static void main(String arg[])
{
int n,c;
System.out.print("Enter an interger to print its multiplication table");
Scanner in=new Scanner(System.in);
n=in.nextInt();
System.out.println("Multiplication table of "+n+" is:");
for(c=1;c<=10;c++)
System.out.println(n + "*" + c + "="  +(n*c));
}
}