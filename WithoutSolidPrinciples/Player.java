package WithoutSolidPrinciples;

public class Player {
    AttackInterface attackType;
    int index, level;

    Player(int index, int level){
        this.index = index;
        this.level = level;
        if(index==1)
            attackType = new LandAttack();
        else if(index == 2)
            attackType = new AerialAttack();
    }

    void attack(){
        if(level < 20) attackType.midRangeAttack();
        else attackType.advancedMidRangeAttack();
    }
}
