import java.util.Observable;
import java.util.Observer;

public class Student implements Observer {

    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {

        if(o instanceof AdminLMS){
            System.out.println(name+" Got the message...."+((AdminLMS) o).lmsMessage);
        }


    }
}
