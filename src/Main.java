package src;

import java.util.*;

public class Main {
    static final String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        WordsChecker wordsChecker = new WordsChecker(text);

        while (true) {
            System.out.println("Введите искомое слово или нажмите 'энтер' для выхода");
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String splitedInput[] = input.split("\\P{IsAlphabetic}+");
            if (splitedInput.length != 1) {
                System.out.println("Вы должны ввести только одно слово");
                continue;
            }

            if (wordsChecker.hasWord(splitedInput[0])) {
                System.out.println("Слово " + splitedInput[0] + " встречается в тексте");
            } else {
                System.out.println("Слово " + splitedInput[0] + " НЕ встречается в тексте");
            }

        }

    }
}
