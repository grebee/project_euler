package project_euler;

import java.awt.List;
import java.util.ArrayList;

public class class_to_run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Problem 6
		// System.out.println("Project Euler, problem 6!");
		//
		// Number6 number6 = new Number6();
		// int squareOfSum = number6.getSquareOfSum(1, 100);
		// System.out.println("Square of Sum from 1 to 100 is: " + squareOfSum);
		//
		// int sumOfSquare = number6.getSumOfSquare(1, 100);
		// System.out.println("Sum of Square from 1 to 100 is: " + sumOfSquare);
		//
		// int difference = squareOfSum - sumOfSquare;
		// System.out.println("The difference between the sum of the squares of the first one hundred natural numbers and the square of the sum is: "
		// + difference);

		// Problem 7
		// System.out.println("Project Euler, problem 7!");
		// int primeNumber = 10001;
		// int result = 0;
		// Number7 number7 = new Number7();
		// int count = 5;
		// for (int n = 13; n < Integer.MAX_VALUE; n++){
		// System.out.println("Checking if number " + n + " is prime number");
		// if (number7.primeNumber(n) == true){
		// count++;
		// System.out.println("Yes it's. " + n + " is prime #: " + count);
		// }
		// if (count == primeNumber){
		// result = n;
		// System.out.println("Prime Number 10 001 is number: " + result);
		// break;
		// }
		// else if (number7.primeNumber(n) == false)
		// System.out.println(n + " is not a prime number. Keep checking! ");
		// }

		// Problem 9
		// System.out.println("Project Euler, problem 9!");
		// Number6 number6 = new Number6();
		// int product = 0;
		// int a = 0;
		//
		// for (a = 1; a < 997; a++) {
		// for (int b = a + 1; b < 997; b = b + 2) {
		// for (int c = b + 1; c < 997; c++) {
		//
		// int a_b_square = number6.square(a) + number6.square(b);
		// int c_square = number6.square(c);
		// if (a_b_square == c_square && (a + b + c == 1000)) {
		// product = a * b * c;
		// System.out.println("Product of triplet (" + a + ", " + b
		// + ", " + c + ")"
		// + " that has  sum = 1000 is : " + product);
		// break;
		// }
		// }
		// }
		// }

		// Problem 10
		// System.out.println("Project Euler, problem 10!");
		// Number7 number7 = new Number7();
		// ArrayList<Integer> primeList = new ArrayList<Integer>();
		//
		// long start = System.currentTimeMillis();
		// System.out.println("Start program: " + start);
		//
		// for (int i = 8; i < 2000000; i++){
		// if (number7.primeNumber(i) == true){
		// //System.out.println(i + " is a prime number. Add to the list!");
		// primeList.add(i);
		// }
		// if (i == 1000000)
		// System.out.println("We have way through. Hang tight!");
		// }
		//
		// long elapsedTimeMillis = System.currentTimeMillis()-start;
		// float elapsedTimeSec = elapsedTimeMillis/1000F;
		//
		// System.out.println("End program: " + elapsedTimeSec + " s");
		//
		// System.out.println("DONE adding the LIST. Start calculating!");
		// int items = 17;
		// for (int item : primeList){
		// items = items + item;
		// }
		//
		// System.out.println("Sum of all prime number below 2 mil is : " +
		// items);
		int n = 11;
		int temp = 0;
		double round = Math.sqrt(n);
		int temp_round = (int) Math.round(round);
		if  (round < temp_round){
			round = round + 1;
			temp = (int) round;
		}
		else
			temp = (int) round;

		System.out.println(temp);

	}

}
