package co.edu.uco.dto;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class HistorialAccesoPublicacionDTO {

	private UUID identificador;
	private LectorDTO lector;
	private PublicacionDTO publicacion;
	
	
	
	
	public HistorialAccesoPublicacionDTO(UUID identificador, LectorDTO lector, PublicacionDTO publicacion) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setPublicacion(publicacion);
	}




	public HistorialAccesoPublicacionDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setLector(LectorDTO.create());
		setPublicacion(PublicacionDTO.create());
	}

	public static HistorialAccesoPublicacionDTO create() {
		return new HistorialAccesoPublicacionDTO();
	}
	
	
	
	
	public final UUID getIdentificador() {
		return identificador;
	}




	public final HistorialAccesoPublicacionDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}




	public final LectorDTO getLector() {
		return lector;
	}




	public final HistorialAccesoPublicacionDTO setLector(LectorDTO lector) {
		this.lector = UtilObject.getDefault(lector, LectorDTO.create());
		return this;
	}




	public final PublicacionDTO getPublicacion() {
		return publicacion;
	}




	public final HistorialAccesoPublicacionDTO setPublicacion(PublicacionDTO publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionDTO.create());
		return this;
	}
	
	
	
	
	
}
