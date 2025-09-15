package viikko1;

public class NumberProperties {
    public static String describe(int n) {
        if (n == 0) {
            return "nolla";
        }

        String tulos = "";

        if (n > 0) {
            tulos += "positiivinen ";
        } else {
            tulos += "negatiivinen ";
        }

        if (n % 2 == 0) {
            tulos += "parillinen";
        } else {
            tulos += "pariton";
        }

        return tulos;
    }
}
