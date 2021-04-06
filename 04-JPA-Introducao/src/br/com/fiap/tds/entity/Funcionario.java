package br.com.fiap.tds.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tb_funcionario")
@SequenceGenerator(name = "funcionario", sequenceName = "sq_funcionario", allocationSize = 1001)
public class Funcionario {

	@Id
	@Column(name = "cd_funcionario")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "funcionario")
	private int codigo;

	@Column(name = "nm_funcionario", length = 100)
	private String nome;

	@Enumerated(EnumType.STRING)
	@Column(name = "ds_tipo_contrato")
	private TipoContrato tipoContrato;

	@Temporal(TemporalType.DATE)
	@Column(name = "dt_contratacao")
	private Calendar dataContratacao;

	@Column(name = "vl_salario", scale = 2, precision = 1)
	private double salario;

	@Column(name = "fl_foto")
	private byte[] foto;

	@Column(name = "ds_cargo", length = 50)
	private String cargo;

	@Column(name = "st_pcd", nullable = false)
	private boolean pcd;

	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Funcionario(int codigo, String nome, TipoContrato tipoContrato, Calendar dataContratacao, double salario,
			byte[] foto, String cargo, boolean pcd) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.tipoContrato = tipoContrato;
		this.dataContratacao = dataContratacao;
		this.salario = salario;
		this.foto = foto;
		this.cargo = cargo;
		this.pcd = pcd;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoContrato getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(TipoContrato tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	public Calendar getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(Calendar dataContratacao) {
		this.dataContratacao = dataContratacao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public boolean isPcd() {
		return pcd;
	}

	public void setPcd(boolean pcd) {
		this.pcd = pcd;
	}

}
