import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        SkillBook  skill = new SkillBook();
        Char empty = new Char();
        Char knight = new Char("Sir Timmy", 1000, 250, 150);
        Char goblin1 = new Char("Green Fucker1", 700, 150, 100);
        Char goblin2 = new Char("Green Fucker2", 700, 150, 100);
        Char goblin3 = new Char("Green Fucker3", 700, 150, 100);
        ArrayList enemyList = new ArrayList();
        enemyList.add(goblin1);
        enemyList.add(goblin2);
        enemyList.add(goblin3);

        knight.addSkills(skill.fireball());
        knight.addSkills(skill.waterball());
        knight.addSkills(skill.breathe());

        Battle forest = new Battle(knight, empty, empty, goblin1, goblin2, goblin3);

        System.out.println(knight.turn());





    }
}