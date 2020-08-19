package java2hw1;

public class RunningTrack implements Obstacles{
    private int trackDistance;

    public RunningTrack(int trackDistance) {
        this.trackDistance = trackDistance;
    }

    public int getTrackDistance() {
        return trackDistance;
    }

    @Override
    public boolean passObstacle(int value) {
        if (value >= trackDistance) {
            value -= trackDistance;
            return true;
        } else {
            return false;
        }
    }
}
