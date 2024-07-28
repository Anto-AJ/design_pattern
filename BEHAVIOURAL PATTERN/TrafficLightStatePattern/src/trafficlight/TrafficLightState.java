package trafficlight;

public interface TrafficLightState {
    void change(TrafficLightContext context);
    void reportState();
}
