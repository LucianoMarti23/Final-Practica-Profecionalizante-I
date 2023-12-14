/*
 * Boton Cliente
 */
package botones;

// Importa la clase iconos del paquete clinica.FrmSistema
import static clinica.FrmSistema.iconos;

/**
 * Clase que representa un botón de tipo "Cliente".
 * Extiende la clase Btn para heredar características de botón base.
 */
public class BtnClient extends Btn {
    
    /**
     * Constructor de la clase BtnClient.
     * Configura el texto del botón como "Cliente" y establece un icono.
     */
    public BtnClient() {
        // Configura el texto del botón
        setText("Cliente");
        
        // Configura el icono del botón utilizando el objeto iconos y su método getClient(16)
        setIcon(iconos.getClient(16));
    }
    
}

