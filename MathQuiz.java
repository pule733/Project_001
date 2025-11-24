import java.util.Scanner;
import java.util.Random;

public class MathQuiz {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Random rand = new Random();

        int correct = 0;

        for (int i = 1; i <= 5; i++) {
            int a = rand.nextInt(10) + 1;
            int b = rand.nextInt(10) + 1;
            int answer = a + b;

            System.out.print("Q" + i + ": What is " + a + " + " + b + "? ");
            int userAnswer = kb.nextInt();

            if (userAnswer == answer) {
                System.out.println("✅ Correct!");
                correct++;
            } else {
                System.out.println("❌ Wrong. The answer was " + answer);
            }
        }

        System.out.println("🎯 You got " + correct + " out of 5 correct!");
    }
}
