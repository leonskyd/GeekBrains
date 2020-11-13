package CatEatFood;

public class Cat {
    String name;
    int appetite; // how much cat eats at once, snack
    int hungryValue; // how much food he can stand with, snack
    final int DAYSPENT = 4; // how much food is spent during daily life


    public Cat(String name, int appetite, int hungryValue) {
        this.name = name;
        this.appetite = appetite;
        this.hungryValue = hungryValue;
    }

    int catEating(int plate) {
        int catFullness = hungryValue;
        if (plate >= appetite) {
            catFullness = catFullness + appetite;
            System.out.println(name + " has eaten " + appetite + " snacks");
            System.out.println(name + " has " + catFullness + " snacks inside");
        } else {
            System.out.println(" Please fill the plate !");
        }
        return catFullness;

    }

    int catBurnCalories(int catFullness) {
        catFullness = catFullness - DAYSPENT;
        System.out.println("The day has gone and " + name + " has " + catFullness + " snacks inside");
        return catFullness;
    }



    }







