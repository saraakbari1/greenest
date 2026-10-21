import java.util.Optional;
import javax.swing.JOptionPane;

public class main {
    private static final String QUESTION = "Vilken växt ska få vätska?";
    private static final String RESULT_TITLE = "Vätskebehov";
    private static final String ERROR_TITLE = "Fel";
    private static final String EMPTY_INPUT_MESSAGE = "Du måste skriva ett namn.";
    private static final String UNKNOWN_PLANT_MESSAGE = "Det finns ingen växt med det namnet på hotellet: ";

    public static void main(String[] args) {
        planthotel hotel = new planthotel();
        boolean running = true;

        while (running) {
            String input = JOptionPane.showInputDialog(QUESTION);

            if (input == null) {
                // Felhantering: null betyder att användaren tryckte Avbryt
                // eller stängde rutan. Då avslutas programmet utan krasch.
                running = false;
            } else if (input.isBlank()) {
                // Felhantering: tom inmatning ger ett felmeddelande.
                showError(EMPTY_INPUT_MESSAGE);
            } else {
                handleInput(hotel, input);
            }
        }
    }

    private static void handleInput(planthotel hotel, String input) {
        Optional<plant> foundPlant = hotel.findPlantByName(input);

        if (foundPlant.isPresent()) {
            showResult(foundPlant.get());
        } else {
            // Felhantering: okända namn, siffror och tecken hamnar här.
            showError(UNKNOWN_PLANT_MESSAGE + input.trim());
        }
    }

    private static void showResult(plant selectedPlant) {
        // POLYMORFISM: Variabeln selectedPlant har typen plant, men objektet kan
        // vara en palm, carnivorousplant eller cactus. Java väljer själv rätt
        // version av calculateLiquidAmount(), getUnit() och getLiquidType()
        // när programmet körs.
        String message = String.format("%s ska ha %.2f %s av typen %s.",
                selectedPlant.getName(),
                selectedPlant.calculateLiquidAmount(),
                selectedPlant.getUnit(),
                selectedPlant.getLiquidType());
        JOptionPane.showMessageDialog(null, message, RESULT_TITLE, JOptionPane.INFORMATION_MESSAGE);
    }

    private static void showError(String message) {
        JOptionPane.showMessageDialog(null, message, ERROR_TITLE, JOptionPane.ERROR_MESSAGE);
    }
}