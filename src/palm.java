// ARV: palm ärver från plant (extends). Därför får palm namn och längd
// från plant utan att behöva skriva den koden en gång till.
public class palm extends plant {

    private static final double LITERS_PER_METER = 0.5;
    private static final String LIQUID_TYPE = "Kranvatten";
    private static final String UNIT = "liter per dag";

    public palm(String name, double heightInMeters) {
        super(name, heightInMeters);
    }

    // POLYMORFISM: Metoden finns i alla växtklasser men räknar olika.
    // Palmens version använder formeln 0,5 liter gånger längden i meter.
    @Override
    public double calculateLiquidAmount() {
        return LITERS_PER_METER * getHeightInMeters();
    }

    @Override
    public String getLiquidType() {
        return LIQUID_TYPE;
    }

    @Override
    public String getUnit() {
        return UNIT;
    }
}