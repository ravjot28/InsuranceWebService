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
@Table(name = "CLOSE_FORM")
public class CloseFormBean {
	@Id
	@GeneratedValue(generator = "closeForm_seq1", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, initialValue = 1001, sequenceName = "closeForm_seq1", name = "closeForm_seq1")
	private Long id;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private InsuranceFormBean formBean;
	private String businessWithUs;
	private String company;
	private double quote;

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

	public String getBusinessWithUs() {
		return businessWithUs;
	}

	public void setBusinessWithUs(String businessWithUs) {
		this.businessWithUs = businessWithUs;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getQuote() {
		return quote;
	}

	public void setQuote(double quote) {
		this.quote = quote;
	}

}