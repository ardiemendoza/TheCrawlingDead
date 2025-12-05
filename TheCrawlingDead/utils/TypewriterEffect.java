package utils;
public class TypewriterEffect {

    public static void type(String text, int delay, int postDelay) throws Exception {
        // SoundManager.startTyping();
        for (char c : text.toCharArray()) {
            System.out.print(c);
            Thread.sleep(delay);
        }

        Thread.sleep(postDelay);
    }
}