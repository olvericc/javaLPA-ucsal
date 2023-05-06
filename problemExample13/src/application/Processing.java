package application;

public class Processing {

	public static String hiddenWord(int key) {
		String word;
		switch (key) {
		case 1:
			word = "bacalhau";
			break;
		case 2:
			word = "universidade";
			break;
		case 3:
			word = "java";
			break;
		case 4:
			word = "objeto";
			break;
		case 5:
			word = "reforma";
			break;
		case 6:
			word = "programacao";
			break;
		case 7:
			word = "hospital";
			break;
		default:
			word = "none";
			break;
		}
		return word;
	}
}
