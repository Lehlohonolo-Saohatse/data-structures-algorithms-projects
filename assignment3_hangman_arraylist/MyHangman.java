import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class MyHangman {
    public static final int MAX_GUESSES = 7;

    // Game state variables
    public static MyArrayListHM<String> words = new MyArrayListHM<>();
    public static MyArrayListHM<Character> secretWord = new MyArrayListHM<>();
    public static MyArrayListHM<Character> guessedWord = new MyArrayListHM<>();
    public static int guessesLeft;

    public static void loadWords(String filename) {
        try (BufferedReader input = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = input.readLine()) != null) {
                String[] wordArray = line.split("\\s+");
                for (String word : wordArray) {
                    word = word.trim().toUpperCase(); // Convert to uppercase for consistency
                    if (!word.isEmpty() && !words.contains(word)) {
                        words.add(words.getSize(), word);
                    }
                }
            }
            words.sortList();
            System.out.println("The words: " + words);
            System.out.println("The sorted words: " + words);
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filename);
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }

    public static void startNewGame() {
        Random rand = new Random();
        String selectedWord = words.get(rand.nextInt(words.getSize())).toUpperCase();

        secretWord.clear();
        guessedWord.clear();

        for (char c : selectedWord.toCharArray()) {
            secretWord.add(secretWord.getSize(), c);
            guessedWord.add(guessedWord.getSize(), '_');
        }

        guessesLeft = MAX_GUESSES;
        System.out.println("Welcome to Hangman!");
        displayGuessedWord();
    }

    public static void playGame() {
        Scanner scanner = new Scanner(System.in);

        while (guessesLeft > 0 && !isWordGuessed()) {
            System.out.print("Enter a letter: ");
            char guess = scanner.next().toUpperCase().charAt(0);

            if (secretWord.contains(guess)) {
                updateGuessedWord(guess);
                System.out.println("Correct guess!");
            } else {
                guessesLeft--;
                System.out.println("Incorrect guess.");
            }

            displayGuessedWord();
            System.out.println("Guesses left: " + guessesLeft);
        }

        if (isWordGuessed()) {
            System.out.println("Congratulations! You guessed the word: " + guessedWord);
        } else {
            System.out.println("Game over. The word was: " + secretWord);
        }

        scanner.close(); // Close the scanner
    }

    private static void displayGuessedWord() {
        System.out.print("Guessed word: ");
        for (int i = 0; i < guessedWord.getSize(); i++) {
            System.out.print(guessedWord.get(i) + " ");
        }
        System.out.println();
    }

    private static void updateGuessedWord(char correctGuess) {
        for (int i = 0; i < secretWord.getSize(); i++) {
            if (secretWord.get(i) == correctGuess) {
                guessedWord.remove(i);
                guessedWord.add(i, correctGuess);
            }
        }
    }

    private static boolean isWordGuessed() {
        for (int i = 0; i < guessedWord.getSize(); i++) {
            if (guessedWord.get(i) == '_') {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        loadWords("words.txt");
        startNewGame();
        playGame();
    }
}
