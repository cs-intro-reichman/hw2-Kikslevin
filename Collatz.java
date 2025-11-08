// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {

int seed = Integer.parseInt(args[0]);
String verborcon = args[1];

for (int i = 1; i <= seed; i++) {
	int n = i;
	int steps = 1;

	if (verborcon.equals("v")) {
		System.out.print(i + " ");
	}

	while (n != 1) {
		if (n % 2 == 0) {
			n = n / 2;
		} else {
			n = 3 * n + 1;
		}
	
	if (verborcon.equals("v")) {
		System.out.print(n + " ");
	}

	steps++;
	}

	if (verborcon.equals("v")) {
		System.out.println("(" + steps + ")");
	}
}
	System.out.println("Every one of the first " + args[0] + " hailstone sequences reached 1."); 
}
	}