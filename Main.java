public class Main {
    public static void main(String[] args) {
        Planet planet = new Planet("Kepler", 2, 4, true);
        Satellite satellite = new Satellite("Carme", 175, 65);
        Star star = new Star("Alpha Centavra", 530, 670);

        Star star2 = new Star(star);
        Star star3 = new Star();
        star3.temperature = 887;
        star3.weight = 1943;
        star3.name = "Sirius";

        planet.suitableForLife();
        System.out.println("Планета " + planet.name + " буде жити ще " + planet.cycleLife() + " млрд. років");
        System.out.println("Планета " + planet.name + " буде жити ще " + planet.cycleLife(2.043,4.142) + " млрд. років");
        satellite.showTides();
        star.clasification();
        System.out.println("Зірка " + star.name + " буде світити ще " + star.starBright() + " млрд. років");
        System.out.println("Зірка " + star2.name + " буде світити ще " + star2.starBright() + " млрд. років");
        star3.clasification();
        System.out.println("Зірка " + star3.name + " буде світити ще " + star3.starBright() + " млрд. років");



    }
}