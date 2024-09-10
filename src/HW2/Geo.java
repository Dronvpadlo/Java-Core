package HW2;

public class Geo extends User {
    String lat;
    String lng;

    public Geo(){

    }
    public Geo(String lat, String lng) {
        this.lat = lat;
        this.lng = lng;
    }
    public String toString(){
        return ", Ge0 {lat: " + lat + " lng: " + lng + "}";
    }
}
