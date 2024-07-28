package trafficlight;

public class RedState implements TrafficLightState {
    @Override
    public void change(TrafficLightContext context) {
        context.logStateChange("Red", "Green");
        context.setState(new GreenState());
    }

    @Override
    public void reportState() {
        System.out.println("\u001B[31mTraffic light is Red. Stop.\u001B[0m");
    }
}
