

	import java.util.Scanner;
	public class evennumb {
		public static void main(String[] args){
					int number, evenSum = 0,i;
					Scanner sc = new Scanner(System.in);
					System.out.print(" Please Enter any Number : ");
					number = sc.nextInt();
					for(i = 1; i <= number; i++)
					{
						if(i % 2 == 0)
						{
							evenSum = evenSum + i; 
						}
				}
		System.out.println("\n The Sum of Even Numbers upto " + number + "  =  " + evenSum);
		}
	}
