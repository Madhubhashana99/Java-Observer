public class MyEasyObserverDemo {
    public static void main(String[] args) {

        AdminLMS techAdmin = new AdminLMS();

        Student nimal = new Student("Nimal");
        Student kamal = new Student("Kamal");

        techAdmin.addObserver(nimal);
        techAdmin.addObserver(kamal);

        techAdmin.sentMessage();
    }
}
