package br.com.unialfa.projeto.model.entity;

import java.util.ArrayList;
import java.util.List;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class Usuarios {
	private IntegerProperty id;
	private StringProperty tipoUser;
	private StringProperty nome;
	private StringProperty cpf;
	private StringProperty telefone;
	private StringProperty matricula;
	private StringProperty email;
	private StringProperty sexo;
	private StringProperty cargo;
	private StringProperty departamento;

	
	private String senha;
	private String login;
	
	private List<TipoProcesso> procPendentes = new ArrayList<TipoProcesso>();

	public IntegerProperty getId() {
		return id;
	}

	public void setId(IntegerProperty id) {
		this.id = id;
	}

	public StringProperty getTipoUser() {
		return tipoUser;
	}

	public void setTipoUser(StringProperty tipoUser) {
		this.tipoUser = tipoUser;
	}

	public StringProperty getNome() {
		return nome;
	}

	public void setNome(StringProperty nome) {
		this.nome = nome;
	}

	public StringProperty getCpf() {
		return cpf;
	}

	public void setCpf(StringProperty cpf) {
		this.cpf = cpf;
	}

	public StringProperty getTelefone() {
		return telefone;
	}

	public void setTelefone(StringProperty telefone) {
		this.telefone = telefone;
	}

	public StringProperty getMatricula() {
		return matricula;
	}

	public void setMatricula(StringProperty matricula) {
		this.matricula = matricula;
	}

	public StringProperty getEmail() {
		return email;
	}

	public void setEmail(StringProperty email) {
		this.email = email;
	}

	public StringProperty getSexo() {
		return sexo;
	}

	public void setSexo(StringProperty sexo) {
		this.sexo = sexo;
	}

	public StringProperty getCargo() {
		return cargo;
	}

	public void setCargo(StringProperty cargo) {
		this.cargo = cargo;
	}

	public StringProperty getDepartamento() {
		return departamento;
	}

	public void setDepartamento(StringProperty departamento) {
		this.departamento = departamento;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public List<TipoProcesso> getProcPendentes() {
		return procPendentes;
	}

	public void setProcPendentes(List<TipoProcesso> procPendentes) {
		this.procPendentes = procPendentes;
	}
	
	
}
