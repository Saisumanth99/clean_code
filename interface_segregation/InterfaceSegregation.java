package interface_segregation;

interface AttackInterface{
    void killEnemy();
    
}
interface LandAttackInterface extends AttackInterface {
    void shortRangeAttack();
    void midRangeAttack();
    void longRangeAttack();
}
interface AerialAttackInterface extends AttackInterface {
    void midRangeAttack();
}

class LandAttacker implements LandAttackInterface {
    public void shortRangeAttack(){
        System.out.println("this is a short attack");
        killEnemy();
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
}

class AerialAttacker implements AerialAttackInterface {


    public void killEnemy() {
        System.out.println("killer enemy");
        
    }

    
    public void midRangeAttack() {
        System.out.println("this is a mid range attack");
        killEnemy();
    }
    
}


public class InterfaceSegregation {
    public static void main(String[] args) {
        LandAttacker hero_land = new LandAttacker();
        hero_land.shortRangeAttack();
        hero_land.midRangeAttack();

        new AerialAttacker().midRangeAttack();
        
    }
}
