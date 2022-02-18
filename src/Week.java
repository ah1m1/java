
/**
 * Beschreiben Sie hier die Klasse Week.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Week
{
    private int day;
    public Week(int day) {
        this.day = day;
    }
    
    public String getDay() {
        switch (day - 1) {
            case 0: 
                return "Montag";
            case 1: 
                return "Dienstag";
            case 2: 
                return "Mittwoch";
            case 3: 
                return "Donnerstag";
            case 4: 
                return "Freitag";
            case 5: 
                return "Samstag";
            case 6: 
                return "Sonntag";
            default:
                return "Not a day";
        }
    }
    
        public static String getDayStatic(int day) {
        switch (day - 1) {
            case 0: 
                return "Montag";
            case 1: 
                return "Dienstag";
            case 2: 
                return "Mittwoch";
            case 3: 
                return "Donnerstag";
            case 4: 
                return "Freitag";
            case 5: 
                return "Samstag";
            case 6: 
                return "Sonntag";
            default:
                return "Not a day";
        }
    }
}
