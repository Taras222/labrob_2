public class Satellite {
    String name;
    int distanceFromPlanet;
    int brightness;

    public Satellite(String name, int distanceFromPlanet, int brightness) {
        this.name = name;
        this.distanceFromPlanet = distanceFromPlanet;
        this.brightness = brightness;
    }

    boolean tides() {
        boolean res;
        if (brightness < 70 && distanceFromPlanet < 200) {
            res = true;
        } else {
            res = false;
        }
        return res;
    }

    void showTides() {
        if (tides() == true) {
            System.out.println("Потужність припливів висока");
        } else {
            System.out.println("Потужність припливів низька");
        }
    }
}
