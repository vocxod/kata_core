package ru.odybo.universal;


class Human {
    public int age;
    public String name;
    public String secondName;
    public String favoriteSport;

    Human() {
    }

    Human(int age, String name, String secondName, String favoriteSport) {
        this.age = age;
        this.name = name;
        this.secondName = secondName;
        this.favoriteSport = favoriteSport;
    }

    Human(int age, String name, String secondName){
        this.age = age;
        this.name = name;
        this.secondName = secondName;
    }
}


public class CheckHuman {
    public static void main(String[] args) {
        Human personFirst = new Human();
        Human personSecond = new Human(52, "Sergey", "Riabinin", "Chess");
        Human personThird = new Human(52, "Sergey", "Riabinin");
    }
}



