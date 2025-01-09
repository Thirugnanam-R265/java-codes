import java.util.Scanner;
public class student
{
public static void main(String arga[])
{
Scanner obj= new Scanner(System.in);
System.out.println("Enter your Student Name:");
String Name= obj.nextLine();
System.out.println("the Student Name is:"+Name);

Scanner obj1= new Scanner(System.in);
System.out.println("Enter Student Roll number:");
String Rollnum= obj1.nextLine();
System.out.println("The Student Roll Number is:"+Rollnum);

Scanner obj2= new Scanner(System.in);
System.out.println("The Student classname is:");
String classname= obj2.nextLine();
System.out.println("The Student classname is:"+classname);

Scanner obj3= new Scanner(System.in);
System.out.println("Student section name is:");
String Section= obj3.nextLine();
System.out.println("the Section name is:"+Section);

int marks[]= new int[5];
int i;
float total= 0, avg;
Scanner obj4= new Scanner(System.in);
for(i=0; i<5; i++)
{
System.out.println("Enter marks of subjects"+(i+1)+":");
marks[i]= obj4.nextInt();
total= total+ marks[i];
}
obj4.close();

avg = total/5;
        System.out.print("The student Grade is: ");
if(avg>=80)
        {
            System.out.print("A");
        }
        else if(avg>=60 && avg<80)
        {
           System.out.print("B");
        } 
        else if(avg>=40 && avg<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
    }
}