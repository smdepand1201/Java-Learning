public class GuitarApp {

    public static void main(String[] args) {

        ElectricGuitar myGuitar = new ElectricGuitar();

        myGuitar.setBrand("Fender");
        myGuitar.setNumOfPickups(3);
        myGuitar.setRockStarUsesIt(true);

        System.out.println("Brand: " + myGuitar.getBrand());
        System.out.println("Pickups: " + myGuitar.getNumOfPickups());
        System.out.println("Used by Rockstars? " + myGuitar.getRockStarUsesIt());
    }
}

class ElectricGuitar {

    private String brand;
    private int numOfPickups;
    private boolean rockStarUsesIt;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String aBrand) {
        brand = aBrand;
    }

    public int getNumOfPickups() {
        return numOfPickups;
    }

    public void setNumOfPickups(int num) {
        numOfPickups = num;
    }

    public boolean getRockStarUsesIt() {
        return rockStarUsesIt;
    }

    public void setRockStarUsesIt(boolean yesOrNo) {
        rockStarUsesIt = yesOrNo;
    }
}
