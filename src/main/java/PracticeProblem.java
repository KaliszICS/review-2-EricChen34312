import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		//Write question 1 code here

		//Initiate scanner
		Scanner sc = new Scanner(System.in);

		//Get and print message
		System.out.print("In: ");

		String str = sc.nextLine();
		System.out.println(str);
	}

	public static void q2() {
		//Write question 2 code here

		//initiate scanner
		Scanner sc = new Scanner(System.in);

		//get two integers
		System.out.print("In: ");
		int x = sc.nextInt();

		System.out.print("In: ");
		int y = sc.nextInt();

		//print quotient and modulo
		System.out.println(x/y);
		System.out.println(x%y);

	}

	public static void q3() {
		//Write question 3 code here

		//Initiate scanner
		Scanner sc = new Scanner(System.in);

		//get input 
		System.out.print("In: ");
		String str = sc.nextLine();

		//print concatenated message
		System.out.println(str + " was the text you wrote");
	}

	public static void q4() {
		//Write question 4 code here
		
		//initiate scanner
		Scanner sc = new Scanner(System.in);

		//get int
		System.out.print("In: ");
		int x = sc.nextInt();

		//print x*5
		System.out.println(x*5);
	}

	public static void q5() {
		//Write question 5 code here
		//initiate scanner
		Scanner sc = new Scanner(System.in);

		//get bool
		System.out.print("In: ");
		boolean bool = sc.nextBoolean();

		//print message
		System.out.println(bool + " is a boolean");
	}

	public static void q6() {
		//Write question 6 code here
		//initiate scanner
		Scanner sc = new Scanner(System.in);

		//get double
		System.out.print("In: ");
		double x = sc.nextDouble();

		//print x-3.2
		System.out.println(x-3.2);

	}

}
