import java.util.Locale;
import java.util.ResourceBundle;

public class InternationalizationDemo {

    public static void main(String[] args) {

        // Create English locale
        Locale english = new Locale("en", "US");

        // Create French locale
        Locale french = new Locale("fr", "FR");

        // Load message bundle for English
        ResourceBundle rbEnglish = ResourceBundle.getBundle("Messages", english);

        // Load message bundle for French
        ResourceBundle rbFrench = ResourceBundle.getBundle("Messages", french);

        // Display messages
        System.out.println("English Message:");
        System.out.println(rbEnglish.getString("greeting"));

        System.out.println("\nFrench Message:");
        System.out.println(rbFrench.getString("greeting"));
    }
}
