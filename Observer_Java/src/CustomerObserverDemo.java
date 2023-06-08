public class CustomerObserverDemo {
    public static void main(String[] args) {
        Admin kasuni = new Admin();
        Student Sandun = new Student("Sandun");

        kasuni.addObserver(Sandun);
        kasuni.sendMessage();
    }
}
