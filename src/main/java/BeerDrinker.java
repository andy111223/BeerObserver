public class BeerDrinker implements BeerObserver{
    @Override
    public void notifyBeerIsEmpty() {
        System.out.println("Oh no! My beer is empty! Time to refill!");
    }
}
