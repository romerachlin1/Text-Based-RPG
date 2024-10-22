import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner enter = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println("CHOSEN ONE! IT IS TIME!");
        System.out.println("You awaken with a start to see you are alone in a forest you do not recognise.");
        System.out.println("YOU SHALL START ANEW, CHOOSE YOUR NAME.");
        Player name = new Player(input.nextLine());
        System.out.println(name.getName() + ". YES.. A FINE NAME.. STRONG..");
        System.out.println("ARISE AND BEGIN YOUR ADVENTURE!");
        System.out.println(name);
        enter.nextLine();
        System.out.println();
        System.out.println("You look around and notice you have slept near a fork in a road.");
        System.out.println("To your right you notice the forest thickens and becomes jagged.");
        System.out.println("To your left the path leads to a dark cave.");
        System.out.println("Where does your destiny lead you?");
        System.out.println();
        System.out.println("Choose 1 for forest or 2 for cave");
        String choice;
        do {
            choice = input.next();
            if (choice.equals("1")) {
                System.out.println("deeper into the forest you head..");
                enter.nextLine();
                Rooms.deepForest(name);
            } else if (choice.equals("2")) {
                System.out.println("into the cave you head..");
                enter.nextLine();
                Rooms.Cave1(name);
            } else {
                System.out.println("DO NOT RUN FROM YOUR DESTINY!");
            }
        } while (!choice.equals("1") && !choice.equals("2")) ;
    }


}



