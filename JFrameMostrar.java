import javax.swing.*;
import java.awt.*;

public class JFrameMostrar extends JFrame
{
   MostrarDatos mostrar = new MostrarDatos();
   
    public JFrameMostrar()
   {  
      //super.setVisible(false);
     //super.dispose();
      initComponents();
   }
   
   private void initComponents()
   {
      //super.setVisible(false);
      //super.dispose();
      setSize(400, 300);
      setLocationRelativeTo(null);
      setTitle("Contactos Registrados");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setContentPane(mostrar);
      setVisible(true);
       
   }   
}
