package ocp;

public class SMSNotification implements Notification {
    public void send(String message) {
        System.out.println("Enviando SMS: " + message);
    }
}