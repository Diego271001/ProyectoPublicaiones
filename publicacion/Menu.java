import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Menu extends JFrame{
   static int opc;
    JPanel panel;
    JButton btnAlta, btnMostrar, btnSalir;
    JLabel lblTitulo;
    
    public Menu(){
       initComponents();
    }
   
    private void initComponents(){
      setSize(200, 200); 
      JLabel lblTitulo = new JLabel("  Selecciona una opcion: ");
      btnAlta = new JButton ("Dar de Alta");
      btnMostrar = new JButton("Mostrar");
      btnSalir = new JButton("Salir");
      
      btnAlta.addMouseListener(new alta());
      btnMostrar.addMouseListener(new mostrar());
      btnSalir.addMouseListener(new salir());
      
      setLayout(new GridLayout(4,1));
      setTitle("MENU PRINCIPAL");
      add(lblTitulo);
      add(btnAlta);
      add(btnMostrar);
      add(btnSalir);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setLocationRelativeTo(null);
    }
    
    private void cerrar(){
      setVisible(false);
    }
    
    private class alta extends MouseAdapter{
      public void mouseClicked(MouseEvent event){
         cerrar();
         MenuAlta alta = new MenuAlta(); 
      }
    }
    
    private class mostrar extends MouseAdapter{
      public void mouseClicked(MouseEvent event){
         cerrar();
         //Mostrar mos= new Mostrar();
      }
    }
    
    private class salir extends MouseAdapter{
      public void mouseClicked(MouseEvent event){
         JOptionPane.showMessageDialog(null, "Diego Alatorre Diaz ;)","PROGRAMADOR", JOptionPane.WARNING_MESSAGE);
         System.exit(0);
      }
    }
   
}
