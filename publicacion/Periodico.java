package publicacion;
public class Periodico extends Publicacion implements Periodicidad{

   private String secciones;
   private String editor;
    
   public String getSecciones(){
      return secciones;
   }
    
   public void setSecciones(String seccio){
      secciones = seccio;
   }
    
   public String getEditor(){
      return editor;
   }
    
   public void setEditor(String edi){
      editor = edi;
   }

   @Override
   public String getPeriodicidad(){
      return periodicidad;
   }
}