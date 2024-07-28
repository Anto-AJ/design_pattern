package trafficlight;

public class GreenState implements TrafficLightState {
    @Override
    public void change(TrafficLightContext context) {
        context.logStateChange("Green", "Yellow");
        context.setState(new YellowState());
    }

    @Override
    public void reportState() {
        System.out.println("\u001B[32mTraffic light is Green. Go!\u001B[0m");
    }
}
