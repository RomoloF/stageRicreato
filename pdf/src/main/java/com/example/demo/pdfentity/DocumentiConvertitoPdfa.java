package com.example.demo.pdfentity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


/**
 * The persistent class for the documenti_convertito_pdfa database table.
 *
 */
@Entity
@Table(name="documenti_convertito_pdfa")
@NamedQuery(name="DocumentiConvertitoPdfa.findAll", query="SELECT d FROM DocumentiConvertitoPdfa d")
public class DocumentiConvertitoPdfa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Lob
	@Column(name="contenuto_pdf")
	private byte[] contenutoPdf;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="data_convertito")
	private Date dataConvertito;

	@Column(name="dimensione_file")
	private int dimensioneFile;

	@Column(name="nome_file")
	private String nomeFile;

	public DocumentiConvertitoPdfa() {
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

	public Date getDataConvertito() {
		return this.dataConvertito;
	}

	public void setDataConvertito(Date dataConvertito) {
		this.dataConvertito = dataConvertito;
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