package br.com.unialfa.projeto.model.entity;

import java.util.List;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class TipoProcesso {
	private IntegerProperty id;
	private StringProperty nome;
	private StringProperty descricao;

	private List<Documentos>documentos;
	private List<Responsavel> fluxo ;
	private List<Administrador> fluxoAdm ;
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
	public StringProperty getDescricao() {
		return descricao;
	}
	public void setDescricao(StringProperty descricao) {
		this.descricao = descricao;
	}
	public List<Documentos> getDocumentos() {
		return documentos;
	}
	public void setDocumentos(List<Documentos> documentos) {
		this.documentos = documentos;
	}
	public List<Responsavel> getFluxo() {
		return fluxo;
	}
	public void setFluxo(List<Responsavel> fluxo) {
		this.fluxo = fluxo;
	}
	public List<Administrador> getFluxoAdm() {
		return fluxoAdm;
	}
	public void setFluxoAdm(List<Administrador> fluxoAdm) {
		this.fluxoAdm = fluxoAdm;
	}
	
}
