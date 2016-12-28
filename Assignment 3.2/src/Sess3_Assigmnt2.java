import java.util.Scanner;

public class Sess3_Assigmnt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner inputReader = new Scanner(System.in);
			String S1,S2;
			boolean same=false;
			System.out.println("Enter the value of String 1 :");
			S1=inputReader.nextLine();
			System.out.println("Enter the value of String 2 :");
			S2=inputReader.nextLine();
			
			if(S1.equalsIgnoreCase(S2))
			{
				same=true;
			}
			System.out.println("Value of variable same : "+same);
	}

}

/*
******************************************************************************
Output 1:
Enter the value of String 1 :
abc
Enter the value of String 2 :
abc
Value of variable same : true

Output 2:
Enter the value of String 1 :
abc
Enter the value of String 2 :
cba
Value of variable same : false

******************************************************************************
*/