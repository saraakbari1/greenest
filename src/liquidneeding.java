// INTERFACE: Det här är ett interface. Det är ett kontrakt som säger vilka
// metoder en växt måste ha för att hantera vätska. Interfacet innehåller
// ingen kod, bara metodnamnen. Klasserna som implementerar det bestämmer
// själva vad metoderna gör.
public interface liquidneeding {

    double calculateLiquidAmount();

    String getLiquidType();

    String getUnit();
}