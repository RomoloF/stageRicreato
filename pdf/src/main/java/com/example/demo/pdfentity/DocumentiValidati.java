package com.example.demo.pdfentity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


/**
 * The persistent class for the documenti_validati database table.
 * 
 */
@Entity
@Table(name="documenti_validati")
@NamedQuery(name="DocumentiValidati.findAll", query="SELECT d FROM DocumentiValidati d")
public class DocumentiValidati implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Lob
	@Column(name="contenuto_pdf")
	private byte[] contenutoPdf;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="data_validazione")
	private Date dataValidazione;

	@Column(name="dimensione_file")
	private int dimensioneFile;

	@Column(name="nome_file")
	private String nomeFile;

	private byte valido;

	public DocumentiValidati() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte[] getContenutoPdf() {
		return this.contenutoPdf;
	}

	public void setContenutoPdf(byte[] contenutoPdf) {
		this.contenutoPdf = contenutoPdf;
	}

	public Date getDataValidazione() {
		return this.dataValidazione;
	}

	public void setDataValidazione(Date dataValidazione) {
		this.dataValidazione = dataValidazione;
	}

	public int getDimensioneFile() {
		return this.dimensioneFile;
	}

	public void setDimensioneFile(int dimensioneFile) {
		this.dimensioneFile = dimensioneFile;
	}

	public String getNomeFile() {
		return this.nomeFile;
	}

	public void setNomeFile(String nomeFile) {
		this.nomeFile = nomeFile;
	}

	public byte getValido() {
		return this.valido;
	}

	public void setValido(byte valido) {
		this.valido = valido;
	}

}