package smarthome;

public class Main {
    public static void main(String[] args) {
        CentralHub hub = new CentralHub();

        Device light = DeviceFactory.createDevice("light");
        Device thermostat = DeviceFactory.createDevice("thermostat");
        Device doorLock = DeviceFactory.createDevice("doorlock");

        DeviceProxy lightProxy = new DeviceProxy(light);
        DeviceProxy thermostatProxy = new DeviceProxy(thermostat);
        DeviceProxy doorLockProxy = new DeviceProxy(doorLock);

        hub.addDevice("1", lightProxy);
        hub.addDevice("2", thermostatProxy);
        hub.addDevice("3", doorLockProxy);

        // Example commands
        hub.turnOnDevice("1");
        hub.setTemperature("2", 22);  // Set to 22°C
        hub.turnOnDevice("3");

        hub.displayStatuses();

        // Example commands to turn off devices
        hub.turnOffDevice("1");

        hub.displayStatuses();
    }
}
