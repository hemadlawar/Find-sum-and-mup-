import java.util.Scanner;

public class dailyproblem {
/*Q-take 2 numbers from the user and print result of multiplication and
 *  sum all the numbers between these 2 numbers E.g user presses 3 and 8
 *  then 4+5+6+7 is 22 and 4*5*6*7 is 840.
 *  (restrict user that first number should less than second number)
 * 
 * 
 * */
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("write first number");
		System.out.println("===============");
		int firstNum=scanner.nextInt(); // write first number
		System.out.println("write second number");
		System.out.println("===============");

		int SecondNum=scanner.nextInt(); // write second number
		
		if(firstNum<SecondNum) {
		int sum=0; int mup=1;
		for(int i=firstNum+1;i<SecondNum;i++) {
			sum=sum+i;
		mup=mup*i;
			
		}	System.out.println("sum result is "+ sum); 
		 System.out.println("mup result is "+mup);
		}
		else {
			
		System.out.println("first number shoul less than second number");	
			
		}
		
	}

}
