package co.edu.uco.dto;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public class TipoIdentificacionDTO {
	
	private UUID identificador;
	private String codigo;
	private String nombre;
	private String descripcion;
	private EstadoTipoIdentificacionDTO estado;
	
	
	
	public TipoIdentificacionDTO(UUID identificador,String codigo, String nombre, String descripcion,EstadoTipoIdentificacionDTO estado) {
		super();
		setIdentificador(identificador);
		setCodigo(codigo);
		setNombre(nombre);
		setDescripcion(descripcion);	
		setEstado(estado);
		}
	
	
	public TipoIdentificacionDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setCodigo(UtilText.getUtilText().getDefaultValue());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.getUtilText().getDefaultValue());
		setEstado(EstadoTipoIdentificacionDTO.create());
	}

	public static TipoIdentificacionDTO create() {
		return new TipoIdentificacionDTO();
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	
	public final TipoIdentificacionDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador); 
		
		return this;
	}
	public final String getNombre() {
		return nombre;
	}
	
	
	public final TipoIdentificacionDTO setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
		
	}
	
	public final String getDescripcion() {
		return descripcion;
	}
	
	
	public final TipoIdentificacionDTO setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		
		return this;
	}


	public final EstadoTipoIdentificacionDTO getEstado() {
		return estado;
	}


	public final TipoIdentificacionDTO setEstado(EstadoTipoIdentificacionDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoTipoIdentificacionDTO.create());
		return this; 
	}


	public final String getCodigo() {
		return codigo;
	}


	public final TipoIdentificacionDTO setCodigo(String codigo) {
		this.codigo = UtilText.getUtilText().applyTrim(codigo);
		return this;
	}


	

	

}

