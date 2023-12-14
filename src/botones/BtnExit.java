/*
 * Boton Salir
 */
package botones;

// Importa la clase iconos del paquete clinica.FrmSistema
import static clinica.FrmSistema.iconos;

/**
 * Clase que representa un botón de tipo "Salir".
 * Extiende la clase Btn para heredar características de botón base.
 */
public class BtnExit extends Btn {
    
    /**
     * Constructor de la clase BtnExit.
     * Configura el texto del botón como "Salir" y establece un icono.
     */
    public BtnExit() {
        // Configura el texto del botón
        setText("Salir");
        
        // Configura el icono del botón utilizando el objeto iconos y su método getExit(16)
        setIcon(iconos.getExit(16));
    }
    
}

