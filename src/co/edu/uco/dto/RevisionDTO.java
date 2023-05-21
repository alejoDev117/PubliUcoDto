package co.edu.uco.dto;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilDateTime;
import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class RevisionDTO {

	private UUID identificador;
	private VersionDTO version;
	private TipoRevisionDTO tipo;
	private  Date fechaSolicitudRevision;
	private Date fechaLimiteRevision;
	private Date fechaCompletitudRevision;
	private EstadoRevisionDTO estado;
	
	
	
	
	
	
	public RevisionDTO(UUID identificador, VersionDTO version, TipoRevisionDTO tipo, Date fechaSolicitudRevision,
			Date fechaLimiteRevision, Date fechaCompletitudRevision, EstadoRevisionDTO estado) {
		super();
		setIdentificador(identificador);
		setVersion(version);
		setTipo(tipo);
		setFechaSolicitudRevision(fechaSolicitudRevision);
		setFechaLimiteRevision(fechaLimiteRevision);
		setFechaCompletitudRevision(fechaCompletitudRevision);
		setEstado(estado);
	}






	public RevisionDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setVersion(VersionDTO.create());
		setTipo(TipoRevisionDTO.create());
		setFechaSolicitudRevision(UtilDateTime.getDefaultValueDate());
		setFechaLimiteRevision(UtilDateTime.getDefaultValueDate());
		setFechaCompletitudRevision(UtilDateTime.getDefaultValueDate());
		setEstado(EstadoRevisionDTO.create());
	}
	



	public static RevisionDTO create() {
		return new RevisionDTO();
	}


	public final UUID getIdentificador() {
		return identificador;
	}






	public final RevisionDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}






	public final VersionDTO getVersion() {
		return version;
	}






	public final RevisionDTO setVersion(VersionDTO version) {
		this.version = UtilObject.getDefault(version, VersionDTO.create());
		return this;
	}






	public final TipoRevisionDTO getTipo() {
		return tipo;
	}






	public final RevisionDTO setTipo(TipoRevisionDTO tipo) {
		this.tipo = UtilObject.getDefault(tipo, TipoRevisionDTO.create());
		return this;
	}






	public final Date getFechaSolicitudRevision() {
		return fechaSolicitudRevision;
	}






	public final RevisionDTO setFechaSolicitudRevision(Date fechaSolicitudRevision) {
		this.fechaSolicitudRevision = UtilDateTime.getDefaultDate(fechaSolicitudRevision);
		return this;
	}






	public final Date getFechaLimiteRevision() {
		return fechaLimiteRevision;
	}






	public final RevisionDTO setFechaLimiteRevision(Date fechaLimiteRevision) {
		this.fechaLimiteRevision = UtilDateTime.getDefaultDate(fechaLimiteRevision);
		return this;
	}






	public final Date getFechaCompletitudRevision() {
		return fechaCompletitudRevision;
	}






	public final RevisionDTO setFechaCompletitudRevision(Date fechaCompletitudRevision) {
		this.fechaCompletitudRevision = UtilDateTime.getDefaultDate(fechaCompletitudRevision);
		return this;
	}






	public final EstadoRevisionDTO getEstado() {
		return estado;
	}






	public final RevisionDTO setEstado(EstadoRevisionDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoRevisionDTO.create());
		return this;
	}

	 	
	
	
}
