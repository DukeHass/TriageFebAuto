package ActionItems;

public class AI_01_01 {
    public static void main(String[] args) {
        //declare string variable 1
        String[] artist;
        //store some values in the string array
        artist = new String[]{"Joe Satriani", "Steve Vai"};
        String[] guitarBrands;
        guitarBrands = new String[]{"ibanez", "gibson", "prs", "jackson"};
        //declaring integer variables and storing value to them
        int[] stringGaugeJoe = new int[]{9};
        int[] stringGaugeVai = new int[]{10};

        //print out from the array
        System.out.println(artist[0] + " Plays with " + guitarBrands[1] + " and " + artist[1] + " Plays with " + guitarBrands[0]
                + " and they use the string sizes respectively " + stringGaugeJoe[0] + " and " + stringGaugeVai[0]);
    }
}
