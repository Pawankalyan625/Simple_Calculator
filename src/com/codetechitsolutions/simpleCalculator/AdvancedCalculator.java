package com.codetechitsolutions.simpleCalculator;

import java.util.Scanner;


public class AdvancedCalculator {

	private static void advancedCalculator() {

		Rainbow r = new Rainbow();
		boolean flag = true;
		while (flag) {
			Scanner sc = new Scanner(System.in);
			MathOperations operation = new MathOperations();
			// System.out.println(r);
			System.out.println("1." + r.ANSI_YELLOW + "ADDITION" + r.ANSI_RESET);
			System.out.println("2." + r.ANSI_GREEN + "SUBTRACTION" + r.ANSI_RESET);
			System.out.println("3." + r.ANSI_BLUE + "MULTIPLICATION" + r.ANSI_RESET);
			System.out.println("4." + r.ANSI_PRUPLE + "DIVISION" + r.ANSI_RESET);
			System.out.println("5." + r.ANSI_GREEN + "EXPONENTIAL" + r.ANSI_RESET);
			System.out.println("6." + r.ANSI_RED + "Exit" + r.ANSI_RESET);
			System.out.println(r.ANSI_BG_BLUE + "Enter Your choice :" + r.ANSI_RESET);
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				operation.addition();
				break;
			}
			case 2: {

				operation.subtract();
				break;
			}
			case 3:{
				operation.multiplication();
				break;
			}
			case 4:{
				operation.division();
				break;
			}
			case 5:{
				operation.exponential();
				break;
			}
			case 6: {
				System.out.println(r.ANSI_YELLOW + "Do you want to close the Application " + r.ANSI_GREEN + r.ANSI_BOLD
						+ "Yes" + r.ANSI_RESET + r.ANSI_BOLD + "/" + r.ANSI_RED + "No" + r.ANSI_RESET);
				String s = sc.next().toLowerCase();
				System.out.println();
				if (s.equals("no")) {
					advancedCalculator();
				} else {
					flag = false;
					System.out.println(r.ANSI_BLUE + "Connection closing....\nHappy Coding\nConnection closed restart again." + r.ANSI_RESET);
					System.exit(0);
				}
			}
			default:System.out.println(r.ANSI_RED+"Selected option is not available please select again."+r.ANSI_RESET);
			
			}
		}
		System.exit(0);
	}

	public static void main(String[] args) {
		Rainbow r = new Rainbow();
		System.out.println(r.ANSI_BG_BLUE + r.ANSI_BOLD + "WElCOME TO ADVANCED CALCULATOR..." + r.ANSI_RESET);
		advancedCalculator();
	}

}
