import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String playerA = "";
        String playerB = "";
        String userContinue = "";
        boolean done = false;
        Scanner in = new Scanner(System.in);

        do {
            //get move from player A
            do {
                System.out.print("Enter a move for Player A: ");
                if (in.hasNextLine()){
                    playerA = in.nextLine();
                    if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")){
                        done = true;
                    }
                    else {
                        System.out.println("Enter a valid move, not " + playerA + ".");
                    }
                }
            } while (!done);
            //get move from player B
            done = false;
            do {
                System.out.print("Enter a move for Player B: ");
                if (in.hasNextLine()){
                    playerB = in.nextLine();
                    if (playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S")){
                        done = true;
                    }
                    else {
                        System.out.println("Enter a valid move, not " + playerB + ".");
                    }
                }
            } while (!done);
            //game logic
            if (playerA.equalsIgnoreCase("R")){
                if (playerB.equalsIgnoreCase("R")){
                    System.out.println("A tie on rock.");
                }
                else if (playerB.equalsIgnoreCase("P")){
                    System.out.println("Paper covers rock, Player B wins.");
                }
                else{
                    System.out.println("Rock breaks scissors, Player A wins.");
                }
            }
            else if (playerA.equalsIgnoreCase("P")){
                if (playerB.equalsIgnoreCase("R")){
                    System.out.println("Paper covers rock, Player A wins.");
                }
                else if (playerB.equalsIgnoreCase("P")){
                    System.out.println("A tie on paper.");
                }
                else{
                    System.out.println("Scissors cut paper, Player B wins.");
                }
            }
            else { //scissors
                if (playerB.equalsIgnoreCase("R")){
                    System.out.println("Rock breaks scissors, player B wins.");
                }
                else if (playerB.equalsIgnoreCase("P")){
                    System.out.println("Scissors cut paper, player A wins.");
                }
                else{
                    System.out.println("A tie on scissors.");
                }
            }

            //continue?
            System.out.println("Would you like to continue [Y/N]? ");
            userContinue = in.nextLine();
            if (userContinue.equalsIgnoreCase("Y")) {done = false;}
        } while (!done);
        System.out.println("Goodbye!");
    }
}