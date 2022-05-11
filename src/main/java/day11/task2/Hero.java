package day11.task2;

public abstract class Hero {
    protected double health = 100;
    protected double physDef, magicDef, physAtt, magicAtt;
    public Hero(double physDef, double magicDef, double physAtt, double magicAtt) {
        this.physDef = physDef;
        this.magicDef = magicDef;
        this.physAtt = physAtt;
        this.magicAtt = magicAtt;
    }
}