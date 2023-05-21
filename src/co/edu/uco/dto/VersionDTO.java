package co.edu.uco.dto;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilDateTime;
import co.edu.uco.crosscutting.utils.UtilNumeric;
import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public  final class VersionDTO {

	private UUID identificador;
	private PublicacionDTO publicacion;
	private VersionDTO version;
	private int numeroVersion;
	private Date fechaCreacion;
	private Date fechaUltimaModificacion;
	private String titulo;
	private String resumen;
	private String cuerpo;
	private EstadoVersionDTO estado;
	
	
	
	public VersionDTO(UUID identificador, PublicacionDTO publicacion, VersionDTO version, int numeroVersion,
			Date fechaCreacion, Date fechaUltimaModificacion, String titulo, String resumen, String cuerpo,
			EstadoVersionDTO estado) {
		super();
		setIdentificador(identificador);
		setPublicacion(publicacion);
		setVersion(version);
		setNumeroVersion(numeroVersion);
		setFechaCreacion(fechaCreacion);
		setFechaUltimaModificacion(fechaUltimaModificacion);
		setTitulo(titulo);
		setResumen(resumen);
		setCuerpo(cuerpo);
		setEstado(estado);
	}



	public VersionDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setPublicacion(PublicacionDTO.create());
		setVersion(VersionDTO.create());
		setNumeroVersion(UtilNumeric.getDefaultIntValue());
		setFechaCreacion(UtilDateTime.getDefaultValueDate());
		setFechaUltimaModificacion(UtilDateTime.getDefaultValueDate());
		setTitulo(UtilText.getUtilText().getDefaultValue());
		setResumen(UtilText.getUtilText().getDefaultValue());
		setCuerpo(UtilText.getUtilText().getDefaultValue());
		setEstado(EstadoVersionDTO.create());
	}
	
	
	

	
	public static VersionDTO create() {
		return new VersionDTO();
	}


	public final UUID getIdentificador() {
		return identificador;
	}



	public final VersionDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}



	public final PublicacionDTO getPublicacion() {
		return publicacion;
	}



	public final VersionDTO setPublicacion(PublicacionDTO publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionDTO.create());
		return this;
	}



	public final VersionDTO getVersion() {
		return version;
	}



	public final VersionDTO setVersion(VersionDTO version) {
		this.version = UtilObject.getDefault(version, VersionDTO.create());
		return this;
	}



	public final int getNumeroVersion() {
		return numeroVersion;
	}



	public final VersionDTO setNumeroVersion(int numeroVersion) {
		this.numeroVersion = UtilNumeric.getDefaultValueInt(numeroVersion);
		return this;
	}



	public final Date getFechaCreacion() {
		return fechaCreacion;
	}



	public final VersionDTO setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = UtilDateTime.getDefaultDate(fechaCreacion);
		return this;
	}



	public final Date getFechaUltimaModificacion() {
		return fechaUltimaModificacion;
	}



	public final VersionDTO setFechaUltimaModificacion(Date fechaUltimaModificacion) {
		this.fechaUltimaModificacion = UtilDateTime.getDefaultDate(fechaUltimaModificacion);
		return this;
	}



	public final String getTitulo() {
		return titulo;
	}



	public final VersionDTO setTitulo(String titulo) {
		this.titulo = UtilText.getUtilText().applyTrim(titulo);
		return this;
	}



	public final String getResumen() {
		return resumen;
	}



	public final VersionDTO setResumen(String resumen) {
		this.resumen = UtilText.getUtilText().applyTrim(resumen);
		return this;
	}



	public final String getCuerpo() {
		return cuerpo;
	}



	public final VersionDTO setCuerpo(String cuerpo) {
		this.cuerpo = UtilText.getUtilText().applyTrim(cuerpo);
		return this;
	}



	public final EstadoVersionDTO getEstado() {
		return estado;
	}



	public final VersionDTO setEstado(EstadoVersionDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoVersionDTO.create());
		return this;
	}

	
	
	
	
	
}
