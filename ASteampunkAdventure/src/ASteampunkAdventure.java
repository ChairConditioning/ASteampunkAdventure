import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

public class ASteampunkAdventure {
	public static Player name = new Player("Player", 10, 4, 4, false, false, 1, false, false);
	public static double falldamage;
	public static double falldamage2;
	public static double falldamage3;
	public static double falldamage4;
	public static int playergold;
	
	public static void dead() {
		System.out.println("Your adventure comes to an end as you let out your last breath at level " + name.level + ". Farewell, " + name.playerName + "!");
		System.exit(0);
	}
	
	public static void choice1 () {
		System.out.println("You decide to try to cross the street and visit your favrite tea shop to make you feel more energetic. \nSuddenly, while crossing the busy street, a steamcar collides with your leg!");
		if (name.checkAlive(name.health)==false) {
			dead();
		}
		name.health--;
		name.level++;
		System.out.println("You take " + falldamage + " damage, leaving you at " + name.health + " health.");
		if (name.checkAlive(name.health)==false) {
			dead();
		}
		
		name.health += 2;
		playergold -= 3;
		name.strength++;
		name.level += 1;
		System.out.println("You now know to take the hover-bridge next time, and gain a level. That makes you level " + name.level + ". You pay 3 coins for a warm cup of sweet tea, which gives you two health! \n" + name.health + " health remaining. After walking all the way to the factory from the tea shop, you gained one strength!");
		
		if (name.checkAlive(name.health)==false) {
			dead(); }
		return;
	}
	
	public static void choice2 () {
		if (name.checkAlive(name.health)==false) {
			dead();
		}
	name.health -= falldamage2;
	System.out.println("You decide to travel directly to work. Since you did not get any caffine from a nice cup of tea, you accidently slip on a grease puddle in the factory and \ncan't regain your balance. You lost " + falldamage2 + " health, leaving you at " + name.health + " life. However, you did earn 5 coins for working longer!");	
	playergold += 5;
	if (name.checkAlive(name.health)==false) {
		dead(); }
	return;
	}	

	public static void choice3 () {
		System.out.println("You upgrade your faulty Powerglove to optimal quality.");
		name.hasGloveUpgrade = true;
		if (name.checkAlive(name.health)==false) {
			dead(); }
		return;
	}
	
	public static void choice4 () {
		System.out.println("You upgrade your faulty Elemental Musket to optimal quality.");
		name.hasGunUpgrade = true;	
		if (name.checkAlive(name.health)==false) {
			dead(); }
		return;
	}
	
	public static void choice5 () {
		System.out.println("You whip out your newly upgraded Elemental Musket, switch on the freeze switch, and your manager is suddenly frozen in his tracks. From that impressive quick draw, you gained one speed!");	
		name.speed++;	
		if (name.checkAlive(name.health)==false) {
			dead(); }
		name.level += 1;
		System.out.println("You gained a level! You are now level " + name.level + ".");
		return;
	}
	
	public static void choice6 () {
		System.out.println("You whip out your newly upraged Powerglove and aim it towards your manager's pockets as you begin to run out of the factory. \nFour coins fly out of his pockets and into your hands!");
		playergold += 4;
		if (name.checkAlive(name.health)==false) {
			dead(); }
		return;
	}
	
	public static void choice7 () {
		System.out.println("The piolet bites your coins and agrees to take you to Zenith. You hop in the old military airship and set sail!");	
	if (name.checkAlive(name.health)==false) {
			dead(); }
	return;
	}
	public static void choice8 () {
		System.out.println("The piolet suddenly shivers in your presence and reluctantly agrees to take you to Zenith. You hop in the old military airship and set sail!");
		if (name.checkAlive(name.health)==false) {
			dead(); }
		return;
	}
	
	public static void choice9 () {
		System.out.println("As the piolet turns to spit, you rush to the cargo compartment of the airship unnoticed. You hop in the old military airship and set sail!");
		if (name.checkAlive(name.health)==false) {
			dead(); }
		name.level += 1;
		System.out.println("You gained a level! You are now level " + name.level + ".");
		return;
	}
	
	public static void choice10 () {
		name.health -= falldamage3;
		System.out.println("The piolet briskly shoves you aside, and you take " + falldamage3 + " damage, leaving you at " + name.health + " health.");
		if (name.checkAlive(name.health)==false) {
			dead(); }
		return;
	}
	
	public static void choice11 () {
		System.out.println("You vault over the rail of the ship as it speeds on. Upon activating the Powerglove, you are pulled to a metal gutter on the edge of a tower. As you begin to climb down, your weight is too much for the hinges, and the gutter begins to creak.");
		
		if (name.speed > 5) {
		choice15();	
		}
		
		else {
		choice17();
		}
		
		return;
	}
	
	public static void choice12 () {
		System.out.println("You rush to the crazed piolet and aim your musket. The piolet does not look phased by the contraption and attempts to rip it out of your hands! However, the piolet clearly underestimated your invention. As you pull the trigger, the piolet's jacket ignites with a spark. You are able to take control of the ship for a moment as the pilot rolls around screaming on the floor. The vessel jolts to the side, just before impacting with an important looking building, and then sinks into the streets.");
		if (name.checkAlive(name.health)==false) {
			dead(); }
		name.level += 1;
		System.out.println("You gained a level! You are now level " + name.level + ".");
		return;
	}
	
	public static void choice13 () {
		name.health -= falldamage4;
		System.out.println("You vault over the rail of the ship as it speeds on. Upon activating the Powerglove, nothing happens, and you tumble down a series of roofs until landing flat on your back in an ally. From that spill, you took " + falldamage4 + " damage. Ouch! That leaves you at " + name.health + " health.");
		if (name.checkAlive(name.health)==false) {
			dead(); }
		return;
	}
	
	public static void choice14 () {
		System.out.println("You rush to the crazed piolet and aim the musket. The piolet does not look phased by the contraption and attempts to rip it out of your hands! As you pull the trigger, nothing happens. The piolet disarms you, and a brutal fistfight ensues!");
		
		if (name.strength > 5) {
		choice16();	
		}
		
		else {
		choice18();
		}
		
		return;
	}
	
	public static void choice15 () {
		System.out.println("Good thing you are quick enough to descend the gutter before it snaps off it's hinges! You jump off the edge of the tower and clumsily land in an ally.");	
		if (name.checkAlive(name.health)==false) {
			dead(); }
		name.level += 1;
		System.out.println("You gained a level! You are now level " + name.level + ".");
		return;
	}
	
	public static void choice16 () {
		System.out.println("Good thing you are way tougher than the piolet! After you clock the piolet in the face, you have a moment to take control of the ship. The vessel jolts to the side, just before impacting with an important looking building, and then sinks into the streets.");
		if (name.checkAlive(name.health)==false) {
			dead(); }
		return;
	}

	public static void choice17 () {
		System.out.println("The gutter snaps off it's hinges before you can decend, and you fall flat on your back in an ally, taking" + falldamage4 + " damage, leaving you at " + name.health + " health.");
		if (name.checkAlive(name.health)==false) {
			dead(); }
		return;
	}

	public static void choice18 () {
		System.out.println("You are not strong enough to overcome the piolet, and you get knocked to the ground. The piolet quickly drags you to the edge of the deck and hoists you over the rail. As you tumble down roof after roof, the airship continues to speed forward. You land flat on your back in an ally and take " + falldamage4 + " damage, leaving you at " + name.health + " health.");
		if (name.checkAlive(name.health)==false) {
			dead(); }
		return;
	}
	
	public static void choice19 () {
		System.out.println("You stand no chance against the automatons; one flings you in the air and you land in the fire escape of the building behind you. From the impact, you take" + falldamage3 + " damage, leaving you at" + name.health + " health.");
		name.health -= falldamage3;
		if (name.checkAlive(name.health)==false) {
			dead(); }
		name.level++;
		System.out.println("However, you gained a level, making you level " + name.level + ".");
		System.out.println("You notice that the masked figure is fighting with the robot officers. Gears are broken! Springs are twisted! However, the last automaton has the masked figure in it's grasp, and is slowly squeezing harder and harder.");
	}
	
	public static void choice20 () {
		System.out.println("You decide that you stand no chance against the automatons, and let the masked figure deal with them. You find a fire escape and begin to climb up. However, it's a dead end, as all doors you encounter are locked.");
		if (name.checkAlive(name.health)==false) {
			dead(); }
		System.out.println("You notice that the masked figure is fighting with the robot officers. Gears are broken! Springs are twisted! However, the last automaton has the masked figure in it's grasp, and is slowly squeezing harder and harder.");
		return;
	}
	
	public static void choice21 () {
		System.out.println("You upgrade your Elemental Musket.");
		if (name.checkAlive(name.health)==false) {
			dead(); }
		return;
	}
	
	public static void choice22 () {
		System.out.println("You upgrade your Powerglove.");
		if (name.checkAlive(name.health)==false) {
			dead(); }
		return;
	}
	
	public static void choice23 () {
		System.out.println("You aim your Elemental Musket at the robot from the fire escape and pull the trigger. A bullet explodes from the gun and shoots through the head of the robot. Suddenly, it is engulfed in a corrosive green goo, and the masked figure has to shake off the carcas of the machine.");
		if (name.checkAlive(name.health)==false) {
			dead(); }
		//level up
		System.out.println("You walk nervously down the fire escape to the masked figure.");
		return;
	}
	
	public static void choice24 () {
		System.out.println("You aim your Powerglove at the automaton, and you fly off the fire escape and into the robot's magnetic torso. The robot is tackled onto the ground, and as it starts to get up, it's head is smashed in by the boot of the masked figure.");
		if (name.checkAlive(name.health)==false) {
			dead(); }
		name.level++;
		System.out.println("You gained a level, making you level " + name.level + ". However, you just slammed into a metal robot. The masked figure helps you up from the ground.");
		return;
	}
	
	//Ending Choice 1
	public static void choice25 () {
		System.out.println("End 1");
	}
	
	//Ending Choice 2
public static void choice26 () {
	System.out.println("End 2");
	}
	
	public static void choice100 () {
	System.out.println("The invention you attempted to use is broken. Whatever you just tried to pull with your manager, it did not work. You walk out of the factory in shame.");	
	if (name.checkAlive(name.health)==false) {
		dead(); }
	return;
}
	
	public static void choice101 () {
		System.out.println("The invention you attempted to use is broken. The only thing you can do is hide as the masked figure is carried away by the automaton officer. Word has it that you roamed Zenith for days as the robots hunted you down. You were eventually found, and sent back to a prison in Prominence.");	
		if (name.checkAlive(name.health)==false) {
			dead(); }
	}
	public static void main(String[] args) throws IOException {
		
		//Start
		
		/*DisplayImage x = new DisplayImage();
		x.displayText("Enter your name, sire or madame.", "Name");
		String pname = x.namer;
		name.playerName=pname;
		System.out.println(name.playerName);*/
		
		//End
		
//Declare scanner 
		Scanner playerInput = new Scanner(System.in);
		Random randomGenerator = new Random();
		
		//Set variables
		String playeranswer;
		String playeranswer2;
		String playeranswer3;
		String playeranswer4;
		String playeranswer5;
		String playeranswer6;
		String playeranswer7;
		String playeranswer8;
		String playeranswer9;
		String playeranswer101;
		String playeranswer102;
		String playeranswer103;
		String playeranswer104;
		String playeranswer105;
		
		playergold = 2;
		falldamage = randomGenerator.nextInt(2)+2;
		falldamage2 = randomGenerator.nextInt(2);
		falldamage3 = randomGenerator.nextInt(2);
		falldamage4 = randomGenerator.nextInt(3)+1;
		
		boolean alive = true;
		while (alive == true) {
			
		if (name.checkAlive(name.health)==false) {
			break;
		}
		
		//Introduction
		System.out.println("Welcome to A Steampunk Adventure, v.1.0.1. Before beginning, please note that the choices you make affect your stats, and what you are able to do later on. \nYour responses are not case sensitive. You can also check your stats anytime by typing 'stats'. Damage that you take and the stats you are given may be random. \nTo make a choice when promted, type it on the line below the text and press 'Enter.'");
		System.out.println("Please enter your name below, sire or madame.");
		name.playerName = playerInput.nextLine(); 
		System.out.println("In the plain of Phantasmagoria, on the continent of Prominence, you wake from a deep sleep by the sudden sound of the echoing work wistle. \nWhen you jolt awake, for a moment, you completely forget your name. Of course, you quickly remember that you are " + name.playerName + ", a poor and unrecognized inventor, working \nformally as a factory worker like many others. From your Sunday off, you have " + name.health + " health. Your level is only " + name.level + ", for your adventure has just begun. \n(You gain levels by taking damage and making riskier choices.) Type GO to continue.");
		playeranswer101 = playerInput.nextLine();
		
		//Begin Story Dialogue
		if (playeranswer101.equalsIgnoreCase("go")){
		System.out.println("As you get dressed in your dusty jacket and old boots, you also carry along your beloved inventions: the Powerglove, a magnetic melee meapon; and your \nElemental Musket. Unfortunately, both are nearly broken. You step outside of your apartment into the familiar atmosphere of Prominence.");
		System.out.println("You get too absorbed in smelling the fresh air to realize that you have drifted into the territory of a crow's nest on the edge of a roof. The mother bird flails \n around your head, which sends you tunbling down the front stairs to the busy street.");
		name.health -= falldamage;
		System.out.println("You manage to regain your footing just before you go tumbling into the street, but you hit your shoulder on the railing of the stairs and take " + falldamage + " damage, \nleaving you at " + name.health + " health.");
		}
		
		//Choice Declared
		System.out.println("You could either go to the TEA SHOP across the street, or go STRAIGHT TO WORK.");
		playeranswer = playerInput.nextLine();
		
		//First Choice
		if (playeranswer.equalsIgnoreCase("tea shop")){
			choice1();
		}
		
		//Other Choice
		else if (playeranswer.equalsIgnoreCase("straight to work")){
			choice2();
		}
		
		
		//Continue Story 
		System.out.println("You decide to use some of your work time upgrading one of your inventions at the repair station. Do you upgrade your POWERGLOVE or your ELEMENTAL MUSKET?");
		playeranswer2 = playerInput.nextLine();
		
		//Upgrading Choices
		if (playeranswer2.equalsIgnoreCase("powerglove")){ 
			choice3();
		}
		
		if (playeranswer2.equalsIgnoreCase("elemental musket")){
			choice4();
		}
		
		
		//Ditch the Factory Choice
		System.out.println("Your manager walks over to you, furious that you are not assembling robot parts and doing your job. You were never really happy at the factory. It's time to bouce! \nYou could mess with the manager with the POWERGLOVE or the ELEMENTAL MUSKET.");
		playeranswer3 = playerInput.nextLine();
		
		//First Choice
		if (playeranswer3.equalsIgnoreCase("elemental musket") && (name.hasGunUpgrade = true)) {
			choice5();
		}
		
		//Other Choice
		if (playeranswer3.equalsIgnoreCase("powerglove") && (name.hasGloveUpgrade = true)) {
			choice6();
		}
		
		//Failed
		else {
			choice100();
		}
		
		//Back to story- How do you airship, player?
		System.out.println("As you exit the factory, you spot the docks where the airships of Prominence come and go in a flurry of balloons and propellers. When you see a sign at the docks, \nyou recall hearing that Zenith, the continent to the south, has a fondness for great inventions. However, the only \nvessel there going to Zenith is a private airship. \nYou could BRIBE the pilot to take you along with 6 coins, INTIMIDATE the pilot to take you, or SNEAK on when the pilot isn't looking.");
		playeranswer4 = playerInput.nextLine();
		
		if (playeranswer4.equalsIgnoreCase("bribe") && (playergold > 8)) {
			choice7();
		}
		
		if (playeranswer4.equalsIgnoreCase("intimidate") && (name.strength > 5)) {
			choice8();
		}
		
		if (playeranswer4.equalsIgnoreCase("sneak") && (name.speed > 5)) {
			choice9();
		}
		
		else {
			choice10();
		}
		
		}
		
		//Back to story
				System.out.println("As you drift across the cloudy sky, you hear the piolet muttering about how much he despises Zenith and how the hardworking people of Prominence must fuel their imperial greed. You become worried that the piolet will do something dangerous as Zenith approaches on the horizon. It looks like a hot cup of tea with all the steam erupting from it's towers. Before you know it, the airship is speeding above the mechanical landscape extremely low, and the piolet is oblivious of your presence. You rush to the airship's deck. It would be wise to jump! You can either traverse down to the street with the POWERGLOVE, or use the ELEMENTAL MUSKET to threaten the piolet and take control of the ship.");
				playeranswer5 = playerInput.nextLine();
				
		if (playeranswer5.equalsIgnoreCase("powerglove") && (name.hasGloveUpgrade = true)) {
			choice11();
		}
		
		if (playeranswer5.equalsIgnoreCase("elemental musket") && (name.hasGunUpgrade = true)) {
			choice12();
		}
		
		if (playeranswer5.equalsIgnoreCase("powerglove") && (name.hasGloveUpgrade = false)) {
			choice13();
		}
		
		if (playeranswer5.equalsIgnoreCase("powerglove") && (name.hasGunUpgrade = false)) {
			choice14();
		}
			
		//Back to Story
		System.out.println("After leaping from the ship into an ally, you painfully lift yourself to your hands and knees. You hear the crash of the airship and see a pillar of smoke over the rooftops. You look up, and to your surprise, a figure in a mask gazes down at you. The person is dressed in a long black coat and dark boots, and a white mask resembling a bird. Before you can say anything, a squad of automaton officers rounds the corner into the ally. The robots tower over you and the masked figure. You could try to FIGHT the robots, or RUN and look for an escape from the ally.");
		playeranswer6 = playerInput.nextLine();
		
		if (playeranswer5.equalsIgnoreCase("fight")) {
			choice19();
		}
		
		if (playeranswer5.equalsIgnoreCase("run")) {
			choice20();
		}
		
		//Finds modification desk
		System.out.println("Luckly, next to you on the fire escape is a repair station. Since the dark figure is your only means of escape, you need to destroy the robot. You can either upgrade your POWERGLOVE or your ELEMENTAL MUSKET.");
		playeranswer7 = playerInput.nextLine();
		
		if (playeranswer7.equalsIgnoreCase("elemental musket")) {
			choice21();
		}
		
		//Other Choice
		if (playeranswer7.equalsIgnoreCase("powerglove")) {
			choice22();
		}
		
		//Attack the robots!
		System.out.println("The masked figure won't last long! You need to use your POWERGLOVE or ELEMENTAL MUSKET to attack the robot.");
		playeranswer8 = playerInput.nextLine();
		
		if (playeranswer7.equalsIgnoreCase("elemental musket") && (name.hasGunUpgrade = true)) {
			choice23();
		}
		
		if (playeranswer7.equalsIgnoreCase("powerglove") && (name.hasGloveUpgrade = true)) {
			choice24();
		}
		
		else {
			choice101();
		}
		
		//End Choice
		System.out.println("The masked figure explains that there is a revolution taking place in both Prominence and Zenith. Apparently, Zenith's government has been doing some pretty terrible things. \nDo you wish to join this revolution? YES/NO");
		playeranswer9 = playerInput.nextLine();
		
		if (playeranswer9.equalsIgnoreCase("yes")) {
			choice25();
		}
		
		if (playeranswer9.equalsIgnoreCase("no")) {
			choice26();
		}

		playerInput.close();
	}
	}