package br.com.unialfa.projeto.model.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class Aluno {
	private IntegerProperty id;
	private StringProperty nome;
	private StringProperty cpf;
	private StringProperty telefone;
	private StringProperty matricula;
	private StringProperty email;
	private StringProperty sexo;
	private StringProperty curso;
	private StringProperty ender;
	private StringProperty responsavel;
	private StringProperty city;
	private LocalDate dataNasci;
	
	private List<TipoProcesso> processos = new ArrayList<TipoProcesso>();
	private List<Documentos> documentos = new ArrayList<Documentos>();
	
	public IntegerProperty getId() {
		return id;
	}
	public void setId(IntegerProperty id) {
		this.id = id;
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
	public StringProperty getCurso() {
		return curso;
	}
	public void setCurso(StringProperty curso) {
		this.curso = curso;
	}
	public StringProperty getEnder() {
		return ender;
	}
	public void setEnder(StringProperty ender) {
		this.ender = ender;
	}
	public StringProperty getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(StringProperty responsavel) {
		this.responsavel = responsavel;
	}
	public StringProperty getCity() {
		return city;
	}
	public void setCity(StringProperty city) {
		this.city = city;
	}
	public LocalDate getDataNasci() {
		return dataNasci;
	}
	public void setDataNasci(LocalDate dataNasci) {
		this.dataNasci = dataNasci;
	}
	public List<TipoProcesso> getProcessos() {
		return processos;
	}
	public void setProcessos(List<TipoProcesso> processos) {
		this.processos = processos;
	}
	public List<Documentos> getDocumentos() {
		return documentos;
	}
	public void setDocumentos(List<Documentos> documentos) {
		this.documentos = documentos;
	}
	
}
