package co.edu.uco.dto;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public class EstadoEscritorDTO {
	private UUID identificador;
	private String nombre;
	private String descripcion;
	
	
	
	public EstadoEscritorDTO(UUID identificador, String nombre, String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);	
		}
	
	
	public EstadoEscritorDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.getUtilText().getDefaultValue());
	}

	public static EstadoEscritorDTO create() {
		return new EstadoEscritorDTO();
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	
	public final EstadoEscritorDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador); 
		
		return this;
	}
	public final String getNombre() {
		return nombre;
	}
	
	
	public final EstadoEscritorDTO setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
		
	}
	
	public final String getDescripcion() {
		return descripcion;
	}
	
	
	public final EstadoEscritorDTO setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		
		return this;
	}

}

