public class Dragon {
    private int strength;
    private int health;
    private int level;
    private boolean dead;
    private int attackDamage;

    public Dragon() {
        strength = 1;
        health = 100;
        level = 1;
        dead = false;
        attackDamage = 0;
    }

    public int getStrength() {
        return strength;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public boolean isDead() {
        return dead;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public String state() {
        return "Dragon: " + "\n" + "Strength = " + strength + "\n" + "Health = " + health + "\n" + "Level = " + level + "\n" + "Dead = " + dead + "\n" + "Attack Damage = " + attackDamage;
    }

    public void takeDamage(int dmg) {
        if (health > 0) {
            health -= dmg;
            System.out.println("The dragon takes " + dmg + "damage! \n and now has " + health + " health");
            if (health - dmg <= 0) {
                System.out.println("The dragon has been slayed!");
                dead = true;
            }
        } else {
            System.out.println("The dragon is already dead!");
        }
    }


    public int attack() {
        int dmg = level * strength;
        System.out.println("The dragon attacks for " + dmg + " health");
        attackDamage += dmg;
        if (attackDamage / 50 > level) {
            level = attackDamage / 50;
            System.out.println("The dragon is now level " + level);
        }
        return dmg;
    }

    public void powerUp(int choice) {
        if (choice == 1) {
            health *= 2;
            System.out.println("The dragon now has " + health + " health");
        }
        else if (choice == 2) {
            strength *= 2;
            System.out.println("The dragon now has " + strength + " strength");
        }
    }

}
