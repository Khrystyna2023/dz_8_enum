
public enum SolarSystem {
    MERCURY(1, 0, 2430,null),
    VENUS(2, 0.4, 4612.9701, MERCURY),
    EARTH(3, 1.2, 6378, VENUS),
    MARS(4, 1.8, 9773,EARTH),
    JUPITER(5, 3.9, 33169.05,MARS),
    SATURN(6, 4.6, 58410,JUPITER),
    URANUS(7, 10.2, 122330.15,SATURN),
    NEPTUNE(8, 21.3, 191340.2,URANUS);

    private final int numberFromSun;
    private final double farFromPreviousPlanet;
    private final double radius;
    private final SolarSystem previousPlanet;
    public final double sunDistance;


    SolarSystem(int numberFromSun, double farFromPreviousPlanet, double radius, SolarSystem previousPlanet) {   //конструктор для порядкового номер планети від сонця
        this.numberFromSun = numberFromSun;
        this.farFromPreviousPlanet = farFromPreviousPlanet;
        this.radius = radius;
        this.previousPlanet = previousPlanet;
        this.sunDistance = previousPlanet != null ? previousPlanet.sunDistance + farFromPreviousPlanet :farFromPreviousPlanet;
    }

    public int getNumberFromSun() {  //гетер для виклику порядкового номеру планети в мейн класі
        return numberFromSun;
    }
    public double getFarFromPreviousPlanet() {  //гетер для показу віддаленості планети від попередньої
        return farFromPreviousPlanet;
    }
    public double getRadius() { //гетер для показу радіуса планети
        return radius;
    }
    public SolarSystem getPreviousPlanet() {
        return previousPlanet;
    }
    public double getSunDistance() {
        return sunDistance;
    }

}
