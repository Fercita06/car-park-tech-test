public class Vehicle {
private String id;
private int size;
private int type;

    public Vehicle(String id, int size, int type) {
        this.id = id;
        this.size = size;
        this.type = type;


    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
