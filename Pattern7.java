package pattern;
import java.util.Scanner;

public class Pattern7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number :");
		int no = sc.nextInt();

		for (int i = 1; i <= no; i++) {

			int b = 1;

			for (int k = no - i; k >= 1; k--) {
				System.out.print(" ");

			}

			for (int j = 1; j <= i; j++) {
				System.out.print(b + " ");
				b++;
			}
			System.out.println();

		}

	}


}
