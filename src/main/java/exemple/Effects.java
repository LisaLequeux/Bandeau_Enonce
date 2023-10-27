package exemple;

import bandeau.Bandeau;

import java.awt.*;

public abstract class Effects {


    public void Effects() {
        Bandeau monBandeau = new Bandeau();
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();
    }

    public void doEffect(Bandeau bandeau){}
}