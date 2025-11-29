package Scenes;

import java.util.Scanner;
import utils.GameData;
import utils.TheCrawlingDead;
import utils.TypewriterEffect;
public class GameOver {
    public static String name;
    static int delay = 50;
    static int postDelay = 1000;
    static int choice = 0;
    public static void main() throws Exception {
        Scanner sc = new Scanner(System.in);

        TypewriterEffect.type("\n---GAME OVER!---", delay, postDelay);
        TypewriterEffect.type("\nRetry from checkpoint?", delay, postDelay);
        TypewriterEffect.type("\n1 - Yes", delay, postDelay);
        TypewriterEffect.type("\n2 - No", delay, postDelay);
        TypewriterEffect.type("\nInput: ", delay, postDelay);  
        while (true) {
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        switch (GameData.CheckpointNumber) {
                            case 1:
                                Episode1.Decision1(new String[]{});
                                break;
                            case 2:
                                Episode1A.Decision2(new String[]{});
                                break;
                            case 3:
                                Episode2.Episode2Part2(new String[]{});
                                break;
                            default:
                                throw new AssertionError();
                        }
                        break;
                    case 2:
                        TheCrawlingDead.main(new String[]{});
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }

            } else {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine();
            }
        }  
    }
}
