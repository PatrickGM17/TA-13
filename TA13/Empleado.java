package TA13;

public class Empleado extends Persona {
    private int dni;
    private float sueldo;

    public Empleado(String nombre, String genero, int edad, int dni, int sueldo){
        super(nombre,genero,edad);
        this.dni=dni;
        this.sueldo=sueldo;
    }
    public void MostrarDatos(){
        System.out.println("Nombre del empleado: "+getNombre());
        System.out.println("Genero: "+getGenero());
        System.out.println("Edad: "+getEdad());
        System.out.println("Dni: "+dni);
        System.out.println("Sueldo: "+sueldo);
    }
}
