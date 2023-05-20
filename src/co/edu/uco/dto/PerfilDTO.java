package co.edu.uco.dto;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilBoolean;
import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class PerfilDTO {

	private UUID identificador;
	private LectorDTO lector;
	private boolean enviarCorreoRecomendacionesCategoria;
	private boolean enviarCorreoRecomendacionesAutor;
	
	
	
	public PerfilDTO(UUID identificador ,LectorDTO lector, boolean enviarCorreoRecomendacionesCategoria,
			boolean enviarCorreoRecomendacionesAutor) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setEnviarCorreoRecomendacionesCategoria(enviarCorreoRecomendacionesCategoria);
		setEnviarCorreoRecomendacionesAutor(enviarCorreoRecomendacionesAutor);
	}



	public PerfilDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setLector(LectorDTO.create());
		setEnviarCorreoRecomendacionesCategoria(UtilBoolean.getDefaultValue());
		setEnviarCorreoRecomendacionesAutor(UtilBoolean.getDefaultValue());
	}

	public static PerfilDTO create() {
		return new PerfilDTO();
	}
	
	public final PerfilDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}


	public final LectorDTO getLector() {
		return lector;
	}



	public final PerfilDTO setLector(LectorDTO lector) {
		this.lector = UtilObject.getDefault(lector, LectorDTO.create());
		return this;
		
	}



	public final boolean isEnviarCorreoRecomendacionesCategoria() {
		return enviarCorreoRecomendacionesCategoria;
	}



	public final PerfilDTO setEnviarCorreoRecomendacionesCategoria(boolean enviarCorreoRecomendacionesCategoria) {
		this.enviarCorreoRecomendacionesCategoria = UtilBoolean.getDefault(enviarCorreoRecomendacionesCategoria);
		return this;
	}



	public final boolean isEnviarCorreoRecomendacionesAutor() {
		return enviarCorreoRecomendacionesAutor;
	}



	public final PerfilDTO setEnviarCorreoRecomendacionesAutor(boolean enviarCorreoRecomendacionesAutor) {
		this.enviarCorreoRecomendacionesAutor = UtilBoolean.getDefault(enviarCorreoRecomendacionesAutor);
		return this;
	}



	public final UUID getIdentificador() {
		return identificador;
	}




	
	
	
	
	
	
}
