package java2hw1;

public class Cat implements Actions {
    private String name;
    private int distance;
    private int height;
    private boolean win;

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
        if (runningTrack.passObstacle(distance)) {
            System.out.println(name + ": успешно пробежал!!!");
        } else {
            System.out.println(name + ": неуспешно пробежал!!!");
        }
    }

    @Override
    public void jumpWall(Wall wall) {
        if (wall.passObstacle(height)) {
            System.out.println(name + ": успешно прыгнул!!!");
        } else {
            System.out.println(name + ": неуспешно прыгнул!!!");
        }
    }

    @Override
    public void checkWin() {
        if (win) {
            System.out.println(name + ": Прошел всю трассу!!!");
        } else {
            System.out.println(name + ": Не прошел!!!");
        }
    }
}
