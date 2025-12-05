package Scenes;
import java.util.InputMismatchException;
import java.util.Scanner;
import utils.GameData;
import utils.TypewriterEffect;
public class Episode1 extends Episode {
    static int choice = 0;
    @Override
    public void start() throws Exception {
        GameData.CheckpointNumber = 0;
        Scanner sc = new Scanner(System.in);
        
        TypewriterEffect.type("\n---Episode 1---", 100, GameData.postDelay);
        TypewriterEffect.type("\n\"A Lucky Encounter\"\n", 100, 2000);
        TypewriterEffect.type("\nYou: Huh... Where am I?", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\n???: Ahh. You're finally awake", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\n" + //
                        "You: What? Where are you? Where am I? What's going on?", GameData.delay, 0);
        TypewriterEffect.type("\n" + //
                        "???: Careful pal, your foot is still broken," + //
                        "\nif I was you I would rest 'till it gets better. There are so much walkers outside anyway", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: WHAT THE HELL HAPPENED!?", GameData.delay, GameData.postDelay);     
        TypewriterEffect.type("\n" + //
                        "???: Hey pal, keep your fucking voice down. You wanna draw them to us? " +// 
        "You're lucky that I found you", GameData.delay, GameData.postDelay);        
        TypewriterEffect.type("\n" + //
                        "You: I'm sorry, It's just a lot to take in I can't remember anything", GameData.delay, GameData.postDelay);   
        TypewriterEffect.type("\n" + //
                        "???: I found you laying at the side of the road just right outside of your car, im assuming the car is yours?" + //
                        " Anyway from what I came up, you tried to dodge a walker that was crossing the road but you crashed and I don't know why " + //
                        "but it appears that you were crawling out of your car." + //
                        " You're lucky that the walker ignored you.", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: Ah yes. I remember that holy shit... Thanks for taking care of me.", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\n???: Yeah it's nothing. I haven't asked your name yet", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\n(Enter your name): ", GameData.delay, GameData.postDelay);
        GameData.playerName = sc.nextLine();

        TypewriterEffect.type("\nKenn: " + GameData.playerName + ", I'm Kenn.", GameData.delay, GameData.postDelay);           
        TypewriterEffect.type("\nYou: Thanks Kenn, but I have to get going now.", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: Dude rest up. Your foot is busted. It's not safe outside 'cause of the walkers", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: Thanks for the concern but I need to make my own decision", GameData.delay, GameData.postDelay);
 
        GameData.CheckpointNumber++;
        Decision1();
    }

    public static void Decision1() throws Exception {
        Scanner sc = new Scanner(System.in);

        TypewriterEffect.type("\n-----DECIDE-----", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\n1 - Leave \n2 - Stay with Kenn", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nChoice: ", GameData.delay, GameData.postDelay); 

        while (true) {
            try {
                int choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        Episode1A.Choice1();
                        break;
                    case 2:
                        Episode1A.Choice2();
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine();
            }
        }        
    }
}
