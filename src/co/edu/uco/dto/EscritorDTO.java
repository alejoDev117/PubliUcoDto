package co.edu.uco.dto;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilBoolean;
import co.edu.uco.crosscutting.utils.UtilMail;
import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public class EscritorDTO {

	private UUID identificador;
	private TipoIdentificacionDTO tipoIdentificacion;
	private String numeroIdentificacion;
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	private String correoElectronico;
	private String indicadorPaisTelefono;
	private String numeroTelefonicoMovil;
	private TipoRelacionInstitucionDTO tipoRelacionIntitucion;
	private boolean correoEstaVerificado;
	private boolean numeroTelefonoMovilEstaVerificado;
	private EstadoEscritorDTO estado;
	
	
	
	
	public EscritorDTO(UUID identificador, TipoIdentificacionDTO tipoIdentificacion, String numeroIdentificacion,
			String primerNombre, String segundoNombre, String primerApellido, String segundoApellido,
			String correoElectronico, String indicadorPaisTelefono, String numeroTelefonicoMovil,
			TipoRelacionInstitucionDTO tipoRelacionIntitucion, boolean correoEstaVerificado,
			boolean numeroTelefonoMovilEstaVerificado, EstadoEscritorDTO estado) {
		super();
		setIdentificador(identificador);
		setTipoIdentificacion(tipoIdentificacion);
		setNumeroIdentificacion(numeroIdentificacion);
		setPrimerNombre(primerNombre);
		setSegundoNombre(segundoNombre);
		setPrimerApellido(primerApellido);
		setSegundoApellido(segundoApellido);
		setCorreoElectronico(correoElectronico);
		setIndicadorPaisTelefono(indicadorPaisTelefono);
		setNumeroTelefonicoMovil(numeroTelefonicoMovil);
		setTipoRelacionIntitucion(tipoRelacionIntitucion);
		setCorreoEstaVerificado(correoEstaVerificado);
		setCorreoEstaVerificado(numeroTelefonoMovilEstaVerificado);
		setEstado(estado);
	}




	public EscritorDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setTipoIdentificacion(TipoIdentificacionDTO.create());
		setNumeroIdentificacion(UtilText.getUtilText().getDefaultValue());
		setPrimerNombre(UtilText.getUtilText().getDefaultValue());
		setSegundoNombre(UtilText.getUtilText().getDefaultValue());
		setPrimerApellido(UtilText.getUtilText().getDefaultValue());
		setSegundoApellido(UtilText.getUtilText().getDefaultValue());
		setCorreoElectronico(UtilMail.getDefaultValueMail());
		setIndicadorPaisTelefono(UtilText.getUtilText().getDefaultValue());
		setNumeroTelefonicoMovil(UtilText.getUtilText().getDefaultValue());
		setTipoRelacionIntitucion(TipoRelacionInstitucionDTO.create());
		setCorreoEstaVerificado(UtilBoolean.getDefaultValue());
		setCorreoEstaVerificado(UtilBoolean.getDefaultValue());
		setEstado(EstadoEscritorDTO.create());
	}
	
	
	public static final EscritorDTO create() {
		return new EscritorDTO();
	}




	public final UUID getIdentificador() {
		return identificador;
	}




	public final EscritorDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}




	public final TipoIdentificacionDTO getTipoIdentificacion() {
		return tipoIdentificacion;
	}




	public final EscritorDTO setTipoIdentificacion(TipoIdentificacionDTO tipoIdentificacion) {
		this.tipoIdentificacion = UtilObject.getDefault(tipoIdentificacion, TipoIdentificacionDTO.create());
		return this;
	}




	public final String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}




	public final EscritorDTO setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = UtilText.getUtilText().applyTrim(numeroIdentificacion);
		return this;
	}




	public final String getPrimerNombre() {
		return primerNombre;
	}




	public final EscritorDTO setPrimerNombre(String primerNombre) {
		this.primerNombre = UtilText.getUtilText().applyTrim(primerNombre);
		return this;
	}




	public final String getSegundoNombre() {
		return segundoNombre;
	}




	public final EscritorDTO setSegundoNombre(String segundoNombre) {
		this.segundoNombre = UtilText.getUtilText().applyTrim(segundoNombre);
		return this;
	}




	public final String getPrimerApellido() {
		return primerApellido;
	}




	public final EscritorDTO setPrimerApellido(String primerApellido) {
		this.primerApellido = UtilText.getUtilText().applyTrim(primerApellido);
		return this;
	}




	public final String getSegundoApellido() {
		return segundoApellido;
	}




	public final EscritorDTO setSegundoApellido(String segundoApellido) {
		this.segundoApellido = UtilText.getUtilText().applyTrim(segundoApellido);
		return this;
	}




	public final String getCorreoElectronico() {
		return correoElectronico;
	}




	public final EscritorDTO setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = UtilMail.applyTrimMail(correoElectronico);
		return this;
	}




	public final String getIndicadorPaisTelefono() {
		return indicadorPaisTelefono;
	}




	public final EscritorDTO setIndicadorPaisTelefono(String indicadorPaisTelefono) {
		this.indicadorPaisTelefono = UtilText.getUtilText().applyTrim(indicadorPaisTelefono);
		return this;
	}




	public final String getNumeroTelefonicoMovil() {
		return numeroTelefonicoMovil;
	}




	public final EscritorDTO setNumeroTelefonicoMovil(String numeroTelefonicoMovil) {
		this.numeroTelefonicoMovil = UtilText.getUtilText().applyTrim(numeroTelefonicoMovil);
		return this;
	}




	public final TipoRelacionInstitucionDTO getTipoRelacionIntitucion() {
		return tipoRelacionIntitucion;
	}




	public final EscritorDTO setTipoRelacionIntitucion(TipoRelacionInstitucionDTO tipoRelacionIntitucion) {
		this.tipoRelacionIntitucion = UtilObject.getDefault(tipoRelacionIntitucion, TipoRelacionInstitucionDTO.create());
		return this;
	}




	public final boolean isCorreoEstaVerificado() {
		return correoEstaVerificado;
	}




	public final EscritorDTO setCorreoEstaVerificado(boolean correoEstaVerificado) {
		this.correoEstaVerificado = UtilBoolean.getDefault(correoEstaVerificado);
		return this;
	}




	public final boolean isNumeroTelefonoMovilEstaVerificado() {
		return numeroTelefonoMovilEstaVerificado;
	}




	public final EscritorDTO setNumeroTelefonoMovilEstaVerificado(boolean numeroTelefonoMovilEstaVerificado) {
		this.numeroTelefonoMovilEstaVerificado = UtilBoolean.getDefault(numeroTelefonoMovilEstaVerificado);
		return this;
	}




	public final EstadoEscritorDTO getEstado() {
		return estado;
	}




	public final EscritorDTO setEstado(EstadoEscritorDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoEscritorDTO.create());
		return this;
	}
	
	
	
	
	
	
 }
