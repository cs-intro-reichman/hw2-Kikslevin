// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code

		int numberofterms = Integer.parseInt(args[0]);
		double sum = 0.0;

		for (int i = 0; i < numberofterms; i++) {
			double term = 1.0 / (2 * i + 1);
			if (i % 2 == 0) {
				sum = sum + term;
			} else {
				sum = sum - term;
			}
		}
			double piapproximation = 4.0 * sum;
	
		System.out.println("pi according to Java " + Math.PI);
		System.out.println("pi approximated: " + piapproximation);
	}
}
