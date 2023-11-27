import java.util.ArrayList;
import java.util.Scanner;

/**
 *Represents a character
 *
 *
 * @author Michael Wang
 */
public class Char {


    private String name;

    private ArrayList<ArrayList> allSkills = new ArrayList<ArrayList>();
    private Scanner scan = new Scanner(System.in);
    private int maxHealth;
    private int health;
    /** attack power of the character */
    private int attack;
    private int defense;

    private boolean stun = false;

    boolean alive = true;



    /**
     * Creates a character with required values for use.
     *
     * @param name The name of character
     * @param attack The attack value
     * @param maxHealth The max health value
     * @param defense The defense value
     */


    public Char(String name, int maxHealth, int attack, int defense){
        this.name = name;
        this.attack = attack;
        maxHealth = maxHealth;
        this.defense = defense;
        this.health = maxHealth;
    }

    public Char(){
        name = "empty";
    }

    /**Apply changes to the stats of said character
     *
     * @param hp changes to max health
     * @param atk changes to attack power
     * @param def changes to defense value
     */
    public void statChange(int hp, int atk, int def){
        this.maxHealth += hp;
        this.health += hp;
        this.attack += atk;
        this.defense += def;
    }

    public void takeDMG(int dmg){
        health = health - (dmg - defense);
        System.out.println (" For " + (dmg - defense) + " Damage!");
        System.out.println(name + " has " + health + " health left");
        if (health >= 0){
            health = 0;
            alive = false;
        }
    }



    public void addSkills(ArrayList skill){
        allSkills.add(skill);
        System.out.println(name + " Learnt The Skill: " + allSkills.get(allSkills.size()-1) + "!");
    }

    /**
     *Returns the status of the stun status of the character, if yes return true and remove the stun.
     * @return if the character is stunned or not
     */
    public boolean checkStun(){
        if (stun){
            stun = false;
            return true;
        } else {
            return false;
        }
    }

    public int getHP(){return health;}
    public int getMaxHealth(){return maxHealth;}
    public int getATK(){return attack;}
    public int getDEF(){return defense;}
    public String getName(){return name;}

    public void printSkillInfo(){
        for (int i = 0; i < allSkills.size(); i++){
            System.out.println("--------Skill " + (i + 1) + "---------");
            System.out.println(allSkills.get(i).get(0) + " ");
            System.out.println(allSkills.get(i).get(1) + " X " + attack + " DMG");
            System.out.println(allSkills.get(i).get(2) + " Target");
        }
        System.out.println("------------------------");
    }

    public String turn(){
        if (!stun && alive){
            printSkillInfo();
            System.out.println("Which Skill Will You Like To Use");
            int selection = scan.nextInt();
            ArrayList choseSkill = allSkills.get(selection);
            String target = choseSkill.get(2) + "";
            if (target.equals("S")){
                System.out.println("Choose a target");
                return "S"+scan.nextInt()+choseSkill.get(1);
            } else { //MASS attack
                return "M"+choseSkill.get(1);
            }

        } else {System.out.println("Unable to Act, try again toodaloo loser");}
        return "pass";
    }

    public String status(){
        if (alive) {
            return name + " " + health + "/" + maxHealth + " HP " + attack + " ATK " + defense + " DEF";
        }
        return "";
    }

}
