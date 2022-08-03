package ru.odybo.universal;

import java.util.Scanner;


public class Robot3313 {
    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);
        int fromX;
        int fromY;
        int startDirection;
        Direction fromDirection;
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

        Robot robot = new Robot(fromDirection, 0, 0);
        
        System.out.print("Set endpoint X:");
        int toX = sc.nextInt();
        System.out.print("Set endpoint Y:");
        int toY = sc.nextInt();

        robot.moveRobot(robot, toX, toY);

        System.out.println("LastX= " + robot.posX);
        System.out.println("LastY= " + robot.posY);
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
        System.out.println("Шагаем из " + robot.posX + " : " + robot.posY);
        System.out.println("Шагаем к " + toX + " : " + toY);
        Runnable moving;
        String quant;

        // вариант в лоб - разворотом на X и потом на ось Y пока отложим
        // как банальный и неинтересный.

        int deltaX = toX - this.getX();
        int deltaY = toY - this.getY();
        // @todo for variants
        int distance = 0; 
        // deltaX = 1; deltaY = 0;
        // пока робот не дошел до цели
        System.out.println("\u0394 \u0394 = " + deltaX + ":" + deltaY);
        while(deltaX) {
          System.out.println("\u0394 xy = " + deltaX + ":" + deltaY);
          // ветвим и находим направления, далее ветвим и выставляем допустимое
          if (deltaX > 0 && deltaY > 0) {
            // выставить самое короткое направление из текущего - или в UP or RIGHT
            switch (this.getDirection()) {
              case UP:
                // наше направление
                break;
              case RIGHT:
                // наше направление
                break;
              case DOWN:
                robot.turnLeft();
                break;
              case LEFT:
                robot.turnRight();
                break;
            }
          }
          if (deltaX > 0 && deltaY == 0) {
            // выставить самое короткое направление из текущего - RIGHT
            switch (this.getDirection()) {
              case UP:
                robot.turnRight();
                break;
              case RIGHT:
                // наше направление
                break;
              case DOWN:
                robot.turnLeft();
                break;
              case LEFT:
                robot.turnRight();
                robot.turnRight();
                break;
            }
          }
          // вариант 2 - пробуем добиться результата лямбдой
          robot.stepForward();
          deltaX = toX - this.getX();
          deltaY = toY - this.getY();
          System.out.println("Состояние робота: " + this.getDirection() + " : " + robot.posX + " : " + robot.posY);
          // break;
        }

        // find direction (Quant) from current position to endpoint.
        // int toQuant = 0;
        if (((this.getX() - toX) >= 0) && ((this.getY() - toY) <= 0)) {
          // Q0
          // () -> System.out.println("No Parameters"); 
          String quant1 = "Q0";
          moving = () -> System.out.println("TO ");
          moving.run();
        } else if (((this.getX() - toX) >= 0) && ((this.getY() - toY) >= 0)) {
          // Q1
          
        } else if (((this.getX() - toX) <= 0) && ((this.getY() - toY) <= 0)) {
          // Q2
          
        } else if (((this.getX() - toX) >= 0) && ((this.getY() - toY) <= 0)) {
          // Q3
          
        } else {
          System.out.println("Error find direction.");
          System.out.println("DeltaX= " + (this.getX() - toX) + " DeltaY=" + (this.getY() - toY));
          System.exit(-1); 
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
