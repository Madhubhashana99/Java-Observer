import java.util.ArrayList;
import java.util.Scanner;

public class Admin implements AdminObservable {

    ArrayList<StudentObserver> studentObserverArrayList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    private String msg;

    @Override
    public void addObserver(StudentObserver studentObserver) {
        studentObserverArrayList.add(studentObserver);
    }

    @Override
    public void removeObserver(StudentObserver studentObserver) {
        studentObserverArrayList.remove(studentObserver);
    }

    @Override
    public void notifyObserver() {
        for (StudentObserver studentObserver : studentObserverArrayList){
            studentObserver.update(msg);
        }
    }

    public void sendMessage(){
        System.out.println("Enter the Message : ");
        msg = scanner.nextLine();
        notifyObserver();
    }
}
