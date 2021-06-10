module{
	package Edureka;
	import java.util.Scanner;
	public class Calculator {
	public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
	System.out.print("Enter two numbers: ");
	// nextDouble() reads the next double from the keyboard
	double first = reader.nextDouble();
	double second = reader.nextDouble();
	System.out.print("Enter an operator (+, -, *, /): ");
	char operator = reader.next().charAt(0);
	double result;
	switch(operator)
	{
	case '+':
	result = first + second;
	break;
	case '-':
	result = first - second;
	break;
	case '*':
	result = first * second;
	break;
	case '/':
	result = first / second;
	break;
	// operator doesn't match any case constant (+, -, *, /)


	default:
	System.out.printf("Error! operator is not correct");
	return;
	}
	//printing the result of the operations
	System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
	}
	}
	When you execute the above program, the output looks like as shown below:

	Enter two numbers: 20 98
	Enter an operator (+, -, *, /): /
	20.0 / 98.0 = 0.2
	2. Write a Java program to calculate a Factorial of a number.
	Factorial of a number is the product of all the positive numbers less than or equal to the number. The factorial of a number n is denoted by n!

	Now, let’s write a program and find factorial of a number using recursion.

	package Edureka;
	import java.util.Scanner;
	public class Factorial {
	public static void main(String args[]){
	//Scanner object for capturing the user input
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number:");
	//Stored the entered value in variable
	int num = scanner.nextInt();
	//Called the user defined function fact
	int factorial = fact(num);
	System.out.println("Factorial of entered number is: "+factorial);
	}
	static int fact(int n)
	{
	int output;
	if(n==1){
	return 1;
	}
	//Recursion: Function calling itself!!
	output = fact(n-1)* n;
	return output;
	}
	}
	On executing the above program, you will get factorial of a number as shown below:

	Enter the number:
	12
	Factorial of entered number is: 47900160
	3. Write a Java program to calculate Fibonacci Series up to n numbers.
	It is a series in which the next term is the sum of the preceding two terms. For Example: 0 1 1 2 3 5 8 13…….  Let’s write a Java program to calculate the Fibonacci series.

	package Edureka;
	public class Fibonacci {
	public static void main(String[] args) {
	//initializing the constants
	int n = 100, t1 = 0, t2 = 1;
	System.out.print("Upto " + n + ": ");
	//while loop to calculate fibonacci series upto n numbers
	while (t1<= n)
	{
	System.out.print(t1 + " + ");
	int sum = t1 + t2;
	t1 = t2;
	t2 = sum;
	}
	}
	}}
}