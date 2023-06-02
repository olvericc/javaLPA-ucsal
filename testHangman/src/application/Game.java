package application;

import java.util.*;

public class Game {
    private String word;
    private List<Character> playerGuesses;
    private Integer wrongCount;

    public void initializeSinglePlayerGame() {
        String[] words = {"popcorn", "apple", "avocado", "grape", "orange", "watermelon"};
        List<String> hiddenWords = new ArrayList<>(Arrays.asList(words));
        Random random = new Random();

        word = hiddenWords.get(random.nextInt(hiddenWords.size()));
        playerGuesses = new ArrayList<>();
        wrongCount = 0;
    }

    public void initializeMultiPlayerGame(String word) {
        this.word = word;
        playerGuesses = new ArrayList<>();
        wrongCount = 0;
    }

    public void play(Scanner keyboard) {
        while (true) {
            Printer.printHangedMan(wrongCount);

            if (wrongCount >= 6) {
                System.out.println("You lose!");
                System.out.println("The word was: " + word);
                break;
            }

            Printer.printWordState(word, playerGuesses);
            if (!getPlayerGuess(keyboard, word, playerGuesses)) {
                wrongCount++;
            }

            if (Printer.printWordState(word, playerGuesses)) {
                System.out.println("You win!");
                break;
            }

            System.out.println("Please enter your guess for the word:");
            if (keyboard.nextLine().equals(word)) {
                System.out.println("You win!");
                break;
            } else {
                System.out.println("Nope! Try again.");
            }
        }
    }

    private boolean getPlayerGuess(Scanner keyboard, String word, List<Character> playerGuesses) {
        System.out.println("Please enter a letter:");
        String letterGuess = keyboard.nextLine();
        playerGuesses.add(letterGuess.charAt(0));

        return word.contains(letterGuess);
    }
}
