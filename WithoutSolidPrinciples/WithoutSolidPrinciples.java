package WithoutSolidPrinciples;

import java.util.Scanner;

public class WithoutSolidPrinciples {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your level");
        int level = sc.nextInt();

        System.out.println("Select your player 1)Earth King 2) Wind Lord");
        int index = sc.nextInt();

        Player player = new Player(index, level);

        System.out.println("enter 1 to attack");
        if(sc.nextInt() == 1) player.attack();
        sc.close();


    }
}
