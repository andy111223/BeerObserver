import java.util.ArrayList;
import java.util.List;

public class BeerMug {

    private List<BeerObserver> observers = new ArrayList<>();

    void addObservers(BeerObserver observer) {
        observers.add(observer);
    }
    void removeObserver(BeerObserver observer) {
        observers.remove(observer);
    }
    void beerIsEmpty() {
        for(BeerObserver observer : observers) {
            observer.notifyBeerIsEmpty();
        }
    }
}
