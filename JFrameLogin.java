import javax.swing.*;
import java.awt.*;

public class JFrameLogin extends JFrame
{
  Login lg = new Login();
  
  public JFrameLogin()
   {   
      initComponents();
   }
   
   private void initComponents()
   {
      setSize(300, 200);
      setLocationRelativeTo(null);
      lg.setBackground(Color.lightGray);
      setTitle("Usuario y contraseña");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setContentPane(lg);
      setVisible(true);
       
   }   
}
