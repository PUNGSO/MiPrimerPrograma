public class App {
    public static void main(String[] args) throws Exception {
        String CadenaDeCaracteres = "Hello JD, Bienvenido a Programacion Java!";
        System.out.println(CadenaDeCaracteres);

        AlumnoUS alumno = new AlumnoUS();
        alumno.Nombre = "JUAN DE DIOS";
        alumno.Edad = 26;
        alumno.Apellidos = " PEREZ COLLAZO";

        System.out.println (" El alumno se llama:" + alumno.Apellidos + " " + alumno.Nombre + " " + "y tiene:" + alumno.Edad +" "+ "años");
        System.out.println("");

        alumno.inscripcionAlumnoUS();

        System.out.println(" Alumno: " + alumno.Nombre + " " + alumno.CalificacionAlumnoUS(9, 10));


    }
}
 