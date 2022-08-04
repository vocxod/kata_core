package ru.odybo.universal;

import java.util.Scanner;


public class Robot3313 {
    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);
        int fromX;
        int fromY;
        int startDirection;
        int toX;
        int toY;
        int iExit;
        Direction fromDirection;

        do {
            System.out.print("From point X: ");
            fromX = sc.nextInt();
            System.out.print("From point Y: ");
            fromY = sc.nextInt();
            System.out.print("From direction (as Hour: 0 (up) 3(right) 6(down) 9(left)): ");
            startDirection = sc.nextInt();
            switch (startDirection) {
                case 0:
                    fromDirection = Direction.UP;
                    break;
                case 3:
                    fromDirection = Direction.RIGHT;
                    break;
                case 6:
                    fromDirection = Direction.DOWN;
                    break;
                case 9:
                    fromDirection = Direction.LEFT;
                    break;
                default:
                    fromDirection = Direction.UP;
            }

            Robot robot = new Robot(fromDirection, fromX, fromY);

            System.out.print("Set endpoint X:");
            toX = sc.nextInt();
            System.out.print("Set endpoint Y:");
            toY = sc.nextInt();

            robot.moveRobot(robot, toX, toY);

            System.out.print("LastX= " + robot.posX);
            System.out.print(" LastY= " + robot.posY);
            System.out.print("\n More try? 5 - exit");
            iExit = sc.nextInt();
        } while (iExit != 5);
    }
}

enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT;
    public int getDirection(){
        return 0;
    }
}

class Robot {
    
    public int posY;
    public int posX;
    public Direction lookTo; // up down left rigth 0-3-6-9

    Robot(Direction lookTo, int posX, int posY){
        this.lookTo = lookTo;
        this.posX = posX;
        this.posY = posY;
    }
    
    public Direction getDirection() {
        // текущее направление взгляда
        return this.lookTo;
    }

    public int getX() {
        // текущая координата X
        return this.posX;
    }

    public int getY() {
        // текущая координата Y
        return posY;
    }

    public void moveRobot(Robot robot, int toX, int toY) {
        // System.out.println("Шагаем из " + robot.posX + " : " + robot.posY);
        // System.out.println("Шагаем к " + toX + " : " + toY);
        // Runnable moving;
        // String quant;

        // вариант в лоб - разворотом на X и потом на ось Y пока отложим
        // как банальный и неинтересный.
        // moving to X if needed
        int xDirection = toX - robot.getX();
        int yDirection = toY - robot.getY();
        int deltaX = Math.abs(xDirection);
        int deltaY = Math.abs(yDirection);
        // @todo for variants
        // int distance = 0;
        // int caseApproach = 1;
        // пока робот не дошел до цели
        System.out.println("\u0394 \u0394 = " + deltaX + ":" + deltaY);
        while(deltaX > 0 || deltaY > 0) {
            // System.out.println("\u0394 xy = " + deltaX + ":" + deltaY);
            /*
            решаем в лоб - перебираем X в одном цикле и Y в другом
            only caseApproach = 0
            */
            while (deltaX > 0) {
                if (xDirection == 0) {
                    // not need X moving
                    break;
                }
                if (xDirection < 0) {
                    // need X LEFT moving
                    switch (robot.getDirection()){
                        case UP -> robot.turnLeft();
                        case RIGHT -> {robot.turnLeft();robot.turnLeft();}
                        case DOWN -> robot.turnRight();
                    }
                }
                if (xDirection > 0) {
                    // need X RIGHT moving
                    switch (robot.getDirection()) {
                        case UP -> robot.turnRight();
                        case DOWN -> robot.turnLeft();
                        case LEFT -> { robot.turnRight(); robot.turnRight();}
                    }
                }
                robot.stepForward();
                deltaX = Math.abs(toX - robot.getX());
            }

            // moving to Y if needed
            while (deltaY > 0) {
                if (yDirection == 0) {
                    // not need Y moving
                    break;
                }
                if (yDirection < 0) {
                    // need Y DOWN moving
                    switch (robot.getDirection()){
                        case LEFT -> robot.turnRight();
                        case RIGHT -> robot.turnLeft();
                        case UP -> { robot.turnRight(); robot.turnRight(); }
                    }
                }
                if (yDirection > 0) {
                    // need Y UP moving
                    switch (robot.getDirection()) {
                        case DOWN -> { robot.turnRight(); robot.turnRight(); }
                        case RIGHT -> robot.turnLeft();
                        case LEFT -> robot.turnRight();
                    }
                }
                robot.stepForward();
                deltaY = Math.abs(toY - robot.getY());
            }
            // in this place we have deltaX and deltaY equals 0 or exceprion result
            if ( deltaX + deltaY > 0 ) {
                System.out.println("We have ERROR!");
                try {
                    throw new Exception("Unexpected result!");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            break;
        }
    }
    
    public void turnLeft() {
        // повернуться на 90 градусов против часовой стрелки
        // return this.lookTo = this.lookTo == 0 ? 9 : this.lookTo -= 3;
        switch(this.lookTo) {
            case UP:
                this.lookTo = Direction.LEFT;
                break;
            case LEFT:
                this.lookTo = Direction.DOWN;
                break;            
            case DOWN:
                this.lookTo = Direction.RIGHT;
                break;                
            case RIGHT:
                this.lookTo = Direction.UP;
                break;
        }
    }

    public void turnRight() {
        // повернуться на 90 градусов по часовой стрелке
        //return this.lookTo = this.lookTo == 9 ? 0 : this.lookTo += 3;
        switch(this.lookTo) {
            case DOWN:
                this.lookTo = Direction.LEFT;
                break;
            case LEFT:
                this.lookTo = Direction.UP;
                break;
            case UP:
                this.lookTo = Direction.RIGHT;
                break;
            case RIGHT:
                this.lookTo = Direction.DOWN;
                break;                
        }    
    }

    public void stepForward() {
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
        switch(this.lookTo) {
            case UP:
                this.posY++; 
                break;
            case RIGHT:
                this.posX++;
                break;
            case DOWN:
                this.posY--; 
                break;
            case LEFT:
                this.posX--;
                break;                
        }
    }
}
