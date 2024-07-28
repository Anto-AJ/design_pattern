package trafficlight;

import java.util.Timer;
import java.util.TimerTask;

public class TrafficLightContext {
    private TrafficLightState state;
    private final Timer timer;

    public TrafficLightContext() {
        state = new RedState(); // Initial state
        timer = new Timer(true);
        startTimer();
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void change() {
        state.change(this);
        reportState(); // Report the new state after changing
    }

    public void reportState() {
        state.reportState();
    }

    public void logStateChange(String fromState, String toState) {
        System.out.println("State changed from " + fromState + " to " + toState);
    }

    private void startTimer() {
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                change(); // Automatically change the state and report
            }
        }, 0, 10000); // Change state every 10 seconds
    }
}
