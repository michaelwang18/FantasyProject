import javax.xml.stream.events.EndElement;
import java.util.ArrayList;

public class Battle {
    Char player1;
    Char player2;
    Char player3;
    Char enemy1;
    Char enemy2;
    Char enemy3;
    ArrayList<Char> playerTeam = new ArrayList<Char>();
    ArrayList<Char> enemyTeam = new ArrayList<Char>();

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
    public Battle(Char p1, Char p2,  Char p3, Char e1, Char e2){
        System.out.println("BATTLE START");
        player1 = p1;
        player2 = p2;
        player3 = p3;
        playerTeam.add(p1);
        playerTeam.add(p2);
        playerTeam.add(p3);
        enemy1 = e1;
        enemy2 = e2;
        enemyTeam.add(e1);
        enemyTeam.add(e2);

    }
    public Battle(Char p1, Char p2, Char p3, Char e1){
        System.out.println("BATTLE START");
        player1 = p1;
        player2 = p2;
        player3 = p3;
        playerTeam.add(p1);
        playerTeam.add(p2);
        playerTeam.add(p3);
        enemy1 = e1;
        enemyTeam.add(e1);

    }


    public void start(){
        for ( int i = 0; i < playerTeam.size(); i++){
           Char player =  playerTeam.get(i);
           if (player.getName() != "empty"){

           }
        }
    }



    public void overview(){


    }
}
