package cyberite.characters;


import static util.Combat.getRandNum;

public class ScriptyBoi extends Cyberite{

    public ScriptyBoi(String name) {
        super(100, 10, name);
    }

    @Override
    public void attack() {
        int attackText = getRandNum(4);
        switch (attackText) {
            case 1:
                System.out.println("Do the Dew spray!");
                break;
            case 2:
                System.out.println("Script attack!");
                break;
            case 3:
                System.out.println("DOXed!");
                break;
            default:
                System.out.println("Overflow the stack!");
                break;
        }
    }
}