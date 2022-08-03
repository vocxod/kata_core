package ru.odybo.universal;

/*
 * I check behaivior)) I try return eye insted legs in the getLeg methods
 * Study))
 * */

class Animal {
  public String name;
  public String bodyPart;

  Animal (){
    System.out.println("I'm boring...");
  }

  Animal (String bodyPart){
    this.bodyPart = bodyPart;
    System.out.println("i'am mutant: " + bodyPart + " with some features!");
  }

  protected void displayInfo(){
    System.out.println("I'm animal");
  }
}

class Dog extends Animal {

  public String sound = "HowHow!";

  Dog(){
    System.out.println("Dog open eyes...");
  }

  @Override
  public void displayInfo(){
    // super.displayInfo();
    // this.sound = sound;
    System.out.println("I'm DOG " + this.sound);
  }
  
}

class Korgi extends Dog {

  Korgi(){
    System.out.println("Korgi says!");
  }
  Korgi(String bodyPart){
    System.out.println("Korgi says!");
  }
}
  

public class BehaiveCheckTypeOfReturn {
  public static void main(String... args){
    Korgi korgi = new Korgi();
    korgi.displayInfo();
  }
}

