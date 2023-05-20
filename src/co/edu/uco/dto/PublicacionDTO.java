package co.edu.uco.dto;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilDateTime;
import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class PublicacionDTO {

	private UUID identificador;
	private CategoriaDTO categoria;
	private TipoAccesoDTO tipoAccceso;
	private Date fechaPublicacion;
	
	
	
	
	public PublicacionDTO(UUID identificador, CategoriaDTO categoria, TipoAccesoDTO tipoAccceso,
			Date fechaPublicacion) {
		super();
		setIdentificador(identificador);
		setCategoria(categoria);
		setTipoAccceso(tipoAccceso);
		setFechaPublicacion(fechaPublicacion);
	}




	public PublicacionDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setCategoria(CategoriaDTO.create());
		setTipoAccceso(TipoAccesoDTO.create());
		setFechaPublicacion(UtilDateTime.getDefaultValueDate());
	}

	
	public static PublicacionDTO create() {
		return new PublicacionDTO();
	}



	public final UUID getIdentificador() {
		return identificador;
	}




	public final PublicacionDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}




	public final CategoriaDTO getCategoria() {
		return categoria;
	}




	public final PublicacionDTO setCategoria(CategoriaDTO categoria) {
		this.categoria = UtilObject.getDefault(categoria, CategoriaDTO.create());
		return this;
	}




	public final TipoAccesoDTO getTipoAccceso() {
		return tipoAccceso;
	}




	public final PublicacionDTO setTipoAccceso(TipoAccesoDTO tipoAccceso) {
		this.tipoAccceso = UtilObject.getDefault(tipoAccceso, TipoAccesoDTO.create());
		return this;
	}




	public final Date getFechaPublicacion() {
		return fechaPublicacion;
	}




	public final PublicacionDTO setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = UtilDateTime.getDefaultDate(fechaPublicacion);
		return this;
	}
	
	
	
	
	
}
