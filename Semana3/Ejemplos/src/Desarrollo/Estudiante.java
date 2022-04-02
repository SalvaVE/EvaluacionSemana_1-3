package Desarrollo;

public class Estudiante {
    private  long carnetEstudiante;
    private String nombresEstudiante;
    private String apellidosEstudiantes;

    public long getCarnetEstudiante() {
        return carnetEstudiante;
    }

    public void setCarnetEstudiante(long carnetEstudiante) {
        this.carnetEstudiante = carnetEstudiante;
    }

    public String getNombresEstudiante() {
        return nombresEstudiante;
    }

    public void setNombresEstudiante(String nombresEstudiante) {
        this.nombresEstudiante = nombresEstudiante;
    }

    public String getApellidosEstudiantes() {
        return apellidosEstudiantes;
    }

    public void setApellidosEstudiantes(String apellidosEstudiantes) {
        this.apellidosEstudiantes = apellidosEstudiantes;
    }

   public void registroEstudiante(){
       System.out.println("Metodo para registro de estudiante:");
   }
    public void consultarEstudiante(){
       System.out.println("Metodo para registro de estudiante:");
   }
     public void eliminarEstudiante(){
       System.out.println("Metodo para registro de estudiante:");
    }
   
    public static void main(String[] args) {
    Estudiante est = new Estudiante(); // El objecto est es la instancia de la clase Estudiante
    est.carnetEstudiante = 1234; //Asignar los valores a cada uno de los atributos est.carnet Objeto mas atributo
    est.nombresEstudiante = "Graciela";
    est.apellidosEstudiantes = "Hernandez";
    
        est.registroEstudiante();
        est.consultarEstudiante();
        est.eliminarEstudiante();
    
    
        System.out.println("Carnet   : " + est.carnetEstudiante);//el objeto y el atributo est.carnet
        System.out.println("Nombre   : " + est.nombresEstudiante);
        System.out.println("Apellido : " + est.apellidosEstudiantes);
        
    }
      
}
