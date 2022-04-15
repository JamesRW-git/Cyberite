package cyberite.characters;


import static util.Tools.getRandNum;

public class Conscript extends Cyberite{

    public Conscript(String name) {
        super(175, 6, name);
    }

    @Override
    public void attack() {
        int attackText = getRandNum(4);
        switch (attackText) {
            case 1:
                System.out.println("Conscript uppercut!");
                break;
            case 2:
                System.out.println("Conscript punch!");
                break;
            case 3:
                System.out.println("Conscript kick!");
                break;
            default:
                System.out.println("Conscript roundhouse kick!");
                break;
        }
    }
}