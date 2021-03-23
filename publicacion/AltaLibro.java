import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AltaLibro extends JFrame{
    JPanel panel; 
    JTextField txtTitulo, txtPrecio, txtPaginas, txtISBN, txtEdicion, txtAutor;
    JButton btnRegistrar, btnLimpiar, btnAtras;
    JLabel lblTitulo, lblPrecio, lblPaginas, lblISBN, lblEdicion, lblAutor;
    //ManejoPersona mpA = new ManejoPersona();
    //Mostrar mostrar = new Mostrar();
    
    public AltaLibro(){
       initComponents();
    }
   
    private void initComponents(){
      setSize(500, 200); 

      setTitle(" REGISTRAR LIBRO");
      btnRegistrar = new JButton ("REGISTRAR");
      btnLimpiar = new JButton("LIMPIAR");
      btnAtras = new JButton("ATRAS");
      JLabel lblTitulo = new JLabel("Titulo: ", JLabel.RIGHT);
      txtTitulo = new JTextField(30);
      JLabel lblPrecio = new JLabel("Precio: ", JLabel.RIGHT);
      txtPrecio = new JTextField(10);
      JLabel lblPaginas = new JLabel("Numero de Paginas: ", JLabel.RIGHT);
      txtPaginas = new JTextField(10);
      JLabel lblISBN = new JLabel("ISBN: ", JLabel.RIGHT);
      txtISBN = new JTextField(15);
      JLabel lblEdicion = new JLabel("Edición: ", JLabel.RIGHT);
      txtEdicion = new JTextField(10);
      JLabel lblAutor = new JLabel("Autor: ", JLabel.RIGHT);
      txtAutor = new JTextField(10);
     
      btnRegistrar.addMouseListener(new Registrar());
      btnLimpiar.addMouseListener(new Limpiar());
      btnAtras.addMouseListener(new Atras());
      
      
      setLayout(new GridLayout(8,2));

      add(lblTitulo);
      add(txtTitulo);
      add(lblPrecio);
      add(txtPrecio);
      add(lblPaginas);
      add(txtPaginas);
      add(lblISBN);
      add(txtISBN);
      add(lblEdicion);
      add(txtEdicion);
      add(lblAutor);
      add(txtAutor);

      add(btnRegistrar);
      add(btnLimpiar);
      add(btnAtras);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setLocationRelativeTo(null);
    }
    
    private void cerrar(){
      setVisible(false); 
    }
    
    private class Registrar extends MouseAdapter{
      public void mouseClicked(MouseEvent event){
         if(txtTitulo.getText()==null||txtTitulo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El Titulo es obligatorio","Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtTitulo.requestFocus();
         }else if(txtPrecio.getText()==null||txtPrecio.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El precio es obligatorio","Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtPrecio.requestFocus();
         
         }else if(txtPaginas.getText()==null||txtPaginas.getText().isEmpty()){
             JOptionPane.showMessageDialog(null, "Las paginas son obligatorias","Aviso", JOptionPane.INFORMATION_MESSAGE);
             txtPaginas.requestFocus();
         }else if(txtISBN.getText()==null||txtISBN.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El ISBN es obligatorio","Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtISBN.requestFocus();
         }else if(txtEdicion.getText()==null||txtEdicion.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "La edicion es obligatoria","Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtEdicion.requestFocus();
         }else if(txtAutor.getText()==null||txtAutor.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El autor es obligatorio","Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtAutor.requestFocus();
         }else{
            JOptionPane.showMessageDialog(null, "Se guardarán los datos","Aviso", JOptionPane.INFORMATION_MESSAGE);
            MenuAlta m = new MenuAlta();
            cerrar();  
         }
      }
   }
    
    private class Limpiar extends MouseAdapter{
      public void mouseClicked(MouseEvent event){
         txtTitulo.setText(null); 
         txtPrecio.setText(null);
         txtPaginas.setText(null);
         txtISBN.setText(null);
         txtEdicion.setText(null);
         txtAutor.setText(null);
         txtTitulo.requestFocus();
      }
    }
    
    private class Atras extends MouseAdapter{
      public void mouseClicked(MouseEvent event){
         MenuAlta m = new MenuAlta();
         cerrar();
      }
    }
    
}