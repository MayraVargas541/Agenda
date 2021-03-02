import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;

public class PanelDatosAgenda extends JPanel implements ActionListener  {
  private JButton btnAceptar, btnCancelar, btnEliminar, btnModificar;
  private JTextField txtNombre, txtCorreo, txtTelefono, txtFCumple;
  ManejoPersona mpA = new ManejoPersona();
  JFrameMostrar jfm;
  
  public PanelDatosAgenda(){
    setLayout(new GridLayout(5,2));
    JLabel lblNombre = new JLabel("Nombre: ", JLabel.RIGHT);
    txtNombre = new JTextField(20);
    add(lblNombre);
    add(txtNombre);
    JLabel lblTelefono = new JLabel("Celular: ", JLabel.RIGHT);
    txtTelefono = new JTextField(15);
    add(lblTelefono);
    add(txtTelefono);
    JLabel lblCorreo = new JLabel("Correo: ", JLabel.RIGHT);
    txtCorreo = new JTextField(30);
    add(lblCorreo);
    add(txtCorreo);
    JLabel lblFCumple = new JLabel("F. Cumpleaños: ", JLabel.RIGHT);
    txtFCumple = new JTextField(8);
    add(lblFCumple);
    add(txtFCumple);
    
     
     btnAceptar = new JButton("Guardar");
     btnAceptar.addActionListener(this);
     btnCancelar = new JButton("Mostrar");
     btnCancelar.addActionListener(this);
     
     btnModificar = new JButton("Modificar");
     btnModificar.addActionListener(this);
     btnEliminar = new JButton("Eliminar");
     btnEliminar.addActionListener(this);    
     
     
    
    add(btnAceptar);
    add(btnCancelar);
    add(btnModificar);
    add(btnEliminar);
  }
  
   public void actionPerformed(ActionEvent e) {
     
        
     if (e.getSource()==btnAceptar) {
         if (txtNombre.getText()==null||txtNombre.getText().isEmpty())
          { 
            JOptionPane.showMessageDialog(null, "Debes colocar al menos el nombre",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);
           txtNombre.requestFocus();
          }
         else
           if(txtTelefono.getText()==null||txtTelefono.getText().isEmpty()) 
           {
           JOptionPane.showMessageDialog(null, "Debes capturar su telÃ©fono",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtTelefono.requestFocus();
            }  
          else
          {  
            mpA.agregar(txtNombre.getText(), txtTelefono.getText(), txtCorreo.getText(), txtFCumple.getText());
		  		JOptionPane.showMessageDialog(null, "Se guardaran los datos",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtNombre.setText(null);		
            txtTelefono.setText("");
            txtCorreo.setText("");
            txtFCumple.setText("");
            txtNombre.requestFocus();
          }
      }
		
      if (e.getSource()==btnCancelar) {
          jfm = new JFrameMostrar();
		}
	}
}