import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class BattleRoyale {
    public static void main(String[] args){

//        SuperHero heroA = new SuperHero(new String[16]), heroB = new SuperHero(new String[16]);



//        if(heroA instanceof GreenLantern)
//            damageA += GreenLantern.Neverdie();


        try{
            System.out.println(System.getProperty("user.dir"));
            ArrayList<SuperHero> heroes = SuperHero.readDataFile("./SuperheroDataset.csv");
            int count = 0;
            for(int i = 0; i < heroes.size(); i++){
                for(int j = i + 1; j < heroes.size(); j++){
                    int damageA = heroes.get(i).attack(heroes.get(j));
                    int damageB = heroes.get(j).attack(heroes.get(i));
                    String AlignmentA = heroes.get(i).getAlignment();
                    String AlignmentB = heroes.get(j).getAlignment();

                    if(damageA > damageB && AlignmentA != AlignmentB)
                        System.out.println(heroes.get(i).getName() + " wins");

                    else if(damageB > damageA && AlignmentB != AlignmentA)
                        System.out.println(heroes.get(j).getName() + " wins");
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
