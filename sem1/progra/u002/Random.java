public class Random {

    public static void main (String []args) {

        // Eingabe der Würfel-Grenzen
        double min = Double.parseDouble(args[0]);
        double max = Double.parseDouble(args[1]);
        
        double randomNum = Math.random(); // [0,1)

        // Intervalschritte festlegen
        double interval = max - min + 1;
        double correctLength = randomNum * interval; // [0,interval)

        // Interval in Würfel-Grenzen verschieben
        double correctInterval = correctLength + min; // [min,max)

        // Ausgabe als ganze Zahl
        int result = (int)(correctInterval);
        System.out.println(result);
    }
}