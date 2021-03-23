import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MenuAlta extends JFrame{
   static int opc;
    JPanel panel;
    JButton btnRevista, btnPeriodico, btnLibro, btnAtras;
    JLabel lblTitulo;
    
    public MenuAlta(){
       initComponents();
    }
   
    private void initComponents(){
      setSize(250, 200); 
      JLabel lblTitulo = new JLabel("  Selecciona el tipo de publicación: ");
      btnRevista = new JButton (" REVISTA");
      btnPeriodico = new JButton (" PERIODICO");
      btnLibro = new JButton (" LIBRO");
      btnAtras = new JButton("Atras");
      
      btnRevista.addMouseListener(new revista());
      btnPeriodico.addMouseListener(new periodico());
      btnLibro.addMouseListener(new libro());
      btnAtras.addMouseListener(new atras());
      
      setLayout(new GridLayout(5,1));
      setTitle("MENU PRINCIPAL");
      add(lblTitulo);
      add(btnRevista);
      add(btnPeriodico);
      add(btnLibro);
      add(btnAtras);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setLocationRelativeTo(null);
    }
    
    private void cerrar(){
      setVisible(false);
    }
    
    private class revista extends MouseAdapter{
      public void mouseClicked(MouseEvent event){
         cerrar();
         AltaRevista a = new AltaRevista(); 
      }
    }
    
    private class periodico extends MouseAdapter{
      public void mouseClicked(MouseEvent event){
         cerrar();
         AltaPeriodico p = new AltaPeriodico();
      }
    }
    
    private class libro extends MouseAdapter{
      public void mouseClicked(MouseEvent event){
         cerrar();
         AltaLibro l = new AltaLibro();
      }
    }
    private class atras extends MouseAdapter{
      public void mouseClicked(MouseEvent event){
         cerrar();
         Menu menu= new Menu();
      }
    }
   
}
