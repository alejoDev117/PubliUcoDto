package co.edu.uco.dto;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilDateTime;
import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class CalificacionDTO {

	private UUID identificador;
	private LectorDTO lector;
	private PublicacionDTO publicacion;
	private Date fechaCalificacion;
	
	
	
	public CalificacionDTO(UUID identificador, LectorDTO lector, PublicacionDTO publicacion, Date fechaCalificacion) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setPublicacion(publicacion);
		setFechaCalificacion(fechaCalificacion);
	}



	public CalificacionDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setLector(LectorDTO.create());
		setPublicacion(PublicacionDTO.create());
		setFechaCalificacion(UtilDateTime.getDefaultValueDate());
	}


	public static CalificacionDTO create() {
		return new CalificacionDTO();
	}

	public final UUID getIdentificador() {
		return identificador;
	}



	public final CalificacionDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}



	public final LectorDTO getLector() {
		return lector;
	}



	public final CalificacionDTO setLector(LectorDTO lector) {
		this.lector = UtilObject.getDefault(lector, LectorDTO.create());
		return this;
	}



	public final PublicacionDTO getPublicacion() {
		return publicacion;
	}



	public final CalificacionDTO setPublicacion(PublicacionDTO publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionDTO.create());
		return this;
	}



	public final Date getFechaCalificacion() {
		return fechaCalificacion;
	}



	public final CalificacionDTO setFechaCalificacion(Date fechaCalificacion) {
		this.fechaCalificacion = UtilDateTime.getDefaultDate(fechaCalificacion);
		return this;
	}

	
	
	
	
}
