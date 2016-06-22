package modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: adocao
 *
 */
@Entity

public class adocao implements Serializable {
	//Long
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private static final long serialVersionUID = 1L;
	
	//String
	private String nomeAnunciante;
	private String estadoAnunciante;
	private String descricaoAnimal;
	private String telefoneAnunciante;
	private String nomeAnimal;
	private String especieAnimal;
	private String sexoAnimal;
	private String pelagemAnimal;
	private String racaAnimal;
	private String cidadeAnimal;
	private String observacao;
	//Boolean
	private Boolean castrado;
	//Date
	private Date dataCadastro;
	//Integer
	private Integer cpfAnunciante;
	private Integer idadeAnimal;
	//Double
	private Double pesoAnimal;
	
	
	
	
	
	
	
	
	public adocao(String nomeAnunciante,
			String descricaoAnimal, 
			String telefoneAnunciante, 
			String nomeAnimal, 
			String especieAnimal, 
			String sexoAnimal, 
			String pelagemAnimal, 
			String racaAnimal,
			String cidadeAnimal,
			String observacao,
			Boolean castrado,  
			Integer cpfAnunciante, 
			Integer idadeAnimal,
			Double pesoAnimal) {
		super();
		this.nomeAnunciante = nomeAnunciante;
		this.descricaoAnimal = descricaoAnimal;
		this.telefoneAnunciante = telefoneAnunciante;
		this.nomeAnimal = nomeAnimal;
		this.especieAnimal = especieAnimal;
		this.sexoAnimal = sexoAnimal;
		this.pelagemAnimal = pelagemAnimal;
		this.racaAnimal = racaAnimal;
		this.cidadeAnimal = cidadeAnimal;
		this.castrado = castrado;
		this.cpfAnunciante = cpfAnunciante;
		this.idadeAnimal = idadeAnimal;
		this.pesoAnimal = pesoAnimal;
	}

	public String getNomeAnunciante() {
		return nomeAnunciante;
	}

	public void setNomeAnunciante(String nomeAnunciante) {
		this.nomeAnunciante = nomeAnunciante;
	}

	public String getDescricaoAnimal() {
		return descricaoAnimal;
	}

	public void setDescricaoAnimal(String descricaoAnimal) {
		this.descricaoAnimal = descricaoAnimal;
	}

	public String getTelefoneAnunciante() {
		return telefoneAnunciante;
	}

	public void setTelefoneAnunciante(String telefoneAnunciante) {
		this.telefoneAnunciante = telefoneAnunciante;
	}

	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public String getSexoAnimal() {
		return sexoAnimal;
	}

	public void setSexoAnimal(String sexoAnimal) {
		this.sexoAnimal = sexoAnimal;
	}

	public String getPelagemAnimal() {
		return pelagemAnimal;
	}

	public void setPelagemAnimal(String pelagemAnimal) {
		this.pelagemAnimal = pelagemAnimal;
	}

	public String getRacaAnimal() {
		return racaAnimal;
	}

	public void setRacaAnimal(String racaAnimal) {
		this.racaAnimal = racaAnimal;
	}

	public String getCidadeAnimal() {
		return cidadeAnimal;
	}

	public void setCidadeAnimal(String cidadeAnimal) {
		this.cidadeAnimal = cidadeAnimal;
	}

	public Boolean getCastrado() {
		return castrado;
	}

	public void setCastrado(Boolean castrado) {
		this.castrado = castrado;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Integer getCpfAnunciante() {
		return cpfAnunciante;
	}

	public void setCpfAnunciante(Integer cpfAnunciante) {
		this.cpfAnunciante = cpfAnunciante;
	}

	public Integer getIdadeAnimal() {
		return idadeAnimal;
	}

	public void setIdadeAnimal(Integer idadeAnimal) {
		this.idadeAnimal = idadeAnimal;
	}

	public Double getPesoAnimal() {
		return pesoAnimal;
	}

	public void setPesoAnimal(Double pesoAnimal) {
		this.pesoAnimal = pesoAnimal;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

	public String getEstadoAnunciante() {
		return estadoAnunciante;
	}

	public void setEstadoAnunciante(String estadoAnunciante) {
		this.estadoAnunciante = estadoAnunciante;
	}

	public String getEspecieAnimal() {
		return especieAnimal;
	}

	public void setEspecieAnimal(String especieAnimal) {
		this.especieAnimal = especieAnimal;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public adocao() {
		super();
	}

	public Long getId() {
		return id;
	}



   
}
