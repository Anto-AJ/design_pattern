package smarthome;

import java.util.HashMap;
import java.util.Map;

public class CentralHub extends Subject {
    private Map<String, Device> devices = new HashMap<>();

    public void addDevice(String id, Device device) {
        devices.put(id, device);
        addObserver(device);
        notifyObservers();
    }

    public void removeDevice(String id) {
        Device device = devices.remove(id);
        if (device != null) {
            removeObserver(device);
            notifyObservers();
        }
    }

    public void turnOnDevice(String id) {
        Device device = devices.get(id);
        if (device != null) {
            device.turnOn();
            notifyObservers();
        }
    }

    public void turnOffDevice(String id) {
        Device device = devices.get(id);
        if (device != null) {
            device.turnOff();
            notifyObservers();
        }
    }

    public void setTemperature(String id, int temperature) {
        if (devices.get(id) instanceof Thermostat) {
            ((Thermostat) devices.get(id)).setTemperature(temperature);
            notifyObservers();
        }
    }

    public void displayStatuses() {
        for (Map.Entry<String, Device> entry : devices.entrySet()) {
            System.out.println("Device ID: " + entry.getKey() + ", Status: " + entry.getValue().getStatus());
        }
    }
}
