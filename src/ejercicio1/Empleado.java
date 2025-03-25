package ejercicio1;

public class Empleado {
 	public static int count=1000; 
	private final int id;
	private String nombre;
	private int edad;
	public Empleado() {
		this.id= count;
		nombre="Sin Nombre";
		edad=99;
		count++;
	}
	public Empleado(String nombre,int edad) {
		this.id=count;
		this.nombre=nombre;
		this.edad=edad;
		count++;
		
	}
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Empleado: "+nombre+ ", Edad: "+edad+", Legajo: "+id;
	}
	public static  int devuelveProximoID() {
		return count+1;
	}
}
