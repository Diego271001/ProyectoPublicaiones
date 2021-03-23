import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AltaPeriodico extends JFrame{
    JPanel panel; 
    JTextField txtTitulo, txtPrecio, txtPaginas, txtSecciones, txtEditor;
    JButton btnRegistrar, btnLimpiar, btnAtras;
    JLabel lblTitulo, lblPrecio, lblPaginas, lblSecciones, lblEditor;
    //ManejoPersona mpA = new ManejoPersona();
    //Mostrar mostrar = new Mostrar();
    
    public AltaPeriodico(){
       initComponents();
    }
   
    private void initComponents(){
      setSize(500, 200); 

      setTitle(" REGISTRAR PERIODICO");
      btnRegistrar = new JButton ("REGISTRAR");
      btnLimpiar = new JButton("LIMPIAR");
      btnAtras = new JButton("ATRAS");
      JLabel lblTitulo = new JLabel("Titulo: ", JLabel.RIGHT);
      txtTitulo = new JTextField(30);
      JLabel lblPrecio = new JLabel("Precio: ", JLabel.RIGHT);
      txtPrecio = new JTextField(10);
      JLabel lblPaginas = new JLabel("Numero de Paginas: ", JLabel.RIGHT);
      txtPaginas = new JTextField(10);
      JLabel lblSecciones = new JLabel("Secciones: ", JLabel.RIGHT);
      txtSecciones = new JTextField(15);
      JLabel lblEditor = new JLabel("Editor: ", JLabel.RIGHT);
      txtEditor = new JTextField(30);
     
      btnRegistrar.addMouseListener(new Registrar());
      btnLimpiar.addMouseListener(new Limpiar());
      btnAtras.addMouseListener(new Atras());
      
      
      setLayout(new GridLayout(7,2));

      add(lblTitulo);
      add(txtTitulo);
      add(lblPrecio);
      add(txtPrecio);
      add(lblPaginas);
      add(txtPaginas);
      add(lblSecciones);
      add(txtSecciones);
      add(lblEditor);
      add(txtEditor);

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
         }else if(txtSecciones.getText()==null||txtSecciones.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Las secciones son obligatorias","Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtSecciones.requestFocus();
         }else if(txtEditor.getText()==null||txtEditor.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El editor es obligatorio","Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtEditor.requestFocus();
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
         txtSecciones.setText(null);
         txtEditor.setText(null);
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