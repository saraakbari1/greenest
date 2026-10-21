import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Den här klassen har hand om växterna på hotellet och kan söka upp en växt
// på namn.
public class planthotel {

    // Listan har typen plant, så den kan innehålla både cactus, palm och
    // carnivorousplant. Det är möjligt tack vare arvet.
    private final List<plant> plants = new ArrayList<>();

    public planthotel() {
        plants.add(new cactus("Igge", 0.2));
        plants.add(new palm("Laura", 5));
        plants.add(new carnivorousplant("Meatloaf", 0.7));
        plants.add(new palm("Olof", 1));
    }

    // Returnerar en tom Optional om växten inte finns. Då kraschar inte
    // programmet utan main kan visa ett felmeddelande.
    public Optional<plant> findPlantByName(String name) {
        for (plant currentPlant : plants) {
            if (currentPlant.getName().equalsIgnoreCase(name.trim())) {
                return Optional.of(currentPlant);
            }
        }
        return Optional.empty();
    }
}