
public class starPattern {
	public static void main(String[] args) {
		int rows = 5; // Input number of rows

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

