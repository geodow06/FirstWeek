package app;

public class Iteration {
	// public static void main(String[] args)
	// {
	// int number = 0;
	// oneToTen();
	// ninetyToHundred();
	// oneToTenWords(1);
	// }
	public static void oneToTen() {
		for (int i = 1; i < 11; i++) {
			System.out.println(i);

		}
	}

	public static void ninetyToHundred() {
		for (int i = 100; i < 1000; i++) {
			System.out.println(i);

		}
	}

	public static void oneToTenWords(int number) {

		int unit = number % 100;
		int digit = number % 10;
		int ten = (number / 10) % 10;
		int hundred = number / 100;

		switch (hundred) {
		case 0:
			System.out.print("");
			break;
		case 1:
			System.out.print("one hundred ");
			break;
		case 2:
			System.out.print("two hundred ");
			break;
		case 3:
			System.out.print("three hundred ");
			break;
		case 4:
			System.out.print("four hundred ");
			break;
		case 5:
			System.out.print("five hundred ");
			break;
		case 6:
			System.out.print("six hundred ");
			break;
		case 7:
			System.out.print("seven hundred ");
			break;
		case 8:
			System.out.print("eight hundred ");
			break;
		case 9:
			System.out.print("nine hundred ");
			break;
		case 10:
			System.out.print("One thousand");
			break;
		}

		if (unit > 20) {
			switch (ten) {
			case 0:
				System.out.print("");
				break;

			case 2:
				System.out.print("twenty ");
				break;
			case 3:
				System.out.print("thirty ");
				break;
			case 4:
				System.out.print("fourty ");
				break;
			case 5:
				System.out.print("fifty ");
				break;
			case 6:
				System.out.print("sixty ");
				break;
			case 7:
				System.out.print("seventy ");
				break;
			case 8:
				System.out.print("eighty ");
				break;
			case 9:
				System.out.print("ninety ");
				break;
			}
			switch (digit) {
			case 1:
				System.out.print("one");
				break;
			case 2:
				System.out.print("two");
				break;
			case 3:
				System.out.print("three");
				break;
			case 4:
				System.out.print("four");
				break;
			case 5:
				System.out.print("five");
				break;
			case 6:
				System.out.print("six");
				break;
			case 7:
				System.out.print("seven");
				break;
			case 8:
				System.out.print("eight");
				break;
			case 9:
				System.out.print("nine");
				break;
			}

		} else {
			System.out.print("and ");
		}
		switch (unit) {
		case 1:
			System.out.print("one");
			break;
		case 2:
			System.out.print("two");
			break;
		case 3:
			System.out.print("three");
			break;
		case 4:
			System.out.print("four");
			break;
		case 5:
			System.out.print("five");
			break;
		case 6:
			System.out.print("six");
			break;
		case 7:
			System.out.print("seven");
			break;
		case 8:
			System.out.print("eight");
			break;
		case 9:
			System.out.print("nine");
			break;
		case 10:
			System.out.print("ten");
			break;
		case 11:
			System.out.print("eleven");
			break;
		case 12:
			System.out.print("twelve");
			break;
		case 13:
			System.out.print("thirteen");
			break;
		case 14:
			System.out.print("fourteen");
			break;
		case 15:
			System.out.print("fifthteen");
			break;
		case 16:
			System.out.print("sixteen");
			break;
		case 17:
			System.out.print("seventeen");
			break;
		case 18:
			System.out.print("eighteen");
			break;
		case 19:
			System.out.print("nineteen");
			break;
		}

	}
}
