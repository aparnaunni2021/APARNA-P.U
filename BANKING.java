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
    while(true)
    	{
    	System.out.println("choose 1 for withdraw");
    	System.out.println("choose 2 for check balance");
    	System.out.print("operation you want to perform:");
        int n = input.nextInt();
        switch(n)
        {
            case 1:
            	System.out.println("balance:10000");
            System.out.print(" money to be withdrawn:");
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
    
            case 2:{
            	
            	
                System.out.print(" balance: "+balance);
                System.out.println("");
                System.exit(0);
               
               
                }}
    	}
	}
}
  

    
    