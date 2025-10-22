//ConcreteObserver
import java.time.LocalDateTime;

public class LoggingListener implements EventListener {
    @Override
    public void update(String filename) {
        System.out.println("Log Entry: File " + filename + " updated at " + LocalDateTime.now());
    }
}