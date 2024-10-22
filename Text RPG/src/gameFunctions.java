import java.util.Scanner;
import java.util.Random;


public class gameFunctions {
    static Scanner enter = new Scanner(System.in);

    //Player A takes Damage based off of Player B's weapon
    public static void takeDamage(Player A, Player B){
        A.setHp(A.getHp() - B.getWeapon().getDamage());
        System.out.println(A.getName() + " has taken " + B.getWeapon().getDamage() + " damage and has " + A.getHp() + " HP left!");

    }

    //A fight starts between player A and B with Player A attacking first until one dies
    public static void fight(Player A, Player B){
        while (A.getHp()>0 && B.getHp()>0){
            takeDamage(B, A);
            enter.nextLine();
            takeDamage(A, B);
            enter.nextLine();
        }
        if (A.getHp()<=0){
            System.out.println(A.getName() + " has died..");
        }else {
            System.out.println(B.getName() + " has died..");
        }
    }
    //checks players health to see if he is dead and exits the game
    public static void checkDead(Player A){
        if (A.getHp()<=0){
            System.out.println();
            System.out.println("'YOU HAVE FAILED ME'");
            System.out.println("You have died..");
            System.out.println();
            System.out.println("GAME OVER");
            System.exit(0);
        }
    }
    // generates a game of rock paper scissors against an npc
    //return -1 if lost, 1 if won, restarts if tie.
    public static int rockPaperScissors(Player A) {
        System.out.println("Choose:");
        System.out.println("1: Rock");
        System.out.println("2: Paper");
        System.out.println("3: Scissors");
        Random random = new Random();
        int npc = random.nextInt(3) + 1; // generates random number between 1-3 to signify npc's choice.
        //
        Scanner input = new Scanner(System.in);
        String choice;
        do {
            choice = input.next();
            if (choice.equals("1")) {
                System.out.println("You have chosen Rock");
                if (npc == 2){
                    System.out.println("Your opponent has chosen Paper and you have lost..");
                    return -1;
                } if (npc == 3){
                    System.out.println("Your opponent has chosen Scissors and you have won!");
                    return 1;
                } if (npc == 1) {
                    System.out.println("Your opponent has chosen Rock and you have tied..");
                    System.out.println();
                   return rockPaperScissors(A);
                }
            }
            if (choice.equals("2")) {
                System.out.println("You have chosen Paper");
                if (npc == 2){
                    System.out.println("Your opponent has chosen Paper and you have tied..");
                    System.out.println();
                   return rockPaperScissors(A);
                } if (npc == 3){
                    System.out.println("Your opponent has chosen Scissors and you have lost..");
                    return -1;
                } if (npc == 1){
                    System.out.println("Your opponent has chosen Rock and you have Won!");
                    return 1;
                }
            }
            if (choice.equals("3")) {
                System.out.println("You have chosen Scissors");
                if (npc == 2){
                    System.out.println("Your opponent has chosen Paper and you have Won!");
                    return 1;
                } if (npc == 3 ){
                    System.out.println("Your opponent has chosen Scissors and you have tied..");
                    System.out.println();
                   return rockPaperScissors(A);
                } if (npc == 1) {
                    System.out.println("Your opponent has chosen Rock and you have lost..");
                    return -1;
                }
            }
        } while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3"));
        return 0;
    }
    // generates a fight against an npc
    //return -1 if lost, 1 if won, restarts if tie.
    public static int grandFight(Player A){
        System.out.println("What would you like to do?");
        System.out.println("1: High Attack");
        System.out.println("2: Middle Attack");
        System.out.println("3: Low Attack");
        Random random = new Random();
        int npc = random.nextInt(3) + 1; // generates random number between 1-3 to signify npc's choice.
        //
        Scanner input = new Scanner(System.in);
        String choice;
        do {
            choice = input.next();
            if (choice.equals("1")) {
                System.out.println("You attack from above!");
                if (npc == 2){
                    System.out.println("You get the wind knocked out of you as you suffer a blow to your middle body..");
                    return -1;
                } if (npc == 3){
                    System.out.println("You penetrate their defence and land the blow!");
                    return 1;
                } if (npc == 1) {
                    System.out.println("You both clash and neither manage to land a blow..");
                    System.out.println();
                    return grandFight(A);
                }
            }
            if (choice.equals("2")) {
                System.out.println("You attack their middle body!");
                if (npc == 2){
                    System.out.println("You both clash and neither manage to land a blow..");
                    System.out.println();
                    return grandFight(A);
                } if (npc == 3){
                    System.out.println("You feel a blow land near your legs as you crash to the ground..");
                    return -1;
                } if (npc == 1){
                    System.out.println("You penetrate their defence and land the blow!");
                    return 1;
                }
            }
            if (choice.equals("3")) {
                System.out.println("You aim for the legs and attack!");
                if (npc == 2){
                    System.out.println("You penetrate their defence and land the blow!");
                    return 1;
                } if (npc == 3 ){
                    System.out.println("You both clash and neither manage to land a blow..");
                    System.out.println();
                    return grandFight(A);
                } if (npc == 1) {
                    System.out.println("Before landing your attack you feel sharp pain in your upper body as you suffer an attack");
                    return -1;
                }
            }
        } while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3"));
        return 0;
    }

    //generates a fireball dodging sequence
    public static void fireBall (Player A){
        System.out.println("In what direction do you dodge?");
        System.out.println("1: Left");
        System.out.println("2: Right");
        Random random = new Random();
        int npc = random.nextInt(2) + 1; // generates random number between 1-2 to signify npc's choice.
        Scanner input = new Scanner(System.in);
        String choice;
        choice = input.next();
            if (choice.equals("1")) {
                System.out.println("You dodge left!");
                if (npc == 1) {
                    System.out.println("The Kings shoots a fireball as you dodge and lands a direct hit");
                    A.setHp(A.getHp() - 2);
                    gameFunctions.checkDead(A);
                    System.out.println("You take 2 damage and have " + A.getHp() + " left.");
                }
                if (npc == 2) {
                    System.out.println("You feel the heat of the fireball as it passes right by you");
                }
            }
            if (choice.equals("2")) {
                System.out.println("You dodge right!");
                if (npc == 1) {
                    System.out.println("You feel the heat of the fireball as it passes right by you");
                }
                if (npc == 2) {
                    System.out.println("The Kings shoots a fireball as you dodge and lands a direct hit");
                    A.setHp(A.getHp() - 2);
                    gameFunctions.checkDead(A);
                    System.out.println("You take 2 damage and have " + A.getHp() + " left.");
                }
            }
    }
    //A flurry attack is unleashed on player A by player B
    public static void flurryAttack (Player A, Player B){
        System.out.println("In what direction do you slash?");
        System.out.println("1: Left");
        System.out.println("2: Right");
        Random random = new Random();
        int npc = random.nextInt(2) + 1; // generates random number between 1-2 to signify npc's choice.
        Scanner input = new Scanner(System.in);
        String choice;
        choice = input.next();
        if (choice.equals("1")) {
            System.out.println("You Slash left!");
            if (npc == 1) {
                System.out.println("Blood is sprayed as your attack lands!");
                A.setHp(A.getHp() - B.getWeapon().getDamage());
            }
            if (npc == 2) {
                System.out.println("Your attack misses at the last second..");
            }
        }
        if (choice.equals("2")) {
            System.out.println("You Slash right!");
            if (npc == 1) {
                System.out.println("Your attack misses at the last second..");            }
            if (npc == 2) {
                System.out.println("Blood is sprayed as your attack lands!");
                A.setHp(A.getHp() - B.getWeapon().getDamage());
            }
        }
    }
}
