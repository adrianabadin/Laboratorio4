package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Empleado[] uno = new Empleado[5];
for (Empleado empleado:uno) 
{
empleado = new  Empleado();
empleado.setEdad(55);
empleado.setNombre("Adrian");
System.out.println(empleado.toString());
System.out.println(Empleado.devuelveProximoID());
}
	}

}
