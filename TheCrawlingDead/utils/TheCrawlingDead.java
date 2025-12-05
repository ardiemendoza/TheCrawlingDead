package utils;
import Scenes.*;
import java.util.Scanner;

public class TheCrawlingDead {
    public static void main(String[] args) throws Exception {
        
        while (true) { 
        TypewriterEffect.type("\nThe Crawling Dead", 50, 0);
        TypewriterEffect.type("\nA Console-Based Game by NotGPT", 50, 100);
        TypewriterEffect.type("\nThis game adapts to the choices you make, \nthe story is tailored by how you play.", 50,1000);
        TypewriterEffect.type("\n\n\n--MAIN MENU--", 20,0);
        TypewriterEffect.type("\n1: START", 20,0);
        TypewriterEffect.type("\n2: CHOOSE EPISODE", 20,0);
        TypewriterEffect.type("\n3: CREDITS", 20,0);
        TypewriterEffect.type("\n4: EXIT", 20,0);
        TypewriterEffect.type("\n\nInput: ", 20,0);

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();    
        switch (choice) {
            case 1:
                new Episode1().start();
                break;
            case 2:    
                TypewriterEffect.type("\n--Episode List--", 50,0);
                TypewriterEffect.type("\n1 - Episode 1", 50,0);
                TypewriterEffect.type("\n2 - Episode 2", 50,0);
                TypewriterEffect.type("\n3 - Back to Main Menu\n", 50,0);
                TypewriterEffect.type("\nInput: ", 50,0);
                choice = sc.nextInt();    
                switch (choice) {
                    case 1:
                        new Episode1().start();
                        break;
                    case 2:
                        sc.nextLine();
                        TypewriterEffect.type("\nEnter your name: ", 50,0);
                        GameData.playerName = sc.nextLine();
                        GameData.CheckpointNumber = 2;
                        new Episode2().start();      
                        break;
                    case 3:
                        main(new String[]{});
                        break;                        
                    default:
                        throw new AssertionError();
                }
                break;
            case 3:
                TypewriterEffect.type("\n\"The Crawling Dead\"", 50,1000);
                TypewriterEffect.type("\nGame made by NotGPT", 50,1000);
                TypewriterEffect.type("\nArdie Mendoza", 50,1000);
                TypewriterEffect.type("\nTristan Dayle Mendoza", 50,1000);
                TypewriterEffect.type("\nKenn Adrian Sarmiento", 50,1000);
                TypewriterEffect.type("\nBSIT - 2105\n", 50,1000);
                main(new String[]{});
                break;
            case 4:    
                break;    
            default:
                throw new AssertionError();
        }            
        }

    }
}
