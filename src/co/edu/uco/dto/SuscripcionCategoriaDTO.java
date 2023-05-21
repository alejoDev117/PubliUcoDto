package co.edu.uco.dto;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class SuscripcionCategoriaDTO {

	private UUID identificador;
	private PerfilDTO perfil;
	private PlanCategoriaDTO categoria;
	
	
	
	
	
	public SuscripcionCategoriaDTO(UUID identificador, PerfilDTO perfil, PlanCategoriaDTO categoria) {
		super();
		setIdentificador(identificador);
		setPerfil(perfil);
		setCategoria(categoria);
	}





	public SuscripcionCategoriaDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setPerfil(PerfilDTO.create());
		setCategoria(PlanCategoriaDTO.create());
	}



	public static SuscripcionCategoriaDTO create() {
		return new SuscripcionCategoriaDTO();
	}
	
	


	public final UUID getIdentificador() {
		return identificador;
	}





	public final SuscripcionCategoriaDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}





	public final PerfilDTO getPerfil() {
		return perfil;
	}





	public final SuscripcionCategoriaDTO setPerfil(PerfilDTO perfil) {
		this.perfil = UtilObject.getDefault(perfil, PerfilDTO.create());
		return this;
	}





	public final PlanCategoriaDTO getCategoria() {
		return categoria;
	}





	public final SuscripcionCategoriaDTO setCategoria(PlanCategoriaDTO categoria) {
		this.categoria = UtilObject.getDefault(categoria, PlanCategoriaDTO.create());
		return this;
	}
	
	
	
	
	
	
}
