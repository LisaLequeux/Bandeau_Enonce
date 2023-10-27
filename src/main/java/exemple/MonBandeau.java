package exemple;

import bandeau.Bandeau;


public class MonBandeau {
    public static void main(String[] args) {
        Bandeau monBandeau = new Bandeau();
        Scénario sc = new Scénario();
        sc.addEffect(new Zoom(), 1);
        sc.addEffect(new Tourne(), 1);
        sc.addEffect(new Rainbow(), 2);
        sc.afficherScenario(monBandeau);
    }

}
