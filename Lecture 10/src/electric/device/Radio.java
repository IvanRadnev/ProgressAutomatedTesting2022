package electric.device;

public class Radio implements ElectricDevice{

    boolean isTurnedOn;

    @Override
    public void turnOn() {
        isTurnedOn = true;
    }

    @Override
    public void turnOff() {
        isTurnedOn = false;
    }

    @Override
    public boolean isTurnedOn() {
        return isTurnedOn;
    }
}
