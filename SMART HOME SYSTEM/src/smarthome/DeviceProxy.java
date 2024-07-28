package smarthome;

public class DeviceProxy implements Device {
    private Device device;

    public DeviceProxy(Device device) {
        this.device = device;
    }

    @Override
    public void turnOn() {
        System.out.println("Proxy: Turning on device");
        device.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("Proxy: Turning off device");
        device.turnOff();
    }

    @Override
    public String getStatus() {
        return device.getStatus();
    }

    @Override
    public void update() {
        System.out.println("Proxy: Updating device status");
        device.update();
    }
}
