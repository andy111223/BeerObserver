public class Pub {
    public static void main(String[] args) {

        BeerMug mug = new BeerMug();
        BeerDrinker drinker = new BeerDrinker();

        mug.addObservers(drinker);

        //when beer mur gets empty
        mug.beerIsEmpty();
    }
}
