package cyberite.characters;

public class Cyberite extends Character{

    private String name;

    public Cyberite(int hp, int attackDamage, String name) {
        super(hp, attackDamage);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void spAttack() {
        System.out.println("----------------------------------");
        System.out.println("Used special attack for " + spAttackDamage + " damage!");
        System.out.println("----------------------------------");
    }
}
