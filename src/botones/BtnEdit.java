/*
 * Boton Editar
 */
package botones;

// Importa la clase iconos del paquete clinica.FrmSistema
import static clinica.FrmSistema.iconos;

/**
 * Clase que representa un botón de tipo "Editar".
 * Extiende la clase Btn para heredar características de botón base.
 */
public class BtnEdit extends Btn {
    
    /**
     * Constructor de la clase BtnEdit.
     * Configura el texto del botón como "Actualizar" y establece un icono.
     */
    public BtnEdit() {
        // Configura el texto del botón
        setText("Actualizar");
        
        // Configura el icono del botón utilizando el objeto iconos y su método getEdit(16)
        setIcon(iconos.getEdit(16));
    }
    
}
