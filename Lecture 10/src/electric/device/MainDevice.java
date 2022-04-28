package electric.device;

public class MainDevice {
    public static void main(String[] args) {

        ElectricDevice radio = new Radio();
        ElectricDevice tv = new TV();

        System.out.println(radio.isTurnedOn());

        System.out.println(tv.isTurnedOn());

    }
}
