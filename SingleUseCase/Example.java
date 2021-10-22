package SingleUseCase;

import java.util.Scanner;

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
                player.setAttackType(new LandAttack());
            else if(index == 2)
                player.setAttackType(new AerialAttack());
        } else {
            if(index==1)
                player.setAttackType(new AdvancedLandAttack());
            else if(index == 2)
                player.setAttackType(new AdvancedAerialAttack());
        }

        System.out.println("enter 1 to attack");
        if(sc.nextInt() == 1) player.attack();
        sc.close();


    }
}
