package trafficlight;

public class YellowState implements TrafficLightState {
    @Override
    public void change(TrafficLightContext context) {
        context.logStateChange("Yellow", "Red");
        context.setState(new RedState());
    }

    @Override
    public void reportState() {
        System.out.println("\u001B[33mTraffic light is Yellow. Prepare to stop.\u001B[0m");
    }
}
