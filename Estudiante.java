public class Estudiante { 
// Atributos del estudiante     
String nombre;  
String matricula;
double calificacion;
// Constructor para inicializar
//los datos del estudiante 
public Estudiante (String nombre,
String matricula, double calificacion){
this.nombre= nombre; 
this.matricula = matricula; 
this.calificacion = calificacion; 
}
//Metodo para mostrar la informacion del estudiante
public void mostrarInformacion(){
System.out.println("Nombre: " +nombre);
System.out.println("Matricula: " +matricula);
System.out.println("Calificacion:" + calificacion);
}
}
