package isp;

public class Main {
    public static void main(String[] args) {
        Switchable phone = new Phone();
        Switchable camera = new DisposableCamera();

        phone.turnOn();
        if (phone instanceof Chargeable) {
            ((Chargeable) phone).charge();
        }

        camera.turnOn();
        if (camera instanceof Chargeable) {
            ((Chargeable) camera).charge(); 
        } else {
            System.out.println("DisposableCamera cannot be charged.");
        }

        phone.turnOff();
        camera.turnOff();
    }
}
