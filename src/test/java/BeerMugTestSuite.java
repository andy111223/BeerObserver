import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BeerMugTestSuite {

    @Test
    void observerShouldBeNotifiedWhenBeerIsEmpty() {
        //Arrange
        BeerMug mug = new BeerMug();
        BeerObserver observer = mock(BeerObserver.class);
        mug.addObservers(observer);
        //Act
        mug.beerIsEmpty();
        //Assert
        verify(observer, times(1)).notifyBeerIsEmpty();
    }
    @Test
    void observerShouldNotBeNotifiedAfterBeingRemoved() {
        //Arrange
        BeerMug mug = new BeerMug();
        BeerObserver observer = mock(BeerObserver.class);
        mug.addObservers(observer);
        mug.removeObserver(observer);
        //Act
        mug.beerIsEmpty();
        //Assert
        verify(observer, never()).notifyBeerIsEmpty();
    }
    @Test
    void noExceptionThrownWhenNotifyingWithoutObservers() {
        //Arrange
        BeerMug mug = new BeerMug();
        //Act & Assert
        mug.beerIsEmpty();
    }
}
