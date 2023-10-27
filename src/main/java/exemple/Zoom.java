package exemple;

import bandeau.Bandeau;

import java.awt.*;

public class Zoom extends Effects {

    public Zoom() {}

    @Override
    public void doEffect(Bandeau bandeau){
        for (int i = 0; i < 10; i++) {
            bandeau.setBackground(Color.LIGHT_GRAY);
            bandeau.setForeground(Color.WHITE);
            bandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i*10));
            bandeau.sleep(100);
        }
        bandeau.setFont(new Font("Dialog", Font.BOLD, 30));
    }

}
