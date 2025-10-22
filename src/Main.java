public class Main {
    public static void main(String[] args) {
        // Create subject (Editor)
        Editor editor = new Editor();

        // Create observers
        EventListener emailListener = new EmailAlertsListener();
        EventListener loggingListener = new LoggingListener();

        // Subscribe observers to specific events
        editor.subscribe("fileOpen", emailListener);
        editor.subscribe("fileSave", loggingListener);

        // Trigger events
        editor.openFile();
        editor.saveFile();

        // Unsubscribe one listener and trigger again
        editor.unsubscribe("fileSave", loggingListener);
        editor.saveFile();
    }
}