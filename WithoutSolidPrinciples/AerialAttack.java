package WithoutSolidPrinciples;

public class AerialAttack implements AttackInterface {
    public void shortRangeAttack(){
        throw new UnsupportedOperationException("This attack is not supported");
    }
    public void midRangeAttack(){
        System.out.println("this is a mid attack");
        killEnemy();
    }
    public void longRangeAttack(){
        System.out.println("this is a long attack");
        killEnemy();
    }
    public void killEnemy() {
        System.out.println("killed enemy");
    }

    public void advancedMidRangeAttack(){
        System.out.println("This is an air gun mid range attack, extra health loss");
    }
}
