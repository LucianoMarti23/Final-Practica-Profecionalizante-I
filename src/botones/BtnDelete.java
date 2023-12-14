/*
 * Boton Borrar
 */
package botones;

// Importa la clase iconos del paquete clinica.FrmSistema
import static clinica.FrmSistema.iconos;

/**
 * Clase que representa un botón de tipo "Borrar".
 * Extiende la clase Btn para heredar características de botón base.
 */
public class BtnDelete extends Btn {
    
    /**
     * Constructor de la clase BtnDelete.
     * Configura el texto del botón como "Borrar" y establece un icono.
     */
    public BtnDelete() {
        // Configura el texto del botón
        setText("Borrar");
        
        // Configura el icono del botón utilizando el objeto iconos y su método getDelete(16)
        setIcon(iconos.getDelete(16));
    }
    
}

