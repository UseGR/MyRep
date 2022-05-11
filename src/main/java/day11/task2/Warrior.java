package day11.task2;

public class Warrior extends Hero implements interfacePhysAttack {
    protected double physDef;
    protected double physAtt;
    public Warrior() {
        super(0.8, 0, 15,0);
        physDef = 0.8;
        physAtt = 30;
    }
    @Override
    public void physicalAttack(Hero hero) {
        hero.health = hero.health - (physAtt - physAtt * hero.physDef);
        if (hero.health <= 0)
            hero.health = 0;
    }
    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}