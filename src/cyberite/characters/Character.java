package cyberite.characters;

public abstract class Character implements Attackable {
    //Properties All Characters Share
    protected int hp;
    protected int attackDamage = 0;
    protected int spAttackDamage = 20;

    public Character(int hp, int attackDamage) {
        this.hp = hp;
        this.attackDamage = attackDamage;
    }

    //Getters/Setters

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    //Behaviors All Characters Share
    public void attack() {
        if (attackDamage > baseAttackDamage) {
            System.out.println("Attacked for " + attackDamage + " damage!");
        } else {
            System.out.println("Attacked for " + baseAttackDamage + " damage!");
        }
    }

}
