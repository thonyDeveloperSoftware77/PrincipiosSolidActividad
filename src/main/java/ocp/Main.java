package ocp;

public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();
        Notification push = new PushNotification();
        Notification fax = new FaxNotification();
        
        service.sendNotification(email, "¡Hola vía Email!");
        service.sendNotification(sms, "¡Hola vía SMS!");
        service.sendNotification(push, "¡Hola vía Notificación Push!");
        service.sendNotification(fax, "¡Hola vía Fax!");
    }
}
