package kartyatrukkkonzolon;
public class Pakli {
    
    public static String[] pakli = new String[22];
    
    Lap lap = new Lap();
    
    public void feltolt(String leiras) {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        int i = 1;
        for (String szin : szinek) {
            for (int e = 0; e < ertekek.length && i < pakli.length; e++) {
                pakli[i++] = szin + "_" + ertekek[e];
            }
        }

    }
    
}
