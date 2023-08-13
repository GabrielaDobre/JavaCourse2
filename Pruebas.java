package poo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Empleados trabajador1=new Empleados("Santi");
		
		Empleados trabajador2=new Empleados("Gabriela");
		
		trabajador1.setSeccion("RRHH");
		
		
		
		System.out.println(trabajador1.getDatos()+ "\n"+ trabajador2.getDatos());
		
		System.out.println(Empleados.dameIdSiguiente()); //para llamar a un metodo static
		
		
	}

}


class Empleados{
	
	public Empleados(String nom) {  //constructor
		
		nombre=nom;
		seccion="Administración";
		Id=idSiguiente;
		
		idSiguiente++;
		
	}
	
	public void setSeccion(String seccion) {
		
		this.seccion=seccion;
	}
	
	public String getDatos() {
		
		return "El nombre es: " + nombre + " y la sección es " + seccion + " y el Id= "+ Id;
	}
	
	public static String dameIdSiguiente() {
		
		return "El IdSiguiente es: " + idSiguiente;
	}
	private final String nombre; //final para asegurarse que no se podrá cambiar el valor de la constante
	
	private String seccion;
	
	private int Id;
	
	private static int idSiguiente=1;
}