// INTERFACE: plant implementerar interfacet liquidneeding och lovar därmed att
// följa kontraktet. Eftersom plant är abstrakt skriver subklasserna själva
// koden för metoderna.
public abstract class plant implements liquidneeding {

    private final String name;
    private final double heightInMeters;

    public plant(String name, double heightInMeters) {
        this.name = name;
        this.heightInMeters = heightInMeters;
    }

    public String getName() {
        return name;
    }

    public double getHeightInMeters() {
        return heightInMeters;
    }
}