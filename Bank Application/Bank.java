import java.util.Scanner;
import java.lang.String;
import java.lang.System;
class Bank{
public static void main(String[] args)
{
System.out.println("STATE BANK OF INDIA");
System.out.println("Enter Customer Name");
Scanner sc=new Scanner(System.in);
String name=sc.nextLine();
System.out.println("Enter customer 5 digit Password");
String pass=sc.nextLine();
if (pass.length()==5)
{
    System.out.println("Valid password");
}
else
{
System.out.println("Invalid Pasword"); 
System.exit(0);
}

System.out.println("DO YOU WANT TO CONTINUE");
System.out.println("CLICK 1.NO 2.YES");
System.out.println("Enter your choice");
int choice=sc.nextInt();
switch(choice){
case 1:System.out.println("thanks for visting");System.exit(0);
       break;
case 2:
       System.out.println("click your prefered option");
       System.out.println("1.Bank balance");
       System.out.println("2.Withdraw");
       System.out.println("3.Cardless deposit");
       System.out.println("4.Update mobile no");
       System.out.println("5.Mini Statement");
       break;  
default:System.out.println("Wrong preffered choice");                
}
int p_choice=sc.nextInt();
int balance=5000;
switch(p_choice)
{
case 1:System.out.println(balance);break;
case 2:System.out.println("How much amount are you going to withdrawn");
       int withdrawn=sc.nextInt();
       int amount=balance-withdrawn;
       System.out.println(amount);
       break;
case 3:System.out.println("Enter Deposit amount");
       int deposit=sc.nextInt();
       int amount1=balance+deposit;
       System.out.println(amount1);
       break;
case 4:System.out.println("Enter your current mobile number");
       int mbno=sc.nextInt();
       System.out.println("Enter your updated mobile no");
       int mbno2=sc.nextInt(); 
       if(mbno==mbno2)
       {
        System.out.println("Unable to proceess");
       } 
       else
       {
        System.out.println("Your mobile number is updated");
       }
       break;
case 5:System.out.println("Mini statement is not available");break;
default:System.out.println("Wrong preffered choice");
}
}
}