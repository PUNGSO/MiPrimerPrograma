public class AlumnoUS {

    int Edad;
    String Nombre;
    String Apellidos;
    
    public void inscripcionAlumnoUS(){
    System.out.println ("Inscribiremos al alumno");
    }

    public String CalificacionAlumnoUS(int califMatematicas, int califEspanol){
        int suma = califMatematicas + califEspanol;
        float promedio = suma/2;

        return " Promedio es:" + promedio;
    }

}
