/*
 * Boton Filtro
 */
package botones;

// Importa la clase iconos del paquete clinica.FrmSistema
import static clinica.FrmSistema.iconos;

/**
 * Clase que representa un botón de tipo "Filtro".
 * Extiende la clase Btn para heredar características de botón base.
 */
public class BtnFilter extends Btn {
    
    /**
     * Constructor de la clase BtnFilter.
     * Configura el texto del botón como "Filtro" y establece un icono.
     */
    public BtnFilter() {
        // Configura el texto del botón
        setText("Filtro");
        
        // Configura el icono del botón utilizando el objeto iconos y su método getFilter(16)
        setIcon(iconos.getFilter(16));
    }
    
}

