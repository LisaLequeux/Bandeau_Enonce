package exemple;

import bandeau.Bandeau;

import java.awt.*;

public class Rainbow extends Effects {

    public Rainbow(){}

    @Override
    public void doEffect(Bandeau bandeau){
        bandeau.setBackground(Color.WHITE);
        bandeau.sleep(100);
        bandeau.setForeground(Color.ORANGE);
        bandeau.sleep(100);
        bandeau.setForeground(Color.YELLOW);
        bandeau.sleep(100);
        bandeau.setForeground(Color.GREEN);
        bandeau.sleep(100);
        bandeau.setForeground(Color.CYAN);
        bandeau.sleep(100);
        bandeau.setForeground(Color.BLUE);
        bandeau.sleep(100);
        bandeau.setForeground(Color.MAGENTA);
        bandeau.sleep(100);
        bandeau.setForeground(Color.RED);
        bandeau.sleep(100);
        bandeau.setForeground(Color.ORANGE);
    }
}
