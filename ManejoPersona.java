import java.util.*;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
public class ManejoPersona{
   static ArrayList<Persona> Arrperson = new ArrayList<Persona>(); 
   private Persona objPersona;
   
   public ManejoPersona(){ 
   }
   
   public void agregar(String nom, String tel,String cor,String fcum){
    objPersona = new Persona();
    objPersona.setNombre(nom);
    objPersona.setTelefono(tel);
    objPersona.setCorreo(cor);
    objPersona.setFCumple(fcum);
    Arrperson.add(objPersona);//Agrega el objeto al arraylist
   }
   
   private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        //slecciona la fila
        int fila_seleccionada = this.tabla.getSelectedRow();

        //Si no hay una fila seleccionada, devuelve -1
        if (fila_seleccionada == -1) {
            JOptionPane.showMessageDialog(this, "No has seleccionado ninguna fila", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            //Cojo los datos de la fila
            String nombre = (String) modelo.getValueAt(fila_seleccionada, 0);
            int tel = (int) modelo.getValueAt(fila_seleccionada, 1);
            String correo = (String) modelo.getValueAt(fila_seleccionada, 2);
            String fCumple = (String) modelo.getValueAt(fila_seleccionada, 3);

            //Creo el contacto
            Persona aux = new Persona(nombre, tel, correo, fCumple);

            //Le paso el contacto que quiero borrar
            agenda.eliminarPersona(aux);

            //Rellena la tabla de nuevo
            rellenarTabla();

        }

    } 
	
  public ArrayList datos()
   {
     return Arrperson;
   }
   
   public void mostrar()
   {
     System.out.println("... Personas en la Agenda ...");
     Iterator<Persona> itrPersona = Arrperson.iterator();
     while(itrPersona.hasNext()){
	      Persona persona = itrPersona.next();
	    System.out.println(persona.getNombre() + "  "
			+ persona.getTelefono() + "  "
         + persona.getCorreo() + "  "
         + persona.getFCumple() + "  ");
      }
   }
  }
