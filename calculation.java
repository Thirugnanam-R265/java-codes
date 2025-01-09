import java.util.Scanner;
public class calculation{
public static void main(String args[]){
int a,b,add,sub,mul;
float divide;
Scanner obj=new Scanner(System.in);
System.out.println("enter the value of a:");
a=obj.nextInt();
System.out.println("enter the value of b:");
b=obj.nextInt();
add=a+b;
sub=a-b;
mul=a*b;
divide= (float)a/b;
System.out.println("add of two num:"+add);
System.out.println("sub of two num:"+sub);
System.out.println("mul of two num:"+mul);
System.out.println("div of two num:"+divide);
}
}