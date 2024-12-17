package isp;

public class Phone implements Switchable, Chargeable {
    public void turnOn() {
        System.out.println("Phone is turning on.");
    }

    public void turnOff() {
        System.out.println("Phone is turning off.");
    }

    public void charge() {
        System.out.println("Phone is charging.");
    }
}