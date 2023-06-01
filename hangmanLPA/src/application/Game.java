package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Game {

    static String[] words = {"popcorn", "apple", "avocado", "grape", "orange", "watermelon"};
    static List<String> hiddenWords = new ArrayList<>(Arrays.asList(words));
    static Random random = new Random();

    public static String getRandomWord() {
        return hiddenWords.get(random.nextInt(hiddenWords.size()));
    }

}