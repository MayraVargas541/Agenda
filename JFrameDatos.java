import javax.swing.*;
import java.awt.*;

public class JFrameDatos extends JFrame
{
   PanelDatosAgenda PDA = new PanelDatosAgenda();
      public JFrameDatos()
   {     initComponents();
   }
   
   private void initComponents()
   {
      setSize(500, 500);
      setLocationRelativeTo(null);
      PDA.setBackground(Color.ORANGE);
      setTitle("Datos Personales");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setContentPane(PDA);
      setVisible(true);
   }   
}
