import java.util.*;
public class Game {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Name Bank
        // Boys
        // Girls

Random ran = new Random();




String [] nameBoys1 = {"Jeremy", "Max"};
String [] nameGirls1 = {"Dhalia", "Lucy"};
String [] nameBoys2 = {"David", "Neil"};
String [] nameGirls2 = {"Louise", "Nikki"};

        int random1 = ran.nextInt(2);
        int random2 = ran.nextInt(2);
        int random3 = ran.nextInt(2);
        int random4 = ran.nextInt(2);

        int skillPoints = 10;
        int speed = 0;
        int strength = 0;
        int intelligence = 0;

        String f1 = nameBoys1[random1];
        String f2 = nameGirls1[random2];
        String f3 = nameBoys2[random3];
        String f4 = nameGirls2[random4];


        System.out.println("Pick a name: ");
        String name = scan.nextLine();

        System.out.println("-You have 10 skill points-");

        System.out.println("Speed: ");
        speed = scan.nextInt();


        if(speed <= skillPoints){

            skillPoints = skillPoints - speed;

            System.out.println("Strength: ");
            strength = scan.nextInt();

            if(strength <= skillPoints){

                skillPoints = skillPoints - strength;

                intelligence = skillPoints;

            }
        } else{

            System.out.println("No more skill points... ");

        }

        System.out.println("Press enter to continue: ");
        String go = scan.nextLine();


        System.out.println("Speed: " + speed);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligenece: " + intelligence);

        System.out.println("Press enter to Start the Game: ");
        go = scan.nextLine();


        System.out.println("_____The Trickening ~ Chapter 1____");
        System.out.println("");
        System.out.println("");

        System.out.println(f1 + ": Soo, I guess we'll start trick or treating now?");
        System.out.println(f2 + ": Yeah?");
        System.out.println(f4 + ": I guess so...This neighbourhood seems kinda shady though.");
        System.out.println(f3 + ": Nahh, LETS GO!");
        System.out.println(name + ": Ok, lets go then...");
        System.out.println(f1 + ": Alright");

        System.out.println("Press enter to continue: ");
        go = scan.nextLine();

        System.out.println(f1 + ": Ok, first house. *Rings bell*");
        System.out.println("Woman: Hello!");
        System.out.println("All: Trick or Treat!");
        System.out.println("Woman: Here you go, some for all of you!");
        System.out.println("All: Thanks!");
        System.out.println("Woman: Bye now, be safe");
        System.out.println(f4 + ": See, that wasnt so bad");
        System.out.println(name + ": Yeah haha");

        System.out.println(f2 + ": Maybe i'm being paranoid but why did she say be safe?");
        System.out.println(f3 + ": So that we can be safe?");
        System.out.println(f1 + ": " + f2 + ", maybe your overthinking this, lets try to have some fun");
        System.out.println(name + ": Yeah, I'm with " + f1 + " on this, lets try to have some fun");

        System.out.println("Press enter to continue: ");
        go = scan.nextLine();

        System.out.println("All: *Walking down the street*");
        System.out.println(f3 + ": Are you freaking kidding me? I got raisins on the first house!");
        System.out.println(f1 + ": HAHAHA, I got parmaviolets and some gum!");
        System.out.println(f4 + ": And I got a full bar and some chocolate fingers, lol");
        System.out.println(f2 + ": A toffee apple and mints for me");
        System.out.println(name + ": Starburst and biscuits");

        System.out.println(f1 + ": Next house, *Rings bell*");
        System.out.println("Old man: Hello youngins, hehe");
        System.out.println("All: Trick or Treat...");
        System.out.println("Old man: Here ya go, enjoy! *Smiles*");
        System.out.println("All: Thank you sir, bye");
        System.out.println("Old man: Take care!");
        System.out.println(f3 + ": What a nice man");
        System.out.println(f1 + ": Yeah, he seemed nice");
        System.out.println(f4 + ": Yeah totally");
        System.out.println("*Rustles in the bushes*");

        System.out.println("Press enter to continue: ");
        go = scan.nextLine();

        System.out.println(f1 + ": What the freak was that?");
        System.out.println(f4 + ": Chill dude, what was what?");
        System.out.println(f1 + ": The rustling in the bushes");
        System.out.println(name + ": I heard it too..");


        System.out.println("1. Go check it out");
        System.out.println("2. Keep walking");
        System.out.println("Type either 1 or 2");

        int choice1 = scan.nextInt();

        if(choice1 == 1){

            System.out.println("|Strength +1|");
            System.out.println("|Intelligence +1|");

            intelligence++;
            strength++;

            System.out.println(name + ": WE KNOW YOUR THERE");
            System.out.println("All: *Walk toward bushes*");
            System.out.println("*A racoon runs out of the bushes*");
            System.out.println(f1 + ": OH SHI-");
            System.out.println(f1 + ": Huh, is that a whole racoon?");
            System.out.println(f3 + ": Haha, y'all are funny");
            System.out.println(f4 + ": Relax man");
            System.out.println(f1 + ": I'M TOTALLY CALM");
            System.out.println("All: *Continue walking*");

            System.out.println("Press enter to continue: ");
            go = scan.nextLine();


        } else {

            System.out.println(name + ": Its probably nothing");
            System.out.println(f3 + ": Uhhh, or a murderer?");
            System.out.println(f4 + ": Lets hope its not a murderer " + f3);
            System.out.println(f3 + ": I'm just sayin");
            System.out.println(f2 + ": So nothing made that sound?");
            System.out.println(name + ": Trust me, it was probably a cat or something");
            System.out.println(f2 + ": Or that creepy man staring at us-");
            System.out.println("All: AHHHHH");
            System.out.println(f1 + ": Wait, what creepy- " + f2 + " are you messing with us?");
            System.out.println(f2 + ": I sure am, LoL");
            System.out.println(name + ": *Sigh* Lets keep walking");
            System.out.println("All: *Continue walking*");

            System.out.println("Press enter to continue: ");
            go = scan.nextLine();

        }

        System.out.println(f1 + ": 8:30pm, its soo early");
        System.out.println(f3 + ": Ehh, kind of");



    }
}
