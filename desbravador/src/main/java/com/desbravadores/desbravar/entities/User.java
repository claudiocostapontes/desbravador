package com.desbravadores.desbravar.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String insercao;
	private String exclusao;
	private String alteracao;
	private String consulta;
	
	public User( ) {
	}

	public User(Long id, String insercao, String exclusao, String alteracao, String consulta) {
		super();
		this.id = id;
		this.insercao = insercao;
		this.exclusao = exclusao;
		this.alteracao = alteracao;
		this.consulta = consulta;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getInsercao() {
		return insercao;
	}

	public void setInsercao(String insercao) {
		this.insercao = insercao;
	}

	public String getExclusao() {
		return exclusao;
	}

	public void setExclusao(String exclusao) {
		this.exclusao = exclusao;
	}

	public String getAlteracao() {
		return alteracao;
	}

	public void setAlteracao(String alteracao) {
		this.alteracao = alteracao;
	}

	public String getConsulta() {
		return consulta;
	}

	public void setConsulta(String consulta) {
		this.consulta = consulta;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
