package day11.task2;

public class Paladin extends Hero implements interfacePhysAttack, interfaceHealer{
    protected double physDef;
    protected double magicDef;
    protected double physAtt;
    public Paladin() {
        super(0.5,0.2,15,0);
        physDef = 0.5;
        magicDef = 0.2;
        physAtt = 15;
    }
    @Override
    public void healHimself() {
        health += 25;
        if (health > 100)
            health = 100;
    }
    @Override
    public void healTeammate(Hero hero) {
        hero.health += 10;
        if (hero.health > 100)
            hero.health = 100;
    }
    @Override
    public void physicalAttack(Hero hero) {
        hero.health -= physAtt - physAtt * hero.physDef;
        if (hero.health <= 0)
            hero.health = 0;
    }
    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}