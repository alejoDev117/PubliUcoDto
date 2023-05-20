package co.edu.uco.dto;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class PalabraClavePublicacionDTO {

	private UUID identificador;
	private PublicacionDTO publicacion;
	private String palabraClave;
	
	
	
	
	public PalabraClavePublicacionDTO(UUID identificador, PublicacionDTO publicacion, String palabraClave) {
		super();
		setIdentificador(identificador);
		setPublicacion(publicacion);
		setPalabraClave(palabraClave);
	}




	public PalabraClavePublicacionDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setPublicacion(PublicacionDTO.create());
		setPalabraClave(UtilText.getUtilText().getDefaultValue());
	}


	public static PalabraClavePublicacionDTO create() {
		return new PalabraClavePublicacionDTO();
	}


	public final UUID getIdentificador() {
		return identificador;
	}




	public final PalabraClavePublicacionDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}




	public final PublicacionDTO getPublicacion() {
		return publicacion;
	}




	public final PalabraClavePublicacionDTO setPublicacion(PublicacionDTO publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionDTO.create());
		return this;
	}




	public final String getPalabraClave() {
		return palabraClave;
	}




	public final PalabraClavePublicacionDTO setPalabraClave(String palabraClave) {
		this.palabraClave = UtilText.getUtilText().applyTrim(palabraClave);
		return this;
	}
	
	
	
	
	
	
}
