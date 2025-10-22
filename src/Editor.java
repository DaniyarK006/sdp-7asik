//ConcreteSubject
import java.util.ArrayList;
import java.util.List;

public class Editor implements EventManager {
    private final List<EventListener> listeners = new ArrayList<>();

    public Editor() {} // Default constructor

    public void openFile() {
        System.out.println("File opened.");
        notify("fileOpen", "file.txt");
    }

    public void saveFile() {
        System.out.println("File saved.");
        notify("fileSave", "file.txt");
    }

    @Override
    public void subscribe(String eventType, EventListener listener) {
        listeners.add(listener);
    }

    @Override
    public void unsubscribe(String eventType, EventListener listener) {
        listeners.remove(listener);
    }

    @Override
    public void notify(String eventType, String data) {
        for (EventListener listener : listeners) {
            listener.update(data); // Notify all registered listeners
        }
    }
}