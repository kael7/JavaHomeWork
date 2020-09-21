package java2hw1;

public class Main {
    private static String dayType;
    private static int hours;

    public static void main(String[] args) {
        Actions[] actions = {
                new Human("Vova", 100, 4),
                new Cat("Murzik", 70, 9),
                new Robot("M1B0", 50, 2)
        };

        Obstacles[] obstacles = {
                new RunningTrack(60),
                new Wall(3),
                new RunningTrack(80),
                new Wall(2)
        };

//        for (int i = 0; i < actions.length; i++) {
//            for (int j = 0; j < obstacles.length; j++) {
//                if (obstacles[j] instanceof RunningTrack) {
//                    actions[i].runTrack((RunningTrack) obstacles[j]);
//                }
//                if (obstacles[j] instanceof Wall) {
//                    actions[i].jumpWall((Wall) obstacles[j]);
//                }
//            }
//            actions[i].checkWin();
//        }

        Days.getWorkingHours(Days.Monday);
    }


}
