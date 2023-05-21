package co.edu.uco.dto;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilDateTime;
import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class ObservacionRevisionDTO {
	
	private UUID identificador;
	private EscritorPublicacionDTO escritor;
	private ComentarioRevisorDTO comentario;
	private Date fechaReporteObservacion;
	private Date fechaRevisionObservacion;
	private EstadoObservacionRevisorDTO estado;
	private String observacion;
	
	
	
	
	
	
	public ObservacionRevisionDTO(UUID identificador, EscritorPublicacionDTO escritor, ComentarioRevisorDTO comentario,
			Date fechaReporteObservacion, Date fechaRevisionObservacion, EstadoObservacionRevisorDTO estado,
			String observacion) {
		super();
		setIdentificador(identificador);
		setEscritor(escritor);
		setComentario(comentario);
		setFechaReporteObservacion(fechaReporteObservacion);
		setFechaRevisionObservacion(fechaRevisionObservacion);
		setEstado(estado);
		setObservacion(observacion);
	}






	public ObservacionRevisionDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setEscritor(EscritorPublicacionDTO.create());
		setComentario(ComentarioRevisorDTO.create());
		setFechaReporteObservacion(UtilDateTime.getDefaultValueDate());
		setFechaRevisionObservacion(UtilDateTime.getDefaultValueDate());
		setEstado(EstadoObservacionRevisorDTO.create());
		setObservacion(UtilText.getUtilText().getDefaultValue());
	}


	public static ObservacionRevisionDTO create() {
		return new ObservacionRevisionDTO();
	}



	public final UUID getIdentificador() {
		return identificador;
	}






	public final ObservacionRevisionDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}






	public final EscritorPublicacionDTO getEscritor() {
		return escritor;
	}






	public final ObservacionRevisionDTO setEscritor(EscritorPublicacionDTO escritor) {
		this.escritor = UtilObject.getDefault(escritor, EscritorPublicacionDTO.create());
		return this;
	}






	public final ComentarioRevisorDTO getComentario() {
		return comentario;
	}






	public final ObservacionRevisionDTO setComentario(ComentarioRevisorDTO comentario) {
		this.comentario = UtilObject.getDefault(comentario, ComentarioRevisorDTO.create());
		return this;
	}






	public final Date getFechaReporteObservacion() {
		return fechaReporteObservacion;
	}






	public final ObservacionRevisionDTO setFechaReporteObservacion(Date fechaReporteObservacion) {
		this.fechaReporteObservacion = UtilDateTime.getDefaultDate(fechaReporteObservacion);
		return this;
	}






	public final Date getFechaRevisionObservacion() {
		return fechaRevisionObservacion;
	}






	public final ObservacionRevisionDTO setFechaRevisionObservacion(Date fechaRevisionObservacion) {
		this.fechaRevisionObservacion = UtilDateTime.getDefaultDate(fechaRevisionObservacion);
		return this;
	}






	public final EstadoObservacionRevisorDTO getEstado() {
		return estado;
	}






	public final ObservacionRevisionDTO setEstado(EstadoObservacionRevisorDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoObservacionRevisorDTO.create());
		return this;
	}






	public final String getObservacion() {
		return observacion;
	}






	public final ObservacionRevisionDTO setObservacion(String observacion) {
		this.observacion = UtilText.getUtilText().applyTrim(observacion);
		return this;
	}
	
	
	

}
