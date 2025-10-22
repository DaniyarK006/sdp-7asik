//Subject
public interface EventManager {
    void subscribe(String eventType, EventListener listener);
    void unsubscribe(String eventType, EventListener listener);
    void notify(String eventType, String data);
}
