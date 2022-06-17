public class House {

    private String propertyNumber;
    private char propertyType;
    private int bedroomNum;
    private int bathroomNum;
    String furnishStatus;
    boolean onSale;
    int price;
    private String address;

    private int longitude;
    private int latitude;

    // constructor

    public House() {

    }

    public House(String propertyNumberIn, char propertyTypeIn, int bedroomNumIn, int bathroomNumIn, String furnishStatusIn,
                 int priceIn, String addressIn, int longitudeIn, int latitudeIn){
        this.propertyNumber = propertyNumberIn;
        this.propertyType = propertyTypeIn;
        this.bedroomNum = bedroomNumIn;
        this.bathroomNum = bathroomNumIn;
        this.furnishStatus = furnishStatusIn;
        this.price = priceIn;
        this.address = addressIn;

        this.longitude = longitudeIn;
        this.latitude = latitudeIn;

    }

    // Behaviours


    public String furnish() {
        System.out.println("This house has been furnished");
        return furnishStatus = "furnished";
    }

    public void onSaleOrNot(boolean onSale) {
        if (onSale) {
            System.out.print("This house is on sale");
        } else {
            System.out.println("Some bought this house");
        }
    }



    // getter


    public char getPropertyType() {
        return propertyType;
    }

    public int getBathroomNum() {
        return bathroomNum;
    }

    public int getBedroomNum() {
        return bedroomNum;
    }


    public int getPrice() {
        return price;
    }

    public String getAddress() {
        return address;
    }

    public String getFurnishStatus() {
        return furnishStatus;
    }

    public String getProperNumber() {
        return propertyNumber;
    }

    public int getLongitude() {
        return longitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBathroomNum(int bathroomNum) {
        this.bathroomNum = bathroomNum;
    }

    public void setBedroomNum(int bedroomNum) {
        this.bedroomNum = bedroomNum;
    }

    public void setFurnishStatus(String furnishStatus) {
        this.furnishStatus = furnishStatus;
    }

    public void setPropertyType(char propertyType) {
        this.propertyType = propertyType;
    }

    public void setProperNumber(String properNumber) {
        this.propertyNumber = properNumber;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }
}
