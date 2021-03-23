//package publicacion;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AltaRevista extends JFrame{
    JPanel panel; 
    JTextField txtTitulo, txtPrecio, txtPaginas, txtISSN, txtNumero, txtAnio;
    JButton btnRegistrar, btnLimpiar, btnAtras;
    JLabel lblTitulo, lblPrecio, lblPaginas, lblISSN, lblNumero, lblAnio;
   // Publicaciones publi = new Publicaciones();
    public AltaRevista(){
       initComponents();
    }
   
    private void initComponents(){
      setSize(500, 200); 

      setTitle(" REGISTRAR REVISTA");
      btnRegistrar = new JButton ("REGISTRAR");
      btnLimpiar = new JButton("LIMPIAR");
      btnAtras = new JButton("ATRAS");
      JLabel lblTitulo = new JLabel("Titulo: ", JLabel.RIGHT);
      txtTitulo = new JTextField(30);
      JLabel lblPrecio = new JLabel("Precio: ", JLabel.RIGHT);
      txtPrecio = new JTextField(10);
      JLabel lblPaginas = new JLabel("Numero de Paginas: ", JLabel.RIGHT);
      txtPaginas = new JTextField(10);
      JLabel lblISSN = new JLabel("ISSN: ", JLabel.RIGHT);
      txtISSN = new JTextField(15);
      JLabel lblNumero = new JLabel("Numero: ", JLabel.RIGHT);
      txtNumero = new JTextField(10);
      JLabel lblAnio = new JLabel("Año: ", JLabel.RIGHT);
      txtAnio = new JTextField(10);
     
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
      add(lblISSN);
      add(txtISSN);
      add(lblNumero);
      add(txtNumero);
      add(lblAnio);
      add(txtAnio);

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
         }else if(txtISSN.getText()==null||txtISSN.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El ISSN es obligatorio","Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtISSN.requestFocus();
         }else if(txtNumero.getText()==null||txtNumero.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El numero es obligatorio","Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtNumero.requestFocus();
         }else if(txtAnio.getText()==null||txtAnio.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El año es obligatorio","Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtAnio.requestFocus();
         }else{
           // publi.agreRevista(txtTitulo.getText(),txtPrecio.getText(), txtPaginas.getText(), txtISSN.getText(),txtNumero.getText(),txtAnio.getText());
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
         txtISSN.setText(null);
         txtNumero.setText(null);
         txtAnio.setText(null);
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