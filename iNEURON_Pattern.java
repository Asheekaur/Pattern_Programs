package PatternPrograms;
import java.util.*;

public class iNEURON_Pattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number to print iNEURON pattern : ");
		int num = scan.nextInt();
		System.out.println("iNEURON Pattern : ");
		
//		I
		for(int i = 0 ; i < num ; i++) {
			for(int j = 0 ; j < num ; j++) {
				if( i == 0 || i == (num-1) || j == (num-1)/2 ) {
					System.out.print("*"); 
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
		
		
//		N
			for(int j = 0 ; j < num ; j++) {
				if( j == 0 || j == (num-1) || i == j ) {
					System.out.print("*"); 
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");

//		E
		for(int j = 0 ; j < num ; j++) {
				if( i == 0 || j == 0 || i == (num-1)/2 || i == (num-1) ) {
					System.out.print("*"); 
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
		
//		U
			for(int j = 0 ; j < num ; j++) {
				if( j == 0 || j == (num-1) || i == (num-1) ) {
					System.out.print("*"); 
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
//		R
			for(int j=0; j<num; j++) {
				if((j == 0) || (i == 0 && j < num-1) ||(i == (num-1)/2 && j < num-1) || (j == num-1 && i > 0 && i < (num-1)/2) || (j == num-1 && i > (num-1)/2)) {
					
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
//		O
			for(int j = 0 ; j < num ; j++) {
				if( i == 0 || i == (num-1) || j == 0 || j == (num-1) ) {
					System.out.print("*"); 
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
		
		
//		N
			for(int j = 0 ; j < num ; j++) {
				if( j == 0 || j == (num-1) || i == j ) {
					System.out.print("*"); 
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			System.out.println();
		
	}
	}
}
