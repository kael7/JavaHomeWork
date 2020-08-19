package java2hw1;

public class RunningTrack {
    private int trackDistance;

    public RunningTrack(int trackDistance) {
        this.trackDistance = trackDistance;
    }

    public int getTrackDistance() {
        return trackDistance;
    }

    public boolean passTrack(int distance) {
        if (distance >= trackDistance) {
            distance -= trackDistance;
            return true;
        } else {
            return false;
        }

    }
}
