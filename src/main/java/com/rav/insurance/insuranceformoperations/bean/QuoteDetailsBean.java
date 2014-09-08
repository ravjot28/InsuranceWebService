package com.rav.insurance.insuranceformoperations.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Quote_Details")
public class QuoteDetailsBean {
	@Id
	@GeneratedValue(generator = "quoteDetails_seq1", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, initialValue = 1001, sequenceName = "quoteDetails_seq1", name = "quoteDetails_seq1")
	private Long id;
	private String formId;
	private String companyname1;
	public String getCompanyname1() {
		return companyname1;
	}

	public void setCompanyname1(String companyname1) {
		this.companyname1 = companyname1;
	}

	public String getCompanyname2() {
		return companyname2;
	}

	public void setCompanyname2(String companyname2) {
		this.companyname2 = companyname2;
	}

	public String getCompanyname3() {
		return companyname3;
	}

	public void setCompanyname3(String companyname3) {
		this.companyname3 = companyname3;
	}

	public String getCompanyname4() {
		return companyname4;
	}

	public void setCompanyname4(String companyname4) {
		this.companyname4 = companyname4;
	}

	public String getCompanyname5() {
		return companyname5;
	}

	public void setCompanyname5(String companyname5) {
		this.companyname5 = companyname5;
	}

	public String getCompanyname6() {
		return companyname6;
	}

	public void setCompanyname6(String companyname6) {
		this.companyname6 = companyname6;
	}

	public String getCompanyname7() {
		return companyname7;
	}

	public void setCompanyname7(String companyname7) {
		this.companyname7 = companyname7;
	}

	public String getCompanyname8() {
		return companyname8;
	}

	public void setCompanyname8(String companyname8) {
		this.companyname8 = companyname8;
	}

	public String getCompanyname9() {
		return companyname9;
	}

	public void setCompanyname9(String companyname9) {
		this.companyname9 = companyname9;
	}

	public String getCompanyname10() {
		return companyname10;
	}

	public void setCompanyname10(String companyname10) {
		this.companyname10 = companyname10;
	}

	public String getComment1() {
		return comment1;
	}

	public void setComment1(String comment1) {
		this.comment1 = comment1;
	}

	public String getComment2() {
		return comment2;
	}

	public void setComment2(String comment2) {
		this.comment2 = comment2;
	}

	public String getComment3() {
		return comment3;
	}

	public void setComment3(String comment3) {
		this.comment3 = comment3;
	}

	public String getComment4() {
		return comment4;
	}

	public void setComment4(String comment4) {
		this.comment4 = comment4;
	}

	public String getComment5() {
		return comment5;
	}

	public void setComment5(String comment5) {
		this.comment5 = comment5;
	}

	public String getComment6() {
		return comment6;
	}

	public void setComment6(String comment6) {
		this.comment6 = comment6;
	}

	public String getComment7() {
		return comment7;
	}

	public void setComment7(String comment7) {
		this.comment7 = comment7;
	}

	public String getComment8() {
		return comment8;
	}

	public void setComment8(String comment8) {
		this.comment8 = comment8;
	}

	public String getComment9() {
		return comment9;
	}

	public void setComment9(String comment9) {
		this.comment9 = comment9;
	}

	public String getComment10() {
		return comment10;
	}

	public void setComment10(String comment10) {
		this.comment10 = comment10;
	}

	public double getQuote1() {
		return quote1;
	}

	public void setQuote1(double quote1) {
		this.quote1 = quote1;
	}

	public double getQuote2() {
		return quote2;
	}

	public void setQuote2(double quote2) {
		this.quote2 = quote2;
	}

	public double getQuote3() {
		return quote3;
	}

	public void setQuote3(double quote3) {
		this.quote3 = quote3;
	}

	public double getQuote4() {
		return quote4;
	}

	public void setQuote4(double quote4) {
		this.quote4 = quote4;
	}

	public double getQuote5() {
		return quote5;
	}

	public void setQuote5(double quote5) {
		this.quote5 = quote5;
	}

	public double getQuote6() {
		return quote6;
	}

	public void setQuote6(double quote6) {
		this.quote6 = quote6;
	}

	public double getQuote7() {
		return quote7;
	}

	public void setQuote7(double quote7) {
		this.quote7 = quote7;
	}

	public double getQuote8() {
		return quote8;
	}

	public void setQuote8(double quote8) {
		this.quote8 = quote8;
	}

	public double getQuote9() {
		return quote9;
	}

	public void setQuote9(double quote9) {
		this.quote9 = quote9;
	}

	public double getQuote10() {
		return quote10;
	}

	public void setQuote10(double quote10) {
		this.quote10 = quote10;
	}

	private String companyname2;
	private String companyname3;
	private String companyname4;
	private String companyname5;
	private String companyname6;
	private String companyname7;
	private String companyname8;
	private String companyname9;
	private String companyname10;
	
	private String comment1;
	private String comment2;
	private String comment3;
	private String comment4;
	private String comment5;
	private String comment6;
	private String comment7;
	private String comment8;
	private String comment9;
	private String comment10;
	
	private double quote1;
	private double quote2;
	private double quote3;
	private double quote4;
	private double quote5;
	private double quote6;
	private double quote7;
	private double quote8;
	private double quote9;
	private double quote10;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}
}