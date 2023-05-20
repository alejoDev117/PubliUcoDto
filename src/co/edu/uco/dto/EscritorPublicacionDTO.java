package co.edu.uco.dto;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class EscritorPublicacionDTO {

	private UUID identificador;
	private PublicacionDTO publicacion;
	private EscritorDTO escritor;
	private TipoEscritorDTO tipoEscritor;
	
	
	
	
	
	public EscritorPublicacionDTO(UUID identificador, PublicacionDTO publicacion, EscritorDTO escritor,
			TipoEscritorDTO tipoEscritor) {
		super();
		setIdentificador(identificador);
		setPublicacion(publicacion);
		setEscritor(escritor);
		setTipoEscritor(tipoEscritor);
	}





	public EscritorPublicacionDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setPublicacion(PublicacionDTO.create());
		setEscritor(EscritorDTO.create());
		setTipoEscritor(TipoEscritorDTO.create());
	}

	public static EscritorPublicacionDTO create() {
		return new EscritorPublicacionDTO();
	}
	




	public final UUID getIdentificador() {
		return identificador;
	}





	public final EscritorPublicacionDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}





	public final PublicacionDTO getPublicacion() {
		return publicacion;
	}





	public final EscritorPublicacionDTO setPublicacion(PublicacionDTO publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionDTO.create());
		return this;
	}





	public final EscritorDTO getEscritor() {
		return escritor;
	}





	public final EscritorPublicacionDTO setEscritor(EscritorDTO escritor) {
		this.escritor = UtilObject.getDefault(escritor, EscritorDTO.create());
		return this;
	}





	public final TipoEscritorDTO getTipoEscritor() {
		return tipoEscritor;
	}





	public final EscritorPublicacionDTO setTipoEscritor(TipoEscritorDTO tipoEscritor) {
		this.tipoEscritor = UtilObject.getDefault(tipoEscritor, TipoEscritorDTO.create());
		return this;
	}
	
	
	
	
	
	
	
}
