package ocp;

public class FaxNotification implements Notification {
    public void send(String message) {
        System.out.println("Enviando Fax: " + message);
    }
}