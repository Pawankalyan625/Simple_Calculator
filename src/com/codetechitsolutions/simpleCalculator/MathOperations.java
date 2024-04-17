package com.codetechitsolutions.simpleCalculator;

import java.util.Scanner;

public class MathOperations {

	Rainbow r = new Rainbow();
	Scanner sc = new Scanner(System.in);

	public void addition() {
		double result = 0;
		boolean continues = true;
		System.out.println(r.ANSI_YELLOW + "Enter numbers one by one with signs(press Enter after each number or type "
				+ r.ANSI_RED + "'done'" + r.ANSI_RESET + r.ANSI_YELLOW + " to finish addition.): " + r.ANSI_RESET);
		while (continues) {
			try {
				String str = sc.next().toLowerCase();
				if (str.equals("done")) {
					System.out.println(r.ANSI_YELLOW + "Result  is: " + r.ANSI_RESET + r.ANSI_GREEN + r.ANSI_BOLD
							+ result + r.ANSI_RESET);
					System.out.println(r.ANSI_YELLOW + "Do you want to add more numbers type " + r.ANSI_RESET
							+ r.ANSI_GREEN + "YES" + r.ANSI_RESET + "/" + r.ANSI_RED + "NO" + r.ANSI_RESET);
					String s = sc.next().toLowerCase();
					if (s.equals("no")) {
						continues = false;
					} else {
						System.out.println(r.ANSI_YELLOW
								+ "Enter numbers one by one with signs(press Enter after each number or type "
								+ r.ANSI_RED + "'done'" + r.ANSI_RESET + r.ANSI_YELLOW + " to finish addition): "
								+ r.ANSI_RESET);

					}

				} else {
					double number = Double.parseDouble(str);
					result += number;
				}
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			}

		}

	}

	public void subtract() {
		System.out.println(r.ANSI_BG_BLUE + "Enter two numbers: " + r.ANSI_RESET);

		try {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			double result = num1 - num2;

			System.out.println(r.ANSI_YELLOW + "Result is: " + r.ANSI_RESET + r.ANSI_GREEN + result + r.ANSI_RESET);
			System.out.println(r.ANSI_PRUPLE + "Do you want to perform again type " + r.ANSI_RESET + r.ANSI_GREEN
					+ "Yes" + r.ANSI_RESET + "/" + r.ANSI_RED + "No" + r.ANSI_RESET);
			String str = sc.next().toLowerCase();
			if (str.equals("no")) {
				return;
			} else {
				subtract();
			}
		} catch (Exception e) {
			System.out.println("Not a number");
		}

	}

	public void multiplication() {
		double result = 1;
		boolean continues = true;
		System.out.println(r.ANSI_YELLOW + "Enter numbers(press Enter after each number or type " + r.ANSI_RED
				+ "'done'" + r.ANSI_RESET + r.ANSI_YELLOW + " to finish multiplication.): " + r.ANSI_RESET);
		while (continues) {
			try {
				String str = sc.next().toLowerCase();
				if (str.equals("done")) {
					System.out.println(
							r.ANSI_YELLOW + "Result is: " + r.ANSI_RESET + r.ANSI_GREEN + result + r.ANSI_RESET);
					System.out.println(r.ANSI_PRUPLE + "Do you want to perform again type " + r.ANSI_RESET
							+ r.ANSI_GREEN + "Yes" + r.ANSI_RESET + "/" + r.ANSI_RED + "No" + r.ANSI_RESET);
					String s = sc.next().toLowerCase();
					if (s.equals("yes")) {
						multiplication();
					} else if (s.equals("no")) {
						continues = false;
					}

				} else {
					Double num = Double.parseDouble(str);
					result *= num;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

	public void division() {
		System.out.println(r.ANSI_BG_BLUE + "Enter two numbers A and B to find out A/B: " + r.ANSI_RESET);

		try {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			double result = num1/num2;

			System.out.println(r.ANSI_YELLOW + "Result is: " + r.ANSI_RESET + r.ANSI_GREEN + result + r.ANSI_RESET);
			System.out.println(r.ANSI_PRUPLE + "Do you want to perform again type " + r.ANSI_RESET + r.ANSI_GREEN
					+ "Yes" + r.ANSI_RESET + "/" + r.ANSI_RED + "No" + r.ANSI_RESET);
			String str = sc.next().toLowerCase();
			if (str.equals("no")) {
				return;
			} else {
				division();
			}
		} catch (Exception e) {
			System.out.println("Not a number");
		}
	}

	public void exponential() {
		System.out.println(r.ANSI_BG_BLUE + "Enter two numbers A and B to find out A to the power of B: " + r.ANSI_RESET);

		try {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			double result = Math.pow(num1, num2);

			System.out.println(r.ANSI_YELLOW + "Result is: " + r.ANSI_RESET + r.ANSI_GREEN + result + r.ANSI_RESET);
			System.out.println(r.ANSI_PRUPLE + "Do you want to perform again type " + r.ANSI_RESET + r.ANSI_GREEN
					+ "Yes" + r.ANSI_RESET + "/" + r.ANSI_RED + "No" + r.ANSI_RESET);
			String str = sc.next().toLowerCase();
			if (str.equals("no")) {
				return;
			} else {
				exponential();
			}
		} catch (Exception e) {
			System.out.println("Not a number");
		}
	}

}
