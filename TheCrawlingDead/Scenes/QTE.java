package Scenes;

import java.util.Scanner;

public class QTE {

    public static boolean run(String correctKey, int seconds) {
        Scanner sc = new Scanner(System.in);
        final String[] input = {null};
        final boolean[] running = {true};

        Thread inputThread = new Thread(() -> {
            while (running[0]) {
                if (sc.hasNextLine()) {
                    input[0] = sc.nextLine().trim().toUpperCase();
                    break;
                }
            }
        });

        inputThread.start();

        long start = System.currentTimeMillis();

        while (System.currentTimeMillis() - start < seconds * 1000) {
            if (input[0] != null) {
                running[0] = false;
                return input[0].equals(correctKey.toUpperCase());
            }
            try { Thread.sleep(50); } catch (Exception e) {}
        }

        // TIME OUT
        running[0] = false;
        return false;
    }
}
