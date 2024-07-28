package smarthome;

public class Thermostat implements Device {
    private int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Thermostat set to " + temperature + "°C");
    }

    @Override
    public void turnOn() {
        System.out.println("Thermostat is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Thermostat is OFF");
    }

    @Override
    public String getStatus() {
        return "Temperature: " + temperature + "°C";
    }

    @Override
    public void update() {
        System.out.println("Thermostat status updated.");
    }
}
