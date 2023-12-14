/*
 * Clase base o super clase para la creación de los botones
 */
package botones;

// Importa la clase JButton del paquete javax.swing
import javax.swing.JButton;

// Definición de la clase Btn que extiende JButton
public class Btn extends JButton {
    
    // Constructor de la clase Btn
    public Btn() {
        // Establece la fuente del botón con un nuevo objeto de la clase Font
        setFont(new java.awt.Font("Thaoma", 1, 10));
    }
}
