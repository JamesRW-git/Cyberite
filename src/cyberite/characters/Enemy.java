package cyberite.characters;

public class Enemy extends Character {

    public Enemy(int hp, int attackDamage) {
        super(hp, attackDamage);
    }

    @Override
    public void attack() {
        System.out.println("Enemy attacks");
    }

    public void spAttack() {
        System.out.println("Used special attack for " + spAttackDamage + " damage!");
    }
}
