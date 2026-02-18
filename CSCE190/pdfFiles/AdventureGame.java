// Madeline Miklos CSCE 145-003
import java.util.Scanner;

public class AdventureGame {
    public static void main (String[] args) {
        Scanner key = new Scanner(System.in);

        int luckynum = (int) (Math.random() * 3)+1;
        // generates a random number in the range of 1-3

        System.out.println("Pick a number 1-3 before you start.");
        int userNum= key.nextInt();
        // this random number will be checked later in the Georgia Aquarium

        if (userNum <= 0 || userNum > 3){
            System.out.println("Invalid user number. Exiting the program!");
            System.exit(0);
            // checks if the number entered is valid
        }

        System.out.println("Welcome to the vacation decision game!"
        + "\nFirst pick which direction would you like to go.\nEnter \"East\" or \"West\".");
        key.nextLine();
        String cardinalDirec = key.nextLine();

        /* takes the user input "cardinalDirec" and sees if the user input "east", "west", or an input other than
        that and if so followed respective if blocks associated with that statement */
        if (cardinalDirec.equalsIgnoreCase("east")){
            System.out.println("You head toward the coast and can go to 3 different locations."
            + "\nWhere do you wish to go? Enter the number beside the location"
                    + "\n1. Congaree National Park\n2. Charleston\n3. Fripp Island");
            int locationNum = key.nextInt();
            // takes a numerical input anything else will result in an error

            if (locationNum == 1){
                System.out.println ("Congaree National Park is holding their annual Synchronous Fireflies Viewing Event."
                        + "\nDuring this time visitors can experience an awe-inspiring display of synchronous flashing while the fireflies search for a mate. " +
                        "This special and unique phenomenon is extremely popular event.\nYou have received ending: 1");
            } else if (locationNum == 2){
                System.out.println ("King Street is known as Charleston's central hub for shopping, dining, and entertainment." +
                        "You stumble into Louis Vuitton and win their 100th visitor special bag!\nYou have received ending: 2");
            } else if (locationNum == 3){
                System.out.println("You want to visit Fripp island's beach but are unsure if you want to bring food." +
                        "\nEnter \"true\" if you want to bring food or \"false\" if you don't want to");
                boolean bringFood = key.nextBoolean();
                //uses this input to store into a boolean variable type and used in the if statements below to get a different outcome

                if (bringFood == true){
                    System.out.println("You brought an apple and meet a deer on the beach. You feed the deer the apple" +
                            " and get lots of pictures with a deer eating out of your hand.\nYou have received ending: 3");
                }else if (bringFood == false){
                    System.out.println("Your rental house has a golf cart, so you ride it to the Marina. The sunsets and" +
                            " you met a photographer who takes photos of you with all the fishman's boats in the back." +
                            "\n\nYou have received ending: 4");
                }else{
                    System.out.println ("Invalid location number. Exiting the program!");
                    System.exit(0);
                }
            } else{
                System.out.println ("Invalid location number. Exiting the program!");
                System.exit(0);
            }
        }else if (cardinalDirec.equalsIgnoreCase("west")){
            System.out.println("You head toward the mountains and can go to 3 different locations."
                    + "\nWhere do you wish to go? Enter the number beside the location"
                    + "\n1. Atlanta \n2. Clemson\n3. Greenville");
            int locationNum = key.nextInt();

            if (locationNum == 1){
                System.out.println("You arrive in Atlanta. Would you like to visit the Coca-Cola museum or the Georgia Aquarium?" +
                        "\nEnter 1 for the Coca-Cola museum or 2 for the Georgia Aquarium");
                int atlantaPlace = key.nextInt();
                if (atlantaPlace == 1){
                    System.out.println("In the Coca-Cola museum, you go into the tasting room and taste " +
                            "the authentic Mexican Coke. It tastes as good as the rumors.\nYou have received ending: 5");
                }else if (atlantaPlace == 2 && luckynum == userNum){
                    /*uses the number the user input and the random number generated to have a 1 in 3 chance to print this
                    statement*/
                    System.out.println("They draw a raffle and number " + luckynum + " gets called! You answered " + userNum
                    + ". You get the once in a life-time opportunity to snorkel with Yushan the whale shark.\nYou have received ending: 6");
                } else if (atlantaPlace == 2){
                    System.out.println("In the Georgia Aquarium, you go to the Explorer's Cove and touch a sting ray." +
                            "\n\nYou have received ending: 7");
                }else{
                    System.out.println ("Invalid location number. Exiting the program!");
                    System.exit(0);
                }
            }else if (locationNum == 2){
                System.out.println("You arrive at Clemson with a USC jersey and the students aren't happy.\nYou have received ending: 8");
            }else if (locationNum == 3){
                System.out.println("You walk around Falls Park on the Reedy and slip on a rock.\nYou have received ending: 9");
            }else {
                System.out.println ("Invalid location number. Exiting the program!");
                System.exit(0);
            }
        } else{
            System.out.println ("Invalid direction. Exiting the program!");
            System.exit(0);
        }
    }
}