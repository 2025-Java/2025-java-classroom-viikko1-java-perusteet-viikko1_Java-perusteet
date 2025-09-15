package viikko1;

import java.util.Arrays;

public class SortThree {
    public static String ascending(int a, int b, int c) {
        int[] luvut = {a, b, c};
        Arrays.sort(luvut); // Järjestetään taulukko nousevaan järjestykseen
        return luvut[0] + "," + luvut[1] + "," + luvut[2];
    }
}
