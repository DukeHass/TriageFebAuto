package Day3_04082024;

public class T3_multipleElseIfConditions {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        int c = 6;

        if(a+b>c){
            System.out.println("A and B are greater then C ");
        }else if(b+b==c){
            System.out.println("A and B are equeal to C");
        }else {
            System.out.println("Both statements are false and this one is true");
        }
    }
}
