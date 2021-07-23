package JavaCore.Lection3;


public class task3313 {

public static void moveRobot(Robot robot, int toX, int toY) {
    if ((toX < 0) || (toY < 0)) {
        new Exception("Wrong coordinates");
    }


    while ((robot.getX() != toX) && (robot.getY() != toY)) {
        if (robot.getX() < toX ) {

//        }
        }

    }

//    if (toX > robot.getX()) {
//        while (robot.getDirection() != Direction.RIGHT) {
//            robot.turnRight();
//        }
//        for (int i = robot.getX(); i < toX; i++) {
//            robot.stepForward();
//        }
//    }
//    if (toX < robot.getX()) {
//        while (robot.getDirection() != Direction.LEFT) {
//            robot.turnRight();
//        }
//        for (int i = robot.getX(); i > toX; i--) {
//            robot.stepForward();
//        }
//    }
//
//    if (toY > robot.getY()) {
//        while (robot.getDirection() != Direction.UP) {
//            robot.turnRight();
//        }
//        for (int i = robot.getY(); i < toY; i++) {
//            robot.stepForward();
//        }
//    }
//    if (toY < robot.getY()) {
//        while (robot.getDirection() != Direction.DOWN) {
//            robot.turnRight();
//        }
//        for (int i = robot.getY(); i > toY; i--) {
//            robot.stepForward();
//        }
//    }
}
}


// Class ROBOT
class Robot {

    public Direction getDirection() {
        // текущее направление взгляда
        return Direction.UP;
    }

    public int getX() {
        // текущая координата X
        return 0;
    }

    public int getY() {
        return 0;
    }

    public void turnLeft() {
        // повернуться на 90 градусов против часовой стрелки
    }

    public void turnRight() {
        // повернуться на 90 градусов по часовой стрелке
    }

    public void stepForward() {
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
    }
}

