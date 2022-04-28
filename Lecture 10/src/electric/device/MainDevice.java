package electric.device;

public class MainDevice {
    public static void main(String[] args) {

        ElectricDevice radio = new Radio();
        ElectricDevice tv = new TV();

        radio.turnOn();
        System.out.println(radio.isTurnedOn());

        radio.turnOff();
        System.out.println(radio.isTurnedOn());

        tv.turnOn();
        System.out.println(tv.isTurnedOn());

        tv.turnOff();
        System.out.println(tv.isTurnedOn());
    }
}
