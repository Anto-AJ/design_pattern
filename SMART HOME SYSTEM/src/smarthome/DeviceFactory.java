package smarthome;

public class DeviceFactory {
    public static Device createDevice(String type) {
        switch (type) {
            case "light":
                return new Light();
            case "thermostat":
                return new Thermostat();
            case "doorlock":
                return new DoorLock();
            default:
                throw new IllegalArgumentException("Unknown device type: " + type);
        }
    }
}
