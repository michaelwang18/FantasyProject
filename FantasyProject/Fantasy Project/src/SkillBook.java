import java.util.ArrayList;
public class SkillBook {
    public SkillBook(){


    }

    public void Slash(Char user, Char victim){
        System.out.print(user.getName() + " Slashes " + victim.getName());
        victim.takeDMG(user.getATK() * 2);
    }

    public ArrayList fireball(){
        ArrayList fireBall = new ArrayList();
        fireBall.add("Fireball"); //Name
        fireBall.add(2.5); //Damage Multiplier
        fireBall.add("M"); //Target Count
        fireBall.add(1); //SP cost

        return fireBall;
    }

    public ArrayList waterball(){
        ArrayList fireBall = new ArrayList();
        fireBall.add("Splash"); //Name
        fireBall.add(5.5); //Damage Multiplier
        fireBall.add("S"); //Target Count
        fireBall.add(2); //SP cost

        return fireBall;
    }

    public ArrayList breathe(){
        ArrayList fireBall = new ArrayList();
        fireBall.add("Breath"); //Name
        fireBall.add(1.5); //Damage Multiplier
        fireBall.add("S"); //Target Count
        fireBall.add(3); //SP cost

        return fireBall;
    }




}
