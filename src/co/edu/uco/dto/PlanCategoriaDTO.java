package co.edu.uco.dto;


import java.util.Date;
import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilDateTime;
import co.edu.uco.crosscutting.utils.UtilNumeric;
import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class PlanCategoriaDTO {

	private UUID identificador;
	private CategoriaDTO categoria;
	private float precio;
	private Date fechaDeste;
	private Date fechaHasta;
	
	
	public PlanCategoriaDTO(UUID identificador, CategoriaDTO categoria, float precio, Date fechaDeste,
			Date fechaHasta) {
		super();
		setIdentificador(identificador);
		setCategoria(categoria);
		setPrecio(precio);
		setFechaDeste(fechaDeste);
		setFechaHasta(fechaHasta);
	}


	public PlanCategoriaDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setCategoria(CategoriaDTO.create());
		setPrecio(UtilNumeric.getDefaultFloatValue());
		setFechaDeste(UtilDateTime.getDefaultValueDate());
		setFechaHasta(UtilDateTime.getDefaultValueDate());
	}

	public static PlanCategoriaDTO create() {
		return new PlanCategoriaDTO();
	}

	public final UUID getIdentificador() {
		return identificador;
	}


	public final PlanCategoriaDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}


	public final CategoriaDTO getCategoria() {
		return categoria;
	}


	public final PlanCategoriaDTO setCategoria(CategoriaDTO categoria) {
		this.categoria = UtilObject.getDefault(categoria, CategoriaDTO.create());
		return this;
	}


	public final float getPrecio() {
		return precio;
	}


	public final PlanCategoriaDTO setPrecio(float precio) {
		this.precio = UtilNumeric.getDefaultFloatValue();
		return this;
	}


	public final Date getFechaDeste() {
		return fechaDeste;
	}


	public final PlanCategoriaDTO setFechaDeste(Date fechaDeste) {
		this.fechaDeste = UtilDateTime.getDefaultDate(fechaDeste);
		return this;
	}


	public final Date getFechaHasta() {
		return fechaHasta;
	}


	public final PlanCategoriaDTO setFechaHasta(Date fechaHasta) {
		this.fechaHasta = UtilDateTime.getDefaultDate(fechaHasta);
		return this;
	}
	
	
	
	
	
	
	
}
