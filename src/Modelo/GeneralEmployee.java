package Modelo;

import java.time.LocalDate;

public class GeneralEmployee extends Employee{
	private Camion camionAsignado;

	public GeneralEmployee(String name, int age, int idUser, int CP, String email, String phone, String password,
			LocalDate hiringDate, int salary, Camion camionAsignado) {
		super(name, age, idUser, CP, email, phone, password, hiringDate, salary);

	}

	public Camion getCamionAsignado() {
		return camionAsignado;
	}

	public void setCamionAsignado(Camion camionAsignado) {
		if(camion == null) {
			throw IllegalArgumentException("Todos los conductores debeten tener un camion asignado");
		}
		this.camionAsignado = camion;
	}
	
	
	

}
