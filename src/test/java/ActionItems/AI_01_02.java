package ActionItems;

import java.util.ArrayList;

public class AI_01_02 {
    public static void main(String[] args) {
        //declare an arraylist variable
        ArrayList<String> region = new ArrayList<>();
        //add some values to the region array list
        region.add("USA");
        region.add("BANGLADESH");
        region.add("BRAZIL");
        region.add("ARGENTINA");
        //declare an integer variable
        ArrayList<Integer> areaCode = new ArrayList<>();
        //add some values to the areaCode array list
        areaCode.add(718);
        areaCode.add(880);
        areaCode.add(55);
        areaCode.add(500);

        //setting up the loop
        for(int i = 0; i < areaCode.size();i++){
            //printing the result
            System.out.println("The area code of "+region.get(i) + " is " +areaCode.get(i));
        }
    }

}
