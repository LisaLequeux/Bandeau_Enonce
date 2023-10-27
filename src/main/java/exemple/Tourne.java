package exemple;

import bandeau.Bandeau;

import java.awt.*;

public class Tourne extends Effects {

    public Tourne(){}

    @Override
    public void doEffect(Bandeau bandeau){
        bandeau.setBackground(Color.WHITE);
        bandeau.setForeground(Color.LIGHT_GRAY);
        bandeau.setRotation(Math.PI / 2.0f);
        bandeau.sleep(1000);
        bandeau.setRotation(Math.PI / 3.0f);
        bandeau.sleep(1000);
        bandeau.setRotation(Math.PI / 6.0f);
        bandeau.sleep(1000);
        bandeau.setRotation(0.0f);
    }
}
