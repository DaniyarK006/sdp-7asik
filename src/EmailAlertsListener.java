//ConcreteObserver
public class EmailAlertsListener implements EventListener {
    @Override
    public void update(String filename) {
        System.out.println("Email Alert: File " + filename + " has been modified.");
    }
}