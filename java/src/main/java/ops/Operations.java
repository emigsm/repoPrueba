package ops;

public class Operations {

	public int sum(int a, int b) {

		return a + b;
	}

	public int sust(int a, int b) {

		return a - b;
	}

	public int mult(int a, int b) {

		return a * b;
	}

	public int div(int a, int b) {

		if (b != 0) {

			return a / b;

		}

		return 0;
	}

}
