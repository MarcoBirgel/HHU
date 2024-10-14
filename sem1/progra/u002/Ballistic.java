public class Ballistic {

    public static void main (String []args) {

        // Eingabe der double-Werte
        double x0 = Double.parseDouble(args[0]);
        double v0 = Double.parseDouble(args[1]);
        double t  = Double.parseDouble(args[2]);
        
        double g  = 9.81;

        // Berechnung
        double result = x0 + (v0 * t) - (g * t * t / 2);

        // Ausgabe
        System.out.println(result);
    }
}