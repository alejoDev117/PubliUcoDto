package co.edu.uco.dto;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final  class PreferenciaEscritorDTO {

	private UUID identificador;
	private PerfilDTO perfil;
	private EscritorDTO escritor;
	
	
	
	
	public PreferenciaEscritorDTO(UUID identificador, PerfilDTO perfil, EscritorDTO escritor) {
		super();
		setIdentificador(identificador);
		setPerfil(perfil);
		setEscritor(escritor);
	}




	public PreferenciaEscritorDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setPerfil(PerfilDTO.create());
		setEscritor(EscritorDTO.create());
	}



	public static PreferenciaEscritorDTO create() {
		return new PreferenciaEscritorDTO();
	}
	
	

	public final UUID getIdentificador() {
		return identificador;
	}




	public final PreferenciaEscritorDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}




	public final PerfilDTO getPerfil() {
		return perfil;
	}




	public final PreferenciaEscritorDTO setPerfil(PerfilDTO perfil) {
		this.perfil = UtilObject.getDefault(perfil, PerfilDTO.create());
		return this;
	}




	public final EscritorDTO getEscritor() {
		return escritor;
	}




	public final PreferenciaEscritorDTO setEscritor(EscritorDTO escritor) {
		this.escritor = UtilObject.getDefault(escritor, EscritorDTO.create());
		return this;
	}
	
	
	
	
}
