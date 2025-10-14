package net.mohamed.pres;

import net.mohamed.dao.DaoImpl;
import net.mohamed.metier.MetierImpl;
import net.mohamed.net.mohamed.ext.DaoImplV2;

public class Pres1 {
    public static void main(String[] args) {
        DaoImplV2 d = new DaoImplV2();
        MetierImpl metier = new MetierImpl();
        metier.setDao(d);
        System.out.println("RES= "+metier.calcul());
    }
}
