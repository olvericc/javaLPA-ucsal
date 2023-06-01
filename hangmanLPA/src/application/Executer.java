package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Executer {

    public static void main(String[] args) {

        String[] words = {"popcorn", "apple", "avocado", "grape", "orange", "watermelon"};

        List<String> hiddenWords = new ArrayList<>(Arrays.asList(words));

        Random random = new Random();

        String word = hiddenWords.get(random.nextInt(hiddenWords.size()));

        Printer.print(word);
    }
}
