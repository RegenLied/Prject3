import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class BattleRoyale {
    public static void main(String[] args){

//        SuperHero heroA = new SuperHero(new String[16]), heroB = new SuperHero(new String[16]);



//        if(heroA instanceof GreenLantern)
//            damageA += GreenLantern.Neverdie();


        try{
            ArrayList<SuperHero> heroes = SuperHero.readDataFile("/Users/yulinliu/Desktop/CSC-208-002/project-3-powers-RegenLied/SuperheroDataset.csv");
            for(int i = 0; i < heroes.size(); i++){
                for(int j = i + 1; j < heroes.size(); j++){
                    if(damageA > damageB) int damageA = heros.get(i).attack(heros.get(j));
                    int damageB = heros.get(j).attack(heros.get(i));
                        System.out.println("A wins");
                    else if(damageB > damageA)
                        System.out.println("B wins");
                    else
                        System.out.println("it was a tie"); }
        }
        }

        catch (Exception e){
            System.out.println("Wrong");
        }


        PrintWriter writer;
        try{
            writer = new PrintWriter("results.txt");
            for(int i = 0; i < 100; i++)
                writer.println("line " + i);
            writer.close();
        }
        catch (Exception ex){
            System.out.println("File write error");
        }

    }
}
