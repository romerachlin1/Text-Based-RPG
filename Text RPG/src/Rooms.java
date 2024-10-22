import java.util.Scanner;

public class Rooms {

    static Scanner input = new Scanner(System.in);
    static Scanner enter = new Scanner(System.in);

    public static void Cave1(Player A){
        System.out.println();
        System.out.println("You enter the cave and can only slightly see the inside due to the light entering from the entrance.");
        System.out.println("You notice a recently put out fire with a pot near.");
        enter.nextLine();
        System.out.println("What would you like to do?");
        System.out.println("1: Continue Deeper into the cave");
        System.out.println("2: Investigate");
        System.out.println("3: Leave");
        String choice = input.next();
        if (choice.equals("1")){
            Cave2(A);
        }
        if (choice.equals("2")){
            System.out.println("You look near the pot and while looking find a knife.");
            A.setWeapon(Weapon.knife);
            System.out.println(A.getWeapon());
            enter.nextLine();
            System.out.println("What would you like to do?");
            System.out.println("1: Continue Deeper into the cave");
            System.out.println("2: Leave");
            String choice2 = input.next();
            if (choice2.equals("1")){
                Cave2(A);
            }
            if (choice2.equals("2")){
                Forest(A);
            }
        }
        if (choice.equals("3")){
            Forest(A);
        }
        return;
    }
    public static void Cave2(Player A){
        Player caveMan = new Player("Cave Man");
        caveMan.setHp(15);
        System.out.println();
        System.out.println("As you delve deeper into the cave it becomes pitch black. You stop suddenly due to a rustling you hear a few feet ahead.");
        enter.nextLine();
        System.out.println("What would you like to do?");
        System.out.println("1: Rush forward and attack");
        System.out.println("2: Call out");
        String choice = input.next();
        do {
            if (choice.equals("1")) {
                System.out.println();
                System.out.println("You rush forward slashing frantically, from your side someone bumps into you and starts attacking back.");
                gameFunctions.fight(caveMan, A);
                if (A.getHp() <= 0){
                    System. exit(0);
                }
                else {
                    System.out.println();
                    System.out.println("You stand over the bloodied corpse of the man and from the corner of your eye spot something shining.");
                    enter.nextLine();
                    System.out.println("You come closer and notice a sword and pick it up.");
                    enter.nextLine();
                    A.setWeapon(Weapon.sword);
                    System.out.println(A.getWeapon());
                    System.out.println("You put the sword away and leave the cave.");
                    enter.nextLine();
                    Forest(A);
                }
            }
            if (choice.equals("2")) {
                System.out.println("You call out into the darkness: 'Who's there?'");
                enter.nextLine();
                System.out.println("A raspy voice answers back: 'Tiss I the Cave Dweller.. Who goes their?'");
                enter.nextLine();
                System.out.println("You answer back: 'I am the Chosen One.'");
                enter.nextLine();
                System.out.println("He answers Back: 'Finally the day has come.. Please accept this gift.. ");
                System.out.println("He hands you a sword you can see shine even in this dark cave.");
                A.setWeapon(Weapon.sword);
                System.out.println(A.getWeapon());
                System.out.println("You put the sword away, thank the man and leave the cave.");
                enter.nextLine();
                Forest(A);
            } else {
                System.out.println("NOW IS NOT THE TIME TO HESITATE YOU MUST DECIDE");
                enter.nextLine();
            }
        } while (!choice.equals("1") && !choice.equals("2"));
    }

    public static void Forest(Player A){
        System.out.println();
        System.out.println("You have returned to the fork you started at.");
        enter.nextLine();
        System.out.println("What would you like to do?");
        System.out.println("1: Delve deeper into forest");
        System.out.println("2: Rest");
        String choice = input.next();
        do {
            if (choice.equals("1")) {
                System.out.println("Deeper into the forest you head..");
                enter.nextLine();
                deepForest(A);
            }
            else if (choice.equals("2")) {
                A.setHp(35);
                System.out.println("You decide to rest for the night..");
                System.out.println("Your current HP is " + A.getHp());
                enter.nextLine();
                System.out.println("After sleeping the night you awaken rested.");
                enter.nextLine();
                System.out.println();
                System.out.println("Deeper into the forest you head..");
                enter.nextLine();
                   deepForest(A);
            } if (!choice.equals("1") && !choice.equals("2")){
                System.out.println("NOW IS NOT THE TIME TO HESITATE YOU MUST DECIDE");
                enter.nextLine();
            }
        } while (!choice.equals("1") && !choice.equals("2"));
    }

    public static void deepForest(Player A){
        System.out.println();
        System.out.println("As you delve deeper into the forest the trees grow larger, sunlight becomes scarce and the plants thornier..");
        System.out.println("Almost as if the forest itself does not welcome you..");
        enter.nextLine();
        System.out.println("You hesitate on your way and look back, but it is too late..");
        System.out.println("The trees themselves closed the path back!");
        enter.nextLine();
        System.out.println("The only way to go is further in..");
        enter.nextLine();
        System.out.println();
        System.out.println("You continue walking through the forest until you come upon a spot with a stone slab and a sword shaped hole in the middle.");
        enter.nextLine();
        System.out.println("As you see it the trees begin closing in around you, you realise if you don't act quick you'll be crushed.");
        System.out.println();
        enter.nextLine();
        if (A.getWeapon() != Weapon.sword){
            System.out.println("What do you do?");
            System.out.println("1: Slash at trees");
            String choice = input.next();
            do {
                if (choice.equals("1")) {
                    System.out.println("Nothing seems to stop the trees.. If only you had a sword..");
                    enter.nextLine();
                    System.out.println("The trees close in and you are slowly crushed as you struggle to survive..");
                    enter.nextLine();
                    System.out.println("GAME OVER");
                    System.exit(0);
                } else {
                    System.out.println("NOW IS NOT THE TIME TO HESITATE YOU MUST DECIDE");
                    enter.nextLine();
                }
            } while (!choice.equals("1"));
        } else {
            System.out.println("You see your sword shining and begin to vibrate..");
            enter.nextLine();
            System.out.println("Insert Sword?");
            String choice = input.next();
                if (!choice.isEmpty()) {
                    System.out.println("As you insert the sword the trees suddenly stop.");
                    System.out.println("The trees to the North clear away leaving 5 trees standing.");
                    System.out.println();
                    enter.nextLine();
                    System.out.println("You approach the trees and notice each tree has some writing on it.");
                    System.out.println("You touch one and it begins to glow.");
                    System.out.println();
                    enter.nextLine();
                    System.out.println("The writing on the trees is:");
                    System.out.println("Sun: With me the day starts and all shall come after.");
                    System.out.println("Moon: I am the end of day and after me night follows.");
                    System.out.println("Star: The Moon is my king and i shall follow till the end of time.");
                    System.out.println("Flame: I blaze after the Sun, for he is my king.");
                    System.out.println("Flower: I thrive off the sun and yield before the flame. As night comes i rest.");
                    System.out.println();
                    enter.nextLine();
                    System.out.println("In what order do you touch the trees?");
                    System.out.println();
                    deepForestRiddle(A);
                }
        }
    }

    public static void deepForestRiddle(Player A) {
            System.out.println("You must input the names with spaces in between and every name must start with capital letter.");
            System.out.println("For Example:");
            System.out.println("Flower Moon Sun Flame Star");
            Scanner input = new Scanner(System.in);
            String choice2 = input.nextLine();
            do {
                if (!choice2.equals("Sun Flame Flower Moon Star")) {
                    System.out.println("The trees light up but quickly the light vanishes..");
                    choice2 = input.nextLine();
                } if (choice2.equals("Sun Flame Flower Moon Star")){
                    System.out.println("The trees light up and slowly all the trees to the North part for you revealing a path..");
                    System.out.println("You head out of the forest and continue your journey..");
                    enter.nextLine();
                    castlePath(A);
                }
            } while (!choice2.equals("Sun Flame Flower Moon Star"));
        }

    public static void castlePath(Player A) {
        System.out.println();
        System.out.println("As you continue walking down the path you see a castle in the distance.");
        enter.nextLine();
        System.out.println("'THAT IS YOUR DESTINATION AND FINAL TRIAL'");
        System.out.println("You are drawn to the castle as if by a thread..");
        System.out.println();
        enter.nextLine();
        System.out.println("As you approach the castle gate you see a single guard.");
        System.out.println("The guard notices and calls out: Who goes there?");
        System.out.println();
        enter.nextLine();
        System.out.println("1: Ignore and attack the guard");
        System.out.println("2: Call out: Tiss' I, the chosen one!");
        String choice;
        do {
            choice = input.next();
            if (choice.equals("1")) {
                System.out.println("You rush forward slashing at the guard!");
                enter.nextLine();
                System.out.println("The guard moves at incredible speed stopping your slash and throwing you to the ground.");
                System.out.println("You lose 3 HP!");
                A.setHp(A.getHp() - 3);
                System.out.println("Your current HP is " + A.getHp());
                System.out.println();
                enter.nextLine();
                gameFunctions.checkDead(A);
                System.out.println("While on the ground you hear the guard say: 'I wouldn't try that again boy!'");
                System.out.println("Ill let you in if you can defeat me in the ancient game of Rock, Paper, Scissors..");
                System.out.println();
                enter.nextLine();
            }
            if (choice.equals("2")) {
                System.out.println("The guard replies: 'Chosen one Shmosen one..'");
                System.out.println("You're not going anywhere before you defeat me in the ancient game of Rock Paper Scissors!");
                System.out.println();
                enter.nextLine();
            } if (!choice.equals("1") && !choice.equals("2")){
                System.out.println("NOW IS NOT THE TIME TO HESITATE YOU MUST DECIDE");
                enter.nextLine();
            }
        } while (!choice.equals("1") && !choice.equals("2"));
        System.out.println();
        int result;
        do {
            result = gameFunctions.rockPaperScissors(A);
            if (result == 1) {
                System.out.println();
                System.out.println("The guard says: 'You have defeated me fair and square.'");
                System.out.println("'I acknowledge you as the chosen one.'");
                System.out.println("'Good luck on your journey..'");
                System.out.println("He moves aside and you enter the castle..");
                System.out.println();
                enter.nextLine();
                castle(A);
            } if (result == -1){
                System.out.println();
                System.out.println("The guard says: 'Ha! I knew you couldn't defeat me!'");
                System.out.println("He swipes his sword at you and you take 1 damage.");
                A.setHp(A.getHp()-1);
                enter.nextLine();
                System.out.println("But i'm bored so i'll let you try again.");
                System.out.println();
                System.out.println("Your current HP is " + A.getHp());
                System.out.println();
                enter.nextLine();
            }
        } while (result != 1);
    }

    public static void castle(Player A){
        Player king = new Player("The King");
        king.setWeapon(Weapon.sword);
        System.out.println();
        System.out.println("The door of the castle creaks open as you enter.");
        enter.nextLine();
        System.out.println("You enter a large room with a long rug and stone pillars on the sides.");
        System.out.println("At the edge of the rug you see a grand throne and a man sitting on it.");
        enter.nextLine();
        System.out.println("'I always knew this day would come..' The man says.");
        System.out.println("In your head you hear: 'THAT MAN IS YOUR DESTINY!'");
        System.out.println("'DEFEAT HIM AND SAVE THIS WORLD!'");
        enter.nextLine();
        System.out.println("The man unsheathes a sword as black as night and charges forward.");
        System.out.println();
        enter.nextLine();
        //Stage 1 of fight begins
        int result;
        while (king.getHp()>=16){
            result = gameFunctions.grandFight(A);
            if (result == 1){
                System.out.println();
                System.out.println("The King winces in pain as you slash at him!");
                gameFunctions.takeDamage(king,A);
                System.out.println();
            } if (result == -1){
                System.out.println();
                System.out.println("You feel a sharp pain as the King lands a blow against you!");
                gameFunctions.takeDamage(A, king);
                gameFunctions.checkDead(A);
                System.out.println();
            }
        }
        //Stage 2 of fight begins
        System.out.println();
        System.out.println("The king looks at you with rage in his eyes and yells: 'I will not be defeated by you!'");
        System.out.println("He raises his hand and you notice a flaming orb emerge from his hands.");
        System.out.println();
        enter.nextLine();
        for (int i = 0; i < 5; i++) {
            gameFunctions.fireBall(A);
            System.out.println();
        }
        //Stage 3 of fight begins
        System.out.println("After surviving the kings attacks you notice fear in the kings eyes..");
        System.out.println("You feel a strength in you pushing you forward and you rush towards the king for your counter attack!");
        enter.nextLine();
        while (king.getHp()>0){
            gameFunctions.flurryAttack(king,A);
            if (king.getHp()>0) {
                System.out.println();
                System.out.println("The King seems bloodied and has " + king.getHp() + " left!");
                System.out.println();
            }
            else {
                System.out.println();
            }
        }
        //End of fight
        System.out.println();
        System.out.println("You deliver a final blow to the king and he crashes to the ground..");
        enter.nextLine();
        System.out.println("His crown clanks next to his bloodied corpse and you hear:");
        System.out.println("'TAKE IT!'");
        System.out.println("'IT IS YOURS NOW!'");
        enter.nextLine();
        System.out.println("You slowly lift the crown and place it on your head.");
        System.out.println("You step over the Kings warm corpse and sit down on the thrown.");
        System.out.println();
        enter.nextLine();
        System.out.println("As you sit the doors creak open and a man walks in and yells:");
        System.out.println("'I am the chosen one and i am here to defeat you!'");
        enter.nextLine();
        System.out.println("'AND SO THE CYCLE CONTINUES' the voice says in your head..");
        System.out.println("So you stand and raise your sword to your new enemy..");
        System.out.println();
        System.out.println();
        enter.nextLine();
        System.out.println("GAME OVER");
    }
}
