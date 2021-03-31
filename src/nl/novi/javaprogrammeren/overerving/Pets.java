package nl.novi.javaprogrammeren.overerving;

public class Pets extends Animal{

    protected String nameOfBoss;
    protected String favouriteFoodBrand;
    protected String insideOrOutside;

    //constructor



    public Pets(String animalName, String sex, String species, String nameOfBoss, String favouriteFoodBrand) {
        super(animalName, sex, species);

        this.nameOfBoss = nameOfBoss;
        this.favouriteFoodBrand = favouriteFoodBrand;


    }

    public String family(String familyOfPets){
        return "en is een " + familyOfPets;
    }

    public String wantsToLive(String insideOrOutside){
        return this.animalName + " leeft lekker " + insideOrOutside;
    }

    @Override
    public void houseOfAnimal(int hokje) {
        System.out.println(this.animalName + " woont in hokje nr " + hokje);
    }
}
