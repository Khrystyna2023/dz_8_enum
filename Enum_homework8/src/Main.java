public class Main {
    public static void main(String[] args) {
        //System.out.println(SolarSystem.SATURN);
        //SolarSystem print = SolarSystem.EARTH;
        System.out.println("┌──────────────┬──────────────┬──────────────────────────┬──────────────┬────────────────────────┬────────────────────────┐");
        System.out.printf( "│ %-12.12s │  %-12.12s│  %-24.24s│  %-12.12s│  %-22.22s│  %-22.22s│\n",
                "Planets", "After Sun", "Distance from previous", "Radius", "Previous planet", "Sun Distance");
        System.out.println("├──────────────┼──────────────┼──────────────────────────┼──────────────┼────────────────────────┼────────────────────────┤");
        for (SolarSystem print: SolarSystem.values()){

            System.out.printf("│ %-12.12s │  %-12.12s│  %-24.24s│  %-12.12s│  %-22.22s│  %-22.22s│\n",
                    print,print.getNumberFromSun(),print.getFarFromPreviousPlanet(),print.getRadius(),print.getPreviousPlanet(), print.sunDistance);
            System.out.println("└──────────────┴──────────────┴──────────────────────────┴──────────────┴────────────────────────┴────────────────────────┘");

        }
    }
}
