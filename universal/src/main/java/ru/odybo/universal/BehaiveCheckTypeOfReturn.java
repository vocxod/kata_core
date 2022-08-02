package ru.odybo.universal;

/*
 * I check behaivior)) I try return eye insted legs in the getLeg methods
 * Study))
 * */

class Eye {
  private String color;
}

class Leg {
  private String size;
}


class Animal {
  public Leg leg;
  public Eye eye;
}

class Dog extends Animal {

  public Leg getLeg() {
    return this.leg;
  }
}

class Korgi extends Dog {

  @Override
  public Leg getLeg(){
    return this.leg;
  }
}

public class BehaiveCheckTypeOfReturn {
  public static void main(String... args){
    Korgi korgi = new Korgi();
  }
}

