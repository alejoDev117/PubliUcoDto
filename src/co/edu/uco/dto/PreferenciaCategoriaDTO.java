package co.edu.uco.dto;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class PreferenciaCategoriaDTO {
	
	private UUID identificador;
	private PerfilDTO perfil;
	private CategoriaDTO categoria;
	
	
	
	
	
	
	public PreferenciaCategoriaDTO(UUID identificador, PerfilDTO perfil, CategoriaDTO categoria) {
		super();
		setIdentificador(identificador);
		setPerfil(perfil);
		setCategoria(categoria);
	}






	public PreferenciaCategoriaDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setPerfil(PerfilDTO.create());
		setCategoria(CategoriaDTO.create());
	}



	public static PreferenciaCategoriaDTO create() {
		return new PreferenciaCategoriaDTO();
	}



	public final UUID getIdentificador() {
		return identificador;
	}






	public final PreferenciaCategoriaDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}






	public final PerfilDTO getPerfil() {
		return perfil;
	}






	public final PreferenciaCategoriaDTO setPerfil(PerfilDTO perfil) {
		this.perfil = UtilObject.getDefault(perfil, PerfilDTO.create());
		return this;
	}






	public final CategoriaDTO getCategoria() {
		return categoria;
	}






	public final PreferenciaCategoriaDTO setCategoria(CategoriaDTO categoria) {
		this.categoria = UtilObject.getDefault(categoria, CategoriaDTO.create());
		return this;
	}

	

}
