package br.com.unialfa.projeto.model.entity;

import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class Processo {
	private IntegerProperty id;
	private StringProperty nome;
	private StringProperty status;
	private StringProperty comentarios;
	private LocalDate dataIni;
	
// não instanciado;
	private int idAluno;
	private String nomeAluno;
	private String nomeAdm;
	

	private String alunoNome;
	private String admDepart;
	private String statusPend;
	private int idOpen;
	private int cont;
	
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
	public StringProperty getStatus() {
		return status;
	}
	public void setStatus(StringProperty status) {
		this.status = status;
	}
	public StringProperty getComentarios() {
		return comentarios;
	}
	public void setComentarios(StringProperty comentarios) {
		this.comentarios = comentarios;
	}
	public LocalDate getDataIni() {
		return dataIni;
	}
	public void setDataIni(LocalDate dataIni) {
		this.dataIni = dataIni;
	}
	public int getIdAluno() {
		return idAluno;
	}
	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public String getNomeAdm() {
		return nomeAdm;
	}
	public void setNomeAdm(String nomeAdm) {
		this.nomeAdm = nomeAdm;
	}
	public String getAlunoNome() {
		return alunoNome;
	}
	public void setAlunoNome(String alunoNome) {
		this.alunoNome = alunoNome;
	}
	public String getAdmDepart() {
		return admDepart;
	}
	public void setAdmDepart(String admDepart) {
		this.admDepart = admDepart;
	}
	public String getStatusPend() {
		return statusPend;
	}
	public void setStatusPend(String statusPend) {
		this.statusPend = statusPend;
	}
	public int getIdOpen() {
		return idOpen;
	}
	public void setIdOpen(int idOpen) {
		this.idOpen = idOpen;
	}
	public int getCont() {
		return cont;
	}
	public void setCont(int cont) {
		this.cont = cont;
	}
	
	
}
