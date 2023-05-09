package co.edu.uco.dto;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class CategoriaDTO {

	private UUID identificador;
	private CategoriaDTO categoriaPadre;
	private String nombre;
	private String descripcion;
	private EstadoCategoriaDTO estado;
	
	
	
	

	public CategoriaDTO(UUID identificador, CategoriaDTO categoriaPadre, String nombre, String descripcion,
			EstadoCategoriaDTO estado) {
		super();
		setIdentificador(identificador);
		setCategoriaPadre(categoriaPadre);
		setNombre(nombre);
		setDescripcion(descripcion);
		setEstado(estado);
	}
	
	
	
	
	
	
	public CategoriaDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setCategoriaPadre(CategoriaDTO.create());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.getUtilText().getDefaultValue());
		setEstado(EstadoCategoriaDTO.create());
		
	}


	public static final CategoriaDTO create() {
		return new CategoriaDTO();
		
	}




	public final UUID getIdentificador() {
		return identificador;
	}
	public final CategoriaDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public final CategoriaDTO getCategoriaPadre() {
		return categoriaPadre;
	}
	public final CategoriaDTO setCategoriaPadre(CategoriaDTO categoriaPadre) {
		this.categoriaPadre = UtilObject.getDefault(categoriaPadre, CategoriaDTO.create());
		return this;
	}
	public final String getNombre() {
		return nombre;
	}
	public final CategoriaDTO setNombre(String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
	}
	public final String getDescripcion() {
		return descripcion;
	}
	public final CategoriaDTO setDescripcion(String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		return this;
	}
	public final EstadoCategoriaDTO getEstado() {
		return estado;
	}
	public final CategoriaDTO setEstado(EstadoCategoriaDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoCategoriaDTO.create());
		return this;
	}

	
	
	
}
