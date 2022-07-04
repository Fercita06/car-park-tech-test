import java.util.ArrayList;
import java.util.List;

public class CarPark {

int maxMotocycleSpots;
int maxRegularSpots ;
int totalSpots;
int motorcycleSpotsTaken;
int regularSpotsTaken;

int totalSpotsRemaining;



    public CarPark(int maxMotocycleSpots, int maxRegularSpots) {
        this.maxMotocycleSpots = maxMotocycleSpots;
        this.totalSpots = maxMotocycleSpots + maxMotocycleSpots;
        this.motorcycleSpotsTaken = (int) (Math.random() * maxMotocycleSpots);
        this.regularSpotsTaken = (int) (Math.random() * maxRegularSpots);
        this.totalSpotsRemaining = totalSpots - motorcycleSpotsTaken - regularSpotsTaken;
        this.maxRegularSpots = maxRegularSpots;
    }

public void carParkDetail(){
    System.out.println("there are " + maxRegularSpots + " regular spots and " + maxMotocycleSpots + " motorcycle spots");
    System.out.println("But there are " + regularSpotsTaken + " car parked already and " + motorcycleSpotsTaken + " motorcycle parked");
    System.out.println("The spots remaining are " + totalSpotsRemaining);
}




}
