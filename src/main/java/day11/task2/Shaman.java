package day11.task2;

public class Shaman extends Hero implements interfacePhysAttack, interfaceMagicAttack, interfaceHealer {
    protected double physDef;
    protected double magicDef;
    protected double physAtt;
    protected double magicAtt;
    public Shaman() {
        super(0.2,0.2,10,15);
        physDef = 0.2;
        magicDef = 0.2;
        physAtt = 10;
        magicAtt = 15;
    }
    @Override
    public void healHimself() {
        health += 50;
        if (health > 100)
            health = 100;
    }
    @Override
    public void healTeammate(Hero hero) {
        hero.health += 30;
        if (hero.health > 100)
            hero.health = 100;
    }
    @Override
    public void magicalAttack(Hero hero) {
        hero.health -= magicAtt - magicAtt * hero.magicDef;
        if (hero.health <= 0)
            hero.health = 0;
    }
    @Override
    public void physicalAttack(Hero hero) {
        hero.health -= physAtt - physAtt * hero.physDef;
        if (hero.health <= 0)
            hero.health = 0;
    }
    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}