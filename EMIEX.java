  
import java.util.Scanner;
public class EMIEX {
	public static void main(String[] args) {
	float amt,dp,ba,intrest,n,month,mi,emi,rate;
	Scanner input =new Scanner(System.in);
	System.out.println("AMOUNT           :  ");
	amt = input.nextInt();
	System.out.println("DOWN PAYMENT    :    ");
	dp = input.nextInt();
	System.out.println("TOTAL    :    ");
	ba = amt - dp;
	System.out.println("INTREST RATE      :    ");
	rate=input.nextInt();
	System.out.println("NO. YEAR      :    ");
	n = input.nextInt();
	intrest= (ba*rate/100)*n;
	System.out.println("MONTH     :          ");
	month =(n*12)-1 ;
	System.out.println("MONTHLY INTRST       :    ");
	mi = intrest/month;
	

	
	

	
	
	 System.out.println("_________________________________________________");
	 System.out.println("                   Emi receipt  "                );
	 System.out.println("_________________________________________________");
	 System.out.println("amount                                    "+amt    );
     System.out.println("Down payment                              "+dp     );
     System.out.println("balance amount                            "+ba     );
     System.out.println("interest rate                             "+rate   );
     System.out.println("Interest                                  "+intrest);
     System.out.println("Year                                      "+n      );
	 System.out.println("Month                                     "+month  );
     System.out.println("Month interest                            "+mi     );
     System.out.println("__________________________________________________");
     System.out.println("__________________________________________________");
     emi =(ba+intrest)/month;
     System.out.println("Emi                                           "+emi);
     System.out.println("__________________________________________________");
     System.out.println("__________________________________________________");
	}
	
}