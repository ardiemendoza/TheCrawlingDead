package Scenes;

import java.util.Scanner;
import utils.GameData;
import utils.TheCrawlingDead;
import utils.TypewriterEffect;
public class Episode2B {
    static int choice = 0;
    public static void Choice1() throws Exception {

        Scanner sc = new Scanner(System.in);
        TypewriterEffect.type("\nKenn pulled over and both of you got out of the car to help the person", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nThere are 11 walkers in total. Using your weapon you and Kenn are prepared to fight the walkers", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nPress W! ", 10, 0);
        if (!QTE.run("W", 2)) GameOver.main();
        TypewriterEffect.type("\nPress A! ", 10, 0);
        if (!QTE.run("A", 2)) GameOver.main();
        TypewriterEffect.type("\nPress W! ", 10, 0);
        if (!QTE.run("W", 2)) GameOver.main();
        TypewriterEffect.type("\nPress W! ", 10, 0);
        if (!QTE.run("W", 2)) GameOver.main();
        TypewriterEffect.type("\nPress D! ", 10, 0);
        if (!QTE.run("D", 2)) GameOver.main();
        TypewriterEffect.type("\nPress S! ", 10, 0);
        if (!QTE.run("S", 2)) GameOver.main();
        TypewriterEffect.type("\nPress W! ", 10, 0);
        if (!QTE.run("W", 2)) GameOver.main();
        TypewriterEffect.type("\nPress A! ", 10, 0);
        if (!QTE.run("A", 2)) GameOver.main();
        TypewriterEffect.type("\nPress D! ", 10, 0);
        if (!QTE.run("D", 2)) GameOver.main();
        TypewriterEffect.type("\nPress S! ", 10, 0);
        if (!QTE.run("S", 2)) GameOver.main();
        TypewriterEffect.type("\nPress A! ", 10, 0);
        if (!QTE.run("A", 2)) GameOver.main();
        TypewriterEffect.type("\nKenn: That was a hella exercise.", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: HELLO!? Are you okay!? It's safe you can come out now!", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\n???: I thought I was done for! Thanks for saving my life. Holy shit...", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: It's nothing.", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\n???: I really thought that was the end. I was prepared to pull the trigger.", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: You have a gun?", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\n???: Yeah. Only one bullet though, just for me.", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: I hope you don't ever need to use that. We can find more bullets. Wanna tag with us? We're going north", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\n???: The north? So the rumors are true? There's really a group of survivors?", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: Well, sort of. We don't know for sure until we get there.", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\n???: Well, if it's okay with you then I will gladly accept your offer!", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: I'm Kenn and he's " + GameData.playerName +", what's your name? ", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\n???: My name is Tristan.",150, GameData.postDelay);
        TypewriterEffect.type("\nYou: Nice to meet you, Tristan. Let's get to the car.", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nTristan: Wait, so my vehicle is busted right now I don't think it can go on any further, we should siphon the gas out of this and add it to yours", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: Oh yeah good idea!, is it Diesel?", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nTristan: Yep ", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn decided to transfer the gasoline to his car and you three drove off and returned to your journey", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nAfter a while, you three reached a nearby town...", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nTristan: Oh! It's Taal. This was one of the first town to actually evacuate and made it to the military! " + //
        "The population here was always on alert. I guess that's what happens when you have a volcano next to your town ", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: Really? In that case we can use this town as a resting place. We'll continue our journey tomorrow.", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: Finally, A break from driving.", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou stopped in an abandoned local grocery store", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: Huh... \"Three M's Grocery\". Lucky we!", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: Remember that it's been 8 months since the outbreak started. This place could be looted for all we know. Stay alert, there still might be walkers", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nTristan: Yeah this place is really empty. I guess they took all the stuff before they left. ", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: Well in that case, let's all rest up and prepare to leave for tomorrow", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\n8 hours later...", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: Ugh... well that was a goodnight's sleep indeed. Wait... where's everyone? Tristan? Kenn?", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou started to search the place but the two was nowhere to be found", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou went outside and as soon as you wander your eyes Kenn and Tristan passed you carrying what seems to be gasoline cans...", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: YOU'RE FINALLY AWAKE SLEEPYHEAD! GET TO THE CAR QUICKLY!", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nTristan: WE GOT SOME MORE GAS! WE HAVE TO GET OUT OF HERE YOU SEE THE HORDE!?", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nThe three of you went to the car and Kenn started the engine. Kenn drove off and continued going north", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nTristan: That was a close call once again!", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: You guys... you could have woke me up to help you two", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: We didn't want to ruin your sleep", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nTristan: Anyway, we got so much shit right now. This will keep us going for days!", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: That's nice but I don't think we're that far anymore though", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: How much further?", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nTristan: Why don't you know? You're the driver", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: I'm JUST the driver. I'm not the navigator. Plus I don't really know the destination", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: We're like... 12 hours away", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: WHAT? WHAT DO YOU MEAN \"Not that far away\"?! WE'RE LIKE A HUNDRED KILOMETERS AWAY!", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: Hahahaha calm down! We'll take turns driving to make it up to you", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: Ahh. Thank You!", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nThe three of you continued to drive until you reached your destination. You finally reached safe haven. A mysterious person greeted you with " + //
        "with a warm welcome.", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nTristan: We made it.", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\n???: Hello! Welcome to SafeHaven. You can make yourself comfortable here. " + //
        "We're a whole community helping each other out. There are women and children here so we need a lot of help from the men. There's like 500+ of us here so let's give it our best.", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: Cool. Thanks!", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\n???: May I have your names please?", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: I'm Kenn.", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nTristan: Tristan.", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: I'm " + GameData.playerName, GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nArdie: Ahh. Nice to meet you. I'm Ardie. Fight On!", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\n---End of Episode 2---", GameData.delay, GameData.postDelay);
        TheCrawlingDead.main(new String[]{});
    }

    public static void Choice2() throws Exception {
        Scanner sc = new Scanner(System.in);
        TypewriterEffect.type("\nKenn: What? You sure?!?", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: Yeah! I doubt we could defeat those number of walkers anyway. Atleast he can get the easy way out of this madne-", GameData.delay, 0);
        TypewriterEffect.type("\n*GUNSHOTS*", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: DUDE I THINK HE JUST TOOK HIS WAY OUT", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: Lowkey smart, no suffering. He really took the easy way out", GameData.delay, 0);
        TypewriterEffect.type("\nKenn: Dude don't say that. You don't give up no matter what. " + //
        "You continue as long as you can but for that guy it was the end. If we tried to helped him he might had a chance to live", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou and Kenn drove off, you noticed that Kenn was disappointed by your decision", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\n30 Minutes later...", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: Well. That's the end of the line. We should continue on foot, there's a town at the distance, maybe there's some gasoline there", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou and Kenn entered the abandoned town.", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: This town looks empty.", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: Yeah this town is big but since the outbreak I guess they all evacuated. The population here are mostly alert so I guess they were the first to leave for the military", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: I could have joined them if it weren't for the distance. The walkers have already took " + //
        "control of my hometown as soon as the military arrived. The soldiers eventually got kiled since they were not that many. The military " + //
        "spreaded their units and by the time they got there the walkers were just too much", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: That's rough buddy. Also, it's almost night time. We should find a place to rest and we'll continue again in the morning", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: Let's check out this place. \"Three M's Grocery\", well lucky we!", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: Careful " + GameData.playerName + " remember that it's been a while so there's a good chance that this place is looted", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou and Kenn entered the Grocery, and just as you thought, it's empty", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: Well... atleast there's no walkers nearby", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: Well, let's rest up. Good thing we still have some food for us. We'll continue our journey tomorrow", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou and Kenn slept", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\n8 hours later...", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\n6:32 AM", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: Ahh that was a nice goodnight's sleep... Wait... I wonder where's Kenn is", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou searched the place for Kenn but he is nowhere to be found, " + //
        "You head outside and saw in the distance that there is a group of walkers banging down a store", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: Shit... What's that dude doing now?!", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: Well... atleast there's no walkers nearby", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: They're not that many but if I sneak up on them I can take them all at once", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou sneaked up on the walkers and killed them one by one", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nPress A!", 10, 0);
        if (!QTE.run("A", 2)) GameOver.main();
        TypewriterEffect.type("\nPress S!", 10, 0);
        if (!QTE.run("S", 2)) GameOver.main();
        TypewriterEffect.type("\nPress S!", 10, 0);
        if (!QTE.run("S", 2)) GameOver.main();
        TypewriterEffect.type("\nPress A!", 10, 0);
        if (!QTE.run("A", 2)) GameOver.main();
        TypewriterEffect.type("\nPress D!", 10, 0);
        if (!QTE.run("D", 2)) GameOver.main();
        TypewriterEffect.type("\nYou killed all the walkers!", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: HELLO!? YOU THERE!?", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: " + GameData.playerName + " thank goodness you arrived, you were sleeping like a sloth! Listen, we gotta go! I just saw a horde of walkers " + //
        "coming this way but luckily I found like 2 tons of gas! Help me carry this and transfer it to out car! WE NEED TO GO NOW! TIME IS TICKING!", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou and Kenn quickly went back to the car. The gasoline was so heavy you feel like your feet's gonna give up " + //
        "You fill the gas tank full and placed the excess gas at the back of the car. Both of you drove off as quickly as you can and continued heading north", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: SHIT! That was a close call! HAHAHAHA! You know what they say, high risk high reward!", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: You know you could have wake me up to help you search the town. It's a good thing that I woke up. Now we're even. I saved your life hehe", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: Hahaha. Thanks!", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou and Kenn continued the journey for hours and eventually reached north. You made it. You're finally in safe haven. " + //
        "The community greeted you with a warm welcome and you finally felt the sense of relief after a long time.", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\n???: Hello! Welcome to SafeHaven. Make yourself comfortable and rest up! We're a group of survivors helping each other out so we're gonna need your help too, " + //
        "there's like 500+ of us here so we need a lot of hands to help us!", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: Cool. Thanks!", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\n???: May I have your names please?", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nKenn: I'm Kenn", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nYou: I'm " + GameData.playerName, GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\nArdie: Okay nice. I'm Ardie nice to meet both of you. Fight on!", GameData.delay, GameData.postDelay);
        TypewriterEffect.type("\n---End of Episode 2---", GameData.delay, GameData.postDelay);
        TheCrawlingDead.main(new String[]{});
    }
}
