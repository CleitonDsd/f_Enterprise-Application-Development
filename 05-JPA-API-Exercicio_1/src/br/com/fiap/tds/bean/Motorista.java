package br.com.fiap.tds.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_MOTORISTA")
public class Motorista {

	@Id
	@Column(name = "nr_carteira", nullable = false)
	private int numeroCarteira;

	@Column(name = "nm_motorista", length = 150, nullable = false)
	private String nome;

	@Column(name = "dt_nascimento")
	private Date dataNascimento;

	@Column(name = "fl_carteira")
	private byte[][] fotoCarteira;

	@Column(name = "ds_genero")
	private Genero genero;

}
