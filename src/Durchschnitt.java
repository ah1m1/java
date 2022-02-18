import java.util.Scanner;
/**
 * Beschreiben Sie hier die Klasse Durchschnitt.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Durchschnitt
{
    public static void calc() {
        int num = 0;
        int count = 0;
        while (true) {
            Scanner sc = new Scanner(System.in);
            
            if(sc.nextInt() == 0)
                break;
                
            num += sc.nextInt();
            count++;
        }
        System.out.println("Durchschnitt: " + (num / (count - 1)));
    }
}
