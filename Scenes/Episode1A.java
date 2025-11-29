package Scenes;

import java.util.Scanner;
import utils.GameData;
import utils.TypewriterEffect;
public class Episode1A {
    static int choice = 0;
    public static void Choice1() throws Exception {

        TypewriterEffect.type("\nYou decided to leave in the middle of the day while your foot is busted", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: Well. Thanks for everything but I have to get going as soon as possible." + //
        " I need to head north as quickly as I can because that's the safest place to be in the middle of" + //
        " everything that's happening right now", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: Well, I ain't gonna stop you if that's what you want. Goodluck " + GameData.playerName, GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nJust as soon as you walked out the door, in just 200 meters away from Kenn's hideout, you already got a bunch of walkers chasing you...", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nIn just a matter of seconds, you cannot walk any further and the walkers have already ate your insides before you knew it", GameData.delay, GameData.postDelay);
        GameOver.main();
    }

    public static void Choice2() throws Exception {

        Scanner sc = new Scanner(System.in);
        TypewriterEffect.type("\nYou decided to stay with Kenn until you're fully healed", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: Actually, you're right. I should let myself rest for a bit. It's still dangerous outside especially with my foot's busted", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: Alright, cool... So where were you headed to?", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: Up north, the cold. Word's spreaded around that there's a community of survivors in the north that are working together to survive", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: Ahh yes the cold, where the walkers are frozen in place. Makes sense. Smart", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: ... ", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: Look, I'm looking for a place to stay as well. As you can see my hideout is a bit y'know, too \"cozy\" for me." + // 
        " Plus there's not much resources around anymore, much safer in the wild where we can grow crops than in the city where everything is empty now", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: You can tag with me if you want. I'd love a company", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: Thanks, actually I have a car but I need a battery to start the engine.", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: Well, I have a car too but I doubt that it'll still work after the crash. We can take the battery off of her", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: Woah good idea. Make yourself comfortable and we'll get it tomorrow", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: Thanks", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\n12 hours later...", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: SHIT! " + GameData.playerName +" WAKE UP! WE GOT SURROUNDED, THE WALKERS ARE BREAKING IN", GameData.delay, GameData.postDelay);

        GameData.CheckpointNumber++;
        Decision2(new String[]{});
    }

    public static void Decision2(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        TypewriterEffect.type("\nYou have 3 items near your couch. Which one will you choose as a weapon?", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\n1 - A Wrench", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\n2 - A Screwdriver", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\n3 - An almost broken bat", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\n4 - Your fists, (Weapons are for weaklings)", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nChoice: ", GameData.delay, GameData.postDelay);
        while (true) {
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        Episode1B.Choice1();
                        break;
                    case 2:
                        Episode1B.Choice2();
                        break;
                    case 3:
                        Episode1B.Choice3();
                        break;
                    case 4:
                        Episode1B.Choice4();
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
