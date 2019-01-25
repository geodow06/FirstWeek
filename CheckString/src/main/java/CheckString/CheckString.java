package CheckString;

public class CheckString {
	public static void main(String[] args) {
		String inputString = ("hello");

		System.out.println(check(inputString));
	}

	public static String check(String inputString) {
		if ("hello".equals(inputString)) {
			return "Yes!";
		} 
		else {
			return "No!";
		}

	}
}
