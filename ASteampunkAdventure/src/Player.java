
public class Player {
	
	public String playerName = null;
	public static double health;
	public int strength;
	public int speed;
	public boolean hasGloveUpgrade;
	public boolean hasGunUpgrade;
	public int level;
	public boolean hasGloveUpgrade2;
	public boolean hasGunUpgrade2;
	
	public Player (String name,double h, int d, int s, boolean glove, boolean gun, int l, boolean gun2, boolean glove2) {
		playerName = name;
		health = h;
		strength = d;
		speed = s;
		hasGloveUpgrade = glove;
		hasGunUpgrade = gun;
		level = l;
		hasGunUpgrade2 = gun2;
		hasGloveUpgrade2 = glove2;
	}

	public void print() {
		System.out.println(" Your name is " + playerName + ".");
		System.out.println(" Your health is " + health + ".");
		System.out.println(" Your speed is " + speed + ".");
		System.out.println(" Your strength is " + strength + ".");
	}
	
	public boolean checkAlive(double health) {
		if (health>0) {
			return true;
		}
		return false;
	}



}