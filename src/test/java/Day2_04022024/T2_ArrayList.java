package Day2_04022024;

import java.util.ArrayList;

public class T2_ArrayList {
    public static void main(String[] args) {
        //declare an arraylist variable
        ArrayList<String> countries = new ArrayList<>();
        //add some values to the coutries array list
        countries.add("USA");
        countries.add("BANGLADESH");
        countries.add("MEXICO");
        countries.add("BRAZIL");
        countries.add("ARGENTINA");
        //print  out USA
        System.out.println("The first country is "+countries.get(0));
        //print out the total size of the arraylist
        System.out.println("The total size of countries arraylist is "+countries.size());
        //arraylist is resizeable
        countries.add("CANADA");
        //print out the new size
        System.out.println("The total size of countries arraylist is "+countries.size());


    }
}
