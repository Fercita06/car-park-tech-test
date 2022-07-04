public class Car extends Vehicle{

    private boolean isParked;

    public Car(String id, int size, int type) {
        super(id, size, type);
        this.isParked = true;
    }

    public void setParked(boolean parked) {
        isParked = parked;
    }
}
