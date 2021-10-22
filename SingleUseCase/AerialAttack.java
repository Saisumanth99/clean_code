package SingleUseCase;

class AerialAttack implements AerialAttackInterface {


    public void killEnemy() {
        System.out.println("killed enemy");
    }


    public void midRangeAttack() {
        System.out.println("this is a mid range attack");
        killEnemy();
    }
    public void longRangeAttack(){
        System.out.println("this is a long range attack");
        killEnemy();
    }

}