package co.edu.uco.dto;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class CategoriaAdministradorCategoriaDTO {

	private UUID identificador;
	private CategoriaDTO categoria;
	private AdministradorCategoriaDTO administradorCategoria;
	
	
	
	public CategoriaAdministradorCategoriaDTO(UUID identificador, CategoriaDTO categoria,
			AdministradorCategoriaDTO administradorCategoria) {
		super();
		setIdentificador(identificador);
		setCategoria(categoria);
		setAdministradorCategoria(administradorCategoria);
	}



	public CategoriaAdministradorCategoriaDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setCategoria(CategoriaDTO.create());
		setAdministradorCategoria(AdministradorCategoriaDTO.create());
	}


	public static final CategoriaAdministradorCategoriaDTO create() {
		return new CategoriaAdministradorCategoriaDTO();
	}

	public final UUID getIdentificador() {
		return identificador;
	}



	public final CategoriaAdministradorCategoriaDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}



	public final CategoriaDTO getCategoria() {
		return categoria;
	}



	public final CategoriaAdministradorCategoriaDTO setCategoria(CategoriaDTO categoria) {
		this.categoria = UtilObject.getDefault(categoria, CategoriaDTO.create());
		return this;
	}



	public final AdministradorCategoriaDTO getAdministradorCategoria() {
		return administradorCategoria;
	}



	public final CategoriaAdministradorCategoriaDTO setAdministradorCategoria(AdministradorCategoriaDTO administradorCategoria) {
		this.administradorCategoria = UtilObject.getDefault(administradorCategoria,AdministradorCategoriaDTO.create());
		return this;
		
	}

	

}
