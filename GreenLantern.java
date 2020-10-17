public class GreenLantern extends SuperHero{

    public GreenLantern(String[] fields) {
        super(fields);
    }

    public static boolean meetsConditions(String[] fields){


        return (fields[9]).equals("Female") ;
    }

    public int attack(SuperHero oHero) {
        int Neverdie = super.attack(oHero);

        Neverdie += this.getStrength() * 100000  - oHero.getStrength();

        return Neverdie;

    }

    public static boolean SubCondition(String[] fields){
        return true;
    }
}
