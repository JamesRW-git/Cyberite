package cyberite.characters;


import static util.Tools.getRandNum;

public class Suit extends Cyberite{

    public Suit(String name) {
        super(150, 5, name);
    }

    @Override
    public void attack() {
        int attackText = getRandNum(4);
        switch (attackText) {
            case 1:
                System.out.println("Suit uppercut!");
                break;
            case 2:
                System.out.println("Suit punch!");
                break;
            case 3:
                System.out.println("Suit kick!");
                break;
            default:
                System.out.println("Suit roundhouse kick!");
                break;
        }
    }
}
