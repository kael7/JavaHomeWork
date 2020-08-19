package java2hw1;

public class Wall implements Obstacles{
    private int wallHeight;

    public Wall(int wallHeight) {
        this.wallHeight = wallHeight;
    }

    public int getWallHeight() {
        return wallHeight;
    }

    @Override
    public boolean passObstacle(int value) {
        if (value >= wallHeight) {
            return true;
        } else {
            return false;
        }
    }
}
