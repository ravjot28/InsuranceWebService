package com.rav.insurance.insuranceformoperations.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "INSURANCE_FORM")
public class InsuranceFormBean {

	@Id
	@GeneratedValue(generator = "formID_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, initialValue = 1001, sequenceName = "formID_seq", name = "formID_seq")
	private int id;
	private Date creationDate;
	private String producer;
	private String branch;

	private String keyContact;
	private String keyContactPhone;
	private String keyContactEmailAddress;
	private String secondayContact;
	private String secondayContactPhone;
	private String secondayContactEmailAddress;

	private String businessCategory;
	private String businessName;
	private String mailingAddress;
	private String fax;
	private String webSiteURL;
	private int numberOfLocations;
	private int numberOfOwnedAutos;

	private String entityType;
	private boolean profit;
	private boolean nonProfit;
	private String yearInBusiness;
	private String relatedExperience;

	private String owners;
	private String boardOfDirectors;
	private String financialYearEnd;
	private int noOfStaff;
	private double payRoll;
	private boolean groupBenefits;
	private boolean pensionPlan;
	private String descriptionOfOperationsAndRevenue1;
	private double amount1;
	private String descriptionOfOperationsAndRevenue2;
	private double amount2;
	private String descriptionOfOperationsAndRevenue3;
	private double amount3;
	private String descriptionOfOperationsAndRevenue4;
	private double amount4;
	private String descriptionOfOperationsAndRevenue5;
	private double amount5;
	private String descriptionOfOperationsAndRevenue6;
	private double amount6;
	private double totalSale;
	private double percentageOfUSSales;

	private String largestCustomerOrProject1;
	private String largestCustomerOrProject2;
	private String largestCustomerOrProject3;
	private String largestCustomerOrProject4;
	private String largestCustomerOrProject5;
	private String largestCustomerOrProject6;
	private String largestSuppliers1;
	private String largestSuppliers2;
	private String largestSuppliers3;
	private String largestSuppliers4;

	private boolean bondingOpportunities;
	private String futureOpportunitiesOrPlanOfGrowth;
	private String describeCompetition;
	private String businessAsset;
	private String advertising;
	private boolean businessInterruptionSheet;
	private String durationIncaseOfSeriousClaims;
	private String pastClaimCause1;
	private Date pastClaimDate1;
	private double pastClaimAmount1;
	private String pastClaimCause2;
	private Date pastClaimDate2;
	private double pastClaimAmount2;
	private String pastClaimCause3;
	private Date pastClaimDate3;
	private double pastClaimAmount3;
	private String pastClaimCause4;
	private Date pastClaimDate4;
	private double pastClaimAmount4;
	private String pastClaimCause5;
	private Date pastClaimDate5;
	private double pastClaimAmount5;
	private String pastClaimCause6;
	private Date pastClaimDate6;
	private double pastClaimAmount6;

	private String currentInsuranceType1;
	private String currentInsuranceCarrier1;
	private String currentInsuranceExpiry1;
	private String currentInsuranceType2;
	private String currentInsuranceCarrier2;
	private String currentInsuranceExpiry2;
	private String currentInsuranceType3;
	private String currentInsuranceCarrier3;
	private String currentInsuranceExpiry3;
	private String currentInsuranceType4;
	private String currentInsuranceCarrier4;
	private String currentInsuranceExpiry4;

	private String lineHolders1;
	private String lineHoldersLoc1;
	private String lineHolders2;
	private String lineHoldersLoc2;
	private String lineHolders3;
	private String lineHoldersLoc3;
	private String lineHolders4;
	private String lineHoldersLoc4;

	private String addressOfLocation1;
	private String addressOfLocationUse1;
	private boolean addressOfLocationOwned1;
	private String addressOfLocation2;
	private String addressOfLocationUse2;
	private boolean addressOfLocationOwned2;
	private String addressOfLocation3;
	private String addressOfLocationUse3;
	private boolean addressOfLocationOwned3;
	private String addressOfLocation4;
	private String addressOfLocationUse4;
	private boolean addressOfLocationOwned4;
	private String addressOfLocation5;
	private String addressOfLocationUse5;
	private boolean addressOfLocationOwned5;

	private String locationRentedToOthers1;
	private String locationRentedToOthers2;
	private String locationRentedToOthers3;
	private String locationRentedToOthers4;
	private String locationRentedToOthers5;

	private double buildingLimit;
	private double buildingDeductible;
	private double contentsLimit;
	private double contentsDeductible;
	private double stockLimit;
	private double stockDeductible;
	private double officeContentLimit;
	private double officeContentDeductible;
	private double edpLimit;
	private double edpDeductible;
	private double equipmentLimit;
	private double equipmentDeductible;
	private double offPremisesLimit;
	private double offPremisesDeductible;
	private double transitLimit;
	private double transitDeductible;
	private double miscPropertyLimit;
	private double miscPropertyDeductible;
	private double contractorEquipmentLimit;
	private double contractorEquipmentDeductible;
	private double installationFloaterLimit;
	private double installationFloaterDeductible;
	private double toolFloaterLimit;
	private double toolFloaterDeductible;
	private double signFloaterLimit;
	private double signFloaterDeductible;
	private boolean truckMan;
	private boolean owner;
	private double motorTruckLimit;
	private double motorTruckDeductible;
	private double glassLimit;
	private double glassDeductible;
	private double sewerBackupLimit;
	private double sewerBackupDeductible;
	private double floodLimit;
	private double floodDeductible;
	private double earthquakeLimit;
	private double earthquakeDeductible;
	private double profitLimit;
	private double profitDeductible;
	private boolean grossEarning80;
	private boolean grossEarning50;
	private double grossEarningLimit;
	private double grossEarningDeductible;
	private double rentalIncomeLimit;
	private double rentalIncomeDeductible;
	private double extraExpenseLimit;
	private double extraExpenseDeductible;
	private double offPremisesPowerLimit;
	private double offPremisesPowerDeductible;
	private double insideOutsideLimit;
	private double insideOutsideDeductible;
	private double bfMoneyLimit;
	private double bfMoneyDeductible;
	private double deopistorForgeryLimit;
	private double deopistorForgeryDeductible;
	private double moneyOrdersLimit;
	private double moneyOrdersDeductible;
	private double employDishonestyLimit;
	private double employDishonestyDeductible;
	private double cglLimit;
	private double cglDeductible;
	private double tenantsLegalLimit;
	private double tenantsLegalDeductible;
	private double nonOwnedAutoLimit;
	private double nonOwnedAutoDeductible;
	private double sef96Limit;
	private double sef96Deductible;
	private double sef94Limit;
	private double sef94Deductible;
	private double doLimit;
	private double doDeductible;
	private double eoLimit;
	private double eoDeductible;
	private double employerLimit;
	private double employerDeductible;
	private double umbrellaLimit;
	private double umbrellaDeductible;
	private double wrapUpLimit;
	private double wrapUpDeductible;
	private double stdComprehensiveLimit;
	private double stdComprehensiveDeductible;
	private double airConditioningLimit;
	private double airConditioningDeductible;
	private double productionMachineryLimit;
	private double productionMachineryDeductible;
	private double otherCoverageLimit;
	private double otherCoverageDeductible;

	private String address;
	private int age;
	private double totalSqFootage;
	private double insdSqFootage;
	private int noOfStories;
	private boolean basement;
	private String walls;
	private String roof;
	private String floors;
	private String heating;
	private String electrical;
	private String plumbing;
	private String fireProtection;
	private String security;
	private String notes;

	private String currentInsurer;
	private Date currentExpDate;
	private double premiumTarget;

	private String lienHolders1;
	private String lienHoldersVehicle1;
	private String lienHolders2;
	private String lienHoldersVehicle2;
	private String lienHolders3;
	private String lienHoldersVehicle3;
	private String lienHolders4;
	private String lienHoldersVehicle4;
	private String lienHolders5;
	private String lienHoldersVehicle5;
	private Date claimDate1;
	private String claimDesc1;
	private Date claimDate2;
	private String claimDesc2;
	private Date claimDate3;
	private String claimDesc3;
	private Date claimDate4;
	private String claimDesc4;
	private Date claimDate5;
	private String claimDesc5;
	private Date claimDate6;
	private String claimDesc6;
	private double commoditiesTransportedBy;
	private String haulingForOthers;

	private String filingState1;
	private String filingUSDot1;
	private String dilingDocket1;
	private String filingType1;
	private String filingName1;
	private String filingState2;
	private String filingUSDot2;
	private String dilingDocket2;
	private String filingType2;
	private String filingName2;
	private String filingState3;
	private String filingUSDot3;
	private String dilingDocket3;
	private String filingType3;
	private String filingName3;
	private String filingState4;
	private String filingUSDot4;
	private String dilingDocket4;
	private String filingType4;
	private String filingName4;

	private boolean vehicleNonOwned;
	private boolean contract;
	private String typeOfNonOwned;
	private double avgNoOfVehicles;
	private double avgValue;
	private double maxVehicleValue;
	private double maxCostValue;
	private String instructionNotes;

	private String marketerUserName;
	private String status;
	private String producerUserName;
	
	

	public String getProducerUserName() {
		return producerUserName;
	}

	public void setProducerUserName(String producerUserName) {
		this.producerUserName = producerUserName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getKeyContact() {
		return keyContact;
	}

	public void setKeyContact(String keyContact) {
		this.keyContact = keyContact;
	}

	public String getKeyContactPhone() {
		return keyContactPhone;
	}

	public void setKeyContactPhone(String keyContactPhone) {
		this.keyContactPhone = keyContactPhone;
	}

	public String getKeyContactEmailAddress() {
		return keyContactEmailAddress;
	}

	public void setKeyContactEmailAddress(String keyContactEmailAddress) {
		this.keyContactEmailAddress = keyContactEmailAddress;
	}

	public String getSecondayContact() {
		return secondayContact;
	}

	public void setSecondayContact(String secondayContact) {
		this.secondayContact = secondayContact;
	}

	public String getSecondayContactPhone() {
		return secondayContactPhone;
	}

	public void setSecondayContactPhone(String secondayContactPhone) {
		this.secondayContactPhone = secondayContactPhone;
	}

	public String getSecondayContactEmailAddress() {
		return secondayContactEmailAddress;
	}

	public void setSecondayContactEmailAddress(
			String secondayContactEmailAddress) {
		this.secondayContactEmailAddress = secondayContactEmailAddress;
	}

	public String getBusinessCategory() {
		return businessCategory;
	}

	public void setBusinessCategory(String businessCategory) {
		this.businessCategory = businessCategory;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getMailingAddress() {
		return mailingAddress;
	}

	public void setMailingAddress(String mailingAddress) {
		this.mailingAddress = mailingAddress;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getWebSiteURL() {
		return webSiteURL;
	}

	public void setWebSiteURL(String webSiteURL) {
		this.webSiteURL = webSiteURL;
	}

	public int getNumberOfLocations() {
		return numberOfLocations;
	}

	public void setNumberOfLocations(int numberOfLocations) {
		this.numberOfLocations = numberOfLocations;
	}

	public int getNumberOfOwnedAutos() {
		return numberOfOwnedAutos;
	}

	public void setNumberOfOwnedAutos(int numberOfOwnedAutos) {
		this.numberOfOwnedAutos = numberOfOwnedAutos;
	}

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public boolean isProfit() {
		return profit;
	}

	public void setProfit(boolean profit) {
		this.profit = profit;
	}

	public boolean isNonProfit() {
		return nonProfit;
	}

	public void setNonProfit(boolean nonProfit) {
		this.nonProfit = nonProfit;
	}

	public String getYearInBusiness() {
		return yearInBusiness;
	}

	public void setYearInBusiness(String yearInBusiness) {
		this.yearInBusiness = yearInBusiness;
	}

	public String getRelatedExperience() {
		return relatedExperience;
	}

	public void setRelatedExperience(String relatedExperience) {
		this.relatedExperience = relatedExperience;
	}

	public String getOwners() {
		return owners;
	}

	public void setOwners(String owners) {
		this.owners = owners;
	}

	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}

	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}

	public String getFinancialYearEnd() {
		return financialYearEnd;
	}

	public void setFinancialYearEnd(String financialYearEnd) {
		this.financialYearEnd = financialYearEnd;
	}

	public int getNoOfStaff() {
		return noOfStaff;
	}

	public void setNoOfStaff(int noOfStaff) {
		this.noOfStaff = noOfStaff;
	}

	public double getPayRoll() {
		return payRoll;
	}

	public void setPayRoll(double payRoll) {
		this.payRoll = payRoll;
	}

	public boolean isGroupBenefits() {
		return groupBenefits;
	}

	public void setGroupBenefits(boolean groupBenefits) {
		this.groupBenefits = groupBenefits;
	}

	public boolean isPensionPlan() {
		return pensionPlan;
	}

	public void setPensionPlan(boolean pensionPlan) {
		this.pensionPlan = pensionPlan;
	}

	public String getDescriptionOfOperationsAndRevenue1() {
		return descriptionOfOperationsAndRevenue1;
	}

	public void setDescriptionOfOperationsAndRevenue1(
			String descriptionOfOperationsAndRevenue1) {
		this.descriptionOfOperationsAndRevenue1 = descriptionOfOperationsAndRevenue1;
	}

	public double getAmount1() {
		return amount1;
	}

	public void setAmount1(double amount1) {
		this.amount1 = amount1;
	}

	public String getDescriptionOfOperationsAndRevenue2() {
		return descriptionOfOperationsAndRevenue2;
	}

	public void setDescriptionOfOperationsAndRevenue2(
			String descriptionOfOperationsAndRevenue2) {
		this.descriptionOfOperationsAndRevenue2 = descriptionOfOperationsAndRevenue2;
	}

	public double getAmount2() {
		return amount2;
	}

	public void setAmount2(double amount2) {
		this.amount2 = amount2;
	}

	public String getDescriptionOfOperationsAndRevenue3() {
		return descriptionOfOperationsAndRevenue3;
	}

	public void setDescriptionOfOperationsAndRevenue3(
			String descriptionOfOperationsAndRevenue3) {
		this.descriptionOfOperationsAndRevenue3 = descriptionOfOperationsAndRevenue3;
	}

	public double getAmount3() {
		return amount3;
	}

	public void setAmount3(double amount3) {
		this.amount3 = amount3;
	}

	public String getDescriptionOfOperationsAndRevenue4() {
		return descriptionOfOperationsAndRevenue4;
	}

	public void setDescriptionOfOperationsAndRevenue4(
			String descriptionOfOperationsAndRevenue4) {
		this.descriptionOfOperationsAndRevenue4 = descriptionOfOperationsAndRevenue4;
	}

	public double getAmount4() {
		return amount4;
	}

	public void setAmount4(double amount4) {
		this.amount4 = amount4;
	}

	public String getDescriptionOfOperationsAndRevenue5() {
		return descriptionOfOperationsAndRevenue5;
	}

	public void setDescriptionOfOperationsAndRevenue5(
			String descriptionOfOperationsAndRevenue5) {
		this.descriptionOfOperationsAndRevenue5 = descriptionOfOperationsAndRevenue5;
	}

	public double getAmount5() {
		return amount5;
	}

	public void setAmount5(double amount5) {
		this.amount5 = amount5;
	}

	public String getDescriptionOfOperationsAndRevenue6() {
		return descriptionOfOperationsAndRevenue6;
	}

	public void setDescriptionOfOperationsAndRevenue6(
			String descriptionOfOperationsAndRevenue6) {
		this.descriptionOfOperationsAndRevenue6 = descriptionOfOperationsAndRevenue6;
	}

	public double getAmount6() {
		return amount6;
	}

	public void setAmount6(double amount6) {
		this.amount6 = amount6;
	}

	public double getTotalSale() {
		return totalSale;
	}

	public void setTotalSale(double totalSale) {
		this.totalSale = totalSale;
	}

	public double getPercentageOfUSSales() {
		return percentageOfUSSales;
	}

	public void setPercentageOfUSSales(double percentageOfUSSales) {
		this.percentageOfUSSales = percentageOfUSSales;
	}

	public String getLargestCustomerOrProject1() {
		return largestCustomerOrProject1;
	}

	public void setLargestCustomerOrProject1(String largestCustomerOrProject1) {
		this.largestCustomerOrProject1 = largestCustomerOrProject1;
	}

	public String getLargestCustomerOrProject2() {
		return largestCustomerOrProject2;
	}

	public void setLargestCustomerOrProject2(String largestCustomerOrProject2) {
		this.largestCustomerOrProject2 = largestCustomerOrProject2;
	}

	public String getLargestCustomerOrProject3() {
		return largestCustomerOrProject3;
	}

	public void setLargestCustomerOrProject3(String largestCustomerOrProject3) {
		this.largestCustomerOrProject3 = largestCustomerOrProject3;
	}

	public String getLargestCustomerOrProject4() {
		return largestCustomerOrProject4;
	}

	public void setLargestCustomerOrProject4(String largestCustomerOrProject4) {
		this.largestCustomerOrProject4 = largestCustomerOrProject4;
	}

	public String getLargestCustomerOrProject5() {
		return largestCustomerOrProject5;
	}

	public void setLargestCustomerOrProject5(String largestCustomerOrProject5) {
		this.largestCustomerOrProject5 = largestCustomerOrProject5;
	}

	public String getLargestCustomerOrProject6() {
		return largestCustomerOrProject6;
	}

	public void setLargestCustomerOrProject6(String largestCustomerOrProject6) {
		this.largestCustomerOrProject6 = largestCustomerOrProject6;
	}

	public String getLargestSuppliers1() {
		return largestSuppliers1;
	}

	public void setLargestSuppliers1(String largestSuppliers1) {
		this.largestSuppliers1 = largestSuppliers1;
	}

	public String getLargestSuppliers2() {
		return largestSuppliers2;
	}

	public void setLargestSuppliers2(String largestSuppliers2) {
		this.largestSuppliers2 = largestSuppliers2;
	}

	public String getLargestSuppliers3() {
		return largestSuppliers3;
	}

	public void setLargestSuppliers3(String largestSuppliers3) {
		this.largestSuppliers3 = largestSuppliers3;
	}

	public String getLargestSuppliers4() {
		return largestSuppliers4;
	}

	public void setLargestSuppliers4(String largestSuppliers4) {
		this.largestSuppliers4 = largestSuppliers4;
	}

	public boolean isBondingOpportunities() {
		return bondingOpportunities;
	}

	public void setBondingOpportunities(boolean bondingOpportunities) {
		this.bondingOpportunities = bondingOpportunities;
	}

	public String getFutureOpportunitiesOrPlanOfGrowth() {
		return futureOpportunitiesOrPlanOfGrowth;
	}

	public void setFutureOpportunitiesOrPlanOfGrowth(
			String futureOpportunitiesOrPlanOfGrowth) {
		this.futureOpportunitiesOrPlanOfGrowth = futureOpportunitiesOrPlanOfGrowth;
	}

	public String getDescribeCompetition() {
		return describeCompetition;
	}

	public void setDescribeCompetition(String describeCompetition) {
		this.describeCompetition = describeCompetition;
	}

	public String getBusinessAsset() {
		return businessAsset;
	}

	public void setBusinessAsset(String businessAsset) {
		this.businessAsset = businessAsset;
	}

	public String getAdvertising() {
		return advertising;
	}

	public void setAdvertising(String advertising) {
		this.advertising = advertising;
	}

	public boolean isBusinessInterruptionSheet() {
		return businessInterruptionSheet;
	}

	public void setBusinessInterruptionSheet(boolean businessInterruptionSheet) {
		this.businessInterruptionSheet = businessInterruptionSheet;
	}

	public String getDurationIncaseOfSeriousClaims() {
		return durationIncaseOfSeriousClaims;
	}

	public void setDurationIncaseOfSeriousClaims(
			String durationIncaseOfSeriousClaims) {
		this.durationIncaseOfSeriousClaims = durationIncaseOfSeriousClaims;
	}

	public String getPastClaimCause1() {
		return pastClaimCause1;
	}

	public void setPastClaimCause1(String pastClaimCause1) {
		this.pastClaimCause1 = pastClaimCause1;
	}

	public Date getPastClaimDate1() {
		return pastClaimDate1;
	}

	public void setPastClaimDate1(Date pastClaimDate1) {
		this.pastClaimDate1 = pastClaimDate1;
	}

	public double getPastClaimAmount1() {
		return pastClaimAmount1;
	}

	public void setPastClaimAmount1(double pastClaimAmount1) {
		this.pastClaimAmount1 = pastClaimAmount1;
	}

	public String getPastClaimCause2() {
		return pastClaimCause2;
	}

	public void setPastClaimCause2(String pastClaimCause2) {
		this.pastClaimCause2 = pastClaimCause2;
	}

	public Date getPastClaimDate2() {
		return pastClaimDate2;
	}

	public void setPastClaimDate2(Date pastClaimDate2) {
		this.pastClaimDate2 = pastClaimDate2;
	}

	public double getPastClaimAmount2() {
		return pastClaimAmount2;
	}

	public void setPastClaimAmount2(double pastClaimAmount2) {
		this.pastClaimAmount2 = pastClaimAmount2;
	}

	public String getPastClaimCause3() {
		return pastClaimCause3;
	}

	public void setPastClaimCause3(String pastClaimCause3) {
		this.pastClaimCause3 = pastClaimCause3;
	}

	public Date getPastClaimDate3() {
		return pastClaimDate3;
	}

	public void setPastClaimDate3(Date pastClaimDate3) {
		this.pastClaimDate3 = pastClaimDate3;
	}

	public double getPastClaimAmount3() {
		return pastClaimAmount3;
	}

	public void setPastClaimAmount3(double pastClaimAmount3) {
		this.pastClaimAmount3 = pastClaimAmount3;
	}

	public String getPastClaimCause4() {
		return pastClaimCause4;
	}

	public void setPastClaimCause4(String pastClaimCause4) {
		this.pastClaimCause4 = pastClaimCause4;
	}

	public Date getPastClaimDate4() {
		return pastClaimDate4;
	}

	public void setPastClaimDate4(Date pastClaimDate4) {
		this.pastClaimDate4 = pastClaimDate4;
	}

	public double getPastClaimAmount4() {
		return pastClaimAmount4;
	}

	public void setPastClaimAmount4(double pastClaimAmount4) {
		this.pastClaimAmount4 = pastClaimAmount4;
	}

	public String getPastClaimCause5() {
		return pastClaimCause5;
	}

	public void setPastClaimCause5(String pastClaimCause5) {
		this.pastClaimCause5 = pastClaimCause5;
	}

	public Date getPastClaimDate5() {
		return pastClaimDate5;
	}

	public void setPastClaimDate5(Date pastClaimDate5) {
		this.pastClaimDate5 = pastClaimDate5;
	}

	public double getPastClaimAmount5() {
		return pastClaimAmount5;
	}

	public void setPastClaimAmount5(double pastClaimAmount5) {
		this.pastClaimAmount5 = pastClaimAmount5;
	}

	public String getPastClaimCause6() {
		return pastClaimCause6;
	}

	public void setPastClaimCause6(String pastClaimCause6) {
		this.pastClaimCause6 = pastClaimCause6;
	}

	public Date getPastClaimDate6() {
		return pastClaimDate6;
	}

	public void setPastClaimDate6(Date pastClaimDate6) {
		this.pastClaimDate6 = pastClaimDate6;
	}

	public double getPastClaimAmount6() {
		return pastClaimAmount6;
	}

	public void setPastClaimAmount6(double pastClaimAmount6) {
		this.pastClaimAmount6 = pastClaimAmount6;
	}

	public String getCurrentInsuranceType1() {
		return currentInsuranceType1;
	}

	public void setCurrentInsuranceType1(String currentInsuranceType1) {
		this.currentInsuranceType1 = currentInsuranceType1;
	}

	public String getCurrentInsuranceCarrier1() {
		return currentInsuranceCarrier1;
	}

	public void setCurrentInsuranceCarrier1(String currentInsuranceCarrier1) {
		this.currentInsuranceCarrier1 = currentInsuranceCarrier1;
	}

	public String getCurrentInsuranceExpiry1() {
		return currentInsuranceExpiry1;
	}

	public void setCurrentInsuranceExpiry1(String currentInsuranceExpiry1) {
		this.currentInsuranceExpiry1 = currentInsuranceExpiry1;
	}

	public String getCurrentInsuranceType2() {
		return currentInsuranceType2;
	}

	public void setCurrentInsuranceType2(String currentInsuranceType2) {
		this.currentInsuranceType2 = currentInsuranceType2;
	}

	public String getCurrentInsuranceCarrier2() {
		return currentInsuranceCarrier2;
	}

	public void setCurrentInsuranceCarrier2(String currentInsuranceCarrier2) {
		this.currentInsuranceCarrier2 = currentInsuranceCarrier2;
	}

	public String getCurrentInsuranceExpiry2() {
		return currentInsuranceExpiry2;
	}

	public void setCurrentInsuranceExpiry2(String currentInsuranceExpiry2) {
		this.currentInsuranceExpiry2 = currentInsuranceExpiry2;
	}

	public String getCurrentInsuranceType3() {
		return currentInsuranceType3;
	}

	public void setCurrentInsuranceType3(String currentInsuranceType3) {
		this.currentInsuranceType3 = currentInsuranceType3;
	}

	public String getCurrentInsuranceCarrier3() {
		return currentInsuranceCarrier3;
	}

	public void setCurrentInsuranceCarrier3(String currentInsuranceCarrier3) {
		this.currentInsuranceCarrier3 = currentInsuranceCarrier3;
	}

	public String getCurrentInsuranceExpiry3() {
		return currentInsuranceExpiry3;
	}

	public void setCurrentInsuranceExpiry3(String currentInsuranceExpiry3) {
		this.currentInsuranceExpiry3 = currentInsuranceExpiry3;
	}

	public String getCurrentInsuranceType4() {
		return currentInsuranceType4;
	}

	public void setCurrentInsuranceType4(String currentInsuranceType4) {
		this.currentInsuranceType4 = currentInsuranceType4;
	}

	public String getCurrentInsuranceCarrier4() {
		return currentInsuranceCarrier4;
	}

	public void setCurrentInsuranceCarrier4(String currentInsuranceCarrier4) {
		this.currentInsuranceCarrier4 = currentInsuranceCarrier4;
	}

	public String getCurrentInsuranceExpiry4() {
		return currentInsuranceExpiry4;
	}

	public void setCurrentInsuranceExpiry4(String currentInsuranceExpiry4) {
		this.currentInsuranceExpiry4 = currentInsuranceExpiry4;
	}

	public String getLineHolders1() {
		return lineHolders1;
	}

	public void setLineHolders1(String lineHolders1) {
		this.lineHolders1 = lineHolders1;
	}

	public String getLineHoldersLoc1() {
		return lineHoldersLoc1;
	}

	public void setLineHoldersLoc1(String lineHoldersLoc1) {
		this.lineHoldersLoc1 = lineHoldersLoc1;
	}

	public String getLineHolders2() {
		return lineHolders2;
	}

	public void setLineHolders2(String lineHolders2) {
		this.lineHolders2 = lineHolders2;
	}

	public String getLineHoldersLoc2() {
		return lineHoldersLoc2;
	}

	public void setLineHoldersLoc2(String lineHoldersLoc2) {
		this.lineHoldersLoc2 = lineHoldersLoc2;
	}

	public String getLineHolders3() {
		return lineHolders3;
	}

	public void setLineHolders3(String lineHolders3) {
		this.lineHolders3 = lineHolders3;
	}

	public String getLineHoldersLoc3() {
		return lineHoldersLoc3;
	}

	public void setLineHoldersLoc3(String lineHoldersLoc3) {
		this.lineHoldersLoc3 = lineHoldersLoc3;
	}

	public String getLineHolders4() {
		return lineHolders4;
	}

	public void setLineHolders4(String lineHolders4) {
		this.lineHolders4 = lineHolders4;
	}

	public String getLineHoldersLoc4() {
		return lineHoldersLoc4;
	}

	public void setLineHoldersLoc4(String lineHoldersLoc4) {
		this.lineHoldersLoc4 = lineHoldersLoc4;
	}

	public String getAddressOfLocation1() {
		return addressOfLocation1;
	}

	public void setAddressOfLocation1(String addressOfLocation1) {
		this.addressOfLocation1 = addressOfLocation1;
	}

	public String getAddressOfLocationUse1() {
		return addressOfLocationUse1;
	}

	public void setAddressOfLocationUse1(String addressOfLocationUse1) {
		this.addressOfLocationUse1 = addressOfLocationUse1;
	}

	public boolean isAddressOfLocationOwned1() {
		return addressOfLocationOwned1;
	}

	public void setAddressOfLocationOwned1(boolean addressOfLocationOwned1) {
		this.addressOfLocationOwned1 = addressOfLocationOwned1;
	}

	public String getAddressOfLocation2() {
		return addressOfLocation2;
	}

	public void setAddressOfLocation2(String addressOfLocation2) {
		this.addressOfLocation2 = addressOfLocation2;
	}

	public String getAddressOfLocationUse2() {
		return addressOfLocationUse2;
	}

	public void setAddressOfLocationUse2(String addressOfLocationUse2) {
		this.addressOfLocationUse2 = addressOfLocationUse2;
	}

	public boolean isAddressOfLocationOwned2() {
		return addressOfLocationOwned2;
	}

	public void setAddressOfLocationOwned2(boolean addressOfLocationOwned2) {
		this.addressOfLocationOwned2 = addressOfLocationOwned2;
	}

	public String getAddressOfLocation3() {
		return addressOfLocation3;
	}

	public void setAddressOfLocation3(String addressOfLocation3) {
		this.addressOfLocation3 = addressOfLocation3;
	}

	public String getAddressOfLocationUse3() {
		return addressOfLocationUse3;
	}

	public void setAddressOfLocationUse3(String addressOfLocationUse3) {
		this.addressOfLocationUse3 = addressOfLocationUse3;
	}

	public boolean isAddressOfLocationOwned3() {
		return addressOfLocationOwned3;
	}

	public void setAddressOfLocationOwned3(boolean addressOfLocationOwned3) {
		this.addressOfLocationOwned3 = addressOfLocationOwned3;
	}

	public String getAddressOfLocation4() {
		return addressOfLocation4;
	}

	public void setAddressOfLocation4(String addressOfLocation4) {
		this.addressOfLocation4 = addressOfLocation4;
	}

	public String getAddressOfLocationUse4() {
		return addressOfLocationUse4;
	}

	public void setAddressOfLocationUse4(String addressOfLocationUse4) {
		this.addressOfLocationUse4 = addressOfLocationUse4;
	}

	public boolean isAddressOfLocationOwned4() {
		return addressOfLocationOwned4;
	}

	public void setAddressOfLocationOwned4(boolean addressOfLocationOwned4) {
		this.addressOfLocationOwned4 = addressOfLocationOwned4;
	}

	public String getAddressOfLocation5() {
		return addressOfLocation5;
	}

	public void setAddressOfLocation5(String addressOfLocation5) {
		this.addressOfLocation5 = addressOfLocation5;
	}

	public String getAddressOfLocationUse5() {
		return addressOfLocationUse5;
	}

	public void setAddressOfLocationUse5(String addressOfLocationUse5) {
		this.addressOfLocationUse5 = addressOfLocationUse5;
	}

	public boolean isAddressOfLocationOwned5() {
		return addressOfLocationOwned5;
	}

	public void setAddressOfLocationOwned5(boolean addressOfLocationOwned5) {
		this.addressOfLocationOwned5 = addressOfLocationOwned5;
	}

	public String getLocationRentedToOthers1() {
		return locationRentedToOthers1;
	}

	public void setLocationRentedToOthers1(String locationRentedToOthers1) {
		this.locationRentedToOthers1 = locationRentedToOthers1;
	}

	public String getLocationRentedToOthers2() {
		return locationRentedToOthers2;
	}

	public void setLocationRentedToOthers2(String locationRentedToOthers2) {
		this.locationRentedToOthers2 = locationRentedToOthers2;
	}

	public String getLocationRentedToOthers3() {
		return locationRentedToOthers3;
	}

	public void setLocationRentedToOthers3(String locationRentedToOthers3) {
		this.locationRentedToOthers3 = locationRentedToOthers3;
	}

	public String getLocationRentedToOthers4() {
		return locationRentedToOthers4;
	}

	public void setLocationRentedToOthers4(String locationRentedToOthers4) {
		this.locationRentedToOthers4 = locationRentedToOthers4;
	}

	public String getLocationRentedToOthers5() {
		return locationRentedToOthers5;
	}

	public void setLocationRentedToOthers5(String locationRentedToOthers5) {
		this.locationRentedToOthers5 = locationRentedToOthers5;
	}

	public double getBuildingLimit() {
		return buildingLimit;
	}

	public void setBuildingLimit(double buildingLimit) {
		this.buildingLimit = buildingLimit;
	}

	public double getBuildingDeductible() {
		return buildingDeductible;
	}

	public void setBuildingDeductible(double buildingDeductible) {
		this.buildingDeductible = buildingDeductible;
	}

	public double getContentsLimit() {
		return contentsLimit;
	}

	public void setContentsLimit(double contentsLimit) {
		this.contentsLimit = contentsLimit;
	}

	public double getContentsDeductible() {
		return contentsDeductible;
	}

	public void setContentsDeductible(double contentsDeductible) {
		this.contentsDeductible = contentsDeductible;
	}

	public double getStockLimit() {
		return stockLimit;
	}

	public void setStockLimit(double stockLimit) {
		this.stockLimit = stockLimit;
	}

	public double getStockDeductible() {
		return stockDeductible;
	}

	public void setStockDeductible(double stockDeductible) {
		this.stockDeductible = stockDeductible;
	}

	public double getOfficeContentLimit() {
		return officeContentLimit;
	}

	public void setOfficeContentLimit(double officeContentLimit) {
		this.officeContentLimit = officeContentLimit;
	}

	public double getOfficeContentDeductible() {
		return officeContentDeductible;
	}

	public void setOfficeContentDeductible(double officeContentDeductible) {
		this.officeContentDeductible = officeContentDeductible;
	}

	public double getEdpLimit() {
		return edpLimit;
	}

	public void setEdpLimit(double edpLimit) {
		this.edpLimit = edpLimit;
	}

	public double getEdpDeductible() {
		return edpDeductible;
	}

	public void setEdpDeductible(double edpDeductible) {
		this.edpDeductible = edpDeductible;
	}

	public double getEquipmentLimit() {
		return equipmentLimit;
	}

	public void setEquipmentLimit(double equipmentLimit) {
		this.equipmentLimit = equipmentLimit;
	}

	public double getEquipmentDeductible() {
		return equipmentDeductible;
	}

	public void setEquipmentDeductible(double equipmentDeductible) {
		this.equipmentDeductible = equipmentDeductible;
	}

	public double getOffPremisesLimit() {
		return offPremisesLimit;
	}

	public void setOffPremisesLimit(double offPremisesLimit) {
		this.offPremisesLimit = offPremisesLimit;
	}

	public double getOffPremisesDeductible() {
		return offPremisesDeductible;
	}

	public void setOffPremisesDeductible(double offPremisesDeductible) {
		this.offPremisesDeductible = offPremisesDeductible;
	}

	public double getTransitLimit() {
		return transitLimit;
	}

	public void setTransitLimit(double transitLimit) {
		this.transitLimit = transitLimit;
	}

	public double getTransitDeductible() {
		return transitDeductible;
	}

	public void setTransitDeductible(double transitDeductible) {
		this.transitDeductible = transitDeductible;
	}

	public double getMiscPropertyLimit() {
		return miscPropertyLimit;
	}

	public void setMiscPropertyLimit(double miscPropertyLimit) {
		this.miscPropertyLimit = miscPropertyLimit;
	}

	public double getMiscPropertyDeductible() {
		return miscPropertyDeductible;
	}

	public void setMiscPropertyDeductible(double miscPropertyDeductible) {
		this.miscPropertyDeductible = miscPropertyDeductible;
	}

	public double getContractorEquipmentLimit() {
		return contractorEquipmentLimit;
	}

	public void setContractorEquipmentLimit(double contractorEquipmentLimit) {
		this.contractorEquipmentLimit = contractorEquipmentLimit;
	}

	public double getContractorEquipmentDeductible() {
		return contractorEquipmentDeductible;
	}

	public void setContractorEquipmentDeductible(
			double contractorEquipmentDeductible) {
		this.contractorEquipmentDeductible = contractorEquipmentDeductible;
	}

	public double getInstallationFloaterLimit() {
		return installationFloaterLimit;
	}

	public void setInstallationFloaterLimit(double installationFloaterLimit) {
		this.installationFloaterLimit = installationFloaterLimit;
	}

	public double getInstallationFloaterDeductible() {
		return installationFloaterDeductible;
	}

	public void setInstallationFloaterDeductible(
			double installationFloaterDeductible) {
		this.installationFloaterDeductible = installationFloaterDeductible;
	}

	public double getToolFloaterLimit() {
		return toolFloaterLimit;
	}

	public void setToolFloaterLimit(double toolFloaterLimit) {
		this.toolFloaterLimit = toolFloaterLimit;
	}

	public double getToolFloaterDeductible() {
		return toolFloaterDeductible;
	}

	public void setToolFloaterDeductible(double toolFloaterDeductible) {
		this.toolFloaterDeductible = toolFloaterDeductible;
	}

	public double getSignFloaterLimit() {
		return signFloaterLimit;
	}

	public void setSignFloaterLimit(double signFloaterLimit) {
		this.signFloaterLimit = signFloaterLimit;
	}

	public double getSignFloaterDeductible() {
		return signFloaterDeductible;
	}

	public void setSignFloaterDeductible(double signFloaterDeductible) {
		this.signFloaterDeductible = signFloaterDeductible;
	}

	public boolean isTruckMan() {
		return truckMan;
	}

	public void setTruckMan(boolean truckMan) {
		this.truckMan = truckMan;
	}

	public boolean isOwner() {
		return owner;
	}

	public void setOwner(boolean owner) {
		this.owner = owner;
	}

	public double getMotorTruckLimit() {
		return motorTruckLimit;
	}

	public void setMotorTruckLimit(double motorTruckLimit) {
		this.motorTruckLimit = motorTruckLimit;
	}

	public double getMotorTruckDeductible() {
		return motorTruckDeductible;
	}

	public void setMotorTruckDeductible(double motorTruckDeductible) {
		this.motorTruckDeductible = motorTruckDeductible;
	}

	public double getGlassLimit() {
		return glassLimit;
	}

	public void setGlassLimit(double glassLimit) {
		this.glassLimit = glassLimit;
	}

	public double getGlassDeductible() {
		return glassDeductible;
	}

	public void setGlassDeductible(double glassDeductible) {
		this.glassDeductible = glassDeductible;
	}

	public double getSewerBackupLimit() {
		return sewerBackupLimit;
	}

	public void setSewerBackupLimit(double sewerBackupLimit) {
		this.sewerBackupLimit = sewerBackupLimit;
	}

	public double getSewerBackupDeductible() {
		return sewerBackupDeductible;
	}

	public void setSewerBackupDeductible(double sewerBackupDeductible) {
		this.sewerBackupDeductible = sewerBackupDeductible;
	}

	public double getFloodLimit() {
		return floodLimit;
	}

	public void setFloodLimit(double floodLimit) {
		this.floodLimit = floodLimit;
	}

	public double getFloodDeductible() {
		return floodDeductible;
	}

	public void setFloodDeductible(double floodDeductible) {
		this.floodDeductible = floodDeductible;
	}

	public double getEarthquakeLimit() {
		return earthquakeLimit;
	}

	public void setEarthquakeLimit(double earthquakeLimit) {
		this.earthquakeLimit = earthquakeLimit;
	}

	public double getEarthquakeDeductible() {
		return earthquakeDeductible;
	}

	public void setEarthquakeDeductible(double earthquakeDeductible) {
		this.earthquakeDeductible = earthquakeDeductible;
	}

	public double getProfitLimit() {
		return profitLimit;
	}

	public void setProfitLimit(double profitLimit) {
		this.profitLimit = profitLimit;
	}

	public double getProfitDeductible() {
		return profitDeductible;
	}

	public void setProfitDeductible(double profitDeductible) {
		this.profitDeductible = profitDeductible;
	}

	public boolean isGrossEarning80() {
		return grossEarning80;
	}

	public void setGrossEarning80(boolean grossEarning80) {
		this.grossEarning80 = grossEarning80;
	}

	public boolean isGrossEarning50() {
		return grossEarning50;
	}

	public void setGrossEarning50(boolean grossEarning50) {
		this.grossEarning50 = grossEarning50;
	}

	public double getGrossEarningLimit() {
		return grossEarningLimit;
	}

	public void setGrossEarningLimit(double grossEarningLimit) {
		this.grossEarningLimit = grossEarningLimit;
	}

	public double getGrossEarningDeductible() {
		return grossEarningDeductible;
	}

	public void setGrossEarningDeductible(double grossEarningDeductible) {
		this.grossEarningDeductible = grossEarningDeductible;
	}

	public double getRentalIncomeLimit() {
		return rentalIncomeLimit;
	}

	public void setRentalIncomeLimit(double rentalIncomeLimit) {
		this.rentalIncomeLimit = rentalIncomeLimit;
	}

	public double getRentalIncomeDeductible() {
		return rentalIncomeDeductible;
	}

	public void setRentalIncomeDeductible(double rentalIncomeDeductible) {
		this.rentalIncomeDeductible = rentalIncomeDeductible;
	}

	public double getExtraExpenseLimit() {
		return extraExpenseLimit;
	}

	public void setExtraExpenseLimit(double extraExpenseLimit) {
		this.extraExpenseLimit = extraExpenseLimit;
	}

	public double getExtraExpenseDeductible() {
		return extraExpenseDeductible;
	}

	public void setExtraExpenseDeductible(double extraExpenseDeductible) {
		this.extraExpenseDeductible = extraExpenseDeductible;
	}

	public double getOffPremisesPowerLimit() {
		return offPremisesPowerLimit;
	}

	public void setOffPremisesPowerLimit(double offPremisesPowerLimit) {
		this.offPremisesPowerLimit = offPremisesPowerLimit;
	}

	public double getOffPremisesPowerDeductible() {
		return offPremisesPowerDeductible;
	}

	public void setOffPremisesPowerDeductible(double offPremisesPowerDeductible) {
		this.offPremisesPowerDeductible = offPremisesPowerDeductible;
	}

	public double getInsideOutsideLimit() {
		return insideOutsideLimit;
	}

	public void setInsideOutsideLimit(double insideOutsideLimit) {
		this.insideOutsideLimit = insideOutsideLimit;
	}

	public double getInsideOutsideDeductible() {
		return insideOutsideDeductible;
	}

	public void setInsideOutsideDeductible(double insideOutsideDeductible) {
		this.insideOutsideDeductible = insideOutsideDeductible;
	}

	public double getBfMoneyLimit() {
		return bfMoneyLimit;
	}

	public void setBfMoneyLimit(double bfMoneyLimit) {
		this.bfMoneyLimit = bfMoneyLimit;
	}

	public double getBfMoneyDeductible() {
		return bfMoneyDeductible;
	}

	public void setBfMoneyDeductible(double bfMoneyDeductible) {
		this.bfMoneyDeductible = bfMoneyDeductible;
	}

	public double getDeopistorForgeryLimit() {
		return deopistorForgeryLimit;
	}

	public void setDeopistorForgeryLimit(double deopistorForgeryLimit) {
		this.deopistorForgeryLimit = deopistorForgeryLimit;
	}

	public double getDeopistorForgeryDeductible() {
		return deopistorForgeryDeductible;
	}

	public void setDeopistorForgeryDeductible(double deopistorForgeryDeductible) {
		this.deopistorForgeryDeductible = deopistorForgeryDeductible;
	}

	public double getMoneyOrdersLimit() {
		return moneyOrdersLimit;
	}

	public void setMoneyOrdersLimit(double moneyOrdersLimit) {
		this.moneyOrdersLimit = moneyOrdersLimit;
	}

	public double getMoneyOrdersDeductible() {
		return moneyOrdersDeductible;
	}

	public void setMoneyOrdersDeductible(double moneyOrdersDeductible) {
		this.moneyOrdersDeductible = moneyOrdersDeductible;
	}

	public double getEmployDishonestyLimit() {
		return employDishonestyLimit;
	}

	public void setEmployDishonestyLimit(double employDishonestyLimit) {
		this.employDishonestyLimit = employDishonestyLimit;
	}

	public double getEmployDishonestyDeductible() {
		return employDishonestyDeductible;
	}

	public void setEmployDishonestyDeductible(double employDishonestyDeductible) {
		this.employDishonestyDeductible = employDishonestyDeductible;
	}

	public double getCglLimit() {
		return cglLimit;
	}

	public void setCglLimit(double cglLimit) {
		this.cglLimit = cglLimit;
	}

	public double getCglDeductible() {
		return cglDeductible;
	}

	public void setCglDeductible(double cglDeductible) {
		this.cglDeductible = cglDeductible;
	}

	public double getTenantsLegalLimit() {
		return tenantsLegalLimit;
	}

	public void setTenantsLegalLimit(double tenantsLegalLimit) {
		this.tenantsLegalLimit = tenantsLegalLimit;
	}

	public double getTenantsLegalDeductible() {
		return tenantsLegalDeductible;
	}

	public void setTenantsLegalDeductible(double tenantsLegalDeductible) {
		this.tenantsLegalDeductible = tenantsLegalDeductible;
	}

	public double getNonOwnedAutoLimit() {
		return nonOwnedAutoLimit;
	}

	public void setNonOwnedAutoLimit(double nonOwnedAutoLimit) {
		this.nonOwnedAutoLimit = nonOwnedAutoLimit;
	}

	public double getNonOwnedAutoDeductible() {
		return nonOwnedAutoDeductible;
	}

	public void setNonOwnedAutoDeductible(double nonOwnedAutoDeductible) {
		this.nonOwnedAutoDeductible = nonOwnedAutoDeductible;
	}

	public double getSef96Limit() {
		return sef96Limit;
	}

	public void setSef96Limit(double sef96Limit) {
		this.sef96Limit = sef96Limit;
	}

	public double getSef96Deductible() {
		return sef96Deductible;
	}

	public void setSef96Deductible(double sef96Deductible) {
		this.sef96Deductible = sef96Deductible;
	}

	public double getSef94Limit() {
		return sef94Limit;
	}

	public void setSef94Limit(double sef94Limit) {
		this.sef94Limit = sef94Limit;
	}

	public double getSef94Deductible() {
		return sef94Deductible;
	}

	public void setSef94Deductible(double sef94Deductible) {
		this.sef94Deductible = sef94Deductible;
	}

	public double getDoLimit() {
		return doLimit;
	}

	public void setDoLimit(double doLimit) {
		this.doLimit = doLimit;
	}

	public double getDoDeductible() {
		return doDeductible;
	}

	public void setDoDeductible(double doDeductible) {
		this.doDeductible = doDeductible;
	}

	public double getEoLimit() {
		return eoLimit;
	}

	public void setEoLimit(double eoLimit) {
		this.eoLimit = eoLimit;
	}

	public double getEoDeductible() {
		return eoDeductible;
	}

	public void setEoDeductible(double eoDeductible) {
		this.eoDeductible = eoDeductible;
	}

	public double getEmployerLimit() {
		return employerLimit;
	}

	public void setEmployerLimit(double employerLimit) {
		this.employerLimit = employerLimit;
	}

	public double getEmployerDeductible() {
		return employerDeductible;
	}

	public void setEmployerDeductible(double employerDeductible) {
		this.employerDeductible = employerDeductible;
	}

	public double getUmbrellaLimit() {
		return umbrellaLimit;
	}

	public void setUmbrellaLimit(double umbrellaLimit) {
		this.umbrellaLimit = umbrellaLimit;
	}

	public double getUmbrellaDeductible() {
		return umbrellaDeductible;
	}

	public void setUmbrellaDeductible(double umbrellaDeductible) {
		this.umbrellaDeductible = umbrellaDeductible;
	}

	public double getWrapUpLimit() {
		return wrapUpLimit;
	}

	public void setWrapUpLimit(double wrapUpLimit) {
		this.wrapUpLimit = wrapUpLimit;
	}

	public double getWrapUpDeductible() {
		return wrapUpDeductible;
	}

	public void setWrapUpDeductible(double wrapUpDeductible) {
		this.wrapUpDeductible = wrapUpDeductible;
	}

	public double getStdComprehensiveLimit() {
		return stdComprehensiveLimit;
	}

	public void setStdComprehensiveLimit(double stdComprehensiveLimit) {
		this.stdComprehensiveLimit = stdComprehensiveLimit;
	}

	public double getStdComprehensiveDeductible() {
		return stdComprehensiveDeductible;
	}

	public void setStdComprehensiveDeductible(double stdComprehensiveDeductible) {
		this.stdComprehensiveDeductible = stdComprehensiveDeductible;
	}

	public double getAirConditioningLimit() {
		return airConditioningLimit;
	}

	public void setAirConditioningLimit(double airConditioningLimit) {
		this.airConditioningLimit = airConditioningLimit;
	}

	public double getAirConditioningDeductible() {
		return airConditioningDeductible;
	}

	public void setAirConditioningDeductible(double airConditioningDeductible) {
		this.airConditioningDeductible = airConditioningDeductible;
	}

	public double getProductionMachineryLimit() {
		return productionMachineryLimit;
	}

	public void setProductionMachineryLimit(double productionMachineryLimit) {
		this.productionMachineryLimit = productionMachineryLimit;
	}

	public double getProductionMachineryDeductible() {
		return productionMachineryDeductible;
	}

	public void setProductionMachineryDeductible(
			double productionMachineryDeductible) {
		this.productionMachineryDeductible = productionMachineryDeductible;
	}

	public double getOtherCoverageLimit() {
		return otherCoverageLimit;
	}

	public void setOtherCoverageLimit(double otherCoverageLimit) {
		this.otherCoverageLimit = otherCoverageLimit;
	}

	public double getOtherCoverageDeductible() {
		return otherCoverageDeductible;
	}

	public void setOtherCoverageDeductible(double otherCoverageDeductible) {
		this.otherCoverageDeductible = otherCoverageDeductible;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getTotalSqFootage() {
		return totalSqFootage;
	}

	public void setTotalSqFootage(double totalSqFootage) {
		this.totalSqFootage = totalSqFootage;
	}

	public double getInsdSqFootage() {
		return insdSqFootage;
	}

	public void setInsdSqFootage(double insdSqFootage) {
		this.insdSqFootage = insdSqFootage;
	}

	public int getNoOfStories() {
		return noOfStories;
	}

	public void setNoOfStories(int noOfStories) {
		this.noOfStories = noOfStories;
	}

	public boolean isBasement() {
		return basement;
	}

	public void setBasement(boolean basement) {
		this.basement = basement;
	}

	public String getWalls() {
		return walls;
	}

	public void setWalls(String walls) {
		this.walls = walls;
	}

	public String getRoof() {
		return roof;
	}

	public void setRoof(String roof) {
		this.roof = roof;
	}

	public String getFloors() {
		return floors;
	}

	public void setFloors(String floors) {
		this.floors = floors;
	}

	public String getHeating() {
		return heating;
	}

	public void setHeating(String heating) {
		this.heating = heating;
	}

	public String getElectrical() {
		return electrical;
	}

	public void setElectrical(String electrical) {
		this.electrical = electrical;
	}

	public String getPlumbing() {
		return plumbing;
	}

	public void setPlumbing(String plumbing) {
		this.plumbing = plumbing;
	}

	public String getFireProtection() {
		return fireProtection;
	}

	public void setFireProtection(String fireProtection) {
		this.fireProtection = fireProtection;
	}

	public String getSecurity() {
		return security;
	}

	public void setSecurity(String security) {
		this.security = security;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getCurrentInsurer() {
		return currentInsurer;
	}

	public void setCurrentInsurer(String currentInsurer) {
		this.currentInsurer = currentInsurer;
	}

	public Date getCurrentExpDate() {
		return currentExpDate;
	}

	public void setCurrentExpDate(Date currentExpDate) {
		this.currentExpDate = currentExpDate;
	}

	public double getPremiumTarget() {
		return premiumTarget;
	}

	public void setPremiumTarget(double premiumTarget) {
		this.premiumTarget = premiumTarget;
	}

	public String getLienHolders1() {
		return lienHolders1;
	}

	public void setLienHolders1(String lienHolders1) {
		this.lienHolders1 = lienHolders1;
	}

	public String getLienHoldersVehicle1() {
		return lienHoldersVehicle1;
	}

	public void setLienHoldersVehicle1(String lienHoldersVehicle1) {
		this.lienHoldersVehicle1 = lienHoldersVehicle1;
	}

	public String getLienHolders2() {
		return lienHolders2;
	}

	public void setLienHolders2(String lienHolders2) {
		this.lienHolders2 = lienHolders2;
	}

	public String getLienHoldersVehicle2() {
		return lienHoldersVehicle2;
	}

	public void setLienHoldersVehicle2(String lienHoldersVehicle2) {
		this.lienHoldersVehicle2 = lienHoldersVehicle2;
	}

	public String getLienHolders3() {
		return lienHolders3;
	}

	public void setLienHolders3(String lienHolders3) {
		this.lienHolders3 = lienHolders3;
	}

	public String getLienHoldersVehicle3() {
		return lienHoldersVehicle3;
	}

	public void setLienHoldersVehicle3(String lienHoldersVehicle3) {
		this.lienHoldersVehicle3 = lienHoldersVehicle3;
	}

	public String getLienHolders4() {
		return lienHolders4;
	}

	public void setLienHolders4(String lienHolders4) {
		this.lienHolders4 = lienHolders4;
	}

	public String getLienHoldersVehicle4() {
		return lienHoldersVehicle4;
	}

	public void setLienHoldersVehicle4(String lienHoldersVehicle4) {
		this.lienHoldersVehicle4 = lienHoldersVehicle4;
	}

	public String getLienHolders5() {
		return lienHolders5;
	}

	public void setLienHolders5(String lienHolders5) {
		this.lienHolders5 = lienHolders5;
	}

	public String getLienHoldersVehicle5() {
		return lienHoldersVehicle5;
	}

	public void setLienHoldersVehicle5(String lienHoldersVehicle5) {
		this.lienHoldersVehicle5 = lienHoldersVehicle5;
	}

	public Date getClaimDate1() {
		return claimDate1;
	}

	public void setClaimDate1(Date claimDate1) {
		this.claimDate1 = claimDate1;
	}

	public String getClaimDesc1() {
		return claimDesc1;
	}

	public void setClaimDesc1(String claimDesc1) {
		this.claimDesc1 = claimDesc1;
	}

	public Date getClaimDate2() {
		return claimDate2;
	}

	public void setClaimDate2(Date claimDate2) {
		this.claimDate2 = claimDate2;
	}

	public String getClaimDesc2() {
		return claimDesc2;
	}

	public void setClaimDesc2(String claimDesc2) {
		this.claimDesc2 = claimDesc2;
	}

	public Date getClaimDate3() {
		return claimDate3;
	}

	public void setClaimDate3(Date claimDate3) {
		this.claimDate3 = claimDate3;
	}

	public String getClaimDesc3() {
		return claimDesc3;
	}

	public void setClaimDesc3(String claimDesc3) {
		this.claimDesc3 = claimDesc3;
	}

	public Date getClaimDate4() {
		return claimDate4;
	}

	public void setClaimDate4(Date claimDate4) {
		this.claimDate4 = claimDate4;
	}

	public String getClaimDesc4() {
		return claimDesc4;
	}

	public void setClaimDesc4(String claimDesc4) {
		this.claimDesc4 = claimDesc4;
	}

	public Date getClaimDate5() {
		return claimDate5;
	}

	public void setClaimDate5(Date claimDate5) {
		this.claimDate5 = claimDate5;
	}

	public String getClaimDesc5() {
		return claimDesc5;
	}

	public void setClaimDesc5(String claimDesc5) {
		this.claimDesc5 = claimDesc5;
	}

	public Date getClaimDate6() {
		return claimDate6;
	}

	public void setClaimDate6(Date claimDate6) {
		this.claimDate6 = claimDate6;
	}

	public String getClaimDesc6() {
		return claimDesc6;
	}

	public void setClaimDesc6(String claimDesc6) {
		this.claimDesc6 = claimDesc6;
	}

	public double getCommoditiesTransportedBy() {
		return commoditiesTransportedBy;
	}

	public void setCommoditiesTransportedBy(double commoditiesTransportedBy) {
		this.commoditiesTransportedBy = commoditiesTransportedBy;
	}

	public String getHaulingForOthers() {
		return haulingForOthers;
	}

	public void setHaulingForOthers(String haulingForOthers) {
		this.haulingForOthers = haulingForOthers;
	}

	public String getFilingState1() {
		return filingState1;
	}

	public void setFilingState1(String filingState1) {
		this.filingState1 = filingState1;
	}

	public String getFilingUSDot1() {
		return filingUSDot1;
	}

	public void setFilingUSDot1(String filingUSDot1) {
		this.filingUSDot1 = filingUSDot1;
	}

	public String getDilingDocket1() {
		return dilingDocket1;
	}

	public void setDilingDocket1(String dilingDocket1) {
		this.dilingDocket1 = dilingDocket1;
	}

	public String getFilingType1() {
		return filingType1;
	}

	public void setFilingType1(String filingType1) {
		this.filingType1 = filingType1;
	}

	public String getFilingName1() {
		return filingName1;
	}

	public void setFilingName1(String filingName1) {
		this.filingName1 = filingName1;
	}

	public String getFilingState2() {
		return filingState2;
	}

	public void setFilingState2(String filingState2) {
		this.filingState2 = filingState2;
	}

	public String getFilingUSDot2() {
		return filingUSDot2;
	}

	public void setFilingUSDot2(String filingUSDot2) {
		this.filingUSDot2 = filingUSDot2;
	}

	public String getDilingDocket2() {
		return dilingDocket2;
	}

	public void setDilingDocket2(String dilingDocket2) {
		this.dilingDocket2 = dilingDocket2;
	}

	public String getFilingType2() {
		return filingType2;
	}

	public void setFilingType2(String filingType2) {
		this.filingType2 = filingType2;
	}

	public String getFilingName2() {
		return filingName2;
	}

	public void setFilingName2(String filingName2) {
		this.filingName2 = filingName2;
	}

	public String getFilingState3() {
		return filingState3;
	}

	public void setFilingState3(String filingState3) {
		this.filingState3 = filingState3;
	}

	public String getFilingUSDot3() {
		return filingUSDot3;
	}

	public void setFilingUSDot3(String filingUSDot3) {
		this.filingUSDot3 = filingUSDot3;
	}

	public String getDilingDocket3() {
		return dilingDocket3;
	}

	public void setDilingDocket3(String dilingDocket3) {
		this.dilingDocket3 = dilingDocket3;
	}

	public String getFilingType3() {
		return filingType3;
	}

	public void setFilingType3(String filingType3) {
		this.filingType3 = filingType3;
	}

	public String getFilingName3() {
		return filingName3;
	}

	public void setFilingName3(String filingName3) {
		this.filingName3 = filingName3;
	}

	public String getFilingState4() {
		return filingState4;
	}

	public void setFilingState4(String filingState4) {
		this.filingState4 = filingState4;
	}

	public String getFilingUSDot4() {
		return filingUSDot4;
	}

	public void setFilingUSDot4(String filingUSDot4) {
		this.filingUSDot4 = filingUSDot4;
	}

	public String getDilingDocket4() {
		return dilingDocket4;
	}

	public void setDilingDocket4(String dilingDocket4) {
		this.dilingDocket4 = dilingDocket4;
	}

	public String getFilingType4() {
		return filingType4;
	}

	public void setFilingType4(String filingType4) {
		this.filingType4 = filingType4;
	}

	public String getFilingName4() {
		return filingName4;
	}

	public void setFilingName4(String filingName4) {
		this.filingName4 = filingName4;
	}

	public boolean isVehicleNonOwned() {
		return vehicleNonOwned;
	}

	public void setVehicleNonOwned(boolean vehicleNonOwned) {
		this.vehicleNonOwned = vehicleNonOwned;
	}

	public boolean isContract() {
		return contract;
	}

	public void setContract(boolean contract) {
		this.contract = contract;
	}

	public String getTypeOfNonOwned() {
		return typeOfNonOwned;
	}

	public void setTypeOfNonOwned(String typeOfNonOwned) {
		this.typeOfNonOwned = typeOfNonOwned;
	}

	public double getAvgNoOfVehicles() {
		return avgNoOfVehicles;
	}

	public void setAvgNoOfVehicles(double avgNoOfVehicles) {
		this.avgNoOfVehicles = avgNoOfVehicles;
	}

	public double getAvgValue() {
		return avgValue;
	}

	public void setAvgValue(double avgValue) {
		this.avgValue = avgValue;
	}

	public double getMaxVehicleValue() {
		return maxVehicleValue;
	}

	public void setMaxVehicleValue(double maxVehicleValue) {
		this.maxVehicleValue = maxVehicleValue;
	}

	public double getMaxCostValue() {
		return maxCostValue;
	}

	public void setMaxCostValue(double maxCostValue) {
		this.maxCostValue = maxCostValue;
	}

	public String getInstructionNotes() {
		return instructionNotes;
	}

	public void setInstructionNotes(String instructionNotes) {
		this.instructionNotes = instructionNotes;
	}

	public String getMarketerUserName() {
		return marketerUserName;
	}

	public void setMarketerUserName(String marketerUserName) {
		this.marketerUserName = marketerUserName;
	}

}
