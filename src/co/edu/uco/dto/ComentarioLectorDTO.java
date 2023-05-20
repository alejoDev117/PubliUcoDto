package co.edu.uco.dto;



import java.util.Date;
import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilDateTime;
import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class ComentarioLectorDTO {

	private UUID identificador;
	private LectorDTO lector;
	private PublicacionDTO publicacion;
	private ComentarioLectorDTO comentarioPadre;
	private String comentario;
	private Date fechaComentario;
	private EstadoComentarioLectorDTO estado;
	
	
	
	public ComentarioLectorDTO(UUID identificador,LectorDTO lector, PublicacionDTO publicacion, ComentarioLectorDTO comentarioPadre,
			String comentario, Date fechaComentario, EstadoComentarioLectorDTO estado) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setPublicacion(publicacion);
		setComentarioPadre(comentarioPadre);
		setComentario(comentario);
		setFechaComentario(fechaComentario);
		setEstado(estado);

	}



	public ComentarioLectorDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setLector(LectorDTO.create());
		setPublicacion(PublicacionDTO.create());
		setComentarioPadre(ComentarioLectorDTO.create());
		setComentario(UtilText.getUtilText().getDefaultValue());
		setFechaComentario(UtilDateTime.getDefaultValueDate());
		setEstado(EstadoComentarioLectorDTO.create());
	}


	public static ComentarioLectorDTO create() {
		return new ComentarioLectorDTO();
	}
	
	
	
	

	public final UUID getIdentificador() {
		return identificador;
	}



	public final ComentarioLectorDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}



	public final LectorDTO getLector() {
		return lector;
	}



	public final ComentarioLectorDTO setLector(LectorDTO lector) {
		this.lector = UtilObject.getDefault(lector, LectorDTO.create());
		return this;
	}



	public final PublicacionDTO getPublicacion() {
		return publicacion;
	}



	public final ComentarioLectorDTO setPublicacion(PublicacionDTO publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionDTO.create());
		return this;
	}



	public final ComentarioLectorDTO getComentarioPadre() {
		return comentarioPadre;
	}



	public final ComentarioLectorDTO setComentarioPadre(ComentarioLectorDTO comentarioPadre) {
		this.comentarioPadre = UtilObject.getDefault(comentarioPadre, ComentarioLectorDTO.create());
		return this;
	}



	public final String getComentario() {
		return comentario;
	}



	public final ComentarioLectorDTO setComentario(String comentario) {
		this.comentario = UtilText.getUtilText().applyTrim(comentario);
		return this;
	}



	public final Date getFechaComentario() {
		return fechaComentario;
	}



	public final ComentarioLectorDTO setFechaComentario(Date fechaComentario) {
		this.fechaComentario = UtilDateTime.getDefaultDate(fechaComentario);
		return this;
	}



	public final EstadoComentarioLectorDTO getEstado() {
		return estado;
	}



	public final ComentarioLectorDTO setEstado(EstadoComentarioLectorDTO estado) {
		this.estado =UtilObject.getDefault(estado, EstadoComentarioLectorDTO.create());
		return this;
	}
	
	
	
	
	
}
