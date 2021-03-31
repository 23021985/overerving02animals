package nl.novi.javaprogrammeren;

import nl.novi.javaprogrammeren.overerving.InToTheWild;
import nl.novi.javaprogrammeren.overerving.Pets;

public class Main{

    public static void main(String[] args) {

        InToTheWild simba = new InToTheWild("Simba", "male",  "Lion", "1", "Monday");
        System.out.println("\n" + simba.moved(6) + " , " + simba.haveEaten("steak, ") + simba.timeOfSleep(8)+", " +"\n" + simba.makesSound(" WROOAAAHHHHRRR" + " net als Katie Perry zo ongeveer, ") + simba.isFromOrigin("Disneyland ") + "en daar leeft " + simba.kids(8)+".");

        InToTheWild mowgli = new InToTheWild("Mowgli", "male", "Wolf", "2", "Friday");
        System.out.println("\n" + mowgli.moved( 22) + ", " + mowgli.haveEaten(" een lekker kippetje ") + mowgli.timeOfSleep(8)+", " +"\n" + mowgli.makesSound(" HuilieHuilie!!!!" + " vooral bij volle maan") + mowgli.isFromOrigin("Junglebook") + mowgli.isFomRoedel("area 51."));

        InToTheWild tijgetje = new InToTheWild("Tijgetje", "male", "Tiger", "3", "Saturday");
        System.out.println("\n" + tijgetje.moved(500) +" (vooral springend). " + tijgetje.haveEaten(" grote potten honing van Winnie, " + tijgetje.timeOfSleep(8) +", "+"\n" + tijgetje.isFromOrigin("van Winnie de Poeh en ")  + tijgetje.makesSound("gromGrom (afgewisseld met jeeeeejjjj!! whoohohooohhoooo!!!...  ")+"\n" + tijgetje.stripes(255)+"."));

        Pets bolt = new Pets("Bolt", "male", "Dog", "The girl from the movie", "Willies Hondenbrokken");
        System.out.println("\n" + bolt.moved(9)  +", "+ bolt.haveEaten("lekkere brokjes en " + bolt.timeOfSleep(8)+ " , " + bolt.makesSound(" woefBlaf " ) + bolt.family("terriër")));


        Pets arlo = new Pets("Arlo", "woman", "Cat", "le Woman", "Whiskas");
        System.out.println("\n" + arlo.moved(2)+", " + arlo.haveEaten("lekker vette haring en" + arlo.timeOfSleep(8) + " , "+ arlo.makesSound("Miaaaauuuwwwwwwww")+"\n" + arlo.wantsToLive( "buiten ") + arlo.family("Siamees")+"."));
    }


    /*
    Het is traditie om overerving uit te leggen met behulp van dieren. Hier ontkomen jullie dus ook niet aan.

    Opdracht
    Bekijk de beschrijving van onderstaande dieren. Bedenk wat je in de superklasse kan zetten. De subklassen hoef
    je nog niet te maken.

    Van een Leeuw slaan we de naam, naam van het hok, geslacht, weekdag dat die het laatst gevoed is en land van
    herkomst op en de hoeveelheid kinderen.

    Van een Tijger slaan we de naam, naam van het hok, geslacht, weekdag dat die het laatst gevoed is en land van
    herkomst op. Ook willen we het aantal strepen weten.

    Van een Hond slaan we naam, naam van het baasje, favoriete voedselmerk, geslacht en soort op.
    Van een Kat slaan we de naam, naam van het baasje, favoriete voedsel merk, geslacht en soort op. Ook willen we weten
    of het een binnen of buitenkat is.

    Van een Wolf slaan we de naam, naam van het hok, geslacht, weekdag dat die voor het laatste gevoed is en land van
    herkomst op. Ook willen we de naam van de roedel weten.

    Alle dieren moeten kunnen bewegen. Dit moet als methode toegevoegd worden. Wanneer een dier beweegt print je in
    de console dat deze 0.25 meter is verplaatst.

    Alle dieren moeten ook een maak-geluid-methode hebben waarmee je het geluid van de dieren afdrukt naar de console.

    Alle dieren slapen 8 uur per dag. Maak een methode slapen en print dit uit wanneer de methode wordt aangeroepen.

    Alle dieren eten. Maak een methode die een String ontvangt en print dan uit wat het dier eet.

    Alles staat hier in het Nederlands beschreven. Schrijf je klassen-, variabele en methodenamen in het Engels.

     */

}
