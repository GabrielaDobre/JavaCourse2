package poo;
import java.util.*;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Empleado empleado1=new Empleado("Paco Gómez" , 85000, 1990,12,17);
		
		Empleado empleado2=new Empleado("Ana López", 95000, 1995,06,02);
		
		Empleado empleado3=new Empleado("María Martín", 105000, 2002,03,15);
		
		empleado1.setSueldo(5);
		
		empleado2.setSueldo(5);
		
		empleado3.setSueldo(5);
		
		System.out.println("Nombre: " + empleado1.getNombre() + " Sueldo: " + empleado1.getSueldo() 
		 + " Fecha de Alta: " + empleado1.getFechaContrato());
		
		System.out.println("Nombre: " + empleado2.getNombre() + " Sueldo: " + empleado2.getSueldo() 
		 + " Fecha de Alta: " + empleado2.getFechaContrato());
		
		System.out.println("Nombre: " + empleado3.getNombre() + " Sueldo: " + empleado3.getSueldo() 
		 + " Fecha de Alta: " + empleado3.getFechaContrato());*/
		
		
		
		Empleado[] misEmpleados=new Empleado[4];
		
		misEmpleados[0]=new Empleado ("Paco Gómez", 85000, 1990, 12 ,17);
		
		misEmpleados[1]=new Empleado ("Ana López", 95000, 1995, 06 ,02);
		
		misEmpleados[2]=new Empleado ("Ana Martín", 105000, 2002, 03 ,15);
		
		misEmpleados[3]=new Empleado ("Patricia Núñez");
		
		
		
		/*for(int i=0;i<3;i++) {
			
			misEmpleados[i].setSueldo(5);
		}*/
		
		for(Empleado e: misEmpleados) { //bucle for mejorado
			
			e.setSueldo(5);
		}
		
		/*for(int i=0;i<3;i++) {
			
			System.out.println("Nombre: " + misEmpleados[i].getNombre()
			+ " Sueldo: " + misEmpleados[i].getSueldo()
			+" Fecha de Alta: " + misEmpleados[i].getFechaContrato());
		}*/
		
		for(Empleado e: misEmpleados) {
			
			System.out.println("Nombre: " + e.getNombre()
					+ " Sueldo: " + e.getSueldo()
					+" Fecha de Alta: " + e.getFechaContrato());
		}
	}
	
	

}

class Empleado{
	
	public Empleado(String nom, double sue, int anyo, int mes, int dia) {//constructor con parámetros
	
		nombre=nom;
		
		sueldo=sue;
		
		GregorianCalendar calendario=new GregorianCalendar(anyo, mes-1, dia);
		
		altaContrato=calendario.getTime();
	
	}
	
	public Empleado(String nom) { 
		
		this(nom, 30000,2000,01,01); //este this llama al otro constructor para que le dé los parámetros necesarios
	}
	
	public String getNombre() { //Getter
		
		return nombre;
	}
	
	public double getSueldo() { //Getter
		
		return sueldo;
	}
	
	public Date getFechaContrato() { //Getter
		
		return altaContrato;
	}
	
	public void setSueldo(double porcentaje) { //Setter
		
		double aumento=sueldo*porcentaje/100;
		
		sueldo+=aumento;
	}
	
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;
	
}
