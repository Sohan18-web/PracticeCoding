package exceptionHandling;

import java.util.Scanner;

public class ArithmethicException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner scan = new Scanner(System.in)) {
			int n = scan.nextInt();
			System.out.println("Dividing the Number by 0");
			System.out.println(n / 0);

		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Program Completed");
	}

}
