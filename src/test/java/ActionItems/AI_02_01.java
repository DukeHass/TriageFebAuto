package ActionItems;

import java.util.ArrayList;

public class AI_02_01 {
    public static void main(String[] args) {
        //declare an arraylist variable
        ArrayList<String> countries = new ArrayList<>();
        //add some values to the region array list
        countries.add("USA");
        countries.add("India");
        countries.add("Bangladesh");
        countries.add("UK");
        countries.add("Egypt");
        for (int i = 0; i < countries.size(); i++) {
            if (countries.get(i).equals("Bangladesh")) {
                System.out.println("Country is " + countries.get(i));
            } else if (countries.get(i).equals("USA")) {
                System.out.println("Country is " + countries.get(i));

            }


        }
    }
}



