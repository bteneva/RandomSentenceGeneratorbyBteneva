import java.util.Random;
import java.util.Scanner;

public class RandomClassSentence {
    public static void main(String[] args) {
        String[] names = {"Peter", "Michael", "Jane", "Sofia"};
        String[] places = {"Sofia", "Plovdiv", "Varna", "Sungurlare"};
        String[] verbs = {"eats", "fishes", "drinks", "runs"};
        String[] nouns = {"stones", "cake", "apple", "laptop", "bikes"};
        String[] adverbs = {"slowly", "diligently", "warmly", "sadly", "rapidly"};
        String[] details = {"near the river", "at home", "in the park"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, this is your first randomly generated sentence: ");
        while (true) {
            String randomName = getRandomWord(names);
            String randomPlace = getRandomWord(places);
            String randomVerb = getRandomWord(verbs);
            String randomNoun = getRandomWord(nouns);
            String randomAdverb = getRandomWord(adverbs);
            String randomDetails = getRandomWord(details);

            System.out.printf("%s from %s %s %s %s %s%n", randomName, randomPlace, randomAdverb, randomVerb, randomNoun, randomDetails);
            System.out.println("Press [Enter] to generate a new one or type 'exit' to quit.");

            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("exit")) {
                break;
            }
        }
    }

    public static String getRandomWord(String[] words) {
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        return words[randomIndex];
    }
}
