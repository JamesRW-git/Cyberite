package cyberite.characters;

import static util.Tools.getRandNum;

public class Punk extends Cyberite{

    public Punk(String name) {
        super(100, 7, name);
    }

    @Override
    public void attack() {
        int attackText = getRandNum(5);
        switch (attackText) {
            case 1:
                System.out.println("Punk uppercut!");
                break;
            case 2:
                System.out.println("Punk punch!");
                break;
            case 3:
                System.out.println("Punk kick!");
                break;
            case 4:
                System.out.println("Punk roundhouse kick!");
                break;
            default:
                System.out.println("Punk jab to the neck!");
        }
    }
}
