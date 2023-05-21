package co.edu.uco.dto;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilDateTime;
import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class RevisionRevisorDTO {

	private UUID identificador;
	private RevisionDTO revision;
	private RevisorDTO revisor;
	private Date fechaAsignacionRevision;
	private Date fechaCompletitudRevision;
	private EstadoRevisionDTO estado;
	
	
	
	
	
	public RevisionRevisorDTO(UUID identificador, RevisionDTO revision, RevisorDTO revisor,
			Date fechaAsignacionRevision, Date fechaCompletitudRevision, EstadoRevisionDTO estado) {
		super();
	setIdentificador(identificador);
	setRevision(revision);
	setRevisor(revisor);
	setFechaAsignacionRevision(fechaAsignacionRevision);
	setFechaCompletitudRevision(fechaCompletitudRevision);
	setEstado(estado);
	}





	public RevisionRevisorDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setRevision(RevisionDTO.create());
		setRevisor(RevisorDTO.create());
		setFechaAsignacionRevision(UtilDateTime.getDefaultValueDate());
		setFechaCompletitudRevision(UtilDateTime.getDefaultDate(fechaAsignacionRevision));
		setEstado(EstadoRevisionDTO.create());
	}


	public static RevisionRevisorDTO create() {
		return new RevisionRevisorDTO();
	}


	public final UUID getIdentificador() {
		return identificador;
	}





	public final RevisionRevisorDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}





	public final RevisionDTO getRevision() {
		return revision;
	}





	public final RevisionRevisorDTO setRevision(RevisionDTO revision) {
		this.revision = UtilObject.getDefault(revision, RevisionDTO.create());
		return this;
	}





	public final RevisorDTO getRevisor() {
		return revisor;
	}





	public final RevisionRevisorDTO setRevisor(RevisorDTO revisor) {
		this.revisor = UtilObject.getDefault(revisor, RevisorDTO.create());
		return this;
	}





	public final Date getFechaAsignacionRevision() {
		return fechaAsignacionRevision;
	}





	public final RevisionRevisorDTO setFechaAsignacionRevision(Date fechaAsignacionRevision) {
		this.fechaAsignacionRevision = UtilDateTime.getDefaultDate(fechaAsignacionRevision);
		return this;
	}





	public final Date getFechaCompletitudRevision() {
		return fechaCompletitudRevision;
	}





	public final RevisionRevisorDTO setFechaCompletitudRevision(Date fechaCompletitudRevision) {
		this.fechaCompletitudRevision = UtilDateTime.getDefaultDate(fechaCompletitudRevision);
		return this;
	}





	public final EstadoRevisionDTO getEstado() {
		return estado;
	}





	public final RevisionRevisorDTO setEstado(EstadoRevisionDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoRevisionDTO.create());
		return this;
	}

	
	
	
	
}

