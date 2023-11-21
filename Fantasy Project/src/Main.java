import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        System.out.println(dragon.state());
        System.out.println(); // blank line
        int attackAmt = dragon.attack();
        System.out.println(); // blank line
        dragon.takeDamage(20);
        System.out.println(); // blank line
        dragon.powerUp(1);
        System.out.println(); // blank line
        dragon.powerUp(2);
        System.out.println(); // blank line
        dragon.powerUp(2);
        System.out.println(); // blank line
        dragon.powerUp(2);
        System.out.println(); // blank line
        int attackAmt2 = dragon.attack();
        System.out.println(); // blank line
        System.out.println(dragon.state());
        System.out.println(); // blank line
        System.out.println(dragon.state());
        System.out.println(); // blank line
        dragon.takeDamage(70);
        System.out.println(); // blank line
        dragon.powerUp(2);
        System.out.println(); // blank line
        int attackAmt3 = dragon.attack();
        System.out.println(); // blank line
        dragon.powerUp(2);
        System.out.println(); // blank line
        System.out.println(dragon.state());
        System.out.println(); // blank line
        int attackAmt4 = dragon.attack();
        System.out.println(); // blank line
        System.out.println(dragon.state());
        System.out.println(); // blank line
        dragon.takeDamage(65);
        System.out.println(); // blank line
        dragon.takeDamage(40);
        System.out.println(); // blank line
        dragon.takeDamage(10);
        System.out.println(); // blank line
        System.out.println(dragon.state());
        System.out.println(); // blank line
        System.out.println(dragon.getStrength());
        System.out.println(); // blank line
        System.out.println(dragon.getHealth());
        System.out.println(); // blank line
        System.out.println(dragon.getLevel());
        System.out.println(); // blank line
        System.out.println(dragon.isDead());
        System.out.println(); // blank line

























       /* SkillBook  skill = new SkillBook();
        Char empty = new Char();
        Char knight = new Char("Sir Timmy", 1000, 250, 150);
        Char goblin1 = new Char("Green 1", 700, 150, 100);
        Char goblin2 = new Char("Green 2", 700, 150, 100);
        Char goblin3 = new Char("Green 3", 700, 150, 100);
        ArrayList enemyList = new ArrayList();
        enemyList.add(goblin1);
        enemyList.add(goblin2);
        enemyList.add(goblin3);

        knight.addSkills(skill.fireball());
        knight.addSkills(skill.waterball());
        knight.addSkills(skill.breathe());

        Battle forest = new Battle(knight, empty, empty, goblin1, goblin2, goblin3);

        System.out.println(knight.turn()); */





    }
}