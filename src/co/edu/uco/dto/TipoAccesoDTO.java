package co.edu.uco.dto;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public class TipoAccesoDTO {
	private UUID identificador;
	private String nombre;
	private String descripcion;
	private EstadoTipoAccesoDTO estado;
	
	
	
	public TipoAccesoDTO(UUID identificador, String nombre, String descripcion,EstadoTipoAccesoDTO estado) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);	
		setEstado(estado);
		}
	
	
	public TipoAccesoDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.getUtilText().getDefaultValue());
		setEstado(EstadoTipoAccesoDTO.create());
	}

	public static TipoAccesoDTO create() {
		return new TipoAccesoDTO();
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	
	public final TipoAccesoDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador); 
		
		return this;
	}
	public final String getNombre() {
		return nombre;
	}
	
	
	public final TipoAccesoDTO setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
		
	}
	
	public final String getDescripcion() {
		return descripcion;
	}
	
	
	public final TipoAccesoDTO setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		
		return this;
	}


	public final EstadoTipoAccesoDTO getEstado() {
		return estado;
	}


	public final TipoAccesoDTO setEstado(EstadoTipoAccesoDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoTipoAccesoDTO.create());
		return this; 
	}



	

}

