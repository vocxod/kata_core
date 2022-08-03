package ru.odybo.universal;

import java.util.Scanner;

class HomeAnimal {
    String name;

    HomeAnimal(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void displayName(){
        System.out.println("I'm animal");
    }

}

class HomeCat extends HomeAnimal {

    HomeCat(String name) {
        super(name);
    }

    @Override
    public void displayName(){
        // super();
        System.out.println("I'm cat");
    }
}

class HomeDog extends HomeAnimal {
    HomeDog(String name) {
        super(name);
    }

    @Override
    public void displayName(){
        // super();
        System.out.println("I'm dog.");
    }
}

public class CatDog {
    HomeCat myCat;
    HomeDog myDog;
    CatDog(HomeCat cat, HomeDog dog){
        this.myCat = cat;
        this.myDog = dog;
    }

    public static void main(String... args){
        int iMore = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            HomeCat cat = new HomeCat("Кошка");
            HomeDog dog = new HomeDog("Собака");
            CatDog catDog = new CatDog(cat, dog);
            System.out.println("More? 0 - exit");
            iMore = scanner.nextInt();
        } while (iMore !=0 );
    }

}
