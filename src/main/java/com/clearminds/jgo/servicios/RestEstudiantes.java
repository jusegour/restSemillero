package com.clearminds.jgo.servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.clearminds.jgo.dtos.Estudiante;
import com.clearminds.jgo.excepciones.BDDException;

@Path("/estudiantes")
public class RestEstudiantes extends ServicioEstudiante {

	@Path("/insertar")
	@POST()
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Estudiante e) {
		try {
			insertarEstudiante(e);
		} catch (BDDException ex) {
			ex.printStackTrace();
		}
	}

	@Path("/actualizar")
	@PUT()
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void actualizar(Estudiante e) {
		try {
			actualizarEstudiante(e);
		} catch (BDDException ex) {
			ex.printStackTrace();
		}
	}
}
