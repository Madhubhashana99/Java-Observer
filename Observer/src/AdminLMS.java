import java.util.Observable;
import java.util.Scanner;

public class AdminLMS extends Observable {
    String lmsMessage;

    Scanner input = new Scanner(System.in);

    public void sentMessage(){
        System.out.println("Please enter a message to send: ");
        lmsMessage = input.nextLine();

        setChanged();
        notifyObservers();
    }
}
