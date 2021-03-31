package nl.novi.javaprogrammeren.overerving;


import nl.novi.javaprogrammeren.Main;

public class Animal extends Main {
    protected String animalName;
    protected String sex;
    protected String species;


    // constructors
    public Animal(String animalName, String sex, String species) {
        this.animalName = animalName;
        this.sex = sex;
        this.species = species;

    }

//    public String causeImSoLazy(String moved, String timeOfSleep, String haveEaten, String makesSound){
//        return
//    }

    // methods
    public String moved(double distance){
        double moved = distance *0.25;
        return this.animalName + " has moved a distance of " + moved;
    }

    public String timeOfSleep(int hours) {
        int TimeOfSleep = 8;
        return this.animalName + " slept " + hours +" hours";

    }

    public String haveEaten(String food) {
        return this.animalName + " has eaten a lot of " + food;

    }
    //methode sound
    public String makesSound(String animalSound){
    return this.animalName + " makes the lovely sound of " + animalSound;
    }
}


