package nl.novi.javaprogrammeren.overerving;


import nl.novi.javaprogrammeren.Main;

public abstract class Animal extends Main {
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
        return this.animalName + " heeft de afstand " + moved + " meter afgelegd";
    }

    public String timeOfSleep(int hours) {
        int TimeOfSleep = 8;
        return this.animalName + " sliep " + hours +" uur";

    }

    public String haveEaten(String food) {
        return this.animalName + " eet echt vet veel " + food;

    }
    //methode sound
    public String makesSound(String animalSound){
    return this.animalName + " maakt het volgende geluid: " + animalSound;
    }

    public abstract void houseOfAnimal(int hokje);
}


