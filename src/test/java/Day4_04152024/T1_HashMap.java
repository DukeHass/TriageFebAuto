package Day4_04152024;

import java.util.HashMap;

public class T1_HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer>triageStudents = new HashMap<>();
        triageStudents.put("Oyon", 25);
        triageStudents.put("Shakeb", 29);
        triageStudents.put("Tanvir", 27);
        triageStudents.put("Angie", 21);

        System.out.println("the " +triageStudents.size());

        System.out.println("the " +triageStudents);

        int oyonAge = triageStudents.get("Oyon");

        System.out.println("Oyon age is " +oyonAge);

        if(triageStudents.containsKey("Noyon")){
            System.out.println("Noyon age is "+triageStudents.get("Noyon")) ;
        }else {

            System.out.println("Noyon age is there");
        }


    }
    }

