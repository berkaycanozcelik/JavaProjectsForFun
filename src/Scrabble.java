import java.util.Scanner;

public class Scrabble {
    public static void main(String[] args) {



        Scanner newObj = new Scanner(System.in);
        System.out.println("Enter 1. word: ");
        String word1 = newObj.nextLine().toLowerCase();
        System.out.println("Enter 2. word: ");
        String word2 = newObj.nextLine().toLowerCase();

        int score1 = compute_score(word1);
        int score2 = compute_score(word2);

        if (score1 > score2) {
            System.out.println("Player 1 won (Score: " + score1 + ")");
        } else if (score2 > score1) {
            System.out.println("Player 2 won");
        } else
            System.out.println("Its a tie");

    }

    static int compute_score(String word){
        int POINTS[] = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};

        int score=0;

        for (int i = 0; i < word.length(); i++){
            int valueOfChar = POINTS[word.charAt(i) - 97];
            score += valueOfChar;
        }

        return score;
    }
}
