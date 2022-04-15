package cyberite.game;

import cyberite.characters.*;
import cyberite.characters.Character;
import util.Input;

public class GameRunner {

    public static void main(String[] args) {
        int playerChoice = Input.getInt("Welcome to Cyberite, arguably the worst city EVER.\n" +
                "How would you like to survive? Who are you? \n" +
                "-------------------------------------------\n" +
                "(Enter 1 - 5 to select:\n" +
                "1. Punk\n" +
                "2. Suit\n" +
                "3. Conscript\n" +
                "4. Scripty Boi\n");

        Cyberite player;

        switch (playerChoice) {
            case 1:
                System.out.println("You are a punk kid, only not starving and cold on the streets due to the \n" +
                        "schemes, scams, and petty larceny that can keep the unsavory types fed in Cyberite.\n" +
                        "Your fists are forged in the mosh pit and you can't hear well. Good luck, kid.");
                player = new Punk("Taylor");
                break;
            case 2:
                System.out.println("Even the crime riddled streets of Cyberite need someone to manage...stuff.\n" +
                        "Fortunately, you're pretty good at it and even have a bunch of MuskTokens left over\n" +
                        "from your bonus last quarter for something the guy that works for you did. Steve, I think\n" +
                        "Anyways, that doesn't matter now. Good luck, money can only buy safety here most of the time\n");
                player = new Suit("Roger");
                break;
            case 3:
                System.out.println("There's always a war going on somewhere. Fortunately for you, your family\n" +
                        "pooled together some MuskTokens and bought you a shiny new identity. Well, new to you.\n" +
                        "The guy that used to have your new name is dead, but due to some sort of religious\n" +
                        "exemption he's not in the DNA database and your entry has been erased. Conscription\n" +
                        "at least got you some weapons training. Go put it to good use.");
                player = new Conscript("CJ");
                break;
            default:
                System.out.println("You awaken from your post caffeine-psychosis slumber in a room you don't recognize.\n" +
                        "Worse, your Apple iMplant 16XS seems to be offline. Fried. The culprit? 6 liters of Mountain Dew.\n" +
                        "You will have to ask your mom to buy you another one, if you survive Cyberite long\n" +
                        "enough to find her.");
                player = new ScriptyBoi("Bob");
                break;
        }

        player.attack();

    }
}
