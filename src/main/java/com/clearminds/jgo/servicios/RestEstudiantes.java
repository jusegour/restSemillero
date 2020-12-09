package com.clearminds.jgo.servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.clearminds.jgo.dtos.Estudiante;

@Path("/estudiantes")
public class RestEstudiantes {

	@Path("/insertar")
	@POST()
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Estudiante e){
		System.out.println(e);
	}
}
