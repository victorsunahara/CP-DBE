package br.com.fiap.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Column(name = "cd_user")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nm_user")
	private String name;
	@Column(name = "dt_nasc")
	private Date dtNascimento;
	@Column(name = "ds_email")
	private String email;
	@Column(name = "ds_senha")
	private String senha;

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", dtNascimento=" + dtNascimento + ", email=" + email + ", senha="
				+ senha + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
