package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		String word = "rice", userWord = "";
		int count = 0;
		boolean verification = false;
		
		do {
			System.out.print("type a word: ");
			
			userWord = sc.next().toLowerCase();
			
			if (!userWord.equals(word)) {
				count++;
				System.out.println();
				System.out.println("try again!");
				System.out.println("Amount of errors: you missed " + count
						+ (count == 1 ? " time" : " times"));
				switch (count) {
				case 1:
					System.out.println("TIP: the word has " + userWord.length() + " letters");
					break;
				case 2:
					System.out.println("TIP: the first letter is R");
					break;
				case 3:
					System.out.println("TIP: the second letter is I");
					break;
				case 4:
					System.out.println("TIP: the third letter is C");
					break;
				case 5: 
					System.out.println("TIP: the last letter is E");
					break;
				}
			} else if (count == 6) {
				System.out.println("end of execution!");
			}
			
			else {
				System.out.println("you won!");
				verification = true;
			}
			
		} while (count <= 5 && verification == false);
			
		
		sc.close();
	}

}
