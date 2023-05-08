package application;

import java.util.Scanner;

public class Executer {

	public static void main(String[] args) {
		String answer = informedWord().toUpperCase();
		System.out.println(verification(answer));
	}
	
	public static boolean verification(String userWord) {
		boolean result;
		String hiddenWord = Processing.hiddenWord(4).toUpperCase();
		if (userWord.equals(hiddenWord)) {
			result =  true;
		} else {
			result = false;
		}
		return result;
	}
	
	public static String informedWord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("user, type the hidden word: ");
		return sc.next();
	}

}
