package com.rav.insurance.insuranceformoperations.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Quote_Details")
public class QuoteDetailsBean {
	@Id
	@GeneratedValue(generator = "quoteDetails_seq1", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, initialValue = 1001, sequenceName = "quoteDetails_seq1", name = "quoteDetails_seq1")
	private Long id;

	private double abex;
	private double amFredericks;
	private double april;
	private double aviva;
	private double cfc;
	private double BurnsnWilcox;
	private double chutter;
	private double cNA;
	private double creechurch;
	private double dominion;
	private double ecclesiastical;
	private double encon;
	private double groupOne;
	private double gore;
	private double intact;
	private double lloyds;
	private double northbridge;
	private double premierMarine;
	private double rSA;
	private double southWestern;
	private double sRIM;
	private double sUM;
	private double tCIM;
	private double totte;
	private double zurich;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private InsuranceFormBean formBean;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public InsuranceFormBean getFormBean() {
		return formBean;
	}

	public void setFormBean(InsuranceFormBean formBean) {
		this.formBean = formBean;
	}

	public double getAbex() {
		return abex;
	}

	public void setAbex(double abex) {
		this.abex = abex;
	}

	public double getAmFredericks() {
		return amFredericks;
	}

	public void setAmFredericks(double amFredericks) {
		this.amFredericks = amFredericks;
	}

	public double getApril() {
		return april;
	}

	public void setApril(double april) {
		this.april = april;
	}

	public double getAviva() {
		return aviva;
	}

	public void setAviva(double aviva) {
		this.aviva = aviva;
	}

	public double getCfc() {
		return cfc;
	}

	public void setCfc(double cfc) {
		this.cfc = cfc;
	}

	public double getBurnsnWilcox() {
		return BurnsnWilcox;
	}

	public void setBurnsnWilcox(double burnsnWilcox) {
		BurnsnWilcox = burnsnWilcox;
	}

	public double getChutter() {
		return chutter;
	}

	public void setChutter(double chutter) {
		this.chutter = chutter;
	}

	public double getcNA() {
		return cNA;
	}

	public void setcNA(double cNA) {
		this.cNA = cNA;
	}

	public double getCreechurch() {
		return creechurch;
	}

	public void setCreechurch(double creechurch) {
		this.creechurch = creechurch;
	}

	public double getDominion() {
		return dominion;
	}

	public void setDominion(double dominion) {
		this.dominion = dominion;
	}

	public double getEcclesiastical() {
		return ecclesiastical;
	}

	public void setEcclesiastical(double ecclesiastical) {
		this.ecclesiastical = ecclesiastical;
	}

	public double getEncon() {
		return encon;
	}

	public void setEncon(double encon) {
		this.encon = encon;
	}

	public double getGroupOne() {
		return groupOne;
	}

	public void setGroupOne(double groupOne) {
		this.groupOne = groupOne;
	}

	public double getGore() {
		return gore;
	}

	public void setGore(double gore) {
		this.gore = gore;
	}

	public double getIntact() {
		return intact;
	}

	public void setIntact(double intact) {
		this.intact = intact;
	}

	public double getLloyds() {
		return lloyds;
	}

	public void setLloyds(double lloyds) {
		this.lloyds = lloyds;
	}

	public double getNorthbridge() {
		return northbridge;
	}

	public void setNorthbridge(double northbridge) {
		this.northbridge = northbridge;
	}

	public double getPremierMarine() {
		return premierMarine;
	}

	public void setPremierMarine(double premierMarine) {
		this.premierMarine = premierMarine;
	}

	public double getrSA() {
		return rSA;
	}

	public void setrSA(double rSA) {
		this.rSA = rSA;
	}

	public double getSouthWestern() {
		return southWestern;
	}

	public void setSouthWestern(double southWestern) {
		this.southWestern = southWestern;
	}

	public double getsRIM() {
		return sRIM;
	}

	public void setsRIM(double sRIM) {
		this.sRIM = sRIM;
	}

	public double getsUM() {
		return sUM;
	}

	public void setsUM(double sUM) {
		this.sUM = sUM;
	}

	public double gettCIM() {
		return tCIM;
	}

	public void settCIM(double tCIM) {
		this.tCIM = tCIM;
	}

	public double getTotte() {
		return totte;
	}

	public void setTotte(double totte) {
		this.totte = totte;
	}

	public double getZurich() {
		return zurich;
	}

	public void setZurich(double zurich) {
		this.zurich = zurich;
	}

}