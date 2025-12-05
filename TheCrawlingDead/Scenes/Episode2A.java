package Scenes;

import java.util.Scanner;
import utils.GameData;
import utils.TypewriterEffect;
public class Episode2A {
    public static void Choice1() throws Exception {
        Scanner sc = new Scanner(System.in);

        TypewriterEffect.type("\nKenn: I hope so too. I miss my friends", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: Back when the only problem we had was to graduate than dodging walkers... " + // 
        "well atleast we got no more bills to pay, the only thing I like with the apocalypse hahaha.", GameData.delay, GameData.postDelay);
        Episode2.Episode2Part2();
    }

    public static void Choice2() throws Exception {

        TypewriterEffect.type("\nKenn: Shucks. But I'm not giving up hope yet. Remember that these walkers are just walking corpses. They'll give out anytime soon.", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: I don't know if you already know this but the parasite actually enforces the host just a little bit but still weaker than human flesh " + // 
        "but you're right, they'll eventually give out. As long as no one is getting infected anymore", GameData.delay, GameData.postDelay);
        Episode2.Episode2Part2();
    }

    public static void Choice3() throws Exception {

        TypewriterEffect.type("\nKenn: Yes me too. We can't give up hope yet. They might eat most of us but there's one thing that they couldn't eat and that's our will.", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: It's just a shame that most of the people alive right now are either criminals, bandits, and those that are part of gangs " + // 
        "since they are the people that have actual weapons like guns.", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: Yeah, I noticed that too. I'm assuming you got affiliated with them before?", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: Yeah. I didn't like it. They kill and take... That's why I left them without telling them " + // 
        "'cause if I did, they'll kill me. The dead are coming back and what did the people do? Kill each other some more. This is just stupid.", GameData.delay, GameData.postDelay);

        Episode2.Episode2Part2();
    }

    public static void Choice4() throws Exception {

        TypewriterEffect.type("\nKenn: Well personally I think we can get through this." + //
        "Humans had gone much worse such as measles, spanish flu, World War, Great Depression, Ice Age, and we got through them all... or our ancestors did.", GameData.delay, GameData.postDelay);

        Episode2.Episode2Part2();
    }
}
