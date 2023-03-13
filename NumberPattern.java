package PatternPrograms;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number to print Number pattern : ");
		int num = scan.nextInt();
		System.out.println("Number pattern : ");
		for(int i = 1 ; i <= num ; i++) {
			for(int j = 1 ; j <= num ; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
