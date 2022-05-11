package day11.task2;

public class Magician extends Hero implements interfacePhysAttack, interfaceMagicAttack {
    protected double magicDef;
    protected double physAtt;
    protected double magicAtt;
    public Magician() {
        super(0,0.8,5,20);
        magicDef = 0.8;
        physAtt = 5;
        magicAtt = 20;
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
        return "Magician{" +
                "health=" + health +
                '}';
    }
}