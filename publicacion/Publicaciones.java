package publicacion;
import java.util.*;
public class Publicaciones{

   static Object publicaciones [] = new Object[10]; 
   static int ctrlpub = 0;
   public Publicaciones(){  }
   
   public void agreRevista(String titulo, double precio, int paginas, String ISSN, int numero, int anio){
          Revista revista = new Revista();

          revista.setTitulo(titulo);
          revista.setPrecio(precio);
          revista.setNumpag(paginas);
          revista.setISSN(ISSN);
          revista.setNumero(numero);
          revista.setAnio(anio);
          
          publicaciones[ctrlpub] = revista;

          ctrlpub++;
   }
	

}