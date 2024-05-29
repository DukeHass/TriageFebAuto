package Day3_04082024;

public class T4_arrayLoopCondtions {
    public static void main(String[] args) {
        String[] fruits;
        fruits = new String[]{"apple", "grape", "mango", "strawberry", "mango"};

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals("mango")) {
                System.out.println("Fruit is " + fruits[i]);
            } else if (fruits[i].equals("grape")) {
                System.out.println("Fruit is " + fruits[i]);

            }

        }
        int[] age;
        age = new int[]{28,30,21,56,63};
        for (int i = 0; i < age.length; i++) {
            if (age[i]==(30)) {
                System.out.println("My age is "+ age[i]);
            } else if (age[i]==(56)){
                System.out.println("My age is " + age[i]);

            }

        }
}
}