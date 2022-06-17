public class Airplane {

    private String make;
    private String flightNumber;
    private int model;
    private int capacity;

    boolean flyingStatus;
    private String pilot;
    private String location;
    String longitude;
    String latitude;

    // constructor
    public Airplane(){

    }

    // Action
    public void flyOrNot(boolean flyingStatus){
        if (flyingStatus){
            System.out.println("The plane is flying");
        } else {
            System.out.println("The plane is parking in some where.");
        }
    }



    // getter and setter

    public String getMake() {
        return make;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public int getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getPilot() {
        return pilot;
    }

    public String getLocation() {
        return location;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    // setters


    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public void setPilot(String pilot) {
        this.pilot = pilot;
    }

}
