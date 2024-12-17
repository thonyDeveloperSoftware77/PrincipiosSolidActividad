package ocp;

public class PushNotification implements Notification {
    public void send(String message) {
        System.out.println("Enviando notificación push: " + message);
    }
}