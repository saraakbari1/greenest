// ARV: carnivorousplant ärver från plant (extends) och får namn och längd
// därifrån.
public class carnivorousplant extends plant {

    private static final double BASE_LITERS = 0.1;
    private static final double LITERS_PER_METER = 0.2;
    private static final String LIQUID_TYPE = "Proteindryck";
    private static final String UNIT = "liter per dag";

    public carnivorousplant(String name, double heightInMeters) {
        super(name, heightInMeters);
    }

    // POLYMORFISM: Samma metodnamn som i palm och cactus men en annan formel.
    // Här är det en basnivå på 0,1 liter plus 0,2 liter gånger längden.
    @Override
    public double calculateLiquidAmount() {
        return BASE_LITERS + (LITERS_PER_METER * getHeightInMeters());
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