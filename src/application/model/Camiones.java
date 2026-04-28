package application.model;

import java.util.Scanner;

public class Camiones {
	
	private String matriculaCamion;
	private String typeBus, zonaAsignada, empleadoManejo;
	
	//----------CONSTRUCTOR----------
	public Camiones(String matriculaCamion, String typeBus, String empleadoManejo, String zonaAsignada ) {
		String matriculaCam = matriculaCamion.toUpperCase();
		
		typeBus = "Organico";
		setMatriculaCamion(matriculaCam);
		setTypeBus(typeBus);
		
		this.empleadoManejo = empleadoManejo;
		this.zonaAsignada = zonaAsignada;
		
		
				
		
		
	}
	
	
	
	
	//--------------- METODOS MatriculaCamion Get y Set -----------------
	
	private final String getMatriculaCamion(){
		
		return matriculaCamion;
		
	}
	
	
	// Este setter hace una validacion para saber si deja entrar la matricula al constructor.
	
	private void setMatriculaCamion(String matriculaCamion){
		int contador = matriculaCamion.length();
		
		if(contador == 7 || contador == 6) {
			this.matriculaCamion = matriculaCamion;
			System.out.print("Se a agregado correctamente");

		} else {throw new IllegalArgumentException("La Matricula tiene que tener de 6 a 7 - digitos Intentalo de nuevo."); }		
		
	}
	
	
	
	
	
	//--------------- methods typeBus Get and Set -----------------
	
	
	private final String getTypeBus() {
		
		return typeBus;
	}
	
	
	
	private void setTypeBus(String typeBus){
		
		
		switch(typeBus) {
		
		case "Organico":
		case "Inorganico":
		case "Reciclable":
			
			this.typeBus = typeBus;
		    break;
		    
		default: throw new IllegalArgumentException("El tipo de bus No existe");
		
		}
		
	}
	
	

	
	

}
