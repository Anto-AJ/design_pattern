package trafficcontrol;

public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        Light livingRoomLight = new Light();
        Fan ceilingFan = new Fan();

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        FanOnCommand ceilingFanOn = new FanOnCommand(ceilingFan);
        FanOffCommand ceilingFanOff = new FanOffCommand(ceilingFan);

        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remote.setCommand(1, ceilingFanOn, ceilingFanOff);

        System.out.println(remote);

        remote.onButtonWasPressed(0);  // Turn on the living room light
        remote.offButtonWasPressed(0); // Turn off the living room light
        remote.onButtonWasPressed(1);  // Turn on the ceiling fan
        remote.offButtonWasPressed(1); // Turn off the ceiling fan
        remote.undoButtonWasPressed(); // Undo last action (fan off)
    }
}
