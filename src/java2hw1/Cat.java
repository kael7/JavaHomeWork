package java2hw1;

public class Cat implements Actions {
    private String name;
    private int distance;
    private int height;

    public Cat(String name, int distance, int height) {
        this.name = name;
        this.distance = distance;
        this.height = height;
    }

    public int getDistance() {
        return distance;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void run() {
        System.out.println(name + ": cat run");
    }

    @Override
    public void jump() {
        System.out.println(name + ": cat jump");
    }

    @Override
    public void runTrack(RunningTrack runningTrack) {
        if (runningTrack.passTrack(distance)) {
            System.out.println(name + ": успешно пробежал!!!");
        } else {
            System.out.println(name + ": неуспешно пробежал!!!");
        }
    }

    @Override
    public void jumpWall(Wall wall) {
        if (wall.passWall(height)) {
            System.out.println(name + ": успешно прыгнул!!!");
        } else {
            System.out.println(name + ": неуспешно прыгнул!!!");
        }
    }
}
