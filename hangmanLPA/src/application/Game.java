package application;

import java.util.*;

public class Game {

    private String word;
    private List<Character> guesses;
    private Integer wrongCount;

    public void singlePlayer() {
        String[] words = {"popcorn", "apple", "avocado", "grape", "orange", "watermelon"};
        List<String> hiddenWords = new ArrayList<>(Arrays.asList(words));
        Random random = new Random();

        word = hiddenWords.get(random.nextInt(hiddenWords.size()));
        guesses = new ArrayList<>();
        wrongCount = 0;
    }

    public void multiPlayerGame(String word) {
        this.word = word;
        guesses = new ArrayList<>();
        wrongCount = 0;
    }

    public void playing(Scanner sc2) {
        while (true) {
            Printer.printMan(wrongCount);

            if (wrongCount >= 6) {
                System.out.println("You lose!");
                System.out.println("The word was: " + word);
                break;
            }

            Printer.printWord(word, guesses);
            if (!guesses(sc2, word, guesses)) {
                wrongCount++;
            }

            if (Printer.printWord(word, guesses)) {
                System.out.println("You win!");
                break;
            }

            System.out.println("Please enter your guess for the word:");
            if (sc2.nextLine().equals(word)) {
                System.out.println("You win!");
                break;
            } else {
                System.out.println("Nope! Try again.");
            }
        }
    }

    private boolean guesses(Scanner sc3, String word, List<Character> playerGuesses) {
        System.out.println("Please enter a letter:");
        String letterGuess = sc3.nextLine();
        playerGuesses.add(letterGuess.charAt(0));

        return word.contains(letterGuess);
    }
}