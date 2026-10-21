// ARV: cactus ärver från plant (extends) och får namn och längd därifrån.
public class cactus extends plant {

    private static final double CENTILITERS_PER_DAY = 2;
    private static final String LIQUID_TYPE = "Mineralvatten";
    private static final String UNIT = "cl per dag";

    public cactus(String name, double heightInMeters) {
        super(name, heightInMeters);
    }

    // POLYMORFISM: Samma metodnamn som i de andra växtklasserna men kaktusen
    // behöver alltid 2 cl. Längden spelar ingen roll.
    @Override
    public double calculateLiquidAmount() {
        return CENTILITERS_PER_DAY;
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