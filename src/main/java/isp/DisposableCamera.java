package isp;

public class DisposableCamera implements Switchable {
    public void turnOn() {
        System.out.println("Disposable camera is turning on.");
    }

    public void turnOff() {
        System.out.println("Disposable camera is turning off.");
    }
}