package Scenes;

import java.util.Scanner;
import utils.GameData;
import utils.TypewriterEffect;
public class Episode1B {
    public static void Choice1() throws Exception {

        Scanner sc = new Scanner(System.in);
        TypewriterEffect.type("\nYou chose the wrench", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nPress W! ", 10, 0);
        if (!QTE.run("W", 2)) GameOver.main();
        TypewriterEffect.type("\nPress A! ", 10, 0);
        if (!QTE.run("A", 2)) GameOver.main();
        TypewriterEffect.type("\nPress S! ", 10, 0);
        if (!QTE.run("S", 2)) GameOver.main();
        TypewriterEffect.type("\nPress D! ", 10, 0);
        if (!QTE.run("D", 2)) GameOver.main();
        TypewriterEffect.type("\nPress S! ", 10, 0);
        if (!QTE.run("S", 2)) GameOver.main();
        TypewriterEffect.type("\nPress D! ", 10, 0);
        if (!QTE.run("D", 2)) GameOver.main();
        TypewriterEffect.type("\nPress A! ", 10, 0);
        if (!QTE.run("A", 2)) GameOver.main();
        TypewriterEffect.type("\nUsing the wrench, you had succesfully defended Kenn's hideout!", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: Ugh! Thanks for the hand, I think that's our cue to get the battery and head the hell out of here!", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: Couldn't agree more. Let's go!", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: How's your foot?", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: A lot better, there's still a little bit of sting it's good enough to run", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: Okay good, let's go", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou and Kenn head out to the crash site where Kenn found you", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nBoth of you can see the crashed car at the distance", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: There it is!", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nBoth of you opened up the hood and found the battery still in good condition", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nHowever, you need a tool to get the battery unplugged from the engine", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: I don't know much about cars but I'm pretty sure we need a wrench for this", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou remembered that you picked up a wrench as a weapon to use against the walkers... You still have it", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: Try using this. I used it as a weapon earlier. It was the nearest object to me a while ago", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: How lucky! You might be goodluck to me. Hahaha!", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nUsing the wrench, Kenn got the battery out and both of you returned to the hideout as soon as possible", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn had attached the battery to the car and the engine started", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: Sweeeeeet! Now we can actually go north and get the hell out of here!", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: Yes. Pack your things and let's get out of here!", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\n---End of Episode 1---", GameData.delay, GameData.postDelay);
        new Episode2().start();
    }

    public static void Choice2() throws Exception {

        TypewriterEffect.type("\nYou chose the screwdriver", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nPress W! ", 10, 0);
        if (!QTE.run("W", 2)) GameOver.main();
        TypewriterEffect.type("\nPress A! ", 10, 0);
        if (!QTE.run("A", 2)) GameOver.main();
        TypewriterEffect.type("\nPress S! ", 10, 0);
        if (!QTE.run("S", 2)) GameOver.main();
        TypewriterEffect.type("\nPress D! ", 10, 0);
        if (!QTE.run("D", 2)) GameOver.main();
        TypewriterEffect.type("\nPress S! ", 10, 0);
        if (!QTE.run("S", 2)) GameOver.main();
        TypewriterEffect.type("\nPress D! ", 10, 0);
        if (!QTE.run("D", 2)) GameOver.main();
        TypewriterEffect.type("\nPress A! ", 10, 0);
        if (!QTE.run("A", 2)) GameOver.main();
        TypewriterEffect.type("\nUsing the screwdriver, you had succesfully defended Kenn's hideout!", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: Ugh! Thanks for the hand, I think that's our cue to get the battery and head the hell out of here!", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: Couldn't agree more. Let's go!", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: How's your foot?", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: A lot better, there's still a little bit of sting it's good enough to run", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: Okay good, let's go", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou and Kenn head out to the crash site where Kenn found you", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nBoth of you can see the crashed car at the distance", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: There it is!", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nBoth of you opened up the hood and found the battery still in good condition", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nHowever, you need a tool to get the battery unplugged from the engine", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: I don't know much about cars but I'm pretty sure we need a wrench for this", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou remembered that you picked up a screwdriver as a weapon to use against the walkers... beside it was a wrench", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: Shit, I saw a wrench back at the hideout. How come we didn't think to bring any tools!", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: I don't know much about cars! I thought we can get it out without any tools. I might be bad luck to you. Hahaha!", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: Okay, I'll go back and grab it real quick. Watch over the car ", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: Be quick, I don't want to get any walkers get a hold of me", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\n10 minutes later...", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: Okay! I'm back. Here's the wrench", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nUsing the wrench, Kenn got the battery out and both of you returned to the hideout as soon as possible", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn had attached the battery to the car and the engine started", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: Sweeeeeet! Now we can actually go north and get the hell out of here!", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: Yes. Pack your things and let's get out of here!", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\n---End of Episode 1---", GameData.delay, GameData.postDelay);
        new Episode2().start();
    }

    public static void Choice3() throws Exception {

        TypewriterEffect.type("\nYou decided to fight with the broken bat!", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou killed a ton of walkers. However, the bat wasn't enough and it broke the moment you hit the last walker", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou panicked when the bat broken and this made an opening on your body allowing the walker to bite you", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn saw that you got bit and didn't hesitate to end your life right then and there.", GameData.delay, GameData.postDelay);
        GameOver.main();
    }

    public static void Choice4() throws Exception {

        TypewriterEffect.type("\nYou decided to fight with your own fists!", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou only knocked out the walkers and your fists wasn't enough", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nThe walkers had already got up again just as soon as your hands was getting numb from the punching", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nJust as when you're gonna punch the walker, it perfectly bit your hand as soon as you punch him leading to you getting infected", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn saw what happened and decided to leave the hideout. He found out how dumb you are using your fists as weapons against walkers.", GameData.delay, GameData.postDelay);
        GameOver.main();       
    }
}
