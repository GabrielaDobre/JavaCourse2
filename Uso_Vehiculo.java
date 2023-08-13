package poo;

//import javax.swing.JOptionPane;

public class Uso_Vehiculo {

	public static void main(String[] args) {
	
		Coche miCoche1=new Coche();
		
		miCoche1.establece_color("Rojo");
		
		Furgoneta miFurgoneta1= new Furgoneta(7,580); //objeto furgoneta
		
		miFurgoneta1.establece_color("Azul");
		
		miFurgoneta1.configura_asientos("Sí");
		
		miFurgoneta1.configura_climatizador("Sí");
		
		System.out.println(miCoche1.dime_datos_generales()+ miCoche1.dime_color());
		
		System.out.println(miFurgoneta1.dime_datos_generales() + " " + miFurgoneta1.getDatosFurgoneta());
		
		
	}
	
	
}
				

		


	/*Coche Renault=new Coche(); //Instanciar una clase. Ejemplar de clase
	 
	System.out.println(Renault.dime_largo());
	
	Coche micoche= new Coche();
	
	micoche.establece_color(JOptionPane.showInputDialog("Introduce color"));
	
	System.out.println(micoche.dime_datos_generales());
	
	System.out.println(micoche.dime_color());
	
	micoche.configura_asientos("no");
	
	System.out.println(micoche.dime_asientos());
	
	micoche.configura_climatizador("si");
	
	System.out.println(micoche.dime_climatizador());
	
	System.out.println(micoche.dime_peso_coche());
	
	System.out.println("El precio final del coche es: " + micoche.precio_coche());
	
	System.out.println("Este coche tiene " + Renault.ruedas + " ruedas");
}*/