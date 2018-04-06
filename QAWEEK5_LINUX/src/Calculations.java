import java.util.Scanner;



public class Calculations {

	public static void main(String[] args) {

//		int num1 = 0;
//		int num2 = 0;
//		String operation;

		Calculations newcalculations = new Calculations();
		System.out.println(newcalculations.performSum("+", 2, 2));

	}

	public int performSum(String operation, int number1, int number2) {

//		Scanner userinput = new Scanner(System.in);
//		System.out.println("What operator would you like to use");
//		String useropera = userinput.nextLine();
//		System.out.println("Enter the first number");
//		int num1 = Integer.parseInt(userinput.nextLine());
//		System.out.println("Enter the second number");
//		int num2 = Integer.parseInt(userinput.nextLine());
		


		if (operation.equals("+")) {
			return (number1 + number2);
		} else if (operation.equals("-")) {
			return (number2 - number1);
		} else if (operation.equals("/")) {
			return (number1 / number2);
		} else if (operation.equals("*")) {
			return (number1 * number2);
		} else {
			return -1;
		}
		
	
	}

}
