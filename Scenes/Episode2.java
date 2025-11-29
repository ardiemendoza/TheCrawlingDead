package Scenes;
import java.util.Scanner;
import utils.GameData;
import utils.TypewriterEffect;
public class Episode2 {
    static int choice = 0;
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        TypewriterEffect.type("\n---Episode 2---", 100, 1000);
        TypewriterEffect.type("\n\"Time's Ticking\"\n", 100, 2000);
        TypewriterEffect.type("\n4 hours later...", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: and that's the story of why my school always have class suspensions. All because of those bomb threats", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: I see, so that's why the nickname of your school is \"Bomb State University\" huh?", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: Yeah and even if the students were joking about planting a bomb in the school," + //
        " they immediately send the student to the dean's office for questioning. A similar incident happened at University of Batangas " + // 
        "too where a student was supposed to pay for his tuition but made a joke to the guards about bombs. " + //
        "The police took the student for questioning immediately as well. ", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: Haha. Pain for that student bro.", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: I miss the good old days. Ever wonder if things will go back to normal?", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\n1 - Yes! Ofcourse", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\n2 - I don't think so", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\n3 - I don't know but I still have hope in me", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\n4 - ...", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nChoice: ", GameData.delay, GameData.postDelay);
        while (true) {
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        Episode2A.Choice1();
                        break;
                    case 2:
                        Episode2A.Choice2();
                        break;
                    case 3:
                        Episode2A.Choice3();
                        break;
                    case 4:
                        Episode2A.Choice4();
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

    public static void Episode2Part2(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        GameData.CheckpointNumber++;
        TypewriterEffect.type("\nKenn: Anyway, I think we have to ditch the car soon " + //
        "or if we find a nearby gas station perhaps we can loot it. The gas tank is almost empty.", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: Wait do you see that?", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: Holy shit it looks like a car surrounded by walkers. What do you think? Should we help them?", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\n1 - Obviously yeah!", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\n2 - We got our own problems to deal with", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nChoice: ", GameData.delay, GameData.postDelay);
        while (true) {
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        Episode2B.Choice1();
                        break;
                    case 2:
                        Episode2B.Choice2();
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
