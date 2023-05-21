package co.edu.uco.dto;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class ReporteDTO {

	private UUID identificador;
	private LectorDTO lector;
	private ComentarioLectorDTO comentario;
	private TipoReporteDTO tipoReporte;
	
	
	
	
	public ReporteDTO(UUID identificador, LectorDTO lector, ComentarioLectorDTO comentario,
			TipoReporteDTO tipoReporte) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setComentario(comentario);
		setTipoReporte(tipoReporte);
	}




	public ReporteDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setLector(LectorDTO.create());
		setComentario(ComentarioLectorDTO.create());
		setTipoReporte(TipoReporteDTO.create());
	}
	
	
	
	
	public static ReporteDTO create() {
		return new ReporteDTO();
	}




	public final UUID getIdentificador() {
		return identificador;
	}




	public final ReporteDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}




	public final LectorDTO getLector() {
		return lector;
	}




	public final ReporteDTO setLector(LectorDTO lector) {
		this.lector = UtilObject.getDefault(lector, LectorDTO.create());
		return this;
	}




	public final ComentarioLectorDTO getComentario() {
		return comentario;
	}




	public final ReporteDTO setComentario(ComentarioLectorDTO comentario) {
		this.comentario = UtilObject.getDefault(comentario, ComentarioLectorDTO.create());
		return this;
	}




	public final TipoReporteDTO getTipoReporte() {
		return tipoReporte;
	}




	public final ReporteDTO setTipoReporte(TipoReporteDTO tipoReporte) {
		this.tipoReporte = UtilObject.getDefault(tipoReporte, TipoReporteDTO.create());
		return this;
	}
	
	
	
}
