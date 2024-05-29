package Day4_04152024;

public class T2_SplitCommand {
    public static void main(String[] args) {
        //declare a string valriable with a single message
        String message = "My name is John";
        //declare and array to store the split messages
        String[] splitmsgArray = message.split(" ");
        //print out only John from the string
        System.out.println( splitmsgArray[3]);
        //declare another message
        String triageMessage = "Automation_02";
        //store the message in a linear array
        String[] triageMessageArray = triageMessage.split("_");
        //print out only the number
        System.out.println( "the number is "+triageMessageArray[1]);


    }
}
