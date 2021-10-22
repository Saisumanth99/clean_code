package WithoutSolidPrinciples;

public class LandAttack implements AttackInterface {
    public void shortRangeAttack(){
        System.out.println("this is a short attack");
        killEnemy();
    }
    public void midRangeAttack(){
        System.out.println("this is a mid attack");
        killEnemy();
    }
    public void longRangeAttack(){
        throw new UnsupportedOperationException("This attack is not supported");
    }
    public void killEnemy() {
        System.out.println("killed enemy");
    }

    public void advancedMidRangeAttack(){
        System.out.println("This is an hammer throw mid range attack, extra health loss");
    }
}
