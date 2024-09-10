package Task1;

public final class Geo extends User {
    private String lat;
    private String lng;

    public Geo(){

    }
    public Geo(String lat, String lng) {
        this.lat = lat;
        this.lng = lng;
    }
    public String toString(){
        return ", Geo {lat: " + lat + " lng: " + lng + "}";
    }
}
