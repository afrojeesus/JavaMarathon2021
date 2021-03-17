package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane planeOne = new Airplane("Autowas", 1944, 560, 4000);
        Airplane planeTwo = new Airplane("adsf",654,560,654);
        Airplane.compareAirplanes(planeOne,planeTwo);

    }
}