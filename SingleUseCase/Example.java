package SingleUseCase;

import java.util.Scanner;

interface AttackInterface{
    void killEnemy();
    void midRangeAttack();
    
}
interface LandAttackInterface extends AttackInterface {
    void shortRangeAttack();
    
}
interface AerialAttackInterface extends AttackInterface {
    void longRangeAttack();
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
    
    
    public void killEnemy() {
        System.out.println("killed enemy");
    }
}

class AerialAttacker implements AerialAttackInterface {


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
class AdvancedLandAttacker extends LandAttacker {
    public void midRangeAttack(){
        System.out.println("This is an hammer throw mid range attack, extra health loss");
    }
}
class AdvancedAerialAttacker extends AerialAttacker {
    public void midRangeAttack(){
        System.out.println("This is an air gun mid range attack, extra health loss");
    }
}

class Player {
    AttackInterface attackType;
    void setAttackType(AttackInterface attackType){
        this.attackType = attackType;
    }
    void attack(){
        attackType.midRangeAttack();
        attackType.killEnemy();
    }
}


public class Example {
    public static void main(String[] args) {
        
        Player player = new Player();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your level");
        int level = sc.nextInt();
        
        System.out.println("Select your player 1)Earth King 2) Wind Lord");
        int index = sc.nextInt();
        if(level < 20){
            if(index==1)
                player.setAttackType(new LandAttacker());
            else if(index == 2)
                player.setAttackType(new AerialAttacker());
        } else {
            if(index==1)
                player.setAttackType(new AdvancedLandAttacker());
            else if(index == 2)
                player.setAttackType(new AdvancedAerialAttacker());
        }

        System.out.println("enter 1 to attack");
        if(sc.nextInt() == 1) player.attack();
        sc.close();


    }
}
