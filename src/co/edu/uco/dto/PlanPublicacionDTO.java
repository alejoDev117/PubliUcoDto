package co.edu.uco.dto;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilDateTime;
import co.edu.uco.crosscutting.utils.UtilNumeric;
import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class PlanPublicacionDTO {

	private UUID identificador;
	private PublicacionDTO publicacion;
	private float precio;
	private Date fechaDesde;
	private Date fechaFin;
	
	
	
	
	public PlanPublicacionDTO(UUID identificador, PublicacionDTO publicacion, float precio, Date fechaDesde,
			Date fechaFin) {
		super();
		setIdentificador(identificador);
		setPublicacion(publicacion);
		setPrecio(precio);
		setFechaDesde(fechaDesde);
		setFechaFin(fechaFin);
	}




	public PlanPublicacionDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setPublicacion(PublicacionDTO.create());
		setPrecio(UtilNumeric.getDefaultFloatValue());
		setFechaDesde(UtilDateTime.getDefaultValueDate());
		setFechaFin(UtilDateTime.getDefaultValueDate());
	}


	public static PlanPublicacionDTO create() {
		return new PlanPublicacionDTO();
	}
	
	

	public final UUID getIdentificador() {
		return identificador;
	}




	public final PlanPublicacionDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}




	public final PublicacionDTO getPublicacion() {
		return publicacion;
	}




	public final PlanPublicacionDTO setPublicacion(PublicacionDTO publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionDTO.create());
		return this;
	}




	public final float getPrecio() {
		return precio;
	}




	public final PlanPublicacionDTO setPrecio(float precio) {
		this.precio = UtilNumeric.getDefaultValueFloat(precio);
		return this;
	}




	public final Date getFechaDesde() {
		return fechaDesde;
	}




	public final PlanPublicacionDTO setFechaDesde(Date fechaDesde) {
		this.fechaDesde = UtilDateTime.getDefaultDate(fechaDesde);
		return this;
	}




	public final Date getFechaFin() {
		return fechaFin;
	}




	public final PlanPublicacionDTO setFechaFin(Date fechaFin) {
		this.fechaFin = UtilDateTime.getDefaultDate(fechaFin);
		return this;
	}
	
	
	
	
	
}
