package co.edu.uco.dto;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilBoolean;
import co.edu.uco.crosscutting.utils.UtilMail;
import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class AdministradorCategoriaDTO {

	
	private UUID identificador;
	private TipoIdentificacionDTO tipoIdentificacion;
	private String numeroIdentificacion;
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	private String correoElectronico;
	private String indicadorPaisTelefono;
	private String numeroTelefonoMovil;
	private TipoRelacionInstitucionDTO tipoRelacionInstitucion;
	private boolean cuentaDeCorreoEstaVerificada;
	private boolean numeroTelefonoEstaVerificado;
	private EstadoAdministradorCategoriaDTO estado;
	
	
	
	
	public AdministradorCategoriaDTO(UUID identificador, TipoIdentificacionDTO tipoIdentificacion,
			String numeroIdentificacion, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, String correoElectronico, String indicadorPaisTelefono, String numeroTelefonoMovil,
			TipoRelacionInstitucionDTO tipoRelacionInstitucion, boolean cuentaDeCorreoEstaVerificada,
			boolean numeroTelefonoEstaVerificado, EstadoAdministradorCategoriaDTO estado) {
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
		setNumeroTelefonoMovil(numeroTelefonoMovil);
		setTipoRelacionInstitucion(tipoRelacionInstitucion);
		setCuentaDeCorreoEstaVerificada(cuentaDeCorreoEstaVerificada);
		setNumeroTelefonoEstaVerificado(numeroTelefonoEstaVerificado);
		setEstado(estado);
	}




	public AdministradorCategoriaDTO() {
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
		setNumeroTelefonoMovil(UtilText.getUtilText().getDefaultValue());
		setTipoRelacionInstitucion(TipoRelacionInstitucionDTO.create());
		setCuentaDeCorreoEstaVerificada(UtilBoolean.getDefaultValue());
		setNumeroTelefonoEstaVerificado(UtilBoolean.getDefaultValue());
		setEstado(EstadoAdministradorCategoriaDTO.create());
	}
	
	
	
	public static final AdministradorCategoriaDTO create() {
		return new AdministradorCategoriaDTO();
	}




	public final UUID getIdentificador() {
		return identificador;
	}




	public final AdministradorCategoriaDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
		
	}




	public final TipoIdentificacionDTO getTipoIdentificacion() {
		return tipoIdentificacion;
	}




	public final AdministradorCategoriaDTO setTipoIdentificacion(TipoIdentificacionDTO tipoIdentificacion) {
		this.tipoIdentificacion = UtilObject.getDefault(tipoIdentificacion, TipoIdentificacionDTO.create());
		return this;
	}




	public final String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}




	public final AdministradorCategoriaDTO setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = UtilText.getUtilText().applyTrim(numeroIdentificacion);
		return this;
	}




	public final String getPrimerNombre() {
		return primerNombre;
	}




	public final AdministradorCategoriaDTO setPrimerNombre(String primerNombre) {
		this.primerNombre = UtilText.getUtilText().applyTrim(primerNombre);
		return this;
	}




	public final String getSegundoNombre() {
		return segundoNombre;
	}




	public final AdministradorCategoriaDTO setSegundoNombre(String segundoNombre) {
		this.segundoNombre = UtilText.getUtilText().applyTrim(segundoNombre);
		return this;
	}




	public final String getPrimerApellido() {
		return primerApellido;
	}




	public final AdministradorCategoriaDTO setPrimerApellido(String primerApellido) {
		this.primerApellido = UtilText.getUtilText().applyTrim(primerApellido);
		return this;
	}




	public final String getSegundoApellido() {
		return segundoApellido;
	}




	public final AdministradorCategoriaDTO setSegundoApellido(String segundoApellido) {
		this.segundoApellido = UtilText.getUtilText().applyTrim(segundoApellido);
		return this;
	}




	public final String getCorreoElectronico() {
		return correoElectronico;
	}




	public final AdministradorCategoriaDTO setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = UtilMail.applyTrimMail(correoElectronico);
		return this;
	}




	public final String getIndicadorPaisTelefono() {
		return indicadorPaisTelefono;
	}




	public final AdministradorCategoriaDTO setIndicadorPaisTelefono(String indicadorPaisTelefono) {
		this.indicadorPaisTelefono = UtilText.getUtilText().applyTrim(indicadorPaisTelefono);
		return this;
	}




	public final String getNumeroTelefonoMovil() {
		return numeroTelefonoMovil;
	}




	public final AdministradorCategoriaDTO setNumeroTelefonoMovil(String numeroTelefonoMovil) {
		this.numeroTelefonoMovil = UtilText.getUtilText().applyTrim(numeroTelefonoMovil);
		return this;
	}




	public final TipoRelacionInstitucionDTO getTipoRelacionInstitucion() {
		return tipoRelacionInstitucion;
	}




	public final AdministradorCategoriaDTO setTipoRelacionInstitucion(TipoRelacionInstitucionDTO tipoRelacionInstitucion) {
		this.tipoRelacionInstitucion = UtilObject.getDefault(tipoRelacionInstitucion,TipoRelacionInstitucionDTO.create());
		return this;
	}




	public final boolean isCuentaDeCorreoEstaVerificada() {
		return cuentaDeCorreoEstaVerificada;
	}




	public final AdministradorCategoriaDTO setCuentaDeCorreoEstaVerificada(boolean cuentaDeCorreoEstaVerificada) {
		this.cuentaDeCorreoEstaVerificada = UtilBoolean.getDefault(cuentaDeCorreoEstaVerificada);
		return this;
	}




	public final boolean isNumeroTelefonoEstaVerificado() {
		return numeroTelefonoEstaVerificado;
	}




	public final AdministradorCategoriaDTO setNumeroTelefonoEstaVerificado(boolean numeroTelefonoEstaVerificado) {
		this.numeroTelefonoEstaVerificado = UtilBoolean.getDefault(numeroTelefonoEstaVerificado);
		return this;
	}




	public final EstadoAdministradorCategoriaDTO getEstado() {
		return estado;
	}




	public final AdministradorCategoriaDTO setEstado(EstadoAdministradorCategoriaDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoAdministradorCategoriaDTO.create());
		return this;
	}



	
	
	
}
