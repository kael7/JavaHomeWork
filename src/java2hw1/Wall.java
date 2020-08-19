package java2hw1;

public class Wall {
    private int wallHeight;

    public Wall(int wallHeight) {
        this.wallHeight = wallHeight;
    }

    public int getWallHeight() {
        return wallHeight;
    }

    public boolean passWall(int height) {
        if (height >= wallHeight) {
            return true;
        } else {
            return false;
        }

    }
}
