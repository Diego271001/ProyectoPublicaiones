//Arreglo
package publicacion;
import java.util.*;
public class Principal3{
    public static void main(String []Args) {

      int ctrlpub = 0, op, opc;
      Scanner leer = new Scanner(System.in);
      Object publicaciones[] = new Object[5]; 
         
      do{   
         System.out.println("\n\n   MENU PRINCIPAL\n ");
         System.out.println(" 1) Dar de alta");
         System.out.println(" 2) Mostrar");
         System.out.println(" 3) Salir");
         System.out.print("\nIngrese una opcion: ");
         op = leer.nextInt();
           
         switch(op){
           
            case 1:
               do{
                  System.out.println("\n\n PUBLICACIONES\n");
                  System.out.println("   1) Revista");
                  System.out.println("   2) Periodico");
                  System.out.println("   3) Libro");
                  System.out.println("   4) ATRAS");
                  System.out.print("\nIngrese una opcion: ");
                  opc = leer.nextInt();
                  System.out.println();
                  leer.nextLine();
                  
                  switch(opc){                                          
                     case 1:
                        System.out.println(" °°° REVISTA °°°\n");
                        Revista revista = new Revista();
                        System.out.print("Titulo ");
                        revista.setTitulo(leer.nextLine());
                        System.out.print("$ ");
                        revista.setPrecio(leer.nextDouble());
                        System.out.print("# de paginas ");
                        revista.setNumpag(leer.nextInt());  
                        System.out.print("ISSN ");
                        revista.setISSN(leer.nextLine());  
                        System.out.print("# ");
                        revista.setNumero(leer.nextInt());        
                        System.out.print("Año ");
                        revista.setAnio(leer.nextInt()); 
                        publicaciones[ctrlpub++] = revista;
                        break;
                            
                     case 2:
                        System.out.println(" °°° PERIODICO °°°\n");
                        Periodico periodico = new Periodico();
                        System.out.print("Titulo ");
                        periodico.setTitulo(leer.nextLine());
                        System.out.print("$ "); 
                        periodico.setPrecio(leer.nextDouble());
                        System.out.print("# de paginas ");
                        periodico.setNumpag(leer.nextInt());
                        System.out.print("Secciones ");
                        periodico.setSecciones(leer.nextLine());
                        System.out.print("Editor ");
                        periodico.setEditor(leer.nextLine());
                        publicaciones[ctrlpub++] = periodico;
                        break;
                     
                     case 3:
                        System.out.println(" °°° LIBRO °°°\n");
                        Libro libro = new Libro();                       
                        System.out.print("Titulo ");
                        libro.setTitulo(leer.nextLine());
                        System.out.print("$ ");
                        libro.setPrecio(leer.nextDouble());
                        System.out.print("# de paginas ");
                        libro.setNumpag( leer.nextInt());
                        System.out.print("ISBN ");
                        libro.setISBN(leer.nextLine());            
                        System.out.print("Edición ");
                        libro.setEdicion(leer.nextLine());
                        System.out.print("Autor ");
                        libro.setAutor(leer.nextLine());
                        publicaciones[ctrlpub++] = libro;
                        break;
                        
                     case 4:
                        break;
                     
                     default:
                        System.out.println("\n\nIngrese una opcion valida :)");
                  }
               }while(opc != 4);
               break;
            
            case 2:
               for(int i = 0; i < ctrlpub; i ++){

                  if(publicaciones[i] instanceof Revista){
                     System.out.println("\n\n +++ REVISTAS +++\n");
                     Revista rev = (Revista) publicaciones[i];
                     System.out.println("Titulo: " + rev.getTitulo());
                     System.out.println("$ " + rev.getPrecio());
                     System.out.println("# de paginas: " + rev.getNumpag());
                     System.out.println("ISSN: " + rev.getISSN());
                     System.out.println("Numero: " + rev.getNumero());
                     System.out.println("Año: " + rev.getAnio());  
                     System.out.println("Periodicidad: " + rev.getPeriodicidad());
                  }else
                     if(publicaciones[i] instanceof Periodico){
                        System.out.println("\n\n +++ PERIODICOS +++\n");
                        Periodico per = (Periodico) publicaciones[i];
                        System.out.println("Titulo: " + per.getTitulo());
                        System.out.println("$ " + per.getPrecio());
                        System.out.println("# de paginas: " + per.getNumpag());
                        System.out.println("Secciones: " + per.getSecciones());
                        System.out.println("Editor: " + per.getEditor());
                        System.out.println("Periodicidad: " + per.getPeriodicidad());
                     }else{
                        System.out.println("\n\n +++ LIBROS +++\n");
                        Libro lib = (Libro) publicaciones[i];
                        System.out.println("Titulo: " + lib.getTitulo());
                        System.out.println("$ " + lib.getPrecio());
                        System.out.println("# de paginas: " + lib.getNumpag());
                        System.out.println("ISBN: " + lib.getISBN());
                        System.out.println("Edicion: " + lib.getEdicion());
                        System.out.println("Autor: " + lib.getAutor());
                     }
               }
               break;
            case 3:
               System.out.println("\nProgramador: Diego Alatorre Diaz ;)");
               System.exit(0);
            default:
               System.out.println("\nIngrese una opcion valida ............");
         }
      }while(op != 3);    
   }
}