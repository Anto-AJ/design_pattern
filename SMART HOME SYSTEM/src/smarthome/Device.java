package smarthome;

public interface Device extends Observer {
    void turnOn();
    void turnOff();
    String getStatus();
}
