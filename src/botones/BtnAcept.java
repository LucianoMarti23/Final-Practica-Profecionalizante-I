/*
 * Boton Filtro
 */
package botones;

// Importa la clase iconos del paquete clinica.FrmSistema
import static clinica.FrmSistema.iconos;

/**
 * Clase que representa un botón de tipo "Aceptar".
 * Extiende la clase Btn para heredar características de botón base.
 */
public class BtnAcept extends Btn {
    
    /**
     * Constructor de la clase BtnAcept.
     * Configura el texto del botón como "Aceptar" y establece un icono.
     */
    public BtnAcept() {
        // Configura el texto del botón
        setText("Aceptar");
        
        // Configura el icono del botón utilizando el objeto iconos y su método getAcept(16)
        setIcon(iconos.getAcept(16));
    }
    
}
}
