import java.util.Scanner;
public class BANKING{
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
    String username;
    String password;
    String user;
    String pass;
    System.out.println(" enter your username");
    username=input.nextLine();
    System.out.println(" enter your password");
    password=input.nextLine();
   user="lavanya";
   pass="12345";
     
    if(username.equals(user) && (password.equals(pass))){
    System.out.println("savings");  
    System.out.println("fixed ");
    System.out.println("current");
    }
    else 
    {
     System.out.println("wrong password or username");
	}
    int balance=10000,withdraw;
   
    	{
    	System.out.println(" 1  withdraw");
    	System.out.println("2  check balance");
    	System.out.print(" select operation:");
        int n = input.nextInt();
       
            
            	System.out.println("balance:10000");
            System.out.print("  withdrawn amount :");
            withdraw = input.nextInt();
            if(balance >= withdraw)
            {
                balance = balance - withdraw;
                System.out.println("collect your money");
            }
            else
            {
                System.out.println("Insufficient Balance");
            }
            System.out.println("");
    
            {
            	
            	
                System.out.print(" balance: "+balance);
                System.out.println("");
                System.exit(0);
               
               
                }}
    	}
	}

  

    
    