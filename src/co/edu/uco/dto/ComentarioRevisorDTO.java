package co.edu.uco.dto;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class ComentarioRevisorDTO {

	private UUID identificador;
	private RevisionRevisorDTO revisionRevisor;
	private TipoComentarioRevisorDTO tipoComentario;
	private String comentario;
	
	
	
	
	public ComentarioRevisorDTO(UUID identificador, RevisionRevisorDTO revisionRevisor,
			TipoComentarioRevisorDTO tipoComentario, String comentario) {
		super();
		setIdentificador(identificador);
		setRevisionRevisor(revisionRevisor);
		setTipoComentario(tipoComentario);
		setComentario(comentario);
	}




	public ComentarioRevisorDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setRevisionRevisor(RevisionRevisorDTO.create());
		setTipoComentario(TipoComentarioRevisorDTO.create());
		setComentario(UtilText.getUtilText().getDefaultValue());
	}

	
	public static ComentarioRevisorDTO create() {
		return new ComentarioRevisorDTO();
	}

	public final UUID getIdentificador() {
		return identificador;
	}




	public final ComentarioRevisorDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}




	public final RevisionRevisorDTO getRevisionRevisor() {
		return revisionRevisor;
	}




	public final ComentarioRevisorDTO setRevisionRevisor(RevisionRevisorDTO revisionRevisor) {
		this.revisionRevisor = UtilObject.getDefault(revisionRevisor, RevisionRevisorDTO.create());
		return this;
	}




	public final TipoComentarioRevisorDTO getTipoComentario() {
		return tipoComentario;
	}




	public final ComentarioRevisorDTO setTipoComentario(TipoComentarioRevisorDTO tipoComentario) {
		this.tipoComentario = UtilObject.getDefault(tipoComentario, TipoComentarioRevisorDTO.create());
		return this;
	}




	public final String getComentario() {
		return comentario;
	}




	public final ComentarioRevisorDTO setComentario(String comentario) {
		this.comentario = comentario;
		return this;
	}
	
	
	
	
	
}
