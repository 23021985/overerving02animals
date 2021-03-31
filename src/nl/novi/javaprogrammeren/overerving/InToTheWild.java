package nl.novi.javaprogrammeren.overerving;



public class InToTheWild extends Animal implements House, Fed{

    public InToTheWild(String animalName, String sex, String species, String hokje, String DayOfWeek) {
        super(animalName, sex, species);
    }

    //methodes
    public String isFromOrigin(String country){
        return this.animalName + " komt origineel uit het land " + country;
    }

    //roedel
    public String isFomRoedel(String roedel){
        return this.animalName + " Leeft samen met de roedel van " + roedel;
    }

    //aantal strepen
    public String stripes(int amountOfStripes){
        return this.animalName + " heeft op dit moment een totaal van " +amountOfStripes + " strepen";
    }

    //aantal kinderen
    public String kids(int amountOfKids){
        return this.animalName + " met zijn " + amountOfKids + " kinderen";
    }

    @Override
    public void houseOfAnimal(int hokje) {

    }

    @Override
    public void lastDayFed(String lastFedOnDayOfWeek) {

    }
}