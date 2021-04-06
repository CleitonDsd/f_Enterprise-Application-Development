package br.com.fiap.tds.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_VEICULO")
@SequenceGenerator(name = "veiculo", sequenceName = "SQ_T_VEICULO", allocationSize = 1)
public class Veiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "veiculo")
	@Column(name = "cd_veiculo")
	private int codigo;

	@Column(name = "ds_placa", length = 9, nullable = false)
	private String placa;

	@Column(name = "ds_cor", length = 20, nullable = false)
	private String cor;

	@Column(name = "nr_ano")
	private int number;

	public Veiculo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Veiculo(int codigo, String placa, String cor, int number) {
		super();
		this.codigo = codigo;
		this.placa = placa;
		this.cor = cor;
		this.number = number;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
