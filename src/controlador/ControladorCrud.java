
package controlador;
import modelo.*;
import vista.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aleja
 */
public class ControladorCrud implements ActionListener{
    
    JFCrud vistaCRUD = new JFCrud();
    PersonaDAO modeloCRUD = new PersonaDAO();
    
    public ControladorCrud(JFCrud vistaCRUD, PersonaDAO modeloCRUD){
        this.modeloCRUD = modeloCRUD;
        this.vistaCRUD = vistaCRUD;
        this.vistaCRUD.btnRegistrar.addActionListener(this);
        this.vistaCRUD.btnListar.addActionListener(this);
        
    }
    
    public void inicializarCrud(){
        
    }
    
    public void LlenarTabla(JTable tablaD){
     DefaultTableModel modeloT  = new DefaultTableModel();
     tablaD.setModel(modeloT);
     
     modeloT.addColumn("DNI");
     modeloT.addColumn("APELLIDOS");
     modeloT.addColumn("NOMBRES");
     modeloT.addColumn("FECHA N");
     modeloT.addColumn("LUGAR N");
     
     Object[] columna = new Object[5];
     int numRegistros = modeloCRUD.listPersona().size();
     
        for (int i = 0; i < numRegistros; i++) {
           columna[0] = modeloCRUD.listPersona().get(i).getDni();
           columna[1] = modeloCRUD.listPersona().get(i).getApellidos();
           columna[2] = modeloCRUD.listPersona().get(i).getNombres();
           columna[3] = modeloCRUD.listPersona().get(i).getFechaN();
           columna[4] = modeloCRUD.listPersona().get(i).getLugarN();
           modeloT.addRow(columna);
        }
        
    }
    
    public void actionPerformed(ActionEvent e){
      if(e.getSource() == vistaCRUD.btnRegistrar){
          String dni = vistaCRUD.txtDni.getText();
          String apellidos = vistaCRUD.txtApellidos.getText();
          String nombres = vistaCRUD.txtNombres.getText();
          String lugar = vistaCRUD.txtBuscar.getText();
          
          SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
          String fecha = formatoFecha.format(vistaCRUD.jdFecha.getDate());
          String rptaRegistro = modeloCRUD.insertPersona(dni, apellidos, nombres, fecha, lugar);
          
          if(rptaRegistro!=null){
              JOptionPane.showMessageDialog(null, rptaRegistro);
              
          }else{
              
             JOptionPane.showMessageDialog(null, "Registro Erroneo."); 
          }
          
        }
        
      if(e.getSource()== vistaCRUD.btnListar){
          LlenarTabla(vistaCRUD.jtDatos);
      }
    }
    
    
}
