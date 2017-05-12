package testson;

public class Test {
	public static void main(String args[]) {
				
		System.out.println(calcLevel(0.71f));
	}

	public static String calcLevel(float weight) {
		int i = (int) (100 * weight);
		if (i >= 70) {
			return "999";
		} else if (i >= 50) {
			return "998";
		} else if (i >= 20) {
			return "997";
		} else {
			return "996";
		}
	}
}
