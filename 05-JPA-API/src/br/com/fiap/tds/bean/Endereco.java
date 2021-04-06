package br.com.fiap.tds.bean;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "TB_ENDERECO")
@SequenceGenerator(name = "endereco", sequenceName = "SQ_TB_ENDERECO", allocationSize = 1)
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "endereco")
	@Column(name = "cd_endereco")
	private int id;

	@Column(name = "nr_cep", length = 8, nullable = false)
	private String cep;

	@Column(name = "nr_endereco", nullable = false)
	private int numero;

	@Column(name = "ds_logradouro", length = 50, nullable = false)
	private String logradouro;

	@Column(name = "st_ativo")
	private boolean ativo;

	@Column(name = "ds_tipo_endereco", length = 50)
	@Enumerated(EnumType.STRING)
	private TipoEndereco tipo;

	@CreationTimestamp // Cadastrar a data de forma automática
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_cadastro", updatable = false)
	private Calendar dataCadastro;

	public Endereco() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Construtor para usar na Classe de atualização
	public Endereco(int id, String cep, int numero, String logradouro, boolean ativo, TipoEndereco tipo) {
		super();
		this.id = id;
		this.cep = cep;
		this.numero = numero;
		this.logradouro = logradouro;
		this.ativo = ativo;
		this.tipo = tipo;
	}

	// para Cadastrar
	public Endereco(String cep, int numero, String logradouro, boolean ativo, TipoEndereco tipo) {
		super();
		this.cep = cep;
		this.numero = numero;
		this.logradouro = logradouro;
		this.ativo = ativo;
		this.tipo = tipo;
	}

	// Método que é executado automáticamente antes de cadastrar
	@PrePersist
	public void executar() {
		System.out.println("Cadastrando um endereço...");
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return "\nCódigo: " + id + "\nCEP: " + cep + "\nNúmero: " + numero + "\nLogradouro: " + logradouro + "\nAtivo: "
				+ ativo + "\nTipo: " + tipo + "\nData Cadastro: " + sdf.format(dataCadastro.getTime());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public TipoEndereco getTipo() {
		return tipo;
	}

	public void setTipo(TipoEndereco tipo) {
		this.tipo = tipo;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

}
