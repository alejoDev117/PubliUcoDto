package co.edu.uco.dto;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public class TipoEscritorDTO {
	private UUID identificador;
	private String nombre;
	private String descripcion;
	private EstadoTipoEscritorDTO estado;
	
	
	
	public TipoEscritorDTO(UUID identificador, String nombre, String descripcion,EstadoTipoEscritorDTO estado) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);	
		setEstado(estado);
		}
	
	
	public TipoEscritorDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.getUtilText().getDefaultValue());
		setEstado(EstadoTipoEscritorDTO.create());
	}

	public static TipoEscritorDTO create() {
		return new TipoEscritorDTO();
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	
	public final TipoEscritorDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador); 
		
		return this;
	}
	public final String getNombre() {
		return nombre;
	}
	
	
	public final TipoEscritorDTO setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
		
	}
	
	public final String getDescripcion() {
		return descripcion;
	}
	
	
	public final TipoEscritorDTO setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		
		return this;
	}


	public final EstadoTipoEscritorDTO getEstado() {
		return estado;
	}


	public final TipoEscritorDTO setEstado(EstadoTipoEscritorDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoTipoEscritorDTO.create());
		return this; 
	}



	

}

