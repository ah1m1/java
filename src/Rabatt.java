
/**
 * Beschreiben Sie hier die Klasse Rabatt.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Rabatt
{
    public static double calculate(double menge, double preis, boolean neukunde) {
        double rabatt = 0;
        if(menge < 50 && !neukunde) {
            rabatt = 1.0;
        }else if(menge >= 100 && neukunde) {
            rabatt = 2.5;
        }else if(menge < 100 && neukunde) {
            rabatt = 1.5;
        }else if(menge >= 50 && menge <= 100 && !neukunde) {
            rabatt = 2.0;
        }else if(menge > 100 && !neukunde) {
            rabatt = 3.0;
        }
        
        return preis * menge - (preis * menge / 100 * rabatt);
    }
}
