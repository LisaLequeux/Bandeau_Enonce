package exemple;
import bandeau.Bandeau;
import java.util.ArrayList;

public class Scénario {

    private Bandeau bandeau ;

    public Scénario(){}


    ArrayList<Effects> lesEffects = new ArrayList<>();




        public void addEffect(Effects effects, int nbEffects) {
            for(int i = 0; i<nbEffects; i++) {
                lesEffects.add(effects);
            }
        }


    public void afficherScenario(Bandeau bandeau) {
        for (Effects x : lesEffects) {
            x.doEffect(bandeau);
            bandeau.sleep(100);
        }
        bandeau.close();
    }


}
