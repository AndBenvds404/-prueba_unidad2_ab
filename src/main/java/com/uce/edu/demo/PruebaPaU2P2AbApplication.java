package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.hospital.modelo.Doctor;
import com.uce.edu.demo.hospital.modelo.Paciente;
import com.uce.edu.demo.hospital.modelo.PacienteTo;
import com.uce.edu.demo.hospital.service.IDoctorService;
import com.uce.edu.demo.hospital.service.IGestorCitaMedicaService;
import com.uce.edu.demo.hospital.service.IPacienteService;

@SpringBootApplication
public class PruebaPaU2P2AbApplication  implements CommandLineRunner {
	
	Logger LOG = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	@Autowired
	private IDoctorService iDoctorService;
	@Autowired
	private IPacienteService iPacienteService;
	@Autowired
	private IGestorCitaMedicaService iGestorCitaMedicaService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaPaU2P2AbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		LOG.info("hola prueba");
		
		//ingreso 2 pacientes
		Paciente p = new Paciente();
		p.setApellido("Benavides");
		p.setCedula("1727000007");
		p.setCodigoSeguro("1234567890");
		p.setEstatura(1.70);
		p.setFechaNacimiento(LocalDateTime.of(1999, 02, 01, 23, 24));
		p.setGenero("masculino");
		p.setNombre("Andres");
		p.setPeso(60.0);
		
		Paciente p2 = new Paciente();
		p2.setApellido("Ruiz");
		p2.setCedula("172700001");
		p2.setCodigoSeguro("0987654321");
		p2.setEstatura(1.80);
		p2.setFechaNacimiento(LocalDateTime.of(2000, 12, 01, 23, 24));
		p2.setGenero("fenemino");
		p2.setNombre("Lupe");
		p2.setPeso(50.0);
		
//		this.iPacienteService.insertar(p);
//		this.iPacienteService.insertar(p2);
		
		//ingreso 2 doctores
		
		Doctor d = new Doctor();
		d.setApellido("Nuñes");
		d.setCedula("1272737317");
		d.setFechaNacimiento(LocalDateTime.of(1992, 2, 12, 4, 12));
		d.setGenero("masculino");
		d.setNombre("Ramon");
		d.setNumeroConsultorio("A1");
		
		Doctor d2= new Doctor();
		d2.setApellido("Vargas");
		d2.setCedula("1271313124");
		d2.setFechaNacimiento(LocalDateTime.of(1991, 12, 13, 7, 15));
		d2.setGenero("femenino");
		d2.setNombre("Silvia");
		d2.setNumeroConsultorio("A2");
//		this.iDoctorService.insertar(d);
//		this.iDoctorService.insertar(d2);

		//agendar una cita medica
		this.iGestorCitaMedicaService.AgendamientoCitaMedica("c4", LocalDateTime.now(), new BigDecimal(20), "centro de salud Calderon", "1272737317", "1727000007");
		//actualizatr la cita medica
		this.iGestorCitaMedicaService.actualizarCitaMedica ("c4", "Covid", "Hibuprofeno", LocalDateTime.of(2022, 10, 15, 9, 0));
		//reporte paciente
		List<PacienteTo> listaPacientes = this.iGestorCitaMedicaService.reportePaciente(LocalDateTime.of(1990, 10, 24, 1, 30), "masculino");
		for(PacienteTo paciente : listaPacientes) {
			LOG.info("Paciente genero, fecha: "+paciente);
			
		}
		
	}

}
