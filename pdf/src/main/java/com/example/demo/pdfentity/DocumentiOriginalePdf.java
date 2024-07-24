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
 * The persistent class for the documenti_originale_pdf database table.
 *
 */
@Entity
@Table(name="documenti_originale_pdf")
@NamedQuery(name="DocumentiOriginalePdf.findAll", query="SELECT d FROM DocumentiOriginalePdf d")
public class DocumentiOriginalePdf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Lob
	@Column(name="contenuto_pdf")
	private byte[] contenutoPdf;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="data_creazione")
	private Date dataCreazione;

	@Column(name="dimensione_file")
	private int dimensioneFile;

	@Column(name="nome_file")
	private String nomeFile;

	public DocumentiOriginalePdf() {
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

	public Date getDataCreazione() {
		return this.dataCreazione;
	}

	public void setDataCreazione(Date dataCreazione) {
		this.dataCreazione = dataCreazione;
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

}