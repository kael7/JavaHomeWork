package java2hw1;

public interface Actions {
    void run();
    void jump();
    void runTrack(RunningTrack runningTrack);
    void jumpWall(Wall wall);
    void checkWin();
}
