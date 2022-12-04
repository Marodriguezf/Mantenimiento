package crudmvc;
import modelo.*;
import vista.*;
import controlador.*;


/**
 *
 * @author aleja
 */
public class CrudMvc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      JFCrud vistaC = new JFCrud();
      PersonaDAO modeloC = new PersonaDAO();
      ControladorCrud controladorC = new ControladorCrud(vistaC, modeloC);
      
      vistaC.setVisible(true);
      vistaC.setLocationRelativeTo(null);
      
    }
    
}
