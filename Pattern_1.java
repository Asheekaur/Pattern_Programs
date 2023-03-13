package PatternPrograms;
import java.util.Scanner;

public class Pattern_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number to print pattern : ");
		int num = scan.nextInt();
		System.out.println("Star Pattern : ");
		for(int i = 0 ; i < num ; i++) {
			for(int j = 0 ; j < num ; j++) {
				if( (i == 0 || j == 0 || i == (num - 1) || j == (num - 1)) || (i+j <= (num - 1)/2)  || (j-i >= (num - 1)/2) ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
