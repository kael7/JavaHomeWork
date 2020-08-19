package java2hw1;

public class Main {
    public static void main(String[] args) {
        Actions[] actionables = {
                new Human("Vova", 100, 4),
                new Cat("Murzik", 70, 9),
                new Robot("M1B0",50,2)
        };


        RunningTrack runningTrack = new RunningTrack(100);
        Wall wall = new Wall(3);

        for (Actions actionable : actionables) {
//            actionable.jump();
//            actionable.run();
            actionable.runTrack(runningTrack);
            actionable.jumpWall(wall);
        }

//

    }
}
