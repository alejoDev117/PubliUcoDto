package co.edu.uco.dto;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class TipoRelacionInstitucionDTO {
	private UUID identificador;
	private String nombre;
	private String descripcion;
	private EstadoTipoRelacionInstitucionDTO estadoTipoRelacionInstitucion;
	
	
	public TipoRelacionInstitucionDTO(UUID identificador, String nombre, String descripcion,
			EstadoTipoRelacionInstitucionDTO estadoTipoRelacionInstitucion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
		setEstadoTipoRelacionInstitucion(estadoTipoRelacionInstitucion);
	}


	public TipoRelacionInstitucionDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.getUtilText().getDefaultValue());
		setEstadoTipoRelacionInstitucion(EstadoTipoRelacionInstitucionDTO.create());
	}

	
	public static TipoRelacionInstitucionDTO create() {
		return new TipoRelacionInstitucionDTO();
	}
	
	
	public final UUID getIdentificador() {
		return identificador;
	}


	public final TipoRelacionInstitucionDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}


	public final String getNombre() {
		return nombre;
	}


	public final TipoRelacionInstitucionDTO  setNombre(String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
	}


	public final String getDescripcion() {
		return descripcion;
	}


	public final TipoRelacionInstitucionDTO  setDescripcion(String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		return this;
	}


	public final EstadoTipoRelacionInstitucionDTO getEstadoTipoRelacionInstitucion() {
		return estadoTipoRelacionInstitucion;
	}


	public final TipoRelacionInstitucionDTO  setEstadoTipoRelacionInstitucion(EstadoTipoRelacionInstitucionDTO estadoTipoRelacionInstitucion) {
		this.estadoTipoRelacionInstitucion = UtilObject.getDefault( estadoTipoRelacionInstitucion, EstadoTipoRelacionInstitucionDTO.create());
		return this;
	}
	
	
	
	
	
	
	
	
}
