import javax.xml.stream.events.EndElement;
import java.util.ArrayList;

public class Battle {
    Char player1;
    Char player2;
    Char player3;
    Char enemy1;
    Char enemy2;
    Char enemy3;
    ArrayList playerTeam = new ArrayList<>();
    ArrayList enemyTeam = new ArrayList<>();

    public Battle(Char p1, Char p2, Char p3, Char e1, Char e2, Char e3){
        System.out.println("BATTLE START");
        player1 = p1;
        player2 = p2;
        player3 = p3;
        playerTeam.add(p1);
        playerTeam.add(p2);
        playerTeam.add(p3);
        enemy1 = e1;
        enemy2 = e2;
        enemy3 = e3;
        enemyTeam.add(e1);
        enemyTeam.add(e2);
        enemyTeam.add(e3);

    }
    public void start(){
        while (enemy1.alive || enemy2.alive || enemy3.alive){
            player1.turn();
            player2.turn();
            player3.turn();

        }
    }



    public void overview(){

    }
}
