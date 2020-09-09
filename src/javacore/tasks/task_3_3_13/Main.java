package javacore.tasks.task_3_3_13;

import static javacore.tasks.task_3_3_13.Robot.moveRobot;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(0,0, Robot.Direction.DOWN);
        moveRobot(robot, -10, 20);
    }
}

