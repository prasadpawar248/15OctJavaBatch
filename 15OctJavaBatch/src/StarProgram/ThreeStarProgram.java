package StarProgram;

public class ThreeStarProgram {
	public static void main(String[] args) {
		int a, b, c;
		for (a = 1; a <= 10; a++) {
			if (a % 2 == 1) {
				for (b = a; b < 10; b++) {
					System.out.print(" ");
				}
				for (c = 1; c <= a; c++) {
					System.out.print("* ");

				}
				System.out.println();
			}

		}
	}

}
