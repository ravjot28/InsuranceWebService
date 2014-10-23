package com.rav.insurance.insuranceformoperations.model;

import java.util.Date;

import com.rav.insurance.model.CommonRequestAttributes;

public class InsuranceFormSubmitRequest extends CommonRequestAttributes {
	
	
	private Date creationDate;
	private String producer;
	private String branch;
	private String severity;
	private String withUs;
	private String type;

	private String keyContact;
	private String keyContactPhone;
	private String keyContactEmailAddress;
	private String secondayContact;
	private String secondayContactPhone;
	private String secondayContactEmailAddress;

	private String businessCategory;
	private String businessName;
	private String mailingAddress;
	private String pincode;
	private String country;
	private String fax;
	private String webSiteURL;
	private String otherSpecify;
	private int numberOfLocations;
	private int numberOfOwnedAutos;

	private String entityType;
	private String profit;
	private String nonProfit;
	private int yearInBusiness;

	private String relatedExperience;

	private String owner1;
	private String owner2;
	private String owner3;
	private String owner4;

	private String boardOfDirector1;
	private String boardOfDirector2;
	private String boardOfDirector4;
	private String boardOfDirector3;

	private String financialYearEnd;
	private int noOfStaff;
	private double payRoll;
	private String groupBenefits;
	private String pensionPlan;
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

	private String currency1;
	private String currency2;
	private String currency3;
	private String currency4;

	private double totalSale;
	private double percentageOfUSSales;

	private int onpremises;
	private int offpremises;
	private int residential;
	private int commercial;
	private int subcontracted;
	private String ecommerce;
	private String professionalLiability;
	private String cyberLiability;
	private String pollutionexposure;
	private String accidentalBenefits;
	private String malpracticeExposure;
	private String abuseExposure;
	private String bondingOpportunities;

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

	private String futureOpportunitiesOrPlanOfGrowth;
	private String describeCompetition;
	private String businessAsset;
	private String advertising;
	private String businessInterruptionSheet;
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
	private Date currentInsuranceExpiry1;

	private byte[] file1;
	private String file1Name;
	private byte[] file2;
	private String file2Name;
	private byte[] file3;
	private String file3Name;
	private byte[] file4;
	private String file4Name;
	private byte[] file5;
	private String file5Name;
	private byte[] file6;
	private String file6Name;
	private byte[] file7;
	private String file7Name;
	private byte[] file8;
	private String file8Name;
	private byte[] file9;
	private String file9Name;
	private byte[] file10;
	private String file10Name;

	private String currentInsuranceType2;
	private String currentInsuranceCarrier2;
	private Date currentInsuranceExpiry2;
	private String currentInsuranceType3;
	private String currentInsuranceCarrier3;
	private Date currentInsuranceExpiry3;
	private String currentInsuranceType4;
	private String currentInsuranceCarrier4;
	private Date currentInsuranceExpiry4;

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
	private String addressOfLocationOwnedyes1;
	private String addressOfLocation2;
	private String addressOfLocationUse2;
	private String addressOfLocationOwnedyes2;
	private String addressOfLocation3;
	private String addressOfLocationUse3;
	private String addressOfLocationOwnedyes3;
	private String addressOfLocation4;
	private String addressOfLocationUse4;
	private String addressOfLocationOwnedno1;
	private String addressOfLocation5;
	private String addressOfLocationUse5;
	private String addressOfLocationOwnedno2;

	private String addressOfLocationOwnedno3;

	private String locationRentedToOthers1;
	private String locationRentedToOthers2;
	private String locationRentedToOthers3;
	private String locationRentedToOthers4;
	private String locationRentedToOthers5;
	private String producercomments;
	private String marketercomments;


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
	private String truckMan;
	private String ownercb;
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
	private String grossEarningCheckbox;
	
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
	private String othercoverage1;
	private String othercoverage2;
	private double otherCoverageLimit1;
	private double otherCoverageDeductible1;
	private double otherCoverageLimit2;
	private double otherCoverageDeductible2;

	private String address;
	private int age;
	private double totalSqFootage;
	private double insdSqFootage;
	private int noOfStories;
	private String basement;
	private String wallsframe;
	private String wallshcb;
	private String wallssteel;
	private String wallsbrick;
	private String roofwood;
	private String roofsteel;
	private String roofconcrete;
	private String roofupdated;
	private String floorsconcrete;
	private String floorswood;
	private String heatinggas;
	private String heatingoil;
	private String heatingelectric;
	private String heatingother;
	private String heatingupdated;	
	private String electricalbreakers;
	private String electricalfuses;
	private String electricalamps;
	private String electricalupdated;
	private String plumbingcopper;
	private String plumbingpvc;
	private String plumbingother;
	private String plumbingupdated;
	private String fireProtection;
	private String fireProtectiondistance;
	private String security;
	private String additionalcoverage;

	private double buildingLimit1;
	private double buildingDeductible1;
	private double contentsLimit1;
	private double contentsDeductible1;
	private double stockLimit1;
	private double stockDeductible1;
	private double officeContentLimit1;
	private double officeContentDeductible1;
	private double edpLimit1;
	private double edpDeductible1;
	private double equipmentLimit1;
	private double equipmentDeductible1;
	private double offPremisesLimit1;
	private double offPremisesDeductible1;
	private double transitLimit1;
	private double transitDeductible1;
	private double miscPropertyLimit1;
	private double miscPropertyDeductible1;
	private double contractorEquipmentLimit1;
	private double contractorEquipmentDeductible1;
	private double installationFloaterLimit1;
	private double installationFloaterDeductible1;
	private double toolFloaterLimit1;
	private double toolFloaterDeductible1;
	private double signFloaterLimit1;
	private double signFloaterDeductible1;
	private String truckMan1;
	private String ownercb1;
	private double motorTruckLimit1;
	private double motorTruckDeductible1;
	private double glassLimit1;
	private double glassDeductible1;
	private double sewerBackupLimit1;
	private double sewerBackupDeductible1;
	private double floodLimit1;
	private double floodDeductible1;
	private double earthquakeLimit1;
	private double earthquakeDeductible1;
	private double profitLimit1;
	private double profitDeductible1;
	private String grossEarningCheckbox1;
	
	private double grossEarningLimit1;
	private double grossEarningDeductible1;
	private double rentalIncomeLimit1;
	private double rentalIncomeDeductible1;
	private double extraExpenseLimit1;
	private double extraExpenseDeductible1;
	private double offPremisesPowerLimit1;
	private double offPremisesPowerDeductible1;
	private double insideOutsideLimit1;
	private double insideOutsideDeductible1;
	private double bfMoneyLimit1;
	private double bfMoneyDeductible1;
	private double deopistorForgeryLimit1;
	private double deopistorForgeryDeductible1;
	private double moneyOrdersLimit1;
	private double moneyOrdersDeductible1;
	private double employDishonestyLimit1;
	private double employDishonestyDeductible1;
	private double cglLimit1;
	private double cglDeductible1;
	private double tenantsLegalLimit1;
	private double tenantsLegalDeductible1;
	private double nonOwnedAutoLimit1;
	private double nonOwnedAutoDeductible1;
	private double sef96Limit1;
	private double sef96Deductible1;
	private double sef94Limit1;
	private double sef94Deductible1;
	private double doLimit1;
	private double doDeductible1;
	private double eoLimit1;
	private double eoDeductible1;
	private double employerLimit1;
	private double employerDeductible1;
	private double umbrellaLimit1;
	private double umbrellaDeductible1;
	private double wrapUpLimit1;
	private double wrapUpDeductible1;
	private double stdComprehensiveLimit1;
	private double stdComprehensiveDeductible1;
	private double airConditioningLimit1;
	private double airConditioningDeductible1;
	private double productionMachineryLimit1;
	private double productionMachineryDeductible1;
	private String othercoverage11;
	private String othercoverage21;
	private double otherCoverageLimit11;
	private double otherCoverageDeductible11;
	private double otherCoverageLimit21;
	private double otherCoverageDeductible21;

	private String address1;
	private int age1;
	private double totalSqFootage1;
	private double insdSqFootage1;
	private int noOfStories1;
	private String basement1;
	private String wallsframe1;
	private String wallshcb1;
	private String wallssteel1;
	private String wallsbrick1;
	private String roofwood1;
	private String roofsteel1;
	private String roofconcrete1;
	private String roofupdated1;
	private String floorsconcrete1;
	private String floorswood1;
	private String heatinggas1;
	private String heatingoil1;
	private String heatingelectric1;
	private String heatingother1;
	private String heatingupdated1;	
	private String electricalbreakers1;
	private String electricalfuses1;
	private String electricalamps1;
	private String electricalupdated1;
	private String plumbingcopper1;
	private String plumbingpvc1;
	private String plumbingother1;
	private String plumbingupdated1;
	private String fireProtection1;
	private String fireProtectiondistance1;
	private String security1;
	private String additionalcoverage1;


	private double buildingLimit2;
	private double buildingDeductible2;
	private double contentsLimit2;
	private double contentsDeductible2;
	private double stockLimit2;
	private double stockDeductible2;
	private double officeContentLimit2;
	private double officeContentDeductible2;
	private double edpLimit2;
	private double edpDeductible2;
	private double equipmentLimit2;
	private double equipmentDeductible2;
	private double offPremisesLimit2;
	private double offPremisesDeductible2;
	private double transitLimit2;
	private double transitDeductible2;
	private double miscPropertyLimit2;
	private double miscPropertyDeductible2;
	private double contractorEquipmentLimit2;
	private double contractorEquipmentDeductible2;
	private double installationFloaterLimit2;
	private double installationFloaterDeductible2;
	private double toolFloaterLimit2;
	private double toolFloaterDeductible2;
	private double signFloaterLimit2;
	private double signFloaterDeductible2;
	private String truckMan2;
	private String ownercb2;
	private double motorTruckLimit2;
	private double motorTruckDeductible2;
	private double glassLimit2;
	private double glassDeductible2;
	private double sewerBackupLimit2;
	private double sewerBackupDeductible2;
	private double floodLimit2;
	private double floodDeductible2;
	private double earthquakeLimit2;
	private double earthquakeDeductible2;
	private double profitLimit2;
	private double profitDeductible2;
	private String grossEarningCheckbox2;
	
	private double grossEarningLimit2;
	private double grossEarningDeductible2;
	private double rentalIncomeLimit2;
	private double rentalIncomeDeductible2;
	private double extraExpenseLimit2;
	private double extraExpenseDeductible2;
	private double offPremisesPowerLimit2;
	private double offPremisesPowerDeductible2;
	private double insideOutsideLimit2;
	private double insideOutsideDeductible2;
	private double bfMoneyLimit2;
	private double bfMoneyDeductible2;
	private double deopistorForgeryLimit2;
	private double deopistorForgeryDeductible2;
	private double moneyOrdersLimit2;
	private double moneyOrdersDeductible2;
	private double employDishonestyLimit2;
	private double employDishonestyDeductible2;
	private double cglLimit2;
	private double cglDeductible2;
	private double tenantsLegalLimit2;
	private double tenantsLegalDeductible2;
	private double nonOwnedAutoLimit2;
	private double nonOwnedAutoDeductible2;
	private double sef96Limit2;
	private double sef96Deductible2;
	private double sef94Limit2;
	private double sef94Deductible2;
	private double doLimit2;
	private double doDeductible2;
	private double eoLimit2;
	private double eoDeductible2;
	private double employerLimit2;
	private double employerDeductible2;
	private double umbrellaLimit2;
	private double umbrellaDeductible2;
	private double wrapUpLimit2;
	private double wrapUpDeductible2;
	private double stdComprehensiveLimit2;
	private double stdComprehensiveDeductible2;
	private double airConditioningLimit2;
	private double airConditioningDeductible2;
	private double productionMachineryLimit2;
	private double productionMachineryDeductible2;
	private String othercoverage12;
	private String othercoverage22;
	private double otherCoverageLimit12;
	private double otherCoverageDeductible12;
	private double otherCoverageLimit22;
	private double otherCoverageDeductible22;

	private String address2;
	private int age2;
	private double totalSqFootage2;
	private double insdSqFootage2;
	private int noOfStories2;
	private String basement2;
	private String wallsframe2;
	private String wallshcb2;
	private String wallssteel2;
	private String wallsbrick2;
	private String roofwood2;
	private String roofsteel2;
	private String roofconcrete2;
	private String roofupdated2;
	private String floorsconcrete2;
	private String floorswood2;
	private String heatinggas2;
	private String heatingoil2;
	private String heatingelectric2;
	private String heatingother2;
	private String heatingupdated2;	
	private String electricalbreakers2;
	private String electricalfuses2;
	private String electricalamps2;
	private String electricalupdated2;
	private String plumbingcopper2;
	private String plumbingpvc2;
	private String plumbingother2;
	private String plumbingupdated2;
	private String fireProtection2;
	private String fireProtectiondistance2;
	private String security2;
	private String additionalcoverage2;

	private double buildingLimit3;
	private double buildingDeductible3;
	private double contentsLimit3;
	private double contentsDeductible3;
	private double stockLimit3;
	private double stockDeductible3;
	private double officeContentLimit3;
	private double officeContentDeductible3;
	private double edpLimit3;
	private double edpDeductible3;
	private double equipmentLimit3;
	private double equipmentDeductible3;
	private double offPremisesLimit3;
	private double offPremisesDeductible3;
	private double transitLimit3;
	private double transitDeductible3;
	private double miscPropertyLimit3;
	private double miscPropertyDeductible3;
	private double contractorEquipmentLimit3;
	private double contractorEquipmentDeductible3;
	private double installationFloaterLimit3;
	private double installationFloaterDeductible3;
	private double toolFloaterLimit3;
	private double toolFloaterDeductible3;
	private double signFloaterLimit3;
	private double signFloaterDeductible3;
	private String truckMan3;
	private String ownercb3;
	private double motorTruckLimit3;
	private double motorTruckDeductible3;
	private double glassLimit3;
	private double glassDeductible3;
	private double sewerBackupLimit3;
	private double sewerBackupDeductible3;
	private double floodLimit3;
	private double floodDeductible3;
	private double earthquakeLimit3;
	private double earthquakeDeductible3;
	private double profitLimit3;
	private double profitDeductible3;
	private String grossEarningCheckbox3;
	
	private double grossEarningLimit3;
	private double grossEarningDeductible3;
	private double rentalIncomeLimit3;
	private double rentalIncomeDeductible3;
	private double extraExpenseLimit3;
	private double extraExpenseDeductible3;
	private double offPremisesPowerLimit3;
	private double offPremisesPowerDeductible3;
	private double insideOutsideLimit3;
	private double insideOutsideDeductible3;
	private double bfMoneyLimit3;
	private double bfMoneyDeductible3;
	private double deopistorForgeryLimit3;
	private double deopistorForgeryDeductible3;
	private double moneyOrdersLimit3;
	private double moneyOrdersDeductible3;
	private double employDishonestyLimit3;
	private double employDishonestyDeductible3;
	private double cglLimit3;
	private double cglDeductible3;
	private double tenantsLegalLimit3;
	private double tenantsLegalDeductible3;
	private double nonOwnedAutoLimit3;
	private double nonOwnedAutoDeductible3;
	private double sef96Limit3;
	private double sef96Deductible3;
	private double sef94Limit3;
	private double sef94Deductible3;
	private double doLimit3;
	private double doDeductible3;
	private double eoLimit3;
	private double eoDeductible3;
	private double employerLimit3;
	private double employerDeductible3;
	private double umbrellaLimit3;
	private double umbrellaDeductible3;
	private double wrapUpLimit3;
	private double wrapUpDeductible3;
	private double stdComprehensiveLimit3;
	private double stdComprehensiveDeductible3;
	private double airConditioningLimit3;
	private double airConditioningDeductible3;
	private double productionMachineryLimit3;
	private double productionMachineryDeductible3;
	private String othercoverage13;
	private String othercoverage23;
	private double otherCoverageLimit13;
	private double otherCoverageDeductible13;
	private double otherCoverageLimit23;
	private double otherCoverageDeductible23;

	private String address3;
	private int age3;
	private double totalSqFootage3;
	private double insdSqFootage3;
	private int noOfStories3;
	private String basement3;
	private String wallsframe3;
	private String wallshcb3;
	private String wallssteel3;
	private String wallsbrick3;
	private String roofwood3;
	private String roofsteel3;
	private String roofconcrete3;
	private String roofupdated3;
	private String floorsconcrete3;
	private String floorswood3;
	private String heatinggas3;
	private String heatingoil3;
	private String heatingelectric3;
	private String heatingother3;
	private String heatingupdated3;	
	private String electricalbreakers3;
	private String electricalfuses3;
	private String electricalamps3;
	private String electricalupdated3;
	private String plumbingcopper3;
	private String plumbingpvc3;
	private String plumbingother3;
	private String plumbingupdated3;
	private String fireProtection3;
	private String fireProtectiondistance3;
	private String security3;
	private String additionalcoverage3;

	private double buildingLimit4;
	private double buildingDeductible4;
	private double contentsLimit4;
	private double contentsDeductible4;
	private double stockLimit4;
	private double stockDeductible4;
	private double officeContentLimit4;
	private double officeContentDeductible4;
	private double edpLimit4;
	private double edpDeductible4;
	private double equipmentLimit4;
	private double equipmentDeductible4;
	private double offPremisesLimit4;
	private double offPremisesDeductible4;
	private double transitLimit4;
	private double transitDeductible4;
	private double miscPropertyLimit4;
	private double miscPropertyDeductible4;
	private double contractorEquipmentLimit4;
	private double contractorEquipmentDeductible4;
	private double installationFloaterLimit4;
	private double installationFloaterDeductible4;
	private double toolFloaterLimit4;
	private double toolFloaterDeductible4;
	private double signFloaterLimit4;
	private double signFloaterDeductible4;
	private String truckMan4;
	private String ownercb4;
	private double motorTruckLimit4;
	private double motorTruckDeductible4;
	private double glassLimit4;
	private double glassDeductible4;
	private double sewerBackupLimit4;
	private double sewerBackupDeductible4;
	private double floodLimit4;
	private double floodDeductible4;
	private double earthquakeLimit4;
	private double earthquakeDeductible4;
	private double profitLimit4;
	private double profitDeductible4;
	private String grossEarningCheckbox4;
	
	private double grossEarningLimit4;
	private double grossEarningDeductible4;
	private double rentalIncomeLimit4;
	private double rentalIncomeDeductible4;
	private double extraExpenseLimit4;
	private double extraExpenseDeductible4;
	private double offPremisesPowerLimit4;
	private double offPremisesPowerDeductible4;
	private double insideOutsideLimit4;
	private double insideOutsideDeductible4;
	private double bfMoneyLimit4;
	private double bfMoneyDeductible4;
	private double deopistorForgeryLimit4;
	private double deopistorForgeryDeductible4;
	private double moneyOrdersLimit4;
	private double moneyOrdersDeductible4;
	private double employDishonestyLimit4;
	private double employDishonestyDeductible4;
	private double cglLimit4;
	private double cglDeductible4;
	private double tenantsLegalLimit4;
	private double tenantsLegalDeductible4;
	private double nonOwnedAutoLimit4;
	private double nonOwnedAutoDeductible4;
	private double sef96Limit4;
	private double sef96Deductible4;
	private double sef94Limit4;
	private double sef94Deductible4;
	private double doLimit4;
	private double doDeductible4;
	private double eoLimit4;
	private double eoDeductible4;
	private double employerLimit4;
	private double employerDeductible4;
	private double umbrellaLimit4;
	private double umbrellaDeductible4;
	private double wrapUpLimit4;
	private double wrapUpDeductible4;
	private double stdComprehensiveLimit4;
	private double stdComprehensiveDeductible4;
	private double airConditioningLimit4;
	private double airConditioningDeductible4;
	private double productionMachineryLimit4;
	private double productionMachineryDeductible4;
	private String othercoverage14;
	private String othercoverage24;
	private double otherCoverageLimit14;
	private double otherCoverageDeductible14;
	private double otherCoverageLimit24;
	private double otherCoverageDeductible24;

	private String address4;
	private int age4;
	private double totalSqFootage4;
	private double insdSqFootage4;
	private int noOfStories4;
	private String basement4;
	private String wallsframe4;
	private String wallshcb4;
	private String wallssteel4;
	private String wallsbrick4;
	private String roofwood4;
	private String roofsteel4;
	private String roofconcrete4;
	private String roofupdated4;
	private String floorsconcrete4;
	private String floorswood4;
	private String heatinggas4;
	private String heatingoil4;
	private String heatingelectric4;
	private String heatingother4;
	private String heatingupdated4;	
	private String electricalbreakers4;
	private String electricalfuses4;
	private String electricalamps4;
	private String electricalupdated4;
	private String plumbingcopper4;
	private String plumbingpvc4;
	private String plumbingother4;
	private String plumbingupdated4;
	private String fireProtection4;
	private String fireProtectiondistance4;
	private String security4;
	private String additionalcoverage4;
	
	private double buildingLimit5;
	private double buildingDeductible5;
	private double contentsLimit5;
	private double contentsDeductible5;
	private double stockLimit5;
	private double stockDeductible5;
	private double officeContentLimit5;
	private double officeContentDeductible5;
	private double edpLimit5;
	private double edpDeductible5;
	private double equipmentLimit5;
	private double equipmentDeductible5;
	private double offPremisesLimit5;
	private double offPremisesDeductible5;
	private double transitLimit5;
	private double transitDeductible5;
	private double miscPropertyLimit5;
	private double miscPropertyDeductible5;
	private double contractorEquipmentLimit5;
	private double contractorEquipmentDeductible5;
	private double installationFloaterLimit5;
	private double installationFloaterDeductible5;
	private double toolFloaterLimit5;
	private double toolFloaterDeductible5;
	private double signFloaterLimit5;
	private double signFloaterDeductible5;
	private String truckMan5;
	private String ownercb5;
	private double motorTruckLimit5;
	private double motorTruckDeductible5;
	private double glassLimit5;
	private double glassDeductible5;
	private double sewerBackupLimit5;
	private double sewerBackupDeductible5;
	private double floodLimit5;
	private double floodDeductible5;
	private double earthquakeLimit5;
	private double earthquakeDeductible5;
	private double profitLimit5;
	private double profitDeductible5;
	private String grossEarningCheckbox5;
	
	private double grossEarningLimit5;
	private double grossEarningDeductible5;
	private double rentalIncomeLimit5;
	private double rentalIncomeDeductible5;
	private double extraExpenseLimit5;
	private double extraExpenseDeductible5;
	private double offPremisesPowerLimit5;
	private double offPremisesPowerDeductible5;
	private double insideOutsideLimit5;
	private double insideOutsideDeductible5;
	private double bfMoneyLimit5;
	private double bfMoneyDeductible5;
	private double deopistorForgeryLimit5;
	private double deopistorForgeryDeductible5;
	private double moneyOrdersLimit5;
	private double moneyOrdersDeductible5;
	private double employDishonestyLimit5;
	private double employDishonestyDeductible5;
	private double cglLimit5;
	private double cglDeductible5;
	private double tenantsLegalLimit5;
	private double tenantsLegalDeductible5;
	private double nonOwnedAutoLimit5;
	private double nonOwnedAutoDeductible5;
	private double sef96Limit5;
	private double sef96Deductible5;
	private double sef94Limit5;
	private double sef94Deductible5;
	private double doLimit5;
	private double doDeductible5;
	private double eoLimit5;
	private double eoDeductible5;
	private double employerLimit5;
	private double employerDeductible5;
	private double umbrellaLimit5;
	private double umbrellaDeductible5;
	private double wrapUpLimit5;
	private double wrapUpDeductible5;
	private double stdComprehensiveLimit5;
	private double stdComprehensiveDeductible5;
	private double airConditioningLimit5;
	private double airConditioningDeductible5;
	private double productionMachineryLimit5;
	private double productionMachineryDeductible5;
	private String othercoverage15;
	private String othercoverage25;
	private double otherCoverageLimit15;
	private double otherCoverageDeductible15;
	private double otherCoverageLimit25;
	private double otherCoverageDeductible25;

	private String address5;
	private int age5;
	private double totalSqFootage5;
	private double insdSqFootage5;
	private int noOfStories5;
	private String basement5;
	private String wallsframe5;
	private String wallshcb5;
	private String wallssteel5;
	private String wallsbrick5;
	private String roofwood5;
	private String roofsteel5;
	private String roofconcrete5;
	private String roofupdated5;
	private String floorsconcrete5;
	private String floorswood5;
	private String heatinggas5;
	private String heatingoil5;
	private String heatingelectric5;
	private String heatingother5;
	private String heatingupdated5;	
	private String electricalbreakers5;
	private String electricalfuses5;
	private String electricalamps5;
	private String electricalupdated5;
	private String plumbingcopper5;
	private String plumbingpvc5;
	private String plumbingother5;
	private String plumbingupdated5;
	private String fireProtection5;
	private String fireProtectiondistance5;
	private String security5;
	private String additionalcoverage5;
	
	private double buildingLimit6;
	private double buildingDeductible6;
	private double contentsLimit6;
	private double contentsDeductible6;
	private double stockLimit6;
	private double stockDeductible6;
	private double officeContentLimit6;
	private double officeContentDeductible6;
	private double edpLimit6;
	private double edpDeductible6;
	private double equipmentLimit6;
	private double equipmentDeductible6;
	private double offPremisesLimit6;
	private double offPremisesDeductible6;
	private double transitLimit6;
	private double transitDeductible6;
	private double miscPropertyLimit6;
	private double miscPropertyDeductible6;
	private double contractorEquipmentLimit6;
	private double contractorEquipmentDeductible6;
	private double installationFloaterLimit6;
	private double installationFloaterDeductible6;
	private double toolFloaterLimit6;
	private double toolFloaterDeductible6;
	private double signFloaterLimit6;
	private double signFloaterDeductible6;
	private String truckMan6;
	private String ownercb6;
	private double motorTruckLimit6;
	private double motorTruckDeductible6;
	private double glassLimit6;
	private double glassDeductible6;
	private double sewerBackupLimit6;
	private double sewerBackupDeductible6;
	private double floodLimit6;
	private double floodDeductible6;
	private double earthquakeLimit6;
	private double earthquakeDeductible6;
	private double profitLimit6;
	private double profitDeductible6;
	private String grossEarningCheckbox6;
	
	private double grossEarningLimit6;
	private double grossEarningDeductible6;
	private double rentalIncomeLimit6;
	private double rentalIncomeDeductible6;
	private double extraExpenseLimit6;
	private double extraExpenseDeductible6;
	private double offPremisesPowerLimit6;
	private double offPremisesPowerDeductible6;
	private double insideOutsideLimit6;
	private double insideOutsideDeductible6;
	private double bfMoneyLimit6;
	private double bfMoneyDeductible6;
	private double deopistorForgeryLimit6;
	private double deopistorForgeryDeductible6;
	private double moneyOrdersLimit6;
	private double moneyOrdersDeductible6;
	private double employDishonestyLimit6;
	private double employDishonestyDeductible6;
	private double cglLimit6;
	private double cglDeductible6;
	private double tenantsLegalLimit6;
	private double tenantsLegalDeductible6;
	private double nonOwnedAutoLimit6;
	private double nonOwnedAutoDeductible6;
	private double sef96Limit6;
	private double sef96Deductible6;
	private double sef94Limit6;
	private double sef94Deductible6;
	private double doLimit6;
	private double doDeductible6;
	private double eoLimit6;
	private double eoDeductible6;
	private double employerLimit6;
	private double employerDeductible6;
	private double umbrellaLimit6;
	private double umbrellaDeductible6;
	private double wrapUpLimit6;
	private double wrapUpDeductible6;
	private double stdComprehensiveLimit6;
	private double stdComprehensiveDeductible6;
	private double airConditioningLimit6;
	private double airConditioningDeductible6;
	private double productionMachineryLimit6;
	private double productionMachineryDeductible6;
	private String othercoverage16;
	private String othercoverage26;
	private double otherCoverageLimit16;
	private double otherCoverageDeductible16;
	private double otherCoverageLimit26;
	private double otherCoverageDeductible26;

	private String address6;
	private int age6;
	private double totalSqFootage6;
	private double insdSqFootage6;
	private int noOfStories6;
	private String basement6;
	private String wallsframe6;
	private String wallshcb6;
	private String wallssteel6;
	private String wallsbrick6;
	private String roofwood6;
	private String roofsteel6;
	private String roofconcrete6;
	private String roofupdated6;
	private String floorsconcrete6;
	private String floorswood6;
	private String heatinggas6;
	private String heatingoil6;
	private String heatingelectric6;
	private String heatingother6;
	private String heatingupdated6;	
	private String electricalbreakers6;
	private String electricalfuses6;
	private String electricalamps6;
	private String electricalupdated6;
	private String plumbingcopper6;
	private String plumbingpvc6;
	private String plumbingother6;
	private String plumbingupdated6;
	private String fireProtection6;
	private String fireProtectiondistance6;
	private String security6;
	private String additionalcoverage6;
	
	private double buildingLimit7;
	private double buildingDeductible7;
	private double contentsLimit7;
	private double contentsDeductible7;
	private double stockLimit7;
	private double stockDeductible7;
	private double officeContentLimit7;
	private double officeContentDeductible7;
	private double edpLimit7;
	private double edpDeductible7;
	private double equipmentLimit7;
	private double equipmentDeductible7;
	private double offPremisesLimit7;
	private double offPremisesDeductible7;
	private double transitLimit7;
	private double transitDeductible7;
	private double miscPropertyLimit7;
	private double miscPropertyDeductible7;
	private double contractorEquipmentLimit7;
	private double contractorEquipmentDeductible7;
	private double installationFloaterLimit7;
	private double installationFloaterDeductible7;
	private double toolFloaterLimit7;
	private double toolFloaterDeductible7;
	private double signFloaterLimit7;
	private double signFloaterDeductible7;
	private String truckMan7;
	private String ownercb7;
	private double motorTruckLimit7;
	private double motorTruckDeductible7;
	private double glassLimit7;
	private double glassDeductible7;
	private double sewerBackupLimit7;
	private double sewerBackupDeductible7;
	private double floodLimit7;
	private double floodDeductible7;
	private double earthquakeLimit7;
	private double earthquakeDeductible7;
	private double profitLimit7;
	private double profitDeductible7;
	private String grossEarningCheckbox7;
	
	private double grossEarningLimit7;
	private double grossEarningDeductible7;
	private double rentalIncomeLimit7;
	private double rentalIncomeDeductible7;
	private double extraExpenseLimit7;
	private double extraExpenseDeductible7;
	private double offPremisesPowerLimit7;
	private double offPremisesPowerDeductible7;
	private double insideOutsideLimit7;
	private double insideOutsideDeductible7;
	private double bfMoneyLimit7;
	private double bfMoneyDeductible7;
	private double deopistorForgeryLimit7;
	private double deopistorForgeryDeductible7;
	private double moneyOrdersLimit7;
	private double moneyOrdersDeductible7;
	private double employDishonestyLimit7;
	private double employDishonestyDeductible7;
	private double cglLimit7;
	private double cglDeductible7;
	private double tenantsLegalLimit7;
	private double tenantsLegalDeductible7;
	private double nonOwnedAutoLimit7;
	private double nonOwnedAutoDeductible7;
	private double sef96Limit7;
	private double sef96Deductible7;
	private double sef94Limit7;
	private double sef94Deductible7;
	private double doLimit7;
	private double doDeductible7;
	private double eoLimit7;
	private double eoDeductible7;
	private double employerLimit7;
	private double employerDeductible7;
	private double umbrellaLimit7;
	private double umbrellaDeductible7;
	private double wrapUpLimit7;
	private double wrapUpDeductible7;
	private double stdComprehensiveLimit7;
	private double stdComprehensiveDeductible7;
	private double airConditioningLimit7;
	private double airConditioningDeductible7;
	private double productionMachineryLimit7;
	private double productionMachineryDeductible7;
	private String othercoverage17;
	private String othercoverage27;
	private double otherCoverageLimit17;
	private double otherCoverageDeductible17;
	private double otherCoverageLimit27;
	private double otherCoverageDeductible27;

	private String address7;
	private int age7;
	private double totalSqFootage7;
	private double insdSqFootage7;
	private int noOfStories7;
	private String basement7;
	private String wallsframe7;
	private String wallshcb7;
	private String wallssteel7;
	private String wallsbrick7;
	private String roofwood7;
	private String roofsteel7;
	private String roofconcrete7;
	private String roofupdated7;
	private String floorsconcrete7;
	private String floorswood7;
	private String heatinggas7;
	private String heatingoil7;
	private String heatingelectric7;
	private String heatingother7;
	private String heatingupdated7;	
	private String electricalbreakers7;
	private String electricalfuses7;
	private String electricalamps7;
	private String electricalupdated7;
	private String plumbingcopper7;
	private String plumbingpvc7;
	private String plumbingother7;
	private String plumbingupdated7;
	private String fireProtection7;
	private String fireProtectiondistance7;
	private String security7;
	private String additionalcoverage7;

	private String currentInsurer;
	private Date currentExpDate;
	private double premiumTarget;

	private String lienHolders1;
	private String lienHoldersVehicle1;
	private String lienHolders2;
	private String lienHoldersVehicle2;
	private String lienHolders3;
	private String lienHoldersVehicle3;
	
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
	private String commoditiesTransportedBy;
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

	private String vehicleNonOwned;
	private String contract;
	private String typeOfNonOwned;
	private double avgNoOfVehicles;
	private double avgValue;
	private double maxVehicleValue;
	private double maxCostValue;
	private String instructionNotes;

	public int getYearInBusiness() {
		return yearInBusiness;
	}

	public void setYearInBusiness(int yearInBusiness) {
		this.yearInBusiness = yearInBusiness;
	}

	public Date getCurrentInsuranceExpiry1() {
		return currentInsuranceExpiry1;
	}

	public Date getCurrentInsuranceExpiry2() {
		return currentInsuranceExpiry2;
	}

	public Date getCurrentInsuranceExpiry3() {
		return currentInsuranceExpiry3;
	}

	public Date getCurrentInsuranceExpiry4() {
		return currentInsuranceExpiry4;
	}

	public void setCurrentInsuranceExpiry1(Date currentInsuranceExpiry1) {
		this.currentInsuranceExpiry1 = currentInsuranceExpiry1;
	}

	public void setCurrentInsuranceExpiry2(Date currentInsuranceExpiry2) {
		this.currentInsuranceExpiry2 = currentInsuranceExpiry2;
	}

	public void setCurrentInsuranceExpiry3(Date currentInsuranceExpiry3) {
		this.currentInsuranceExpiry3 = currentInsuranceExpiry3;
	}

	public void setCurrentInsuranceExpiry4(Date currentInsuranceExpiry4) {
		this.currentInsuranceExpiry4 = currentInsuranceExpiry4;
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

	public String getTruckMan() {
		return truckMan;
	}

	public void setTruckMan(String truckMan) {
		this.truckMan = truckMan;
	}

	

	public String getGrossEarningCheckBox() {
		return grossEarningCheckbox;
	}

	public void setGrossEarningCheckBox(String grossEarningCheckBox) {
		this.grossEarningCheckbox = grossEarningCheckBox;
	}

	public String getOthercoverage1() {
		return othercoverage1;
	}

	public void setOthercoverage1(String othercoverage1) {
		this.othercoverage1 = othercoverage1;
	}

	public String getOthercoverage2() {
		return othercoverage2;
	}

	public void setOthercoverage2(String othercoverage2) {
		this.othercoverage2 = othercoverage2;
	}

	public double getOtherCoverageLimit1() {
		return otherCoverageLimit1;
	}

	public void setOtherCoverageLimit1(double otherCoverageLimit1) {
		this.otherCoverageLimit1 = otherCoverageLimit1;
	}

	public double getOtherCoverageDeductible1() {
		return otherCoverageDeductible1;
	}

	public void setOtherCoverageDeductible1(double otherCoverageDeductible1) {
		this.otherCoverageDeductible1 = otherCoverageDeductible1;
	}

	public double getOtherCoverageLimit2() {
		return otherCoverageLimit2;
	}

	public void setOtherCoverageLimit2(double otherCoverageLimit2) {
		this.otherCoverageLimit2 = otherCoverageLimit2;
	}

	public double getOtherCoverageDeductible2() {
		return otherCoverageDeductible2;
	}

	public void setOtherCoverageDeductible2(double otherCoverageDeductible2) {
		this.otherCoverageDeductible2 = otherCoverageDeductible2;
	}

	public String getBasement() {
		return basement;
	}

	public void setBasement(String basement) {
		this.basement = basement;
	}

	public String getRoofupdated() {
		return roofupdated;
	}

	public void setRoofupdated(String roofupdated) {
		this.roofupdated = roofupdated;
	}

	public String getHeatingupdated() {
		return heatingupdated;
	}

	public void setHeatingupdated(String heatingupdated) {
		this.heatingupdated = heatingupdated;
	}

	public String getElectricalupdated() {
		return electricalupdated;
	}

	public void setElectricalupdated(String electricalupdated) {
		this.electricalupdated = electricalupdated;
	}

	public String getPlumbingupdated() {
		return plumbingupdated;
	}

	public void setPlumbingupdated(String plumbingupdated) {
		this.plumbingupdated = plumbingupdated;
	}

	public String getFireProtectiondistance() {
		return fireProtectiondistance;
	}

	public void setFireProtectiondistance(String fireProtectiondistance) {
		this.fireProtectiondistance = fireProtectiondistance;
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

	
	public String getOtherSpecify() {
		return otherSpecify;
	}

	public void setOtherSpecify(String otherSpecify) {
		this.otherSpecify = otherSpecify;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	public String getWallsframe() {
		return wallsframe;
	}

	public void setWallsframe(String wallsframe) {
		this.wallsframe = wallsframe;
	}

	public String getWallshcb() {
		return wallshcb;
	}

	public void setWallshcb(String wallshcb) {
		this.wallshcb = wallshcb;
	}

	public String getWallssteel() {
		return wallssteel;
	}

	public void setWallssteel(String wallssteel) {
		this.wallssteel = wallssteel;
	}

	public String getWallsbrick() {
		return wallsbrick;
	}

	public void setWallsbrick(String wallsbrick) {
		this.wallsbrick = wallsbrick;
	}

	public String getRoofwood() {
		return roofwood;
	}

	public void setRoofwood(String roofwood) {
		this.roofwood = roofwood;
	}

	public String getRoofsteel() {
		return roofsteel;
	}

	public void setRoofsteel(String roofsteel) {
		this.roofsteel = roofsteel;
	}

	public String getRoofconcrete() {
		return roofconcrete;
	}

	public void setRoofconcrete(String roofconcrete) {
		this.roofconcrete = roofconcrete;
	}

	public String getFloorsconcrete() {
		return floorsconcrete;
	}

	public void setFloorsconcrete(String floorsconcrete) {
		this.floorsconcrete = floorsconcrete;
	}

	public String getFloorswood() {
		return floorswood;
	}

	public void setFloorswood(String floorswood) {
		this.floorswood = floorswood;
	}

	public String getHeatinggas() {
		return heatinggas;
	}

	public void setHeatinggas(String heatinggas) {
		this.heatinggas = heatinggas;
	}

	public String getHeatingoil() {
		return heatingoil;
	}

	public void setHeatingoil(String heatingoil) {
		this.heatingoil = heatingoil;
	}

	public String getHeatingelectric() {
		return heatingelectric;
	}

	public void setHeatingelectric(String heatingelectric) {
		this.heatingelectric = heatingelectric;
	}

	public String getHeatingother() {
		return heatingother;
	}

	public void setHeatingother(String heatingother) {
		this.heatingother = heatingother;
	}

	public String getElectricalbreakers() {
		return electricalbreakers;
	}

	public void setElectricalbreakers(String electricalbreakers) {
		this.electricalbreakers = electricalbreakers;
	}

	public String getElectricalfuses() {
		return electricalfuses;
	}

	public void setElectricalfuses(String electricalfuses) {
		this.electricalfuses = electricalfuses;
	}

	public String getElectricalamps() {
		return electricalamps;
	}

	public void setElectricalamps(String electricalamps) {
		this.electricalamps = electricalamps;
	}

	public String getPlumbingcopper() {
		return plumbingcopper;
	}

	public void setPlumbingcopper(String plumbingcopper) {
		this.plumbingcopper = plumbingcopper;
	}

	public String getPlumbingpvc() {
		return plumbingpvc;
	}

	public void setPlumbingpvc(String plumbingpvc) {
		this.plumbingpvc = plumbingpvc;
	}

	public String getPlumbingother() {
		return plumbingother;
	}

	public void setPlumbingother(String plumbingother) {
		this.plumbingother = plumbingother;
	}

	public String getAdditionalcoverage() {
		return additionalcoverage;
	}

	public void setAdditionalcoverage(String additionalcoverage) {
		this.additionalcoverage = additionalcoverage;
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

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
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

	

	public String getCommoditiesTransportedBy() {
		return commoditiesTransportedBy;
	}

	public void setCommoditiesTransportedBy(String commoditiesTransportedBy) {
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

	public String getVehicleNonOwned() {
		return vehicleNonOwned;
	}

	public void setVehicleNonOwned(String vehicleNonOwned) {
		this.vehicleNonOwned = vehicleNonOwned;
	}

	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
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

	public String getProfit() {
		return profit;
	}

	public void setProfit(String profit) {
		this.profit = profit;
	}

	public String getNonProfit() {
		return nonProfit;
	}

	public void setNonProfit(String nonProfit) {
		this.nonProfit = nonProfit;
	}

	public String getRelatedExperience() {
		return relatedExperience;
	}

	public void setRelatedExperience(String relatedExperience) {
		this.relatedExperience = relatedExperience;
	}

	public String getOwner1() {
		return owner1;
	}

	public void setOwner1(String owner1) {
		this.owner1 = owner1;
	}

	public String getOwner2() {
		return owner2;
	}

	public void setOwner2(String owner2) {
		this.owner2 = owner2;
	}

	public String getOwner3() {
		return owner3;
	}

	public void setOwner3(String owner3) {
		this.owner3 = owner3;
	}

	public String getOwner4() {
		return owner4;
	}

	public void setOwner4(String owner4) {
		this.owner4 = owner4;
	}

	public String getBoardOfDirector1() {
		return boardOfDirector1;
	}

	public void setBoardOfDirector1(String boardOfDirector1) {
		this.boardOfDirector1 = boardOfDirector1;
	}

	public String getBoardOfDirector2() {
		return boardOfDirector2;
	}

	public void setBoardOfDirector2(String boardOfDirector2) {
		this.boardOfDirector2 = boardOfDirector2;
	}

	public String getBoardOfDirector3() {
		return boardOfDirector3;
	}

	public void setBoardOfDirector3(String boardOfDirector3) {
		this.boardOfDirector3 = boardOfDirector3;
	}

	public String getBoardOfDirector4() {
		return boardOfDirector4;
	}

	public void setBoardOfDirector4(String boardOfDirector4) {
		this.boardOfDirector4 = boardOfDirector4;
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

	public String getGroupBenefits() {
		return groupBenefits;
	}

	public void setGroupBenefits(String groupBenefits) {
		this.groupBenefits = groupBenefits;
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

	public String getPensionPlan() {
		return pensionPlan;
	}

	public void setPensionPlan(String pensionPlan) {
		this.pensionPlan = pensionPlan;
	}

	public String getCurrency1() {
		return currency1;
	}

	public void setCurrency1(String currency1) {
		this.currency1 = currency1;
	}

	public String getCurrency2() {
		return currency2;
	}

	public void setCurrency2(String currency2) {
		this.currency2 = currency2;
	}

	public String getCurrency3() {
		return currency3;
	}

	public void setCurrency3(String currency3) {
		this.currency3 = currency3;
	}

	public String getCurrency4() {
		return currency4;
	}

	public void setCurrency4(String currency4) {
		this.currency4 = currency4;
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

	public int getOnpremises() {
		return onpremises;
	}

	public void setOnpremises(int onpremises) {
		this.onpremises = onpremises;
	}

	public int getOffpremises() {
		return offpremises;
	}

	public void setOffpremises(int offpremises) {
		this.offpremises = offpremises;
	}

	public int getResidential() {
		return residential;
	}

	public void setResidential(int residential) {
		this.residential = residential;
	}

	public int getCommercial() {
		return commercial;
	}

	public void setCommercial(int commercial) {
		this.commercial = commercial;
	}

	public int getSubcontracted() {
		return subcontracted;
	}

	public void setSubcontracted(int subcontracted) {
		this.subcontracted = subcontracted;
	}

	public String getEcommerce() {
		return ecommerce;
	}

	public void setEcommerce(String ecommerce) {
		this.ecommerce = ecommerce;
	}

	public String getProfessionalLiability() {
		return professionalLiability;
	}

	public void setProfessionalLiability(String professionalLiability) {
		this.professionalLiability = professionalLiability;
	}

	public String getCyberLiability() {
		return cyberLiability;
	}

	public void setCyberLiability(String cyberLiability) {
		this.cyberLiability = cyberLiability;
	}

	public String getPollutionexposure() {
		return pollutionexposure;
	}

	public void setPollutionexposure(String pollutionexposure) {
		this.pollutionexposure = pollutionexposure;
	}

	public String getAccidentalBenefits() {
		return accidentalBenefits;
	}

	public void setAccidentalBenefits(String accidentalBenefits) {
		this.accidentalBenefits = accidentalBenefits;
	}

	public String getMalpracticeExposure() {
		return malpracticeExposure;
	}

	public void setMalpracticeExposure(String malpracticeExposure) {
		this.malpracticeExposure = malpracticeExposure;
	}

	public String getAbuseExposure() {
		return abuseExposure;
	}

	public void setAbuseExposure(String abuseExposure) {
		this.abuseExposure = abuseExposure;
	}

	public String getBondingOpportunities() {
		return bondingOpportunities;
	}

	public void setBondingOpportunities(String bondingOpportunities) {
		this.bondingOpportunities = bondingOpportunities;
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

	public String getBusinessInterruptionSheet() {
		return businessInterruptionSheet;
	}

	public void setBusinessInterruptionSheet(String businessInterruptionSheet) {
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

	public String getProducercomments() {
		return producercomments;
	}

	public void setProducercomments(String producercomments) {
		this.producercomments = producercomments;
	}

	public String getMarketercomments() {
		return marketercomments;
	}

	public void setMarketercomments(String marketercomments) {
		this.marketercomments = marketercomments;
	}

	public byte[] getFile1() {
		return file1;
	}

	public void setFile1(byte[] file1) {
		this.file1 = file1;
	}

	public byte[] getFile2() {
		return file2;
	}

	public void setFile2(byte[] file2) {
		this.file2 = file2;
	}

	public byte[] getFile3() {
		return file3;
	}

	public void setFile3(byte[] file3) {
		this.file3 = file3;
	}

	public byte[] getFile4() {
		return file4;
	}

	public void setFile4(byte[] file4) {
		this.file4 = file4;
	}

	public byte[] getFile5() {
		return file5;
	}

	public void setFile5(byte[] file5) {
		this.file5 = file5;
	}

	public byte[] getFile6() {
		return file6;
	}

	public void setFile6(byte[] file6) {
		this.file6 = file6;
	}

	public byte[] getFile7() {
		return file7;
	}

	public void setFile7(byte[] file7) {
		this.file7 = file7;
	}

	public byte[] getFile8() {
		return file8;
	}

	public void setFile8(byte[] file8) {
		this.file8 = file8;
	}

	public byte[] getFile9() {
		return file9;
	}

	public void setFile9(byte[] file9) {
		this.file9 = file9;
	}

	public byte[] getFile10() {
		return file10;
	}

	public void setFile10(byte[] file10) {
		this.file10 = file10;
	}

	public String getFile1Name() {
		return file1Name;
	}

	public void setFile1Name(String file1Name) {
		this.file1Name = file1Name;
	}

	public String getFile2Name() {
		return file2Name;
	}

	public void setFile2Name(String file2Name) {
		this.file2Name = file2Name;
	}

	public String getFile3Name() {
		return file3Name;
	}

	public void setFile3Name(String file3Name) {
		this.file3Name = file3Name;
	}

	public String getFile4Name() {
		return file4Name;
	}

	public void setFile4Name(String file4Name) {
		this.file4Name = file4Name;
	}

	public String getFile5Name() {
		return file5Name;
	}

	public void setFile5Name(String file5Name) {
		this.file5Name = file5Name;
	}

	public String getFile6Name() {
		return file6Name;
	}

	public void setFile6Name(String file6Name) {
		this.file6Name = file6Name;
	}

	public String getFile7Name() {
		return file7Name;
	}

	public void setFile7Name(String file7Name) {
		this.file7Name = file7Name;
	}

	public String getFile8Name() {
		return file8Name;
	}

	public void setFile8Name(String file8Name) {
		this.file8Name = file8Name;
	}

	public String getFile9Name() {
		return file9Name;
	}

	public void setFile9Name(String file9Name) {
		this.file9Name = file9Name;
	}

	public String getFile10Name() {
		return file10Name;
	}

	public void setFile10Name(String file10Name) {
		this.file10Name = file10Name;
	}

	public double getBuildingLimit1() {
		return buildingLimit1;
	}

	public void setBuildingLimit1(double buildingLimit1) {
		this.buildingLimit1 = buildingLimit1;
	}

	public double getBuildingDeductible1() {
		return buildingDeductible1;
	}

	public void setBuildingDeductible1(double buildingDeductible1) {
		this.buildingDeductible1 = buildingDeductible1;
	}

	public double getContentsLimit1() {
		return contentsLimit1;
	}

	public void setContentsLimit1(double contentsLimit1) {
		this.contentsLimit1 = contentsLimit1;
	}

	public double getContentsDeductible1() {
		return contentsDeductible1;
	}

	public void setContentsDeductible1(double contentsDeductible1) {
		this.contentsDeductible1 = contentsDeductible1;
	}

	public double getStockLimit1() {
		return stockLimit1;
	}

	public void setStockLimit1(double stockLimit1) {
		this.stockLimit1 = stockLimit1;
	}

	public double getStockDeductible1() {
		return stockDeductible1;
	}

	public void setStockDeductible1(double stockDeductible1) {
		this.stockDeductible1 = stockDeductible1;
	}

	public double getOfficeContentLimit1() {
		return officeContentLimit1;
	}

	public void setOfficeContentLimit1(double officeContentLimit1) {
		this.officeContentLimit1 = officeContentLimit1;
	}

	public double getOfficeContentDeductible1() {
		return officeContentDeductible1;
	}

	public void setOfficeContentDeductible1(double officeContentDeductible1) {
		this.officeContentDeductible1 = officeContentDeductible1;
	}

	public double getEdpLimit1() {
		return edpLimit1;
	}

	public void setEdpLimit1(double edpLimit1) {
		this.edpLimit1 = edpLimit1;
	}

	public double getEdpDeductible1() {
		return edpDeductible1;
	}

	public void setEdpDeductible1(double edpDeductible1) {
		this.edpDeductible1 = edpDeductible1;
	}

	public double getEquipmentLimit1() {
		return equipmentLimit1;
	}

	public void setEquipmentLimit1(double equipmentLimit1) {
		this.equipmentLimit1 = equipmentLimit1;
	}

	public double getEquipmentDeductible1() {
		return equipmentDeductible1;
	}

	public void setEquipmentDeductible1(double equipmentDeductible1) {
		this.equipmentDeductible1 = equipmentDeductible1;
	}

	public double getOffPremisesLimit1() {
		return offPremisesLimit1;
	}

	public void setOffPremisesLimit1(double offPremisesLimit1) {
		this.offPremisesLimit1 = offPremisesLimit1;
	}

	public double getOffPremisesDeductible1() {
		return offPremisesDeductible1;
	}

	public void setOffPremisesDeductible1(double offPremisesDeductible1) {
		this.offPremisesDeductible1 = offPremisesDeductible1;
	}

	public double getTransitLimit1() {
		return transitLimit1;
	}

	public void setTransitLimit1(double transitLimit1) {
		this.transitLimit1 = transitLimit1;
	}

	public double getTransitDeductible1() {
		return transitDeductible1;
	}

	public void setTransitDeductible1(double transitDeductible1) {
		this.transitDeductible1 = transitDeductible1;
	}

	public double getMiscPropertyLimit1() {
		return miscPropertyLimit1;
	}

	public void setMiscPropertyLimit1(double miscPropertyLimit1) {
		this.miscPropertyLimit1 = miscPropertyLimit1;
	}

	public double getMiscPropertyDeductible1() {
		return miscPropertyDeductible1;
	}

	public void setMiscPropertyDeductible1(double miscPropertyDeductible1) {
		this.miscPropertyDeductible1 = miscPropertyDeductible1;
	}

	public double getContractorEquipmentLimit1() {
		return contractorEquipmentLimit1;
	}

	public void setContractorEquipmentLimit1(double contractorEquipmentLimit1) {
		this.contractorEquipmentLimit1 = contractorEquipmentLimit1;
	}

	public double getContractorEquipmentDeductible1() {
		return contractorEquipmentDeductible1;
	}

	public void setContractorEquipmentDeductible1(
			double contractorEquipmentDeductible1) {
		this.contractorEquipmentDeductible1 = contractorEquipmentDeductible1;
	}

	public double getInstallationFloaterLimit1() {
		return installationFloaterLimit1;
	}

	public void setInstallationFloaterLimit1(double installationFloaterLimit1) {
		this.installationFloaterLimit1 = installationFloaterLimit1;
	}

	public double getInstallationFloaterDeductible1() {
		return installationFloaterDeductible1;
	}

	public void setInstallationFloaterDeductible1(
			double installationFloaterDeductible1) {
		this.installationFloaterDeductible1 = installationFloaterDeductible1;
	}

	public double getToolFloaterLimit1() {
		return toolFloaterLimit1;
	}

	public void setToolFloaterLimit1(double toolFloaterLimit1) {
		this.toolFloaterLimit1 = toolFloaterLimit1;
	}

	public double getToolFloaterDeductible1() {
		return toolFloaterDeductible1;
	}

	public void setToolFloaterDeductible1(double toolFloaterDeductible1) {
		this.toolFloaterDeductible1 = toolFloaterDeductible1;
	}

	public double getSignFloaterLimit1() {
		return signFloaterLimit1;
	}

	public void setSignFloaterLimit1(double signFloaterLimit1) {
		this.signFloaterLimit1 = signFloaterLimit1;
	}

	public double getSignFloaterDeductible1() {
		return signFloaterDeductible1;
	}

	public void setSignFloaterDeductible1(double signFloaterDeductible1) {
		this.signFloaterDeductible1 = signFloaterDeductible1;
	}

	public String getTruckMan1() {
		return truckMan1;
	}

	public void setTruckMan1(String truckMan1) {
		this.truckMan1 = truckMan1;
	}

	

	public double getMotorTruckLimit1() {
		return motorTruckLimit1;
	}

	public void setMotorTruckLimit1(double motorTruckLimit1) {
		this.motorTruckLimit1 = motorTruckLimit1;
	}

	public double getMotorTruckDeductible1() {
		return motorTruckDeductible1;
	}

	public void setMotorTruckDeductible1(double motorTruckDeductible1) {
		this.motorTruckDeductible1 = motorTruckDeductible1;
	}

	public double getGlassLimit1() {
		return glassLimit1;
	}

	public void setGlassLimit1(double glassLimit1) {
		this.glassLimit1 = glassLimit1;
	}

	public double getGlassDeductible1() {
		return glassDeductible1;
	}

	public void setGlassDeductible1(double glassDeductible1) {
		this.glassDeductible1 = glassDeductible1;
	}

	public double getSewerBackupLimit1() {
		return sewerBackupLimit1;
	}

	public void setSewerBackupLimit1(double sewerBackupLimit1) {
		this.sewerBackupLimit1 = sewerBackupLimit1;
	}

	public double getSewerBackupDeductible1() {
		return sewerBackupDeductible1;
	}

	public void setSewerBackupDeductible1(double sewerBackupDeductible1) {
		this.sewerBackupDeductible1 = sewerBackupDeductible1;
	}

	public double getFloodLimit1() {
		return floodLimit1;
	}

	public void setFloodLimit1(double floodLimit1) {
		this.floodLimit1 = floodLimit1;
	}

	public double getFloodDeductible1() {
		return floodDeductible1;
	}

	public void setFloodDeductible1(double floodDeductible1) {
		this.floodDeductible1 = floodDeductible1;
	}

	public double getEarthquakeLimit1() {
		return earthquakeLimit1;
	}

	public void setEarthquakeLimit1(double earthquakeLimit1) {
		this.earthquakeLimit1 = earthquakeLimit1;
	}

	public double getEarthquakeDeductible1() {
		return earthquakeDeductible1;
	}

	public void setEarthquakeDeductible1(double earthquakeDeductible1) {
		this.earthquakeDeductible1 = earthquakeDeductible1;
	}

	public double getProfitLimit1() {
		return profitLimit1;
	}

	public void setProfitLimit1(double profitLimit1) {
		this.profitLimit1 = profitLimit1;
	}

	public double getProfitDeductible1() {
		return profitDeductible1;
	}

	public void setProfitDeductible1(double profitDeductible1) {
		this.profitDeductible1 = profitDeductible1;
	}

	
	public double getGrossEarningLimit1() {
		return grossEarningLimit1;
	}

	public void setGrossEarningLimit1(double grossEarningLimit1) {
		this.grossEarningLimit1 = grossEarningLimit1;
	}

	public double getGrossEarningDeductible1() {
		return grossEarningDeductible1;
	}

	public void setGrossEarningDeductible1(double grossEarningDeductible1) {
		this.grossEarningDeductible1 = grossEarningDeductible1;
	}

	public double getRentalIncomeLimit1() {
		return rentalIncomeLimit1;
	}

	public void setRentalIncomeLimit1(double rentalIncomeLimit1) {
		this.rentalIncomeLimit1 = rentalIncomeLimit1;
	}

	public double getRentalIncomeDeductible1() {
		return rentalIncomeDeductible1;
	}

	public void setRentalIncomeDeductible1(double rentalIncomeDeductible1) {
		this.rentalIncomeDeductible1 = rentalIncomeDeductible1;
	}

	public double getExtraExpenseLimit1() {
		return extraExpenseLimit1;
	}

	public void setExtraExpenseLimit1(double extraExpenseLimit1) {
		this.extraExpenseLimit1 = extraExpenseLimit1;
	}

	public double getExtraExpenseDeductible1() {
		return extraExpenseDeductible1;
	}

	public void setExtraExpenseDeductible1(double extraExpenseDeductible1) {
		this.extraExpenseDeductible1 = extraExpenseDeductible1;
	}

	public double getOffPremisesPowerLimit1() {
		return offPremisesPowerLimit1;
	}

	public void setOffPremisesPowerLimit1(double offPremisesPowerLimit1) {
		this.offPremisesPowerLimit1 = offPremisesPowerLimit1;
	}

	public double getOffPremisesPowerDeductible1() {
		return offPremisesPowerDeductible1;
	}

	public void setOffPremisesPowerDeductible1(
			double offPremisesPowerDeductible1) {
		this.offPremisesPowerDeductible1 = offPremisesPowerDeductible1;
	}

	public double getInsideOutsideLimit1() {
		return insideOutsideLimit1;
	}

	public void setInsideOutsideLimit1(double insideOutsideLimit1) {
		this.insideOutsideLimit1 = insideOutsideLimit1;
	}

	public double getInsideOutsideDeductible1() {
		return insideOutsideDeductible1;
	}

	public void setInsideOutsideDeductible1(double insideOutsideDeductible1) {
		this.insideOutsideDeductible1 = insideOutsideDeductible1;
	}

	public double getBfMoneyLimit1() {
		return bfMoneyLimit1;
	}

	public void setBfMoneyLimit1(double bfMoneyLimit1) {
		this.bfMoneyLimit1 = bfMoneyLimit1;
	}

	public double getBfMoneyDeductible1() {
		return bfMoneyDeductible1;
	}

	public void setBfMoneyDeductible1(double bfMoneyDeductible1) {
		this.bfMoneyDeductible1 = bfMoneyDeductible1;
	}

	public double getDeopistorForgeryLimit1() {
		return deopistorForgeryLimit1;
	}

	public void setDeopistorForgeryLimit1(double deopistorForgeryLimit1) {
		this.deopistorForgeryLimit1 = deopistorForgeryLimit1;
	}

	public double getDeopistorForgeryDeductible1() {
		return deopistorForgeryDeductible1;
	}

	public void setDeopistorForgeryDeductible1(
			double deopistorForgeryDeductible1) {
		this.deopistorForgeryDeductible1 = deopistorForgeryDeductible1;
	}

	public double getMoneyOrdersLimit1() {
		return moneyOrdersLimit1;
	}

	public void setMoneyOrdersLimit1(double moneyOrdersLimit1) {
		this.moneyOrdersLimit1 = moneyOrdersLimit1;
	}

	public double getMoneyOrdersDeductible1() {
		return moneyOrdersDeductible1;
	}

	public void setMoneyOrdersDeductible1(double moneyOrdersDeductible1) {
		this.moneyOrdersDeductible1 = moneyOrdersDeductible1;
	}

	public double getEmployDishonestyLimit1() {
		return employDishonestyLimit1;
	}

	public void setEmployDishonestyLimit1(double employDishonestyLimit1) {
		this.employDishonestyLimit1 = employDishonestyLimit1;
	}

	public double getEmployDishonestyDeductible1() {
		return employDishonestyDeductible1;
	}

	public void setEmployDishonestyDeductible1(
			double employDishonestyDeductible1) {
		this.employDishonestyDeductible1 = employDishonestyDeductible1;
	}

	public double getCglLimit1() {
		return cglLimit1;
	}

	public void setCglLimit1(double cglLimit1) {
		this.cglLimit1 = cglLimit1;
	}

	public double getCglDeductible1() {
		return cglDeductible1;
	}

	public void setCglDeductible1(double cglDeductible1) {
		this.cglDeductible1 = cglDeductible1;
	}

	public double getTenantsLegalLimit1() {
		return tenantsLegalLimit1;
	}

	public void setTenantsLegalLimit1(double tenantsLegalLimit1) {
		this.tenantsLegalLimit1 = tenantsLegalLimit1;
	}

	public double getTenantsLegalDeductible1() {
		return tenantsLegalDeductible1;
	}

	public void setTenantsLegalDeductible1(double tenantsLegalDeductible1) {
		this.tenantsLegalDeductible1 = tenantsLegalDeductible1;
	}

	public double getNonOwnedAutoLimit1() {
		return nonOwnedAutoLimit1;
	}

	public void setNonOwnedAutoLimit1(double nonOwnedAutoLimit1) {
		this.nonOwnedAutoLimit1 = nonOwnedAutoLimit1;
	}

	public double getNonOwnedAutoDeductible1() {
		return nonOwnedAutoDeductible1;
	}

	public void setNonOwnedAutoDeductible1(double nonOwnedAutoDeductible1) {
		this.nonOwnedAutoDeductible1 = nonOwnedAutoDeductible1;
	}

	public double getSef96Limit1() {
		return sef96Limit1;
	}

	public void setSef96Limit1(double sef96Limit1) {
		this.sef96Limit1 = sef96Limit1;
	}

	public double getSef96Deductible1() {
		return sef96Deductible1;
	}

	public void setSef96Deductible1(double sef96Deductible1) {
		this.sef96Deductible1 = sef96Deductible1;
	}

	public double getSef94Limit1() {
		return sef94Limit1;
	}

	public void setSef94Limit1(double sef94Limit1) {
		this.sef94Limit1 = sef94Limit1;
	}

	public double getSef94Deductible1() {
		return sef94Deductible1;
	}

	public void setSef94Deductible1(double sef94Deductible1) {
		this.sef94Deductible1 = sef94Deductible1;
	}

	public double getDoLimit1() {
		return doLimit1;
	}

	public void setDoLimit1(double doLimit1) {
		this.doLimit1 = doLimit1;
	}

	public double getDoDeductible1() {
		return doDeductible1;
	}

	public void setDoDeductible1(double doDeductible1) {
		this.doDeductible1 = doDeductible1;
	}

	public double getEoLimit1() {
		return eoLimit1;
	}

	public void setEoLimit1(double eoLimit1) {
		this.eoLimit1 = eoLimit1;
	}

	public double getEoDeductible1() {
		return eoDeductible1;
	}

	public void setEoDeductible1(double eoDeductible1) {
		this.eoDeductible1 = eoDeductible1;
	}

	public double getEmployerLimit1() {
		return employerLimit1;
	}

	public void setEmployerLimit1(double employerLimit1) {
		this.employerLimit1 = employerLimit1;
	}

	public double getEmployerDeductible1() {
		return employerDeductible1;
	}

	public void setEmployerDeductible1(double employerDeductible1) {
		this.employerDeductible1 = employerDeductible1;
	}

	public double getUmbrellaLimit1() {
		return umbrellaLimit1;
	}

	public void setUmbrellaLimit1(double umbrellaLimit1) {
		this.umbrellaLimit1 = umbrellaLimit1;
	}

	public double getUmbrellaDeductible1() {
		return umbrellaDeductible1;
	}

	public void setUmbrellaDeductible1(double umbrellaDeductible1) {
		this.umbrellaDeductible1 = umbrellaDeductible1;
	}

	public double getWrapUpLimit1() {
		return wrapUpLimit1;
	}

	public void setWrapUpLimit1(double wrapUpLimit1) {
		this.wrapUpLimit1 = wrapUpLimit1;
	}

	public double getWrapUpDeductible1() {
		return wrapUpDeductible1;
	}

	public void setWrapUpDeductible1(double wrapUpDeductible1) {
		this.wrapUpDeductible1 = wrapUpDeductible1;
	}

	public double getStdComprehensiveLimit1() {
		return stdComprehensiveLimit1;
	}

	public void setStdComprehensiveLimit1(double stdComprehensiveLimit1) {
		this.stdComprehensiveLimit1 = stdComprehensiveLimit1;
	}

	public double getStdComprehensiveDeductible1() {
		return stdComprehensiveDeductible1;
	}

	public void setStdComprehensiveDeductible1(
			double stdComprehensiveDeductible1) {
		this.stdComprehensiveDeductible1 = stdComprehensiveDeductible1;
	}

	public double getAirConditioningLimit1() {
		return airConditioningLimit1;
	}

	public void setAirConditioningLimit1(double airConditioningLimit1) {
		this.airConditioningLimit1 = airConditioningLimit1;
	}

	public double getAirConditioningDeductible1() {
		return airConditioningDeductible1;
	}

	public void setAirConditioningDeductible1(double airConditioningDeductible1) {
		this.airConditioningDeductible1 = airConditioningDeductible1;
	}

	public double getProductionMachineryLimit1() {
		return productionMachineryLimit1;
	}

	public void setProductionMachineryLimit1(double productionMachineryLimit1) {
		this.productionMachineryLimit1 = productionMachineryLimit1;
	}

	public double getProductionMachineryDeductible1() {
		return productionMachineryDeductible1;
	}

	public void setProductionMachineryDeductible1(
			double productionMachineryDeductible1) {
		this.productionMachineryDeductible1 = productionMachineryDeductible1;
	}

	public String getOthercoverage11() {
		return othercoverage11;
	}

	public void setOthercoverage11(String othercoverage11) {
		this.othercoverage11 = othercoverage11;
	}

	public String getOthercoverage21() {
		return othercoverage21;
	}

	public void setOthercoverage21(String othercoverage21) {
		this.othercoverage21 = othercoverage21;
	}

	public double getOtherCoverageLimit11() {
		return otherCoverageLimit11;
	}

	public void setOtherCoverageLimit11(double otherCoverageLimit11) {
		this.otherCoverageLimit11 = otherCoverageLimit11;
	}

	public double getOtherCoverageDeductible11() {
		return otherCoverageDeductible11;
	}

	public void setOtherCoverageDeductible11(double otherCoverageDeductible11) {
		this.otherCoverageDeductible11 = otherCoverageDeductible11;
	}

	public double getOtherCoverageLimit21() {
		return otherCoverageLimit21;
	}

	public void setOtherCoverageLimit21(double otherCoverageLimit21) {
		this.otherCoverageLimit21 = otherCoverageLimit21;
	}

	public double getOtherCoverageDeductible21() {
		return otherCoverageDeductible21;
	}

	public void setOtherCoverageDeductible21(double otherCoverageDeductible21) {
		this.otherCoverageDeductible21 = otherCoverageDeductible21;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public int getAge1() {
		return age1;
	}

	public void setAge1(int age1) {
		this.age1 = age1;
	}

	public double getTotalSqFootage1() {
		return totalSqFootage1;
	}

	public void setTotalSqFootage1(double totalSqFootage1) {
		this.totalSqFootage1 = totalSqFootage1;
	}

	public double getInsdSqFootage1() {
		return insdSqFootage1;
	}

	public void setInsdSqFootage1(double insdSqFootage1) {
		this.insdSqFootage1 = insdSqFootage1;
	}

	public int getNoOfStories1() {
		return noOfStories1;
	}

	public void setNoOfStories1(int noOfStories1) {
		this.noOfStories1 = noOfStories1;
	}

	public String getBasement1() {
		return basement1;
	}

	public void setBasement1(String basement1) {
		this.basement1 = basement1;
	}

	

	public String getRoofupdated1() {
		return roofupdated1;
	}

	public void setRoofupdated1(String roofupdated1) {
		this.roofupdated1 = roofupdated1;
	}

	public String getWithUs() {
		return withUs;
	}

	public void setWithUs(String withUs) {
		this.withUs = withUs;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAddressOfLocationOwnedyes1() {
		return addressOfLocationOwnedyes1;
	}

	public void setAddressOfLocationOwnedyes1(String addressOfLocationOwnedyes1) {
		this.addressOfLocationOwnedyes1 = addressOfLocationOwnedyes1;
	}

	public String getAddressOfLocationOwnedyes2() {
		return addressOfLocationOwnedyes2;
	}

	public void setAddressOfLocationOwnedyes2(String addressOfLocationOwnedyes2) {
		this.addressOfLocationOwnedyes2 = addressOfLocationOwnedyes2;
	}

	public String getAddressOfLocationOwnedyes3() {
		return addressOfLocationOwnedyes3;
	}

	public void setAddressOfLocationOwnedyes3(String addressOfLocationOwnedyes3) {
		this.addressOfLocationOwnedyes3 = addressOfLocationOwnedyes3;
	}

	public String getAddressOfLocationOwnedno1() {
		return addressOfLocationOwnedno1;
	}

	public void setAddressOfLocationOwnedno1(String addressOfLocationOwnedno1) {
		this.addressOfLocationOwnedno1 = addressOfLocationOwnedno1;
	}

	public String getAddressOfLocationOwnedno2() {
		return addressOfLocationOwnedno2;
	}

	public void setAddressOfLocationOwnedno2(String addressOfLocationOwnedno2) {
		this.addressOfLocationOwnedno2 = addressOfLocationOwnedno2;
	}

	public String getAddressOfLocationOwnedno3() {
		return addressOfLocationOwnedno3;
	}

	public void setAddressOfLocationOwnedno3(String addressOfLocationOwnedno3) {
		this.addressOfLocationOwnedno3 = addressOfLocationOwnedno3;
	}

	public String getOwnercb() {
		return ownercb;
	}

	public void setOwnercb(String ownercb) {
		this.ownercb = ownercb;
	}

	public String getGrossEarningCheckbox() {
		return grossEarningCheckbox;
	}

	public void setGrossEarningCheckbox(String grossEarningCheckbox) {
		this.grossEarningCheckbox = grossEarningCheckbox;
	}

	public String getOwnercb1() {
		return ownercb1;
	}

	public void setOwnercb1(String ownercb1) {
		this.ownercb1 = ownercb1;
	}

	public String getGrossEarningCheckbox1() {
		return grossEarningCheckbox1;
	}

	public void setGrossEarningCheckbox1(String grossEarningCheckbox1) {
		this.grossEarningCheckbox1 = grossEarningCheckbox1;
	}

	public String getWallsframe1() {
		return wallsframe1;
	}

	public void setWallsframe1(String wallsframe1) {
		this.wallsframe1 = wallsframe1;
	}

	public String getWallshcb1() {
		return wallshcb1;
	}

	public void setWallshcb1(String wallshcb1) {
		this.wallshcb1 = wallshcb1;
	}

	public String getWallssteel1() {
		return wallssteel1;
	}

	public void setWallssteel1(String wallssteel1) {
		this.wallssteel1 = wallssteel1;
	}

	public String getWallsbrick1() {
		return wallsbrick1;
	}

	public void setWallsbrick1(String wallsbrick1) {
		this.wallsbrick1 = wallsbrick1;
	}

	public String getRoofwood1() {
		return roofwood1;
	}

	public void setRoofwood1(String roofwood1) {
		this.roofwood1 = roofwood1;
	}

	public String getRoofsteel1() {
		return roofsteel1;
	}

	public void setRoofsteel1(String roofsteel1) {
		this.roofsteel1 = roofsteel1;
	}

	public String getRoofconcrete1() {
		return roofconcrete1;
	}

	public void setRoofconcrete1(String roofconcrete1) {
		this.roofconcrete1 = roofconcrete1;
	}

	public String getFloorsconcrete1() {
		return floorsconcrete1;
	}

	public void setFloorsconcrete1(String floorsconcrete1) {
		this.floorsconcrete1 = floorsconcrete1;
	}

	public String getFloorswood1() {
		return floorswood1;
	}

	public void setFloorswood1(String floorswood1) {
		this.floorswood1 = floorswood1;
	}

	public String getHeatinggas1() {
		return heatinggas1;
	}

	public void setHeatinggas1(String heatinggas1) {
		this.heatinggas1 = heatinggas1;
	}

	public String getHeatingoil1() {
		return heatingoil1;
	}

	public void setHeatingoil1(String heatingoil1) {
		this.heatingoil1 = heatingoil1;
	}

	public String getHeatingelectric1() {
		return heatingelectric1;
	}

	public void setHeatingelectric1(String heatingelectric1) {
		this.heatingelectric1 = heatingelectric1;
	}

	public String getHeatingother1() {
		return heatingother1;
	}

	public void setHeatingother1(String heatingother1) {
		this.heatingother1 = heatingother1;
	}

	public String getHeatingupdated1() {
		return heatingupdated1;
	}

	public void setHeatingupdated1(String heatingupdated1) {
		this.heatingupdated1 = heatingupdated1;
	}

	public String getElectricalbreakers1() {
		return electricalbreakers1;
	}

	public void setElectricalbreakers1(String electricalbreakers1) {
		this.electricalbreakers1 = electricalbreakers1;
	}

	public String getElectricalfuses1() {
		return electricalfuses1;
	}

	public void setElectricalfuses1(String electricalfuses1) {
		this.electricalfuses1 = electricalfuses1;
	}

	public String getElectricalamps1() {
		return electricalamps1;
	}

	public void setElectricalamps1(String electricalamps1) {
		this.electricalamps1 = electricalamps1;
	}

	public String getElectricalupdated1() {
		return electricalupdated1;
	}

	public void setElectricalupdated1(String electricalupdated1) {
		this.electricalupdated1 = electricalupdated1;
	}

	public String getPlumbingcopper1() {
		return plumbingcopper1;
	}

	public void setPlumbingcopper1(String plumbingcopper1) {
		this.plumbingcopper1 = plumbingcopper1;
	}

	public String getPlumbingpvc1() {
		return plumbingpvc1;
	}

	public void setPlumbingpvc1(String plumbingpvc1) {
		this.plumbingpvc1 = plumbingpvc1;
	}

	public String getPlumbingother1() {
		return plumbingother1;
	}

	public void setPlumbingother1(String plumbingother1) {
		this.plumbingother1 = plumbingother1;
	}

	public String getPlumbingupdated1() {
		return plumbingupdated1;
	}

	public void setPlumbingupdated1(String plumbingupdated1) {
		this.plumbingupdated1 = plumbingupdated1;
	}

	public String getFireProtection1() {
		return fireProtection1;
	}

	public void setFireProtection1(String fireProtection1) {
		this.fireProtection1 = fireProtection1;
	}

	public String getFireProtectiondistance1() {
		return fireProtectiondistance1;
	}

	public void setFireProtectiondistance1(String fireProtectiondistance1) {
		this.fireProtectiondistance1 = fireProtectiondistance1;
	}

	public String getSecurity1() {
		return security1;
	}

	public void setSecurity1(String security1) {
		this.security1 = security1;
	}

	public String getAdditionalcoverage1() {
		return additionalcoverage1;
	}

	public void setAdditionalcoverage1(String additionalcoverage1) {
		this.additionalcoverage1 = additionalcoverage1;
	}

	public double getBuildingLimit2() {
		return buildingLimit2;
	}

	public void setBuildingLimit2(double buildingLimit2) {
		this.buildingLimit2 = buildingLimit2;
	}

	public double getBuildingDeductible2() {
		return buildingDeductible2;
	}

	public void setBuildingDeductible2(double buildingDeductible2) {
		this.buildingDeductible2 = buildingDeductible2;
	}

	public double getContentsLimit2() {
		return contentsLimit2;
	}

	public void setContentsLimit2(double contentsLimit2) {
		this.contentsLimit2 = contentsLimit2;
	}

	public double getContentsDeductible2() {
		return contentsDeductible2;
	}

	public void setContentsDeductible2(double contentsDeductible2) {
		this.contentsDeductible2 = contentsDeductible2;
	}

	public double getStockLimit2() {
		return stockLimit2;
	}

	public void setStockLimit2(double stockLimit2) {
		this.stockLimit2 = stockLimit2;
	}

	public double getStockDeductible2() {
		return stockDeductible2;
	}

	public void setStockDeductible2(double stockDeductible2) {
		this.stockDeductible2 = stockDeductible2;
	}

	public double getOfficeContentLimit2() {
		return officeContentLimit2;
	}

	public void setOfficeContentLimit2(double officeContentLimit2) {
		this.officeContentLimit2 = officeContentLimit2;
	}

	public double getOfficeContentDeductible2() {
		return officeContentDeductible2;
	}

	public void setOfficeContentDeductible2(double officeContentDeductible2) {
		this.officeContentDeductible2 = officeContentDeductible2;
	}

	public double getEdpLimit2() {
		return edpLimit2;
	}

	public void setEdpLimit2(double edpLimit2) {
		this.edpLimit2 = edpLimit2;
	}

	public double getEdpDeductible2() {
		return edpDeductible2;
	}

	public void setEdpDeductible2(double edpDeductible2) {
		this.edpDeductible2 = edpDeductible2;
	}

	public double getEquipmentLimit2() {
		return equipmentLimit2;
	}

	public void setEquipmentLimit2(double equipmentLimit2) {
		this.equipmentLimit2 = equipmentLimit2;
	}

	public double getEquipmentDeductible2() {
		return equipmentDeductible2;
	}

	public void setEquipmentDeductible2(double equipmentDeductible2) {
		this.equipmentDeductible2 = equipmentDeductible2;
	}

	public double getOffPremisesLimit2() {
		return offPremisesLimit2;
	}

	public void setOffPremisesLimit2(double offPremisesLimit2) {
		this.offPremisesLimit2 = offPremisesLimit2;
	}

	public double getOffPremisesDeductible2() {
		return offPremisesDeductible2;
	}

	public void setOffPremisesDeductible2(double offPremisesDeductible2) {
		this.offPremisesDeductible2 = offPremisesDeductible2;
	}

	public double getTransitLimit2() {
		return transitLimit2;
	}

	public void setTransitLimit2(double transitLimit2) {
		this.transitLimit2 = transitLimit2;
	}

	public double getTransitDeductible2() {
		return transitDeductible2;
	}

	public void setTransitDeductible2(double transitDeductible2) {
		this.transitDeductible2 = transitDeductible2;
	}

	public double getMiscPropertyLimit2() {
		return miscPropertyLimit2;
	}

	public void setMiscPropertyLimit2(double miscPropertyLimit2) {
		this.miscPropertyLimit2 = miscPropertyLimit2;
	}

	public double getMiscPropertyDeductible2() {
		return miscPropertyDeductible2;
	}

	public void setMiscPropertyDeductible2(double miscPropertyDeductible2) {
		this.miscPropertyDeductible2 = miscPropertyDeductible2;
	}

	public double getContractorEquipmentLimit2() {
		return contractorEquipmentLimit2;
	}

	public void setContractorEquipmentLimit2(double contractorEquipmentLimit2) {
		this.contractorEquipmentLimit2 = contractorEquipmentLimit2;
	}

	public double getContractorEquipmentDeductible2() {
		return contractorEquipmentDeductible2;
	}

	public void setContractorEquipmentDeductible2(
			double contractorEquipmentDeductible2) {
		this.contractorEquipmentDeductible2 = contractorEquipmentDeductible2;
	}

	public double getInstallationFloaterLimit2() {
		return installationFloaterLimit2;
	}

	public void setInstallationFloaterLimit2(double installationFloaterLimit2) {
		this.installationFloaterLimit2 = installationFloaterLimit2;
	}

	public double getInstallationFloaterDeductible2() {
		return installationFloaterDeductible2;
	}

	public void setInstallationFloaterDeductible2(
			double installationFloaterDeductible2) {
		this.installationFloaterDeductible2 = installationFloaterDeductible2;
	}

	public double getToolFloaterLimit2() {
		return toolFloaterLimit2;
	}

	public void setToolFloaterLimit2(double toolFloaterLimit2) {
		this.toolFloaterLimit2 = toolFloaterLimit2;
	}

	public double getToolFloaterDeductible2() {
		return toolFloaterDeductible2;
	}

	public void setToolFloaterDeductible2(double toolFloaterDeductible2) {
		this.toolFloaterDeductible2 = toolFloaterDeductible2;
	}

	public double getSignFloaterLimit2() {
		return signFloaterLimit2;
	}

	public void setSignFloaterLimit2(double signFloaterLimit2) {
		this.signFloaterLimit2 = signFloaterLimit2;
	}

	public double getSignFloaterDeductible2() {
		return signFloaterDeductible2;
	}

	public void setSignFloaterDeductible2(double signFloaterDeductible2) {
		this.signFloaterDeductible2 = signFloaterDeductible2;
	}

	public String getTruckMan2() {
		return truckMan2;
	}

	public void setTruckMan2(String truckMan2) {
		this.truckMan2 = truckMan2;
	}

	public String getOwnercb2() {
		return ownercb2;
	}

	public void setOwnercb2(String ownercb2) {
		this.ownercb2 = ownercb2;
	}

	public double getMotorTruckLimit2() {
		return motorTruckLimit2;
	}

	public void setMotorTruckLimit2(double motorTruckLimit2) {
		this.motorTruckLimit2 = motorTruckLimit2;
	}

	public double getMotorTruckDeductible2() {
		return motorTruckDeductible2;
	}

	public void setMotorTruckDeductible2(double motorTruckDeductible2) {
		this.motorTruckDeductible2 = motorTruckDeductible2;
	}

	public double getGlassLimit2() {
		return glassLimit2;
	}

	public void setGlassLimit2(double glassLimit2) {
		this.glassLimit2 = glassLimit2;
	}

	public double getGlassDeductible2() {
		return glassDeductible2;
	}

	public void setGlassDeductible2(double glassDeductible2) {
		this.glassDeductible2 = glassDeductible2;
	}

	public double getSewerBackupLimit2() {
		return sewerBackupLimit2;
	}

	public void setSewerBackupLimit2(double sewerBackupLimit2) {
		this.sewerBackupLimit2 = sewerBackupLimit2;
	}

	public double getSewerBackupDeductible2() {
		return sewerBackupDeductible2;
	}

	public void setSewerBackupDeductible2(double sewerBackupDeductible2) {
		this.sewerBackupDeductible2 = sewerBackupDeductible2;
	}

	public double getFloodLimit2() {
		return floodLimit2;
	}

	public void setFloodLimit2(double floodLimit2) {
		this.floodLimit2 = floodLimit2;
	}

	public double getFloodDeductible2() {
		return floodDeductible2;
	}

	public void setFloodDeductible2(double floodDeductible2) {
		this.floodDeductible2 = floodDeductible2;
	}

	public double getEarthquakeLimit2() {
		return earthquakeLimit2;
	}

	public void setEarthquakeLimit2(double earthquakeLimit2) {
		this.earthquakeLimit2 = earthquakeLimit2;
	}

	public double getEarthquakeDeductible2() {
		return earthquakeDeductible2;
	}

	public void setEarthquakeDeductible2(double earthquakeDeductible2) {
		this.earthquakeDeductible2 = earthquakeDeductible2;
	}

	public double getProfitLimit2() {
		return profitLimit2;
	}

	public void setProfitLimit2(double profitLimit2) {
		this.profitLimit2 = profitLimit2;
	}

	public double getProfitDeductible2() {
		return profitDeductible2;
	}

	public void setProfitDeductible2(double profitDeductible2) {
		this.profitDeductible2 = profitDeductible2;
	}

	public String getGrossEarningCheckbox2() {
		return grossEarningCheckbox2;
	}

	public void setGrossEarningCheckbox2(String grossEarningCheckbox2) {
		this.grossEarningCheckbox2 = grossEarningCheckbox2;
	}

	public double getGrossEarningLimit2() {
		return grossEarningLimit2;
	}

	public void setGrossEarningLimit2(double grossEarningLimit2) {
		this.grossEarningLimit2 = grossEarningLimit2;
	}

	public double getGrossEarningDeductible2() {
		return grossEarningDeductible2;
	}

	public void setGrossEarningDeductible2(double grossEarningDeductible2) {
		this.grossEarningDeductible2 = grossEarningDeductible2;
	}

	public double getRentalIncomeLimit2() {
		return rentalIncomeLimit2;
	}

	public void setRentalIncomeLimit2(double rentalIncomeLimit2) {
		this.rentalIncomeLimit2 = rentalIncomeLimit2;
	}

	public double getRentalIncomeDeductible2() {
		return rentalIncomeDeductible2;
	}

	public void setRentalIncomeDeductible2(double rentalIncomeDeductible2) {
		this.rentalIncomeDeductible2 = rentalIncomeDeductible2;
	}

	public double getExtraExpenseLimit2() {
		return extraExpenseLimit2;
	}

	public void setExtraExpenseLimit2(double extraExpenseLimit2) {
		this.extraExpenseLimit2 = extraExpenseLimit2;
	}

	public double getExtraExpenseDeductible2() {
		return extraExpenseDeductible2;
	}

	public void setExtraExpenseDeductible2(double extraExpenseDeductible2) {
		this.extraExpenseDeductible2 = extraExpenseDeductible2;
	}

	public double getOffPremisesPowerLimit2() {
		return offPremisesPowerLimit2;
	}

	public void setOffPremisesPowerLimit2(double offPremisesPowerLimit2) {
		this.offPremisesPowerLimit2 = offPremisesPowerLimit2;
	}

	public double getOffPremisesPowerDeductible2() {
		return offPremisesPowerDeductible2;
	}

	public void setOffPremisesPowerDeductible2(double offPremisesPowerDeductible2) {
		this.offPremisesPowerDeductible2 = offPremisesPowerDeductible2;
	}

	public double getInsideOutsideLimit2() {
		return insideOutsideLimit2;
	}

	public void setInsideOutsideLimit2(double insideOutsideLimit2) {
		this.insideOutsideLimit2 = insideOutsideLimit2;
	}

	public double getInsideOutsideDeductible2() {
		return insideOutsideDeductible2;
	}

	public void setInsideOutsideDeductible2(double insideOutsideDeductible2) {
		this.insideOutsideDeductible2 = insideOutsideDeductible2;
	}

	public double getBfMoneyLimit2() {
		return bfMoneyLimit2;
	}

	public void setBfMoneyLimit2(double bfMoneyLimit2) {
		this.bfMoneyLimit2 = bfMoneyLimit2;
	}

	public double getBfMoneyDeductible2() {
		return bfMoneyDeductible2;
	}

	public void setBfMoneyDeductible2(double bfMoneyDeductible2) {
		this.bfMoneyDeductible2 = bfMoneyDeductible2;
	}

	public double getDeopistorForgeryLimit2() {
		return deopistorForgeryLimit2;
	}

	public void setDeopistorForgeryLimit2(double deopistorForgeryLimit2) {
		this.deopistorForgeryLimit2 = deopistorForgeryLimit2;
	}

	public double getDeopistorForgeryDeductible2() {
		return deopistorForgeryDeductible2;
	}

	public void setDeopistorForgeryDeductible2(double deopistorForgeryDeductible2) {
		this.deopistorForgeryDeductible2 = deopistorForgeryDeductible2;
	}

	public double getMoneyOrdersLimit2() {
		return moneyOrdersLimit2;
	}

	public void setMoneyOrdersLimit2(double moneyOrdersLimit2) {
		this.moneyOrdersLimit2 = moneyOrdersLimit2;
	}

	public double getMoneyOrdersDeductible2() {
		return moneyOrdersDeductible2;
	}

	public void setMoneyOrdersDeductible2(double moneyOrdersDeductible2) {
		this.moneyOrdersDeductible2 = moneyOrdersDeductible2;
	}

	public double getEmployDishonestyLimit2() {
		return employDishonestyLimit2;
	}

	public void setEmployDishonestyLimit2(double employDishonestyLimit2) {
		this.employDishonestyLimit2 = employDishonestyLimit2;
	}

	public double getEmployDishonestyDeductible2() {
		return employDishonestyDeductible2;
	}

	public void setEmployDishonestyDeductible2(double employDishonestyDeductible2) {
		this.employDishonestyDeductible2 = employDishonestyDeductible2;
	}

	public double getCglLimit2() {
		return cglLimit2;
	}

	public void setCglLimit2(double cglLimit2) {
		this.cglLimit2 = cglLimit2;
	}

	public double getCglDeductible2() {
		return cglDeductible2;
	}

	public void setCglDeductible2(double cglDeductible2) {
		this.cglDeductible2 = cglDeductible2;
	}

	public double getTenantsLegalLimit2() {
		return tenantsLegalLimit2;
	}

	public void setTenantsLegalLimit2(double tenantsLegalLimit2) {
		this.tenantsLegalLimit2 = tenantsLegalLimit2;
	}

	public double getTenantsLegalDeductible2() {
		return tenantsLegalDeductible2;
	}

	public void setTenantsLegalDeductible2(double tenantsLegalDeductible2) {
		this.tenantsLegalDeductible2 = tenantsLegalDeductible2;
	}

	public double getNonOwnedAutoLimit2() {
		return nonOwnedAutoLimit2;
	}

	public void setNonOwnedAutoLimit2(double nonOwnedAutoLimit2) {
		this.nonOwnedAutoLimit2 = nonOwnedAutoLimit2;
	}

	public double getNonOwnedAutoDeductible2() {
		return nonOwnedAutoDeductible2;
	}

	public void setNonOwnedAutoDeductible2(double nonOwnedAutoDeductible2) {
		this.nonOwnedAutoDeductible2 = nonOwnedAutoDeductible2;
	}

	public double getSef96Limit2() {
		return sef96Limit2;
	}

	public void setSef96Limit2(double sef96Limit2) {
		this.sef96Limit2 = sef96Limit2;
	}

	public double getSef96Deductible2() {
		return sef96Deductible2;
	}

	public void setSef96Deductible2(double sef96Deductible2) {
		this.sef96Deductible2 = sef96Deductible2;
	}

	public double getSef94Limit2() {
		return sef94Limit2;
	}

	public void setSef94Limit2(double sef94Limit2) {
		this.sef94Limit2 = sef94Limit2;
	}

	public double getSef94Deductible2() {
		return sef94Deductible2;
	}

	public void setSef94Deductible2(double sef94Deductible2) {
		this.sef94Deductible2 = sef94Deductible2;
	}

	public double getDoLimit2() {
		return doLimit2;
	}

	public void setDoLimit2(double doLimit2) {
		this.doLimit2 = doLimit2;
	}

	public double getDoDeductible2() {
		return doDeductible2;
	}

	public void setDoDeductible2(double doDeductible2) {
		this.doDeductible2 = doDeductible2;
	}

	public double getEoLimit2() {
		return eoLimit2;
	}

	public void setEoLimit2(double eoLimit2) {
		this.eoLimit2 = eoLimit2;
	}

	public double getEoDeductible2() {
		return eoDeductible2;
	}

	public void setEoDeductible2(double eoDeductible2) {
		this.eoDeductible2 = eoDeductible2;
	}

	public double getEmployerLimit2() {
		return employerLimit2;
	}

	public void setEmployerLimit2(double employerLimit2) {
		this.employerLimit2 = employerLimit2;
	}

	public double getEmployerDeductible2() {
		return employerDeductible2;
	}

	public void setEmployerDeductible2(double employerDeductible2) {
		this.employerDeductible2 = employerDeductible2;
	}

	public double getUmbrellaLimit2() {
		return umbrellaLimit2;
	}

	public void setUmbrellaLimit2(double umbrellaLimit2) {
		this.umbrellaLimit2 = umbrellaLimit2;
	}

	public double getUmbrellaDeductible2() {
		return umbrellaDeductible2;
	}

	public void setUmbrellaDeductible2(double umbrellaDeductible2) {
		this.umbrellaDeductible2 = umbrellaDeductible2;
	}

	public double getWrapUpLimit2() {
		return wrapUpLimit2;
	}

	public void setWrapUpLimit2(double wrapUpLimit2) {
		this.wrapUpLimit2 = wrapUpLimit2;
	}

	public double getWrapUpDeductible2() {
		return wrapUpDeductible2;
	}

	public void setWrapUpDeductible2(double wrapUpDeductible2) {
		this.wrapUpDeductible2 = wrapUpDeductible2;
	}

	public double getStdComprehensiveLimit2() {
		return stdComprehensiveLimit2;
	}

	public void setStdComprehensiveLimit2(double stdComprehensiveLimit2) {
		this.stdComprehensiveLimit2 = stdComprehensiveLimit2;
	}

	public double getStdComprehensiveDeductible2() {
		return stdComprehensiveDeductible2;
	}

	public void setStdComprehensiveDeductible2(double stdComprehensiveDeductible2) {
		this.stdComprehensiveDeductible2 = stdComprehensiveDeductible2;
	}

	public double getAirConditioningLimit2() {
		return airConditioningLimit2;
	}

	public void setAirConditioningLimit2(double airConditioningLimit2) {
		this.airConditioningLimit2 = airConditioningLimit2;
	}

	public double getAirConditioningDeductible2() {
		return airConditioningDeductible2;
	}

	public void setAirConditioningDeductible2(double airConditioningDeductible2) {
		this.airConditioningDeductible2 = airConditioningDeductible2;
	}

	public double getProductionMachineryLimit2() {
		return productionMachineryLimit2;
	}

	public void setProductionMachineryLimit2(double productionMachineryLimit2) {
		this.productionMachineryLimit2 = productionMachineryLimit2;
	}

	public double getProductionMachineryDeductible2() {
		return productionMachineryDeductible2;
	}

	public void setProductionMachineryDeductible2(
			double productionMachineryDeductible2) {
		this.productionMachineryDeductible2 = productionMachineryDeductible2;
	}

	public String getOthercoverage12() {
		return othercoverage12;
	}

	public void setOthercoverage12(String othercoverage12) {
		this.othercoverage12 = othercoverage12;
	}

	public String getOthercoverage22() {
		return othercoverage22;
	}

	public void setOthercoverage22(String othercoverage22) {
		this.othercoverage22 = othercoverage22;
	}

	public double getOtherCoverageLimit12() {
		return otherCoverageLimit12;
	}

	public void setOtherCoverageLimit12(double otherCoverageLimit12) {
		this.otherCoverageLimit12 = otherCoverageLimit12;
	}

	public double getOtherCoverageDeductible12() {
		return otherCoverageDeductible12;
	}

	public void setOtherCoverageDeductible12(double otherCoverageDeductible12) {
		this.otherCoverageDeductible12 = otherCoverageDeductible12;
	}

	public double getOtherCoverageLimit22() {
		return otherCoverageLimit22;
	}

	public void setOtherCoverageLimit22(double otherCoverageLimit22) {
		this.otherCoverageLimit22 = otherCoverageLimit22;
	}

	public double getOtherCoverageDeductible22() {
		return otherCoverageDeductible22;
	}

	public void setOtherCoverageDeductible22(double otherCoverageDeductible22) {
		this.otherCoverageDeductible22 = otherCoverageDeductible22;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public int getAge2() {
		return age2;
	}

	public void setAge2(int age2) {
		this.age2 = age2;
	}

	public double getTotalSqFootage2() {
		return totalSqFootage2;
	}

	public void setTotalSqFootage2(double totalSqFootage2) {
		this.totalSqFootage2 = totalSqFootage2;
	}

	public double getInsdSqFootage2() {
		return insdSqFootage2;
	}

	public void setInsdSqFootage2(double insdSqFootage2) {
		this.insdSqFootage2 = insdSqFootage2;
	}

	public int getNoOfStories2() {
		return noOfStories2;
	}

	public void setNoOfStories2(int noOfStories2) {
		this.noOfStories2 = noOfStories2;
	}

	public String getBasement2() {
		return basement2;
	}

	public void setBasement2(String basement2) {
		this.basement2 = basement2;
	}

	public String getWallsframe2() {
		return wallsframe2;
	}

	public void setWallsframe2(String wallsframe2) {
		this.wallsframe2 = wallsframe2;
	}

	public String getWallshcb2() {
		return wallshcb2;
	}

	public void setWallshcb2(String wallshcb2) {
		this.wallshcb2 = wallshcb2;
	}

	public String getWallssteel2() {
		return wallssteel2;
	}

	public void setWallssteel2(String wallssteel2) {
		this.wallssteel2 = wallssteel2;
	}

	public String getWallsbrick2() {
		return wallsbrick2;
	}

	public void setWallsbrick2(String wallsbrick2) {
		this.wallsbrick2 = wallsbrick2;
	}

	public String getRoofwood2() {
		return roofwood2;
	}

	public void setRoofwood2(String roofwood2) {
		this.roofwood2 = roofwood2;
	}

	public String getRoofsteel2() {
		return roofsteel2;
	}

	public void setRoofsteel2(String roofsteel2) {
		this.roofsteel2 = roofsteel2;
	}

	public String getRoofconcrete2() {
		return roofconcrete2;
	}

	public void setRoofconcrete2(String roofconcrete2) {
		this.roofconcrete2 = roofconcrete2;
	}

	public String getRoofupdated2() {
		return roofupdated2;
	}

	public void setRoofupdated2(String roofupdated2) {
		this.roofupdated2 = roofupdated2;
	}

	public String getFloorsconcrete2() {
		return floorsconcrete2;
	}

	public void setFloorsconcrete2(String floorsconcrete2) {
		this.floorsconcrete2 = floorsconcrete2;
	}

	public String getFloorswood2() {
		return floorswood2;
	}

	public void setFloorswood2(String floorswood2) {
		this.floorswood2 = floorswood2;
	}

	public String getHeatinggas2() {
		return heatinggas2;
	}

	public void setHeatinggas2(String heatinggas2) {
		this.heatinggas2 = heatinggas2;
	}

	public String getHeatingoil2() {
		return heatingoil2;
	}

	public void setHeatingoil2(String heatingoil2) {
		this.heatingoil2 = heatingoil2;
	}

	public String getHeatingelectric2() {
		return heatingelectric2;
	}

	public void setHeatingelectric2(String heatingelectric2) {
		this.heatingelectric2 = heatingelectric2;
	}

	public String getHeatingother2() {
		return heatingother2;
	}

	public void setHeatingother2(String heatingother2) {
		this.heatingother2 = heatingother2;
	}

	public String getHeatingupdated2() {
		return heatingupdated2;
	}

	public void setHeatingupdated2(String heatingupdated2) {
		this.heatingupdated2 = heatingupdated2;
	}

	public String getElectricalbreakers2() {
		return electricalbreakers2;
	}

	public void setElectricalbreakers2(String electricalbreakers2) {
		this.electricalbreakers2 = electricalbreakers2;
	}

	public String getElectricalfuses2() {
		return electricalfuses2;
	}

	public void setElectricalfuses2(String electricalfuses2) {
		this.electricalfuses2 = electricalfuses2;
	}

	public String getElectricalamps2() {
		return electricalamps2;
	}

	public void setElectricalamps2(String electricalamps2) {
		this.electricalamps2 = electricalamps2;
	}

	public String getElectricalupdated2() {
		return electricalupdated2;
	}

	public void setElectricalupdated2(String electricalupdated2) {
		this.electricalupdated2 = electricalupdated2;
	}

	public String getPlumbingcopper2() {
		return plumbingcopper2;
	}

	public void setPlumbingcopper2(String plumbingcopper2) {
		this.plumbingcopper2 = plumbingcopper2;
	}

	public String getPlumbingpvc2() {
		return plumbingpvc2;
	}

	public void setPlumbingpvc2(String plumbingpvc2) {
		this.plumbingpvc2 = plumbingpvc2;
	}

	public String getPlumbingother2() {
		return plumbingother2;
	}

	public void setPlumbingother2(String plumbingother2) {
		this.plumbingother2 = plumbingother2;
	}

	public String getPlumbingupdated2() {
		return plumbingupdated2;
	}

	public void setPlumbingupdated2(String plumbingupdated2) {
		this.plumbingupdated2 = plumbingupdated2;
	}

	public String getFireProtection2() {
		return fireProtection2;
	}

	public void setFireProtection2(String fireProtection2) {
		this.fireProtection2 = fireProtection2;
	}

	public String getFireProtectiondistance2() {
		return fireProtectiondistance2;
	}

	public void setFireProtectiondistance2(String fireProtectiondistance2) {
		this.fireProtectiondistance2 = fireProtectiondistance2;
	}

	public String getSecurity2() {
		return security2;
	}

	public void setSecurity2(String security2) {
		this.security2 = security2;
	}

	public String getAdditionalcoverage2() {
		return additionalcoverage2;
	}

	public void setAdditionalcoverage2(String additionalcoverage2) {
		this.additionalcoverage2 = additionalcoverage2;
	}

	public double getBuildingLimit3() {
		return buildingLimit3;
	}

	public void setBuildingLimit3(double buildingLimit3) {
		this.buildingLimit3 = buildingLimit3;
	}

	public double getBuildingDeductible3() {
		return buildingDeductible3;
	}

	public void setBuildingDeductible3(double buildingDeductible3) {
		this.buildingDeductible3 = buildingDeductible3;
	}

	public double getContentsLimit3() {
		return contentsLimit3;
	}

	public void setContentsLimit3(double contentsLimit3) {
		this.contentsLimit3 = contentsLimit3;
	}

	public double getContentsDeductible3() {
		return contentsDeductible3;
	}

	public void setContentsDeductible3(double contentsDeductible3) {
		this.contentsDeductible3 = contentsDeductible3;
	}

	public double getStockLimit3() {
		return stockLimit3;
	}

	public void setStockLimit3(double stockLimit3) {
		this.stockLimit3 = stockLimit3;
	}

	public double getStockDeductible3() {
		return stockDeductible3;
	}

	public void setStockDeductible3(double stockDeductible3) {
		this.stockDeductible3 = stockDeductible3;
	}

	public double getOfficeContentLimit3() {
		return officeContentLimit3;
	}

	public void setOfficeContentLimit3(double officeContentLimit3) {
		this.officeContentLimit3 = officeContentLimit3;
	}

	public double getOfficeContentDeductible3() {
		return officeContentDeductible3;
	}

	public void setOfficeContentDeductible3(double officeContentDeductible3) {
		this.officeContentDeductible3 = officeContentDeductible3;
	}

	public double getEdpLimit3() {
		return edpLimit3;
	}

	public void setEdpLimit3(double edpLimit3) {
		this.edpLimit3 = edpLimit3;
	}

	public double getEdpDeductible3() {
		return edpDeductible3;
	}

	public void setEdpDeductible3(double edpDeductible3) {
		this.edpDeductible3 = edpDeductible3;
	}

	public double getEquipmentLimit3() {
		return equipmentLimit3;
	}

	public void setEquipmentLimit3(double equipmentLimit3) {
		this.equipmentLimit3 = equipmentLimit3;
	}

	public double getEquipmentDeductible3() {
		return equipmentDeductible3;
	}

	public void setEquipmentDeductible3(double equipmentDeductible3) {
		this.equipmentDeductible3 = equipmentDeductible3;
	}

	public double getOffPremisesLimit3() {
		return offPremisesLimit3;
	}

	public void setOffPremisesLimit3(double offPremisesLimit3) {
		this.offPremisesLimit3 = offPremisesLimit3;
	}

	public double getOffPremisesDeductible3() {
		return offPremisesDeductible3;
	}

	public void setOffPremisesDeductible3(double offPremisesDeductible3) {
		this.offPremisesDeductible3 = offPremisesDeductible3;
	}

	public double getTransitLimit3() {
		return transitLimit3;
	}

	public void setTransitLimit3(double transitLimit3) {
		this.transitLimit3 = transitLimit3;
	}

	public double getTransitDeductible3() {
		return transitDeductible3;
	}

	public void setTransitDeductible3(double transitDeductible3) {
		this.transitDeductible3 = transitDeductible3;
	}

	public double getMiscPropertyLimit3() {
		return miscPropertyLimit3;
	}

	public void setMiscPropertyLimit3(double miscPropertyLimit3) {
		this.miscPropertyLimit3 = miscPropertyLimit3;
	}

	public double getMiscPropertyDeductible3() {
		return miscPropertyDeductible3;
	}

	public void setMiscPropertyDeductible3(double miscPropertyDeductible3) {
		this.miscPropertyDeductible3 = miscPropertyDeductible3;
	}

	public double getContractorEquipmentLimit3() {
		return contractorEquipmentLimit3;
	}

	public void setContractorEquipmentLimit3(double contractorEquipmentLimit3) {
		this.contractorEquipmentLimit3 = contractorEquipmentLimit3;
	}

	public double getContractorEquipmentDeductible3() {
		return contractorEquipmentDeductible3;
	}

	public void setContractorEquipmentDeductible3(
			double contractorEquipmentDeductible3) {
		this.contractorEquipmentDeductible3 = contractorEquipmentDeductible3;
	}

	public double getInstallationFloaterLimit3() {
		return installationFloaterLimit3;
	}

	public void setInstallationFloaterLimit3(double installationFloaterLimit3) {
		this.installationFloaterLimit3 = installationFloaterLimit3;
	}

	public double getInstallationFloaterDeductible3() {
		return installationFloaterDeductible3;
	}

	public void setInstallationFloaterDeductible3(
			double installationFloaterDeductible3) {
		this.installationFloaterDeductible3 = installationFloaterDeductible3;
	}

	public double getToolFloaterLimit3() {
		return toolFloaterLimit3;
	}

	public void setToolFloaterLimit3(double toolFloaterLimit3) {
		this.toolFloaterLimit3 = toolFloaterLimit3;
	}

	public double getToolFloaterDeductible3() {
		return toolFloaterDeductible3;
	}

	public void setToolFloaterDeductible3(double toolFloaterDeductible3) {
		this.toolFloaterDeductible3 = toolFloaterDeductible3;
	}

	public double getSignFloaterLimit3() {
		return signFloaterLimit3;
	}

	public void setSignFloaterLimit3(double signFloaterLimit3) {
		this.signFloaterLimit3 = signFloaterLimit3;
	}

	public double getSignFloaterDeductible3() {
		return signFloaterDeductible3;
	}

	public void setSignFloaterDeductible3(double signFloaterDeductible3) {
		this.signFloaterDeductible3 = signFloaterDeductible3;
	}

	public String getTruckMan3() {
		return truckMan3;
	}

	public void setTruckMan3(String truckMan3) {
		this.truckMan3 = truckMan3;
	}

	public String getOwnercb3() {
		return ownercb3;
	}

	public void setOwnercb3(String ownercb3) {
		this.ownercb3 = ownercb3;
	}

	public double getMotorTruckLimit3() {
		return motorTruckLimit3;
	}

	public void setMotorTruckLimit3(double motorTruckLimit3) {
		this.motorTruckLimit3 = motorTruckLimit3;
	}

	public double getMotorTruckDeductible3() {
		return motorTruckDeductible3;
	}

	public void setMotorTruckDeductible3(double motorTruckDeductible3) {
		this.motorTruckDeductible3 = motorTruckDeductible3;
	}

	public double getGlassLimit3() {
		return glassLimit3;
	}

	public void setGlassLimit3(double glassLimit3) {
		this.glassLimit3 = glassLimit3;
	}

	public double getGlassDeductible3() {
		return glassDeductible3;
	}

	public void setGlassDeductible3(double glassDeductible3) {
		this.glassDeductible3 = glassDeductible3;
	}

	public double getSewerBackupLimit3() {
		return sewerBackupLimit3;
	}

	public void setSewerBackupLimit3(double sewerBackupLimit3) {
		this.sewerBackupLimit3 = sewerBackupLimit3;
	}

	public double getSewerBackupDeductible3() {
		return sewerBackupDeductible3;
	}

	public void setSewerBackupDeductible3(double sewerBackupDeductible3) {
		this.sewerBackupDeductible3 = sewerBackupDeductible3;
	}

	public double getFloodLimit3() {
		return floodLimit3;
	}

	public void setFloodLimit3(double floodLimit3) {
		this.floodLimit3 = floodLimit3;
	}

	public double getFloodDeductible3() {
		return floodDeductible3;
	}

	public void setFloodDeductible3(double floodDeductible3) {
		this.floodDeductible3 = floodDeductible3;
	}

	public double getEarthquakeLimit3() {
		return earthquakeLimit3;
	}

	public void setEarthquakeLimit3(double earthquakeLimit3) {
		this.earthquakeLimit3 = earthquakeLimit3;
	}

	public double getEarthquakeDeductible3() {
		return earthquakeDeductible3;
	}

	public void setEarthquakeDeductible3(double earthquakeDeductible3) {
		this.earthquakeDeductible3 = earthquakeDeductible3;
	}

	public double getProfitLimit3() {
		return profitLimit3;
	}

	public void setProfitLimit3(double profitLimit3) {
		this.profitLimit3 = profitLimit3;
	}

	public double getProfitDeductible3() {
		return profitDeductible3;
	}

	public void setProfitDeductible3(double profitDeductible3) {
		this.profitDeductible3 = profitDeductible3;
	}

	public String getGrossEarningCheckbox3() {
		return grossEarningCheckbox3;
	}

	public void setGrossEarningCheckbox3(String grossEarningCheckbox3) {
		this.grossEarningCheckbox3 = grossEarningCheckbox3;
	}

	public double getGrossEarningLimit3() {
		return grossEarningLimit3;
	}

	public void setGrossEarningLimit3(double grossEarningLimit3) {
		this.grossEarningLimit3 = grossEarningLimit3;
	}

	public double getGrossEarningDeductible3() {
		return grossEarningDeductible3;
	}

	public void setGrossEarningDeductible3(double grossEarningDeductible3) {
		this.grossEarningDeductible3 = grossEarningDeductible3;
	}

	public double getRentalIncomeLimit3() {
		return rentalIncomeLimit3;
	}

	public void setRentalIncomeLimit3(double rentalIncomeLimit3) {
		this.rentalIncomeLimit3 = rentalIncomeLimit3;
	}

	public double getRentalIncomeDeductible3() {
		return rentalIncomeDeductible3;
	}

	public void setRentalIncomeDeductible3(double rentalIncomeDeductible3) {
		this.rentalIncomeDeductible3 = rentalIncomeDeductible3;
	}

	public double getExtraExpenseLimit3() {
		return extraExpenseLimit3;
	}

	public void setExtraExpenseLimit3(double extraExpenseLimit3) {
		this.extraExpenseLimit3 = extraExpenseLimit3;
	}

	public double getExtraExpenseDeductible3() {
		return extraExpenseDeductible3;
	}

	public void setExtraExpenseDeductible3(double extraExpenseDeductible3) {
		this.extraExpenseDeductible3 = extraExpenseDeductible3;
	}

	public double getOffPremisesPowerLimit3() {
		return offPremisesPowerLimit3;
	}

	public void setOffPremisesPowerLimit3(double offPremisesPowerLimit3) {
		this.offPremisesPowerLimit3 = offPremisesPowerLimit3;
	}

	public double getOffPremisesPowerDeductible3() {
		return offPremisesPowerDeductible3;
	}

	public void setOffPremisesPowerDeductible3(double offPremisesPowerDeductible3) {
		this.offPremisesPowerDeductible3 = offPremisesPowerDeductible3;
	}

	public double getInsideOutsideLimit3() {
		return insideOutsideLimit3;
	}

	public void setInsideOutsideLimit3(double insideOutsideLimit3) {
		this.insideOutsideLimit3 = insideOutsideLimit3;
	}

	public double getInsideOutsideDeductible3() {
		return insideOutsideDeductible3;
	}

	public void setInsideOutsideDeductible3(double insideOutsideDeductible3) {
		this.insideOutsideDeductible3 = insideOutsideDeductible3;
	}

	public double getBfMoneyLimit3() {
		return bfMoneyLimit3;
	}

	public void setBfMoneyLimit3(double bfMoneyLimit3) {
		this.bfMoneyLimit3 = bfMoneyLimit3;
	}

	public double getBfMoneyDeductible3() {
		return bfMoneyDeductible3;
	}

	public void setBfMoneyDeductible3(double bfMoneyDeductible3) {
		this.bfMoneyDeductible3 = bfMoneyDeductible3;
	}

	public double getDeopistorForgeryLimit3() {
		return deopistorForgeryLimit3;
	}

	public void setDeopistorForgeryLimit3(double deopistorForgeryLimit3) {
		this.deopistorForgeryLimit3 = deopistorForgeryLimit3;
	}

	public double getDeopistorForgeryDeductible3() {
		return deopistorForgeryDeductible3;
	}

	public void setDeopistorForgeryDeductible3(double deopistorForgeryDeductible3) {
		this.deopistorForgeryDeductible3 = deopistorForgeryDeductible3;
	}

	public double getMoneyOrdersLimit3() {
		return moneyOrdersLimit3;
	}

	public void setMoneyOrdersLimit3(double moneyOrdersLimit3) {
		this.moneyOrdersLimit3 = moneyOrdersLimit3;
	}

	public double getMoneyOrdersDeductible3() {
		return moneyOrdersDeductible3;
	}

	public void setMoneyOrdersDeductible3(double moneyOrdersDeductible3) {
		this.moneyOrdersDeductible3 = moneyOrdersDeductible3;
	}

	public double getEmployDishonestyLimit3() {
		return employDishonestyLimit3;
	}

	public void setEmployDishonestyLimit3(double employDishonestyLimit3) {
		this.employDishonestyLimit3 = employDishonestyLimit3;
	}

	public double getEmployDishonestyDeductible3() {
		return employDishonestyDeductible3;
	}

	public void setEmployDishonestyDeductible3(double employDishonestyDeductible3) {
		this.employDishonestyDeductible3 = employDishonestyDeductible3;
	}

	public double getCglLimit3() {
		return cglLimit3;
	}

	public void setCglLimit3(double cglLimit3) {
		this.cglLimit3 = cglLimit3;
	}

	public double getCglDeductible3() {
		return cglDeductible3;
	}

	public void setCglDeductible3(double cglDeductible3) {
		this.cglDeductible3 = cglDeductible3;
	}

	public double getTenantsLegalLimit3() {
		return tenantsLegalLimit3;
	}

	public void setTenantsLegalLimit3(double tenantsLegalLimit3) {
		this.tenantsLegalLimit3 = tenantsLegalLimit3;
	}

	public double getTenantsLegalDeductible3() {
		return tenantsLegalDeductible3;
	}

	public void setTenantsLegalDeductible3(double tenantsLegalDeductible3) {
		this.tenantsLegalDeductible3 = tenantsLegalDeductible3;
	}

	public double getNonOwnedAutoLimit3() {
		return nonOwnedAutoLimit3;
	}

	public void setNonOwnedAutoLimit3(double nonOwnedAutoLimit3) {
		this.nonOwnedAutoLimit3 = nonOwnedAutoLimit3;
	}

	public double getNonOwnedAutoDeductible3() {
		return nonOwnedAutoDeductible3;
	}

	public void setNonOwnedAutoDeductible3(double nonOwnedAutoDeductible3) {
		this.nonOwnedAutoDeductible3 = nonOwnedAutoDeductible3;
	}

	public double getSef96Limit3() {
		return sef96Limit3;
	}

	public void setSef96Limit3(double sef96Limit3) {
		this.sef96Limit3 = sef96Limit3;
	}

	public double getSef96Deductible3() {
		return sef96Deductible3;
	}

	public void setSef96Deductible3(double sef96Deductible3) {
		this.sef96Deductible3 = sef96Deductible3;
	}

	public double getSef94Limit3() {
		return sef94Limit3;
	}

	public void setSef94Limit3(double sef94Limit3) {
		this.sef94Limit3 = sef94Limit3;
	}

	public double getSef94Deductible3() {
		return sef94Deductible3;
	}

	public void setSef94Deductible3(double sef94Deductible3) {
		this.sef94Deductible3 = sef94Deductible3;
	}

	public double getDoLimit3() {
		return doLimit3;
	}

	public void setDoLimit3(double doLimit3) {
		this.doLimit3 = doLimit3;
	}

	public double getDoDeductible3() {
		return doDeductible3;
	}

	public void setDoDeductible3(double doDeductible3) {
		this.doDeductible3 = doDeductible3;
	}

	public double getEoLimit3() {
		return eoLimit3;
	}

	public void setEoLimit3(double eoLimit3) {
		this.eoLimit3 = eoLimit3;
	}

	public double getEoDeductible3() {
		return eoDeductible3;
	}

	public void setEoDeductible3(double eoDeductible3) {
		this.eoDeductible3 = eoDeductible3;
	}

	public double getEmployerLimit3() {
		return employerLimit3;
	}

	public void setEmployerLimit3(double employerLimit3) {
		this.employerLimit3 = employerLimit3;
	}

	public double getEmployerDeductible3() {
		return employerDeductible3;
	}

	public void setEmployerDeductible3(double employerDeductible3) {
		this.employerDeductible3 = employerDeductible3;
	}

	public double getUmbrellaLimit3() {
		return umbrellaLimit3;
	}

	public void setUmbrellaLimit3(double umbrellaLimit3) {
		this.umbrellaLimit3 = umbrellaLimit3;
	}

	public double getUmbrellaDeductible3() {
		return umbrellaDeductible3;
	}

	public void setUmbrellaDeductible3(double umbrellaDeductible3) {
		this.umbrellaDeductible3 = umbrellaDeductible3;
	}

	public double getWrapUpLimit3() {
		return wrapUpLimit3;
	}

	public void setWrapUpLimit3(double wrapUpLimit3) {
		this.wrapUpLimit3 = wrapUpLimit3;
	}

	public double getWrapUpDeductible3() {
		return wrapUpDeductible3;
	}

	public void setWrapUpDeductible3(double wrapUpDeductible3) {
		this.wrapUpDeductible3 = wrapUpDeductible3;
	}

	public double getStdComprehensiveLimit3() {
		return stdComprehensiveLimit3;
	}

	public void setStdComprehensiveLimit3(double stdComprehensiveLimit3) {
		this.stdComprehensiveLimit3 = stdComprehensiveLimit3;
	}

	public double getStdComprehensiveDeductible3() {
		return stdComprehensiveDeductible3;
	}

	public void setStdComprehensiveDeductible3(double stdComprehensiveDeductible3) {
		this.stdComprehensiveDeductible3 = stdComprehensiveDeductible3;
	}

	public double getAirConditioningLimit3() {
		return airConditioningLimit3;
	}

	public void setAirConditioningLimit3(double airConditioningLimit3) {
		this.airConditioningLimit3 = airConditioningLimit3;
	}

	public double getAirConditioningDeductible3() {
		return airConditioningDeductible3;
	}

	public void setAirConditioningDeductible3(double airConditioningDeductible3) {
		this.airConditioningDeductible3 = airConditioningDeductible3;
	}

	public double getProductionMachineryLimit3() {
		return productionMachineryLimit3;
	}

	public void setProductionMachineryLimit3(double productionMachineryLimit3) {
		this.productionMachineryLimit3 = productionMachineryLimit3;
	}

	public double getProductionMachineryDeductible3() {
		return productionMachineryDeductible3;
	}

	public void setProductionMachineryDeductible3(
			double productionMachineryDeductible3) {
		this.productionMachineryDeductible3 = productionMachineryDeductible3;
	}

	public String getOthercoverage13() {
		return othercoverage13;
	}

	public void setOthercoverage13(String othercoverage13) {
		this.othercoverage13 = othercoverage13;
	}

	public String getOthercoverage23() {
		return othercoverage23;
	}

	public void setOthercoverage23(String othercoverage23) {
		this.othercoverage23 = othercoverage23;
	}

	public double getOtherCoverageLimit13() {
		return otherCoverageLimit13;
	}

	public void setOtherCoverageLimit13(double otherCoverageLimit13) {
		this.otherCoverageLimit13 = otherCoverageLimit13;
	}

	public double getOtherCoverageDeductible13() {
		return otherCoverageDeductible13;
	}

	public void setOtherCoverageDeductible13(double otherCoverageDeductible13) {
		this.otherCoverageDeductible13 = otherCoverageDeductible13;
	}

	public double getOtherCoverageLimit23() {
		return otherCoverageLimit23;
	}

	public void setOtherCoverageLimit23(double otherCoverageLimit23) {
		this.otherCoverageLimit23 = otherCoverageLimit23;
	}

	public double getOtherCoverageDeductible23() {
		return otherCoverageDeductible23;
	}

	public void setOtherCoverageDeductible23(double otherCoverageDeductible23) {
		this.otherCoverageDeductible23 = otherCoverageDeductible23;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public int getAge3() {
		return age3;
	}

	public void setAge3(int age3) {
		this.age3 = age3;
	}

	public double getTotalSqFootage3() {
		return totalSqFootage3;
	}

	public void setTotalSqFootage3(double totalSqFootage3) {
		this.totalSqFootage3 = totalSqFootage3;
	}

	public double getInsdSqFootage3() {
		return insdSqFootage3;
	}

	public void setInsdSqFootage3(double insdSqFootage3) {
		this.insdSqFootage3 = insdSqFootage3;
	}

	public int getNoOfStories3() {
		return noOfStories3;
	}

	public void setNoOfStories3(int noOfStories3) {
		this.noOfStories3 = noOfStories3;
	}

	public String getBasement3() {
		return basement3;
	}

	public void setBasement3(String basement3) {
		this.basement3 = basement3;
	}

	public String getWallsframe3() {
		return wallsframe3;
	}

	public void setWallsframe3(String wallsframe3) {
		this.wallsframe3 = wallsframe3;
	}

	public String getWallshcb3() {
		return wallshcb3;
	}

	public void setWallshcb3(String wallshcb3) {
		this.wallshcb3 = wallshcb3;
	}

	public String getWallssteel3() {
		return wallssteel3;
	}

	public void setWallssteel3(String wallssteel3) {
		this.wallssteel3 = wallssteel3;
	}

	public String getWallsbrick3() {
		return wallsbrick3;
	}

	public void setWallsbrick3(String wallsbrick3) {
		this.wallsbrick3 = wallsbrick3;
	}

	public String getRoofwood3() {
		return roofwood3;
	}

	public void setRoofwood3(String roofwood3) {
		this.roofwood3 = roofwood3;
	}

	public String getRoofsteel3() {
		return roofsteel3;
	}

	public void setRoofsteel3(String roofsteel3) {
		this.roofsteel3 = roofsteel3;
	}

	public String getRoofconcrete3() {
		return roofconcrete3;
	}

	public void setRoofconcrete3(String roofconcrete3) {
		this.roofconcrete3 = roofconcrete3;
	}

	public String getRoofupdated3() {
		return roofupdated3;
	}

	public void setRoofupdated3(String roofupdated3) {
		this.roofupdated3 = roofupdated3;
	}

	public String getFloorsconcrete3() {
		return floorsconcrete3;
	}

	public void setFloorsconcrete3(String floorsconcrete3) {
		this.floorsconcrete3 = floorsconcrete3;
	}

	public String getFloorswood3() {
		return floorswood3;
	}

	public void setFloorswood3(String floorswood3) {
		this.floorswood3 = floorswood3;
	}

	public String getHeatinggas3() {
		return heatinggas3;
	}

	public void setHeatinggas3(String heatinggas3) {
		this.heatinggas3 = heatinggas3;
	}

	public String getHeatingoil3() {
		return heatingoil3;
	}

	public void setHeatingoil3(String heatingoil3) {
		this.heatingoil3 = heatingoil3;
	}

	public String getHeatingelectric3() {
		return heatingelectric3;
	}

	public void setHeatingelectric3(String heatingelectric3) {
		this.heatingelectric3 = heatingelectric3;
	}

	public String getHeatingother3() {
		return heatingother3;
	}

	public void setHeatingother3(String heatingother3) {
		this.heatingother3 = heatingother3;
	}

	public String getHeatingupdated3() {
		return heatingupdated3;
	}

	public void setHeatingupdated3(String heatingupdated3) {
		this.heatingupdated3 = heatingupdated3;
	}

	public String getElectricalbreakers3() {
		return electricalbreakers3;
	}

	public void setElectricalbreakers3(String electricalbreakers3) {
		this.electricalbreakers3 = electricalbreakers3;
	}

	public String getElectricalfuses3() {
		return electricalfuses3;
	}

	public void setElectricalfuses3(String electricalfuses3) {
		this.electricalfuses3 = electricalfuses3;
	}

	public String getElectricalamps3() {
		return electricalamps3;
	}

	public void setElectricalamps3(String electricalamps3) {
		this.electricalamps3 = electricalamps3;
	}

	public String getElectricalupdated3() {
		return electricalupdated3;
	}

	public void setElectricalupdated3(String electricalupdated3) {
		this.electricalupdated3 = electricalupdated3;
	}

	public String getPlumbingcopper3() {
		return plumbingcopper3;
	}

	public void setPlumbingcopper3(String plumbingcopper3) {
		this.plumbingcopper3 = plumbingcopper3;
	}

	public String getPlumbingpvc3() {
		return plumbingpvc3;
	}

	public void setPlumbingpvc3(String plumbingpvc3) {
		this.plumbingpvc3 = plumbingpvc3;
	}

	public String getPlumbingother3() {
		return plumbingother3;
	}

	public void setPlumbingother3(String plumbingother3) {
		this.plumbingother3 = plumbingother3;
	}

	public String getPlumbingupdated3() {
		return plumbingupdated3;
	}

	public void setPlumbingupdated3(String plumbingupdated3) {
		this.plumbingupdated3 = plumbingupdated3;
	}

	public String getFireProtection3() {
		return fireProtection3;
	}

	public void setFireProtection3(String fireProtection3) {
		this.fireProtection3 = fireProtection3;
	}

	public String getFireProtectiondistance3() {
		return fireProtectiondistance3;
	}

	public void setFireProtectiondistance3(String fireProtectiondistance3) {
		this.fireProtectiondistance3 = fireProtectiondistance3;
	}

	public String getSecurity3() {
		return security3;
	}

	public void setSecurity3(String security3) {
		this.security3 = security3;
	}

	public String getAdditionalcoverage3() {
		return additionalcoverage3;
	}

	public void setAdditionalcoverage3(String additionalcoverage3) {
		this.additionalcoverage3 = additionalcoverage3;
	}

	public double getBuildingLimit4() {
		return buildingLimit4;
	}

	public void setBuildingLimit4(double buildingLimit4) {
		this.buildingLimit4 = buildingLimit4;
	}

	public double getBuildingDeductible4() {
		return buildingDeductible4;
	}

	public void setBuildingDeductible4(double buildingDeductible4) {
		this.buildingDeductible4 = buildingDeductible4;
	}

	public double getContentsLimit4() {
		return contentsLimit4;
	}

	public void setContentsLimit4(double contentsLimit4) {
		this.contentsLimit4 = contentsLimit4;
	}

	public double getContentsDeductible4() {
		return contentsDeductible4;
	}

	public void setContentsDeductible4(double contentsDeductible4) {
		this.contentsDeductible4 = contentsDeductible4;
	}

	public double getStockLimit4() {
		return stockLimit4;
	}

	public void setStockLimit4(double stockLimit4) {
		this.stockLimit4 = stockLimit4;
	}

	public double getStockDeductible4() {
		return stockDeductible4;
	}

	public void setStockDeductible4(double stockDeductible4) {
		this.stockDeductible4 = stockDeductible4;
	}

	public double getOfficeContentLimit4() {
		return officeContentLimit4;
	}

	public void setOfficeContentLimit4(double officeContentLimit4) {
		this.officeContentLimit4 = officeContentLimit4;
	}

	public double getOfficeContentDeductible4() {
		return officeContentDeductible4;
	}

	public void setOfficeContentDeductible4(double officeContentDeductible4) {
		this.officeContentDeductible4 = officeContentDeductible4;
	}

	public double getEdpLimit4() {
		return edpLimit4;
	}

	public void setEdpLimit4(double edpLimit4) {
		this.edpLimit4 = edpLimit4;
	}

	public double getEdpDeductible4() {
		return edpDeductible4;
	}

	public void setEdpDeductible4(double edpDeductible4) {
		this.edpDeductible4 = edpDeductible4;
	}

	public double getEquipmentLimit4() {
		return equipmentLimit4;
	}

	public void setEquipmentLimit4(double equipmentLimit4) {
		this.equipmentLimit4 = equipmentLimit4;
	}

	public double getEquipmentDeductible4() {
		return equipmentDeductible4;
	}

	public void setEquipmentDeductible4(double equipmentDeductible4) {
		this.equipmentDeductible4 = equipmentDeductible4;
	}

	public double getOffPremisesLimit4() {
		return offPremisesLimit4;
	}

	public void setOffPremisesLimit4(double offPremisesLimit4) {
		this.offPremisesLimit4 = offPremisesLimit4;
	}

	public double getOffPremisesDeductible4() {
		return offPremisesDeductible4;
	}

	public void setOffPremisesDeductible4(double offPremisesDeductible4) {
		this.offPremisesDeductible4 = offPremisesDeductible4;
	}

	public double getTransitLimit4() {
		return transitLimit4;
	}

	public void setTransitLimit4(double transitLimit4) {
		this.transitLimit4 = transitLimit4;
	}

	public double getTransitDeductible4() {
		return transitDeductible4;
	}

	public void setTransitDeductible4(double transitDeductible4) {
		this.transitDeductible4 = transitDeductible4;
	}

	public double getMiscPropertyLimit4() {
		return miscPropertyLimit4;
	}

	public void setMiscPropertyLimit4(double miscPropertyLimit4) {
		this.miscPropertyLimit4 = miscPropertyLimit4;
	}

	public double getMiscPropertyDeductible4() {
		return miscPropertyDeductible4;
	}

	public void setMiscPropertyDeductible4(double miscPropertyDeductible4) {
		this.miscPropertyDeductible4 = miscPropertyDeductible4;
	}

	public double getContractorEquipmentLimit4() {
		return contractorEquipmentLimit4;
	}

	public void setContractorEquipmentLimit4(double contractorEquipmentLimit4) {
		this.contractorEquipmentLimit4 = contractorEquipmentLimit4;
	}

	public double getContractorEquipmentDeductible4() {
		return contractorEquipmentDeductible4;
	}

	public void setContractorEquipmentDeductible4(
			double contractorEquipmentDeductible4) {
		this.contractorEquipmentDeductible4 = contractorEquipmentDeductible4;
	}

	public double getInstallationFloaterLimit4() {
		return installationFloaterLimit4;
	}

	public void setInstallationFloaterLimit4(double installationFloaterLimit4) {
		this.installationFloaterLimit4 = installationFloaterLimit4;
	}

	public double getInstallationFloaterDeductible4() {
		return installationFloaterDeductible4;
	}

	public void setInstallationFloaterDeductible4(
			double installationFloaterDeductible4) {
		this.installationFloaterDeductible4 = installationFloaterDeductible4;
	}

	public double getToolFloaterLimit4() {
		return toolFloaterLimit4;
	}

	public void setToolFloaterLimit4(double toolFloaterLimit4) {
		this.toolFloaterLimit4 = toolFloaterLimit4;
	}

	public double getToolFloaterDeductible4() {
		return toolFloaterDeductible4;
	}

	public void setToolFloaterDeductible4(double toolFloaterDeductible4) {
		this.toolFloaterDeductible4 = toolFloaterDeductible4;
	}

	public double getSignFloaterLimit4() {
		return signFloaterLimit4;
	}

	public void setSignFloaterLimit4(double signFloaterLimit4) {
		this.signFloaterLimit4 = signFloaterLimit4;
	}

	public double getSignFloaterDeductible4() {
		return signFloaterDeductible4;
	}

	public void setSignFloaterDeductible4(double signFloaterDeductible4) {
		this.signFloaterDeductible4 = signFloaterDeductible4;
	}

	public String getTruckMan4() {
		return truckMan4;
	}

	public void setTruckMan4(String truckMan4) {
		this.truckMan4 = truckMan4;
	}

	public String getOwnercb4() {
		return ownercb4;
	}

	public void setOwnercb4(String ownercb4) {
		this.ownercb4 = ownercb4;
	}

	public double getMotorTruckLimit4() {
		return motorTruckLimit4;
	}

	public void setMotorTruckLimit4(double motorTruckLimit4) {
		this.motorTruckLimit4 = motorTruckLimit4;
	}

	public double getMotorTruckDeductible4() {
		return motorTruckDeductible4;
	}

	public void setMotorTruckDeductible4(double motorTruckDeductible4) {
		this.motorTruckDeductible4 = motorTruckDeductible4;
	}

	public double getGlassLimit4() {
		return glassLimit4;
	}

	public void setGlassLimit4(double glassLimit4) {
		this.glassLimit4 = glassLimit4;
	}

	public double getGlassDeductible4() {
		return glassDeductible4;
	}

	public void setGlassDeductible4(double glassDeductible4) {
		this.glassDeductible4 = glassDeductible4;
	}

	public double getSewerBackupLimit4() {
		return sewerBackupLimit4;
	}

	public void setSewerBackupLimit4(double sewerBackupLimit4) {
		this.sewerBackupLimit4 = sewerBackupLimit4;
	}

	public double getSewerBackupDeductible4() {
		return sewerBackupDeductible4;
	}

	public void setSewerBackupDeductible4(double sewerBackupDeductible4) {
		this.sewerBackupDeductible4 = sewerBackupDeductible4;
	}

	public double getFloodLimit4() {
		return floodLimit4;
	}

	public void setFloodLimit4(double floodLimit4) {
		this.floodLimit4 = floodLimit4;
	}

	public double getFloodDeductible4() {
		return floodDeductible4;
	}

	public void setFloodDeductible4(double floodDeductible4) {
		this.floodDeductible4 = floodDeductible4;
	}

	public double getEarthquakeLimit4() {
		return earthquakeLimit4;
	}

	public void setEarthquakeLimit4(double earthquakeLimit4) {
		this.earthquakeLimit4 = earthquakeLimit4;
	}

	public double getEarthquakeDeductible4() {
		return earthquakeDeductible4;
	}

	public void setEarthquakeDeductible4(double earthquakeDeductible4) {
		this.earthquakeDeductible4 = earthquakeDeductible4;
	}

	public double getProfitLimit4() {
		return profitLimit4;
	}

	public void setProfitLimit4(double profitLimit4) {
		this.profitLimit4 = profitLimit4;
	}

	public double getProfitDeductible4() {
		return profitDeductible4;
	}

	public void setProfitDeductible4(double profitDeductible4) {
		this.profitDeductible4 = profitDeductible4;
	}

	public String getGrossEarningCheckbox4() {
		return grossEarningCheckbox4;
	}

	public void setGrossEarningCheckbox4(String grossEarningCheckbox4) {
		this.grossEarningCheckbox4 = grossEarningCheckbox4;
	}

	public double getGrossEarningLimit4() {
		return grossEarningLimit4;
	}

	public void setGrossEarningLimit4(double grossEarningLimit4) {
		this.grossEarningLimit4 = grossEarningLimit4;
	}

	public double getGrossEarningDeductible4() {
		return grossEarningDeductible4;
	}

	public void setGrossEarningDeductible4(double grossEarningDeductible4) {
		this.grossEarningDeductible4 = grossEarningDeductible4;
	}

	public double getRentalIncomeLimit4() {
		return rentalIncomeLimit4;
	}

	public void setRentalIncomeLimit4(double rentalIncomeLimit4) {
		this.rentalIncomeLimit4 = rentalIncomeLimit4;
	}

	public double getRentalIncomeDeductible4() {
		return rentalIncomeDeductible4;
	}

	public void setRentalIncomeDeductible4(double rentalIncomeDeductible4) {
		this.rentalIncomeDeductible4 = rentalIncomeDeductible4;
	}

	public double getExtraExpenseLimit4() {
		return extraExpenseLimit4;
	}

	public void setExtraExpenseLimit4(double extraExpenseLimit4) {
		this.extraExpenseLimit4 = extraExpenseLimit4;
	}

	public double getExtraExpenseDeductible4() {
		return extraExpenseDeductible4;
	}

	public void setExtraExpenseDeductible4(double extraExpenseDeductible4) {
		this.extraExpenseDeductible4 = extraExpenseDeductible4;
	}

	public double getOffPremisesPowerLimit4() {
		return offPremisesPowerLimit4;
	}

	public void setOffPremisesPowerLimit4(double offPremisesPowerLimit4) {
		this.offPremisesPowerLimit4 = offPremisesPowerLimit4;
	}

	public double getOffPremisesPowerDeductible4() {
		return offPremisesPowerDeductible4;
	}

	public void setOffPremisesPowerDeductible4(double offPremisesPowerDeductible4) {
		this.offPremisesPowerDeductible4 = offPremisesPowerDeductible4;
	}

	public double getInsideOutsideLimit4() {
		return insideOutsideLimit4;
	}

	public void setInsideOutsideLimit4(double insideOutsideLimit4) {
		this.insideOutsideLimit4 = insideOutsideLimit4;
	}

	public double getInsideOutsideDeductible4() {
		return insideOutsideDeductible4;
	}

	public void setInsideOutsideDeductible4(double insideOutsideDeductible4) {
		this.insideOutsideDeductible4 = insideOutsideDeductible4;
	}

	public double getBfMoneyLimit4() {
		return bfMoneyLimit4;
	}

	public void setBfMoneyLimit4(double bfMoneyLimit4) {
		this.bfMoneyLimit4 = bfMoneyLimit4;
	}

	public double getBfMoneyDeductible4() {
		return bfMoneyDeductible4;
	}

	public void setBfMoneyDeductible4(double bfMoneyDeductible4) {
		this.bfMoneyDeductible4 = bfMoneyDeductible4;
	}

	public double getDeopistorForgeryLimit4() {
		return deopistorForgeryLimit4;
	}

	public void setDeopistorForgeryLimit4(double deopistorForgeryLimit4) {
		this.deopistorForgeryLimit4 = deopistorForgeryLimit4;
	}

	public double getDeopistorForgeryDeductible4() {
		return deopistorForgeryDeductible4;
	}

	public void setDeopistorForgeryDeductible4(double deopistorForgeryDeductible4) {
		this.deopistorForgeryDeductible4 = deopistorForgeryDeductible4;
	}

	public double getMoneyOrdersLimit4() {
		return moneyOrdersLimit4;
	}

	public void setMoneyOrdersLimit4(double moneyOrdersLimit4) {
		this.moneyOrdersLimit4 = moneyOrdersLimit4;
	}

	public double getMoneyOrdersDeductible4() {
		return moneyOrdersDeductible4;
	}

	public void setMoneyOrdersDeductible4(double moneyOrdersDeductible4) {
		this.moneyOrdersDeductible4 = moneyOrdersDeductible4;
	}

	public double getEmployDishonestyLimit4() {
		return employDishonestyLimit4;
	}

	public void setEmployDishonestyLimit4(double employDishonestyLimit4) {
		this.employDishonestyLimit4 = employDishonestyLimit4;
	}

	public double getEmployDishonestyDeductible4() {
		return employDishonestyDeductible4;
	}

	public void setEmployDishonestyDeductible4(double employDishonestyDeductible4) {
		this.employDishonestyDeductible4 = employDishonestyDeductible4;
	}

	public double getCglLimit4() {
		return cglLimit4;
	}

	public void setCglLimit4(double cglLimit4) {
		this.cglLimit4 = cglLimit4;
	}

	public double getCglDeductible4() {
		return cglDeductible4;
	}

	public void setCglDeductible4(double cglDeductible4) {
		this.cglDeductible4 = cglDeductible4;
	}

	public double getTenantsLegalLimit4() {
		return tenantsLegalLimit4;
	}

	public void setTenantsLegalLimit4(double tenantsLegalLimit4) {
		this.tenantsLegalLimit4 = tenantsLegalLimit4;
	}

	public double getTenantsLegalDeductible4() {
		return tenantsLegalDeductible4;
	}

	public void setTenantsLegalDeductible4(double tenantsLegalDeductible4) {
		this.tenantsLegalDeductible4 = tenantsLegalDeductible4;
	}

	public double getNonOwnedAutoLimit4() {
		return nonOwnedAutoLimit4;
	}

	public void setNonOwnedAutoLimit4(double nonOwnedAutoLimit4) {
		this.nonOwnedAutoLimit4 = nonOwnedAutoLimit4;
	}

	public double getNonOwnedAutoDeductible4() {
		return nonOwnedAutoDeductible4;
	}

	public void setNonOwnedAutoDeductible4(double nonOwnedAutoDeductible4) {
		this.nonOwnedAutoDeductible4 = nonOwnedAutoDeductible4;
	}

	public double getSef96Limit4() {
		return sef96Limit4;
	}

	public void setSef96Limit4(double sef96Limit4) {
		this.sef96Limit4 = sef96Limit4;
	}

	public double getSef96Deductible4() {
		return sef96Deductible4;
	}

	public void setSef96Deductible4(double sef96Deductible4) {
		this.sef96Deductible4 = sef96Deductible4;
	}

	public double getSef94Limit4() {
		return sef94Limit4;
	}

	public void setSef94Limit4(double sef94Limit4) {
		this.sef94Limit4 = sef94Limit4;
	}

	public double getSef94Deductible4() {
		return sef94Deductible4;
	}

	public void setSef94Deductible4(double sef94Deductible4) {
		this.sef94Deductible4 = sef94Deductible4;
	}

	public double getDoLimit4() {
		return doLimit4;
	}

	public void setDoLimit4(double doLimit4) {
		this.doLimit4 = doLimit4;
	}

	public double getDoDeductible4() {
		return doDeductible4;
	}

	public void setDoDeductible4(double doDeductible4) {
		this.doDeductible4 = doDeductible4;
	}

	public double getEoLimit4() {
		return eoLimit4;
	}

	public void setEoLimit4(double eoLimit4) {
		this.eoLimit4 = eoLimit4;
	}

	public double getEoDeductible4() {
		return eoDeductible4;
	}

	public void setEoDeductible4(double eoDeductible4) {
		this.eoDeductible4 = eoDeductible4;
	}

	public double getEmployerLimit4() {
		return employerLimit4;
	}

	public void setEmployerLimit4(double employerLimit4) {
		this.employerLimit4 = employerLimit4;
	}

	public double getEmployerDeductible4() {
		return employerDeductible4;
	}

	public void setEmployerDeductible4(double employerDeductible4) {
		this.employerDeductible4 = employerDeductible4;
	}

	public double getUmbrellaLimit4() {
		return umbrellaLimit4;
	}

	public void setUmbrellaLimit4(double umbrellaLimit4) {
		this.umbrellaLimit4 = umbrellaLimit4;
	}

	public double getUmbrellaDeductible4() {
		return umbrellaDeductible4;
	}

	public void setUmbrellaDeductible4(double umbrellaDeductible4) {
		this.umbrellaDeductible4 = umbrellaDeductible4;
	}

	public double getWrapUpLimit4() {
		return wrapUpLimit4;
	}

	public void setWrapUpLimit4(double wrapUpLimit4) {
		this.wrapUpLimit4 = wrapUpLimit4;
	}

	public double getWrapUpDeductible4() {
		return wrapUpDeductible4;
	}

	public void setWrapUpDeductible4(double wrapUpDeductible4) {
		this.wrapUpDeductible4 = wrapUpDeductible4;
	}

	public double getStdComprehensiveLimit4() {
		return stdComprehensiveLimit4;
	}

	public void setStdComprehensiveLimit4(double stdComprehensiveLimit4) {
		this.stdComprehensiveLimit4 = stdComprehensiveLimit4;
	}

	public double getStdComprehensiveDeductible4() {
		return stdComprehensiveDeductible4;
	}

	public void setStdComprehensiveDeductible4(double stdComprehensiveDeductible4) {
		this.stdComprehensiveDeductible4 = stdComprehensiveDeductible4;
	}

	public double getAirConditioningLimit4() {
		return airConditioningLimit4;
	}

	public void setAirConditioningLimit4(double airConditioningLimit4) {
		this.airConditioningLimit4 = airConditioningLimit4;
	}

	public double getAirConditioningDeductible4() {
		return airConditioningDeductible4;
	}

	public void setAirConditioningDeductible4(double airConditioningDeductible4) {
		this.airConditioningDeductible4 = airConditioningDeductible4;
	}

	public double getProductionMachineryLimit4() {
		return productionMachineryLimit4;
	}

	public void setProductionMachineryLimit4(double productionMachineryLimit4) {
		this.productionMachineryLimit4 = productionMachineryLimit4;
	}

	public double getProductionMachineryDeductible4() {
		return productionMachineryDeductible4;
	}

	public void setProductionMachineryDeductible4(
			double productionMachineryDeductible4) {
		this.productionMachineryDeductible4 = productionMachineryDeductible4;
	}

	public String getOthercoverage14() {
		return othercoverage14;
	}

	public void setOthercoverage14(String othercoverage14) {
		this.othercoverage14 = othercoverage14;
	}

	public String getOthercoverage24() {
		return othercoverage24;
	}

	public void setOthercoverage24(String othercoverage24) {
		this.othercoverage24 = othercoverage24;
	}

	public double getOtherCoverageLimit14() {
		return otherCoverageLimit14;
	}

	public void setOtherCoverageLimit14(double otherCoverageLimit14) {
		this.otherCoverageLimit14 = otherCoverageLimit14;
	}

	public double getOtherCoverageDeductible14() {
		return otherCoverageDeductible14;
	}

	public void setOtherCoverageDeductible14(double otherCoverageDeductible14) {
		this.otherCoverageDeductible14 = otherCoverageDeductible14;
	}

	public double getOtherCoverageLimit24() {
		return otherCoverageLimit24;
	}

	public void setOtherCoverageLimit24(double otherCoverageLimit24) {
		this.otherCoverageLimit24 = otherCoverageLimit24;
	}

	public double getOtherCoverageDeductible24() {
		return otherCoverageDeductible24;
	}

	public void setOtherCoverageDeductible24(double otherCoverageDeductible24) {
		this.otherCoverageDeductible24 = otherCoverageDeductible24;
	}

	public String getAddress4() {
		return address4;
	}

	public void setAddress4(String address4) {
		this.address4 = address4;
	}

	public int getAge4() {
		return age4;
	}

	public void setAge4(int age4) {
		this.age4 = age4;
	}

	public double getTotalSqFootage4() {
		return totalSqFootage4;
	}

	public void setTotalSqFootage4(double totalSqFootage4) {
		this.totalSqFootage4 = totalSqFootage4;
	}

	public double getInsdSqFootage4() {
		return insdSqFootage4;
	}

	public void setInsdSqFootage4(double insdSqFootage4) {
		this.insdSqFootage4 = insdSqFootage4;
	}

	public int getNoOfStories4() {
		return noOfStories4;
	}

	public void setNoOfStories4(int noOfStories4) {
		this.noOfStories4 = noOfStories4;
	}

	public String getBasement4() {
		return basement4;
	}

	public void setBasement4(String basement4) {
		this.basement4 = basement4;
	}

	public String getWallsframe4() {
		return wallsframe4;
	}

	public void setWallsframe4(String wallsframe4) {
		this.wallsframe4 = wallsframe4;
	}

	public String getWallshcb4() {
		return wallshcb4;
	}

	public void setWallshcb4(String wallshcb4) {
		this.wallshcb4 = wallshcb4;
	}

	public String getWallssteel4() {
		return wallssteel4;
	}

	public void setWallssteel4(String wallssteel4) {
		this.wallssteel4 = wallssteel4;
	}

	public String getWallsbrick4() {
		return wallsbrick4;
	}

	public void setWallsbrick4(String wallsbrick4) {
		this.wallsbrick4 = wallsbrick4;
	}

	public String getRoofwood4() {
		return roofwood4;
	}

	public void setRoofwood4(String roofwood4) {
		this.roofwood4 = roofwood4;
	}

	public String getRoofsteel4() {
		return roofsteel4;
	}

	public void setRoofsteel4(String roofsteel4) {
		this.roofsteel4 = roofsteel4;
	}

	public String getRoofconcrete4() {
		return roofconcrete4;
	}

	public void setRoofconcrete4(String roofconcrete4) {
		this.roofconcrete4 = roofconcrete4;
	}

	public String getRoofupdated4() {
		return roofupdated4;
	}

	public void setRoofupdated4(String roofupdated4) {
		this.roofupdated4 = roofupdated4;
	}

	public String getFloorsconcrete4() {
		return floorsconcrete4;
	}

	public void setFloorsconcrete4(String floorsconcrete4) {
		this.floorsconcrete4 = floorsconcrete4;
	}

	public String getFloorswood4() {
		return floorswood4;
	}

	public void setFloorswood4(String floorswood4) {
		this.floorswood4 = floorswood4;
	}

	public String getHeatinggas4() {
		return heatinggas4;
	}

	public void setHeatinggas4(String heatinggas4) {
		this.heatinggas4 = heatinggas4;
	}

	public String getHeatingoil4() {
		return heatingoil4;
	}

	public void setHeatingoil4(String heatingoil4) {
		this.heatingoil4 = heatingoil4;
	}

	public String getHeatingelectric4() {
		return heatingelectric4;
	}

	public void setHeatingelectric4(String heatingelectric4) {
		this.heatingelectric4 = heatingelectric4;
	}

	public String getHeatingother4() {
		return heatingother4;
	}

	public void setHeatingother4(String heatingother4) {
		this.heatingother4 = heatingother4;
	}

	public String getHeatingupdated4() {
		return heatingupdated4;
	}

	public void setHeatingupdated4(String heatingupdated4) {
		this.heatingupdated4 = heatingupdated4;
	}

	public String getElectricalbreakers4() {
		return electricalbreakers4;
	}

	public void setElectricalbreakers4(String electricalbreakers4) {
		this.electricalbreakers4 = electricalbreakers4;
	}

	public String getElectricalfuses4() {
		return electricalfuses4;
	}

	public void setElectricalfuses4(String electricalfuses4) {
		this.electricalfuses4 = electricalfuses4;
	}

	public String getElectricalamps4() {
		return electricalamps4;
	}

	public void setElectricalamps4(String electricalamps4) {
		this.electricalamps4 = electricalamps4;
	}

	public String getElectricalupdated4() {
		return electricalupdated4;
	}

	public void setElectricalupdated4(String electricalupdated4) {
		this.electricalupdated4 = electricalupdated4;
	}

	public String getPlumbingcopper4() {
		return plumbingcopper4;
	}

	public void setPlumbingcopper4(String plumbingcopper4) {
		this.plumbingcopper4 = plumbingcopper4;
	}

	public String getPlumbingpvc4() {
		return plumbingpvc4;
	}

	public void setPlumbingpvc4(String plumbingpvc4) {
		this.plumbingpvc4 = plumbingpvc4;
	}

	public String getPlumbingother4() {
		return plumbingother4;
	}

	public void setPlumbingother4(String plumbingother4) {
		this.plumbingother4 = plumbingother4;
	}

	public String getPlumbingupdated4() {
		return plumbingupdated4;
	}

	public void setPlumbingupdated4(String plumbingupdated4) {
		this.plumbingupdated4 = plumbingupdated4;
	}

	public String getFireProtection4() {
		return fireProtection4;
	}

	public void setFireProtection4(String fireProtection4) {
		this.fireProtection4 = fireProtection4;
	}

	public String getFireProtectiondistance4() {
		return fireProtectiondistance4;
	}

	public void setFireProtectiondistance4(String fireProtectiondistance4) {
		this.fireProtectiondistance4 = fireProtectiondistance4;
	}

	public String getSecurity4() {
		return security4;
	}

	public void setSecurity4(String security4) {
		this.security4 = security4;
	}

	public String getAdditionalcoverage4() {
		return additionalcoverage4;
	}

	public void setAdditionalcoverage4(String additionalcoverage4) {
		this.additionalcoverage4 = additionalcoverage4;
	}

	public double getBuildingLimit5() {
		return buildingLimit5;
	}

	public void setBuildingLimit5(double buildingLimit5) {
		this.buildingLimit5 = buildingLimit5;
	}

	public double getBuildingDeductible5() {
		return buildingDeductible5;
	}

	public void setBuildingDeductible5(double buildingDeductible5) {
		this.buildingDeductible5 = buildingDeductible5;
	}

	public double getContentsLimit5() {
		return contentsLimit5;
	}

	public void setContentsLimit5(double contentsLimit5) {
		this.contentsLimit5 = contentsLimit5;
	}

	public double getContentsDeductible5() {
		return contentsDeductible5;
	}

	public void setContentsDeductible5(double contentsDeductible5) {
		this.contentsDeductible5 = contentsDeductible5;
	}

	public double getStockLimit5() {
		return stockLimit5;
	}

	public void setStockLimit5(double stockLimit5) {
		this.stockLimit5 = stockLimit5;
	}

	public double getStockDeductible5() {
		return stockDeductible5;
	}

	public void setStockDeductible5(double stockDeductible5) {
		this.stockDeductible5 = stockDeductible5;
	}

	public double getOfficeContentLimit5() {
		return officeContentLimit5;
	}

	public void setOfficeContentLimit5(double officeContentLimit5) {
		this.officeContentLimit5 = officeContentLimit5;
	}

	public double getOfficeContentDeductible5() {
		return officeContentDeductible5;
	}

	public void setOfficeContentDeductible5(double officeContentDeductible5) {
		this.officeContentDeductible5 = officeContentDeductible5;
	}

	public double getEdpLimit5() {
		return edpLimit5;
	}

	public void setEdpLimit5(double edpLimit5) {
		this.edpLimit5 = edpLimit5;
	}

	public double getEdpDeductible5() {
		return edpDeductible5;
	}

	public void setEdpDeductible5(double edpDeductible5) {
		this.edpDeductible5 = edpDeductible5;
	}

	public double getEquipmentLimit5() {
		return equipmentLimit5;
	}

	public void setEquipmentLimit5(double equipmentLimit5) {
		this.equipmentLimit5 = equipmentLimit5;
	}

	public double getEquipmentDeductible5() {
		return equipmentDeductible5;
	}

	public void setEquipmentDeductible5(double equipmentDeductible5) {
		this.equipmentDeductible5 = equipmentDeductible5;
	}

	public double getOffPremisesLimit5() {
		return offPremisesLimit5;
	}

	public void setOffPremisesLimit5(double offPremisesLimit5) {
		this.offPremisesLimit5 = offPremisesLimit5;
	}

	public double getOffPremisesDeductible5() {
		return offPremisesDeductible5;
	}

	public void setOffPremisesDeductible5(double offPremisesDeductible5) {
		this.offPremisesDeductible5 = offPremisesDeductible5;
	}

	public double getTransitLimit5() {
		return transitLimit5;
	}

	public void setTransitLimit5(double transitLimit5) {
		this.transitLimit5 = transitLimit5;
	}

	public double getTransitDeductible5() {
		return transitDeductible5;
	}

	public void setTransitDeductible5(double transitDeductible5) {
		this.transitDeductible5 = transitDeductible5;
	}

	public double getMiscPropertyLimit5() {
		return miscPropertyLimit5;
	}

	public void setMiscPropertyLimit5(double miscPropertyLimit5) {
		this.miscPropertyLimit5 = miscPropertyLimit5;
	}

	public double getMiscPropertyDeductible5() {
		return miscPropertyDeductible5;
	}

	public void setMiscPropertyDeductible5(double miscPropertyDeductible5) {
		this.miscPropertyDeductible5 = miscPropertyDeductible5;
	}

	public double getContractorEquipmentLimit5() {
		return contractorEquipmentLimit5;
	}

	public void setContractorEquipmentLimit5(double contractorEquipmentLimit5) {
		this.contractorEquipmentLimit5 = contractorEquipmentLimit5;
	}

	public double getContractorEquipmentDeductible5() {
		return contractorEquipmentDeductible5;
	}

	public void setContractorEquipmentDeductible5(
			double contractorEquipmentDeductible5) {
		this.contractorEquipmentDeductible5 = contractorEquipmentDeductible5;
	}

	public double getInstallationFloaterLimit5() {
		return installationFloaterLimit5;
	}

	public void setInstallationFloaterLimit5(double installationFloaterLimit5) {
		this.installationFloaterLimit5 = installationFloaterLimit5;
	}

	public double getInstallationFloaterDeductible5() {
		return installationFloaterDeductible5;
	}

	public void setInstallationFloaterDeductible5(
			double installationFloaterDeductible5) {
		this.installationFloaterDeductible5 = installationFloaterDeductible5;
	}

	public double getToolFloaterLimit5() {
		return toolFloaterLimit5;
	}

	public void setToolFloaterLimit5(double toolFloaterLimit5) {
		this.toolFloaterLimit5 = toolFloaterLimit5;
	}

	public double getToolFloaterDeductible5() {
		return toolFloaterDeductible5;
	}

	public void setToolFloaterDeductible5(double toolFloaterDeductible5) {
		this.toolFloaterDeductible5 = toolFloaterDeductible5;
	}

	public double getSignFloaterLimit5() {
		return signFloaterLimit5;
	}

	public void setSignFloaterLimit5(double signFloaterLimit5) {
		this.signFloaterLimit5 = signFloaterLimit5;
	}

	public double getSignFloaterDeductible5() {
		return signFloaterDeductible5;
	}

	public void setSignFloaterDeductible5(double signFloaterDeductible5) {
		this.signFloaterDeductible5 = signFloaterDeductible5;
	}

	public String getTruckMan5() {
		return truckMan5;
	}

	public void setTruckMan5(String truckMan5) {
		this.truckMan5 = truckMan5;
	}

	public String getOwnercb5() {
		return ownercb5;
	}

	public void setOwnercb5(String ownercb5) {
		this.ownercb5 = ownercb5;
	}

	public double getMotorTruckLimit5() {
		return motorTruckLimit5;
	}

	public void setMotorTruckLimit5(double motorTruckLimit5) {
		this.motorTruckLimit5 = motorTruckLimit5;
	}

	public double getMotorTruckDeductible5() {
		return motorTruckDeductible5;
	}

	public void setMotorTruckDeductible5(double motorTruckDeductible5) {
		this.motorTruckDeductible5 = motorTruckDeductible5;
	}

	public double getGlassLimit5() {
		return glassLimit5;
	}

	public void setGlassLimit5(double glassLimit5) {
		this.glassLimit5 = glassLimit5;
	}

	public double getGlassDeductible5() {
		return glassDeductible5;
	}

	public void setGlassDeductible5(double glassDeductible5) {
		this.glassDeductible5 = glassDeductible5;
	}

	public double getSewerBackupLimit5() {
		return sewerBackupLimit5;
	}

	public void setSewerBackupLimit5(double sewerBackupLimit5) {
		this.sewerBackupLimit5 = sewerBackupLimit5;
	}

	public double getSewerBackupDeductible5() {
		return sewerBackupDeductible5;
	}

	public void setSewerBackupDeductible5(double sewerBackupDeductible5) {
		this.sewerBackupDeductible5 = sewerBackupDeductible5;
	}

	public double getFloodLimit5() {
		return floodLimit5;
	}

	public void setFloodLimit5(double floodLimit5) {
		this.floodLimit5 = floodLimit5;
	}

	public double getFloodDeductible5() {
		return floodDeductible5;
	}

	public void setFloodDeductible5(double floodDeductible5) {
		this.floodDeductible5 = floodDeductible5;
	}

	public double getEarthquakeLimit5() {
		return earthquakeLimit5;
	}

	public void setEarthquakeLimit5(double earthquakeLimit5) {
		this.earthquakeLimit5 = earthquakeLimit5;
	}

	public double getEarthquakeDeductible5() {
		return earthquakeDeductible5;
	}

	public void setEarthquakeDeductible5(double earthquakeDeductible5) {
		this.earthquakeDeductible5 = earthquakeDeductible5;
	}

	public double getProfitLimit5() {
		return profitLimit5;
	}

	public void setProfitLimit5(double profitLimit5) {
		this.profitLimit5 = profitLimit5;
	}

	public double getProfitDeductible5() {
		return profitDeductible5;
	}

	public void setProfitDeductible5(double profitDeductible5) {
		this.profitDeductible5 = profitDeductible5;
	}

	public String getGrossEarningCheckbox5() {
		return grossEarningCheckbox5;
	}

	public void setGrossEarningCheckbox5(String grossEarningCheckbox5) {
		this.grossEarningCheckbox5 = grossEarningCheckbox5;
	}

	public double getGrossEarningLimit5() {
		return grossEarningLimit5;
	}

	public void setGrossEarningLimit5(double grossEarningLimit5) {
		this.grossEarningLimit5 = grossEarningLimit5;
	}

	public double getGrossEarningDeductible5() {
		return grossEarningDeductible5;
	}

	public void setGrossEarningDeductible5(double grossEarningDeductible5) {
		this.grossEarningDeductible5 = grossEarningDeductible5;
	}

	public double getRentalIncomeLimit5() {
		return rentalIncomeLimit5;
	}

	public void setRentalIncomeLimit5(double rentalIncomeLimit5) {
		this.rentalIncomeLimit5 = rentalIncomeLimit5;
	}

	public double getRentalIncomeDeductible5() {
		return rentalIncomeDeductible5;
	}

	public void setRentalIncomeDeductible5(double rentalIncomeDeductible5) {
		this.rentalIncomeDeductible5 = rentalIncomeDeductible5;
	}

	public double getExtraExpenseLimit5() {
		return extraExpenseLimit5;
	}

	public void setExtraExpenseLimit5(double extraExpenseLimit5) {
		this.extraExpenseLimit5 = extraExpenseLimit5;
	}

	public double getExtraExpenseDeductible5() {
		return extraExpenseDeductible5;
	}

	public void setExtraExpenseDeductible5(double extraExpenseDeductible5) {
		this.extraExpenseDeductible5 = extraExpenseDeductible5;
	}

	public double getOffPremisesPowerLimit5() {
		return offPremisesPowerLimit5;
	}

	public void setOffPremisesPowerLimit5(double offPremisesPowerLimit5) {
		this.offPremisesPowerLimit5 = offPremisesPowerLimit5;
	}

	public double getOffPremisesPowerDeductible5() {
		return offPremisesPowerDeductible5;
	}

	public void setOffPremisesPowerDeductible5(double offPremisesPowerDeductible5) {
		this.offPremisesPowerDeductible5 = offPremisesPowerDeductible5;
	}

	public double getInsideOutsideLimit5() {
		return insideOutsideLimit5;
	}

	public void setInsideOutsideLimit5(double insideOutsideLimit5) {
		this.insideOutsideLimit5 = insideOutsideLimit5;
	}

	public double getInsideOutsideDeductible5() {
		return insideOutsideDeductible5;
	}

	public void setInsideOutsideDeductible5(double insideOutsideDeductible5) {
		this.insideOutsideDeductible5 = insideOutsideDeductible5;
	}

	public double getBfMoneyLimit5() {
		return bfMoneyLimit5;
	}

	public void setBfMoneyLimit5(double bfMoneyLimit5) {
		this.bfMoneyLimit5 = bfMoneyLimit5;
	}

	public double getBfMoneyDeductible5() {
		return bfMoneyDeductible5;
	}

	public void setBfMoneyDeductible5(double bfMoneyDeductible5) {
		this.bfMoneyDeductible5 = bfMoneyDeductible5;
	}

	public double getDeopistorForgeryLimit5() {
		return deopistorForgeryLimit5;
	}

	public void setDeopistorForgeryLimit5(double deopistorForgeryLimit5) {
		this.deopistorForgeryLimit5 = deopistorForgeryLimit5;
	}

	public double getDeopistorForgeryDeductible5() {
		return deopistorForgeryDeductible5;
	}

	public void setDeopistorForgeryDeductible5(double deopistorForgeryDeductible5) {
		this.deopistorForgeryDeductible5 = deopistorForgeryDeductible5;
	}

	public double getMoneyOrdersLimit5() {
		return moneyOrdersLimit5;
	}

	public void setMoneyOrdersLimit5(double moneyOrdersLimit5) {
		this.moneyOrdersLimit5 = moneyOrdersLimit5;
	}

	public double getMoneyOrdersDeductible5() {
		return moneyOrdersDeductible5;
	}

	public void setMoneyOrdersDeductible5(double moneyOrdersDeductible5) {
		this.moneyOrdersDeductible5 = moneyOrdersDeductible5;
	}

	public double getEmployDishonestyLimit5() {
		return employDishonestyLimit5;
	}

	public void setEmployDishonestyLimit5(double employDishonestyLimit5) {
		this.employDishonestyLimit5 = employDishonestyLimit5;
	}

	public double getEmployDishonestyDeductible5() {
		return employDishonestyDeductible5;
	}

	public void setEmployDishonestyDeductible5(double employDishonestyDeductible5) {
		this.employDishonestyDeductible5 = employDishonestyDeductible5;
	}

	public double getCglLimit5() {
		return cglLimit5;
	}

	public void setCglLimit5(double cglLimit5) {
		this.cglLimit5 = cglLimit5;
	}

	public double getCglDeductible5() {
		return cglDeductible5;
	}

	public void setCglDeductible5(double cglDeductible5) {
		this.cglDeductible5 = cglDeductible5;
	}

	public double getTenantsLegalLimit5() {
		return tenantsLegalLimit5;
	}

	public void setTenantsLegalLimit5(double tenantsLegalLimit5) {
		this.tenantsLegalLimit5 = tenantsLegalLimit5;
	}

	public double getTenantsLegalDeductible5() {
		return tenantsLegalDeductible5;
	}

	public void setTenantsLegalDeductible5(double tenantsLegalDeductible5) {
		this.tenantsLegalDeductible5 = tenantsLegalDeductible5;
	}

	public double getNonOwnedAutoLimit5() {
		return nonOwnedAutoLimit5;
	}

	public void setNonOwnedAutoLimit5(double nonOwnedAutoLimit5) {
		this.nonOwnedAutoLimit5 = nonOwnedAutoLimit5;
	}

	public double getNonOwnedAutoDeductible5() {
		return nonOwnedAutoDeductible5;
	}

	public void setNonOwnedAutoDeductible5(double nonOwnedAutoDeductible5) {
		this.nonOwnedAutoDeductible5 = nonOwnedAutoDeductible5;
	}

	public double getSef96Limit5() {
		return sef96Limit5;
	}

	public void setSef96Limit5(double sef96Limit5) {
		this.sef96Limit5 = sef96Limit5;
	}

	public double getSef96Deductible5() {
		return sef96Deductible5;
	}

	public void setSef96Deductible5(double sef96Deductible5) {
		this.sef96Deductible5 = sef96Deductible5;
	}

	public double getSef94Limit5() {
		return sef94Limit5;
	}

	public void setSef94Limit5(double sef94Limit5) {
		this.sef94Limit5 = sef94Limit5;
	}

	public double getSef94Deductible5() {
		return sef94Deductible5;
	}

	public void setSef94Deductible5(double sef94Deductible5) {
		this.sef94Deductible5 = sef94Deductible5;
	}

	public double getDoLimit5() {
		return doLimit5;
	}

	public void setDoLimit5(double doLimit5) {
		this.doLimit5 = doLimit5;
	}

	public double getDoDeductible5() {
		return doDeductible5;
	}

	public void setDoDeductible5(double doDeductible5) {
		this.doDeductible5 = doDeductible5;
	}

	public double getEoLimit5() {
		return eoLimit5;
	}

	public void setEoLimit5(double eoLimit5) {
		this.eoLimit5 = eoLimit5;
	}

	public double getEoDeductible5() {
		return eoDeductible5;
	}

	public void setEoDeductible5(double eoDeductible5) {
		this.eoDeductible5 = eoDeductible5;
	}

	public double getEmployerLimit5() {
		return employerLimit5;
	}

	public void setEmployerLimit5(double employerLimit5) {
		this.employerLimit5 = employerLimit5;
	}

	public double getEmployerDeductible5() {
		return employerDeductible5;
	}

	public void setEmployerDeductible5(double employerDeductible5) {
		this.employerDeductible5 = employerDeductible5;
	}

	public double getUmbrellaLimit5() {
		return umbrellaLimit5;
	}

	public void setUmbrellaLimit5(double umbrellaLimit5) {
		this.umbrellaLimit5 = umbrellaLimit5;
	}

	public double getUmbrellaDeductible5() {
		return umbrellaDeductible5;
	}

	public void setUmbrellaDeductible5(double umbrellaDeductible5) {
		this.umbrellaDeductible5 = umbrellaDeductible5;
	}

	public double getWrapUpLimit5() {
		return wrapUpLimit5;
	}

	public void setWrapUpLimit5(double wrapUpLimit5) {
		this.wrapUpLimit5 = wrapUpLimit5;
	}

	public double getWrapUpDeductible5() {
		return wrapUpDeductible5;
	}

	public void setWrapUpDeductible5(double wrapUpDeductible5) {
		this.wrapUpDeductible5 = wrapUpDeductible5;
	}

	public double getStdComprehensiveLimit5() {
		return stdComprehensiveLimit5;
	}

	public void setStdComprehensiveLimit5(double stdComprehensiveLimit5) {
		this.stdComprehensiveLimit5 = stdComprehensiveLimit5;
	}

	public double getStdComprehensiveDeductible5() {
		return stdComprehensiveDeductible5;
	}

	public void setStdComprehensiveDeductible5(double stdComprehensiveDeductible5) {
		this.stdComprehensiveDeductible5 = stdComprehensiveDeductible5;
	}

	public double getAirConditioningLimit5() {
		return airConditioningLimit5;
	}

	public void setAirConditioningLimit5(double airConditioningLimit5) {
		this.airConditioningLimit5 = airConditioningLimit5;
	}

	public double getAirConditioningDeductible5() {
		return airConditioningDeductible5;
	}

	public void setAirConditioningDeductible5(double airConditioningDeductible5) {
		this.airConditioningDeductible5 = airConditioningDeductible5;
	}

	public double getProductionMachineryLimit5() {
		return productionMachineryLimit5;
	}

	public void setProductionMachineryLimit5(double productionMachineryLimit5) {
		this.productionMachineryLimit5 = productionMachineryLimit5;
	}

	public double getProductionMachineryDeductible5() {
		return productionMachineryDeductible5;
	}

	public void setProductionMachineryDeductible5(
			double productionMachineryDeductible5) {
		this.productionMachineryDeductible5 = productionMachineryDeductible5;
	}

	public String getOthercoverage15() {
		return othercoverage15;
	}

	public void setOthercoverage15(String othercoverage15) {
		this.othercoverage15 = othercoverage15;
	}

	public String getOthercoverage25() {
		return othercoverage25;
	}

	public void setOthercoverage25(String othercoverage25) {
		this.othercoverage25 = othercoverage25;
	}

	public double getOtherCoverageLimit15() {
		return otherCoverageLimit15;
	}

	public void setOtherCoverageLimit15(double otherCoverageLimit15) {
		this.otherCoverageLimit15 = otherCoverageLimit15;
	}

	public double getOtherCoverageDeductible15() {
		return otherCoverageDeductible15;
	}

	public void setOtherCoverageDeductible15(double otherCoverageDeductible15) {
		this.otherCoverageDeductible15 = otherCoverageDeductible15;
	}

	public double getOtherCoverageLimit25() {
		return otherCoverageLimit25;
	}

	public void setOtherCoverageLimit25(double otherCoverageLimit25) {
		this.otherCoverageLimit25 = otherCoverageLimit25;
	}

	public double getOtherCoverageDeductible25() {
		return otherCoverageDeductible25;
	}

	public void setOtherCoverageDeductible25(double otherCoverageDeductible25) {
		this.otherCoverageDeductible25 = otherCoverageDeductible25;
	}

	public String getAddress5() {
		return address5;
	}

	public void setAddress5(String address5) {
		this.address5 = address5;
	}

	public int getAge5() {
		return age5;
	}

	public void setAge5(int age5) {
		this.age5 = age5;
	}

	public double getTotalSqFootage5() {
		return totalSqFootage5;
	}

	public void setTotalSqFootage5(double totalSqFootage5) {
		this.totalSqFootage5 = totalSqFootage5;
	}

	public double getInsdSqFootage5() {
		return insdSqFootage5;
	}

	public void setInsdSqFootage5(double insdSqFootage5) {
		this.insdSqFootage5 = insdSqFootage5;
	}

	public int getNoOfStories5() {
		return noOfStories5;
	}

	public void setNoOfStories5(int noOfStories5) {
		this.noOfStories5 = noOfStories5;
	}

	public String getBasement5() {
		return basement5;
	}

	public void setBasement5(String basement5) {
		this.basement5 = basement5;
	}

	public String getWallsframe5() {
		return wallsframe5;
	}

	public void setWallsframe5(String wallsframe5) {
		this.wallsframe5 = wallsframe5;
	}

	public String getWallshcb5() {
		return wallshcb5;
	}

	public void setWallshcb5(String wallshcb5) {
		this.wallshcb5 = wallshcb5;
	}

	public String getWallssteel5() {
		return wallssteel5;
	}

	public void setWallssteel5(String wallssteel5) {
		this.wallssteel5 = wallssteel5;
	}

	public String getWallsbrick5() {
		return wallsbrick5;
	}

	public void setWallsbrick5(String wallsbrick5) {
		this.wallsbrick5 = wallsbrick5;
	}

	public String getRoofwood5() {
		return roofwood5;
	}

	public void setRoofwood5(String roofwood5) {
		this.roofwood5 = roofwood5;
	}

	public String getRoofsteel5() {
		return roofsteel5;
	}

	public void setRoofsteel5(String roofsteel5) {
		this.roofsteel5 = roofsteel5;
	}

	public String getRoofconcrete5() {
		return roofconcrete5;
	}

	public void setRoofconcrete5(String roofconcrete5) {
		this.roofconcrete5 = roofconcrete5;
	}

	public String getRoofupdated5() {
		return roofupdated5;
	}

	public void setRoofupdated5(String roofupdated5) {
		this.roofupdated5 = roofupdated5;
	}

	public String getFloorsconcrete5() {
		return floorsconcrete5;
	}

	public void setFloorsconcrete5(String floorsconcrete5) {
		this.floorsconcrete5 = floorsconcrete5;
	}

	public String getFloorswood5() {
		return floorswood5;
	}

	public void setFloorswood5(String floorswood5) {
		this.floorswood5 = floorswood5;
	}

	public String getHeatinggas5() {
		return heatinggas5;
	}

	public void setHeatinggas5(String heatinggas5) {
		this.heatinggas5 = heatinggas5;
	}

	public String getHeatingoil5() {
		return heatingoil5;
	}

	public void setHeatingoil5(String heatingoil5) {
		this.heatingoil5 = heatingoil5;
	}

	public String getHeatingelectric5() {
		return heatingelectric5;
	}

	public void setHeatingelectric5(String heatingelectric5) {
		this.heatingelectric5 = heatingelectric5;
	}

	public String getHeatingother5() {
		return heatingother5;
	}

	public void setHeatingother5(String heatingother5) {
		this.heatingother5 = heatingother5;
	}

	public String getHeatingupdated5() {
		return heatingupdated5;
	}

	public void setHeatingupdated5(String heatingupdated5) {
		this.heatingupdated5 = heatingupdated5;
	}

	public String getElectricalbreakers5() {
		return electricalbreakers5;
	}

	public void setElectricalbreakers5(String electricalbreakers5) {
		this.electricalbreakers5 = electricalbreakers5;
	}

	public String getElectricalfuses5() {
		return electricalfuses5;
	}

	public void setElectricalfuses5(String electricalfuses5) {
		this.electricalfuses5 = electricalfuses5;
	}

	public String getElectricalamps5() {
		return electricalamps5;
	}

	public void setElectricalamps5(String electricalamps5) {
		this.electricalamps5 = electricalamps5;
	}

	public String getElectricalupdated5() {
		return electricalupdated5;
	}

	public void setElectricalupdated5(String electricalupdated5) {
		this.electricalupdated5 = electricalupdated5;
	}

	public String getPlumbingcopper5() {
		return plumbingcopper5;
	}

	public void setPlumbingcopper5(String plumbingcopper5) {
		this.plumbingcopper5 = plumbingcopper5;
	}

	public String getPlumbingpvc5() {
		return plumbingpvc5;
	}

	public void setPlumbingpvc5(String plumbingpvc5) {
		this.plumbingpvc5 = plumbingpvc5;
	}

	public String getPlumbingother5() {
		return plumbingother5;
	}

	public void setPlumbingother5(String plumbingother5) {
		this.plumbingother5 = plumbingother5;
	}

	public String getPlumbingupdated5() {
		return plumbingupdated5;
	}

	public void setPlumbingupdated5(String plumbingupdated5) {
		this.plumbingupdated5 = plumbingupdated5;
	}

	public String getFireProtection5() {
		return fireProtection5;
	}

	public void setFireProtection5(String fireProtection5) {
		this.fireProtection5 = fireProtection5;
	}

	public String getFireProtectiondistance5() {
		return fireProtectiondistance5;
	}

	public void setFireProtectiondistance5(String fireProtectiondistance5) {
		this.fireProtectiondistance5 = fireProtectiondistance5;
	}

	public String getSecurity5() {
		return security5;
	}

	public void setSecurity5(String security5) {
		this.security5 = security5;
	}

	public String getAdditionalcoverage5() {
		return additionalcoverage5;
	}

	public void setAdditionalcoverage5(String additionalcoverage5) {
		this.additionalcoverage5 = additionalcoverage5;
	}

	public double getBuildingLimit6() {
		return buildingLimit6;
	}

	public void setBuildingLimit6(double buildingLimit6) {
		this.buildingLimit6 = buildingLimit6;
	}

	public double getBuildingDeductible6() {
		return buildingDeductible6;
	}

	public void setBuildingDeductible6(double buildingDeductible6) {
		this.buildingDeductible6 = buildingDeductible6;
	}

	public double getContentsLimit6() {
		return contentsLimit6;
	}

	public void setContentsLimit6(double contentsLimit6) {
		this.contentsLimit6 = contentsLimit6;
	}

	public double getContentsDeductible6() {
		return contentsDeductible6;
	}

	public void setContentsDeductible6(double contentsDeductible6) {
		this.contentsDeductible6 = contentsDeductible6;
	}

	public double getStockLimit6() {
		return stockLimit6;
	}

	public void setStockLimit6(double stockLimit6) {
		this.stockLimit6 = stockLimit6;
	}

	public double getStockDeductible6() {
		return stockDeductible6;
	}

	public void setStockDeductible6(double stockDeductible6) {
		this.stockDeductible6 = stockDeductible6;
	}

	public double getOfficeContentLimit6() {
		return officeContentLimit6;
	}

	public void setOfficeContentLimit6(double officeContentLimit6) {
		this.officeContentLimit6 = officeContentLimit6;
	}

	public double getOfficeContentDeductible6() {
		return officeContentDeductible6;
	}

	public void setOfficeContentDeductible6(double officeContentDeductible6) {
		this.officeContentDeductible6 = officeContentDeductible6;
	}

	public double getEdpLimit6() {
		return edpLimit6;
	}

	public void setEdpLimit6(double edpLimit6) {
		this.edpLimit6 = edpLimit6;
	}

	public double getEdpDeductible6() {
		return edpDeductible6;
	}

	public void setEdpDeductible6(double edpDeductible6) {
		this.edpDeductible6 = edpDeductible6;
	}

	public double getEquipmentLimit6() {
		return equipmentLimit6;
	}

	public void setEquipmentLimit6(double equipmentLimit6) {
		this.equipmentLimit6 = equipmentLimit6;
	}

	public double getEquipmentDeductible6() {
		return equipmentDeductible6;
	}

	public void setEquipmentDeductible6(double equipmentDeductible6) {
		this.equipmentDeductible6 = equipmentDeductible6;
	}

	public double getOffPremisesLimit6() {
		return offPremisesLimit6;
	}

	public void setOffPremisesLimit6(double offPremisesLimit6) {
		this.offPremisesLimit6 = offPremisesLimit6;
	}

	public double getOffPremisesDeductible6() {
		return offPremisesDeductible6;
	}

	public void setOffPremisesDeductible6(double offPremisesDeductible6) {
		this.offPremisesDeductible6 = offPremisesDeductible6;
	}

	public double getTransitLimit6() {
		return transitLimit6;
	}

	public void setTransitLimit6(double transitLimit6) {
		this.transitLimit6 = transitLimit6;
	}

	public double getTransitDeductible6() {
		return transitDeductible6;
	}

	public void setTransitDeductible6(double transitDeductible6) {
		this.transitDeductible6 = transitDeductible6;
	}

	public double getMiscPropertyLimit6() {
		return miscPropertyLimit6;
	}

	public void setMiscPropertyLimit6(double miscPropertyLimit6) {
		this.miscPropertyLimit6 = miscPropertyLimit6;
	}

	public double getMiscPropertyDeductible6() {
		return miscPropertyDeductible6;
	}

	public void setMiscPropertyDeductible6(double miscPropertyDeductible6) {
		this.miscPropertyDeductible6 = miscPropertyDeductible6;
	}

	public double getContractorEquipmentLimit6() {
		return contractorEquipmentLimit6;
	}

	public void setContractorEquipmentLimit6(double contractorEquipmentLimit6) {
		this.contractorEquipmentLimit6 = contractorEquipmentLimit6;
	}

	public double getContractorEquipmentDeductible6() {
		return contractorEquipmentDeductible6;
	}

	public void setContractorEquipmentDeductible6(
			double contractorEquipmentDeductible6) {
		this.contractorEquipmentDeductible6 = contractorEquipmentDeductible6;
	}

	public double getInstallationFloaterLimit6() {
		return installationFloaterLimit6;
	}

	public void setInstallationFloaterLimit6(double installationFloaterLimit6) {
		this.installationFloaterLimit6 = installationFloaterLimit6;
	}

	public double getInstallationFloaterDeductible6() {
		return installationFloaterDeductible6;
	}

	public void setInstallationFloaterDeductible6(
			double installationFloaterDeductible6) {
		this.installationFloaterDeductible6 = installationFloaterDeductible6;
	}

	public double getToolFloaterLimit6() {
		return toolFloaterLimit6;
	}

	public void setToolFloaterLimit6(double toolFloaterLimit6) {
		this.toolFloaterLimit6 = toolFloaterLimit6;
	}

	public double getToolFloaterDeductible6() {
		return toolFloaterDeductible6;
	}

	public void setToolFloaterDeductible6(double toolFloaterDeductible6) {
		this.toolFloaterDeductible6 = toolFloaterDeductible6;
	}

	public double getSignFloaterLimit6() {
		return signFloaterLimit6;
	}

	public void setSignFloaterLimit6(double signFloaterLimit6) {
		this.signFloaterLimit6 = signFloaterLimit6;
	}

	public double getSignFloaterDeductible6() {
		return signFloaterDeductible6;
	}

	public void setSignFloaterDeductible6(double signFloaterDeductible6) {
		this.signFloaterDeductible6 = signFloaterDeductible6;
	}

	public String getTruckMan6() {
		return truckMan6;
	}

	public void setTruckMan6(String truckMan6) {
		this.truckMan6 = truckMan6;
	}

	public String getOwnercb6() {
		return ownercb6;
	}

	public void setOwnercb6(String ownercb6) {
		this.ownercb6 = ownercb6;
	}

	public double getMotorTruckLimit6() {
		return motorTruckLimit6;
	}

	public void setMotorTruckLimit6(double motorTruckLimit6) {
		this.motorTruckLimit6 = motorTruckLimit6;
	}

	public double getMotorTruckDeductible6() {
		return motorTruckDeductible6;
	}

	public void setMotorTruckDeductible6(double motorTruckDeductible6) {
		this.motorTruckDeductible6 = motorTruckDeductible6;
	}

	public double getGlassLimit6() {
		return glassLimit6;
	}

	public void setGlassLimit6(double glassLimit6) {
		this.glassLimit6 = glassLimit6;
	}

	public double getGlassDeductible6() {
		return glassDeductible6;
	}

	public void setGlassDeductible6(double glassDeductible6) {
		this.glassDeductible6 = glassDeductible6;
	}

	public double getSewerBackupLimit6() {
		return sewerBackupLimit6;
	}

	public void setSewerBackupLimit6(double sewerBackupLimit6) {
		this.sewerBackupLimit6 = sewerBackupLimit6;
	}

	public double getSewerBackupDeductible6() {
		return sewerBackupDeductible6;
	}

	public void setSewerBackupDeductible6(double sewerBackupDeductible6) {
		this.sewerBackupDeductible6 = sewerBackupDeductible6;
	}

	public double getFloodLimit6() {
		return floodLimit6;
	}

	public void setFloodLimit6(double floodLimit6) {
		this.floodLimit6 = floodLimit6;
	}

	public double getFloodDeductible6() {
		return floodDeductible6;
	}

	public void setFloodDeductible6(double floodDeductible6) {
		this.floodDeductible6 = floodDeductible6;
	}

	public double getEarthquakeLimit6() {
		return earthquakeLimit6;
	}

	public void setEarthquakeLimit6(double earthquakeLimit6) {
		this.earthquakeLimit6 = earthquakeLimit6;
	}

	public double getEarthquakeDeductible6() {
		return earthquakeDeductible6;
	}

	public void setEarthquakeDeductible6(double earthquakeDeductible6) {
		this.earthquakeDeductible6 = earthquakeDeductible6;
	}

	public double getProfitLimit6() {
		return profitLimit6;
	}

	public void setProfitLimit6(double profitLimit6) {
		this.profitLimit6 = profitLimit6;
	}

	public double getProfitDeductible6() {
		return profitDeductible6;
	}

	public void setProfitDeductible6(double profitDeductible6) {
		this.profitDeductible6 = profitDeductible6;
	}

	public String getGrossEarningCheckbox6() {
		return grossEarningCheckbox6;
	}

	public void setGrossEarningCheckbox6(String grossEarningCheckbox6) {
		this.grossEarningCheckbox6 = grossEarningCheckbox6;
	}

	public double getGrossEarningLimit6() {
		return grossEarningLimit6;
	}

	public void setGrossEarningLimit6(double grossEarningLimit6) {
		this.grossEarningLimit6 = grossEarningLimit6;
	}

	public double getGrossEarningDeductible6() {
		return grossEarningDeductible6;
	}

	public void setGrossEarningDeductible6(double grossEarningDeductible6) {
		this.grossEarningDeductible6 = grossEarningDeductible6;
	}

	public double getRentalIncomeLimit6() {
		return rentalIncomeLimit6;
	}

	public void setRentalIncomeLimit6(double rentalIncomeLimit6) {
		this.rentalIncomeLimit6 = rentalIncomeLimit6;
	}

	public double getRentalIncomeDeductible6() {
		return rentalIncomeDeductible6;
	}

	public void setRentalIncomeDeductible6(double rentalIncomeDeductible6) {
		this.rentalIncomeDeductible6 = rentalIncomeDeductible6;
	}

	public double getExtraExpenseLimit6() {
		return extraExpenseLimit6;
	}

	public void setExtraExpenseLimit6(double extraExpenseLimit6) {
		this.extraExpenseLimit6 = extraExpenseLimit6;
	}

	public double getExtraExpenseDeductible6() {
		return extraExpenseDeductible6;
	}

	public void setExtraExpenseDeductible6(double extraExpenseDeductible6) {
		this.extraExpenseDeductible6 = extraExpenseDeductible6;
	}

	public double getOffPremisesPowerLimit6() {
		return offPremisesPowerLimit6;
	}

	public void setOffPremisesPowerLimit6(double offPremisesPowerLimit6) {
		this.offPremisesPowerLimit6 = offPremisesPowerLimit6;
	}

	public double getOffPremisesPowerDeductible6() {
		return offPremisesPowerDeductible6;
	}

	public void setOffPremisesPowerDeductible6(double offPremisesPowerDeductible6) {
		this.offPremisesPowerDeductible6 = offPremisesPowerDeductible6;
	}

	public double getInsideOutsideLimit6() {
		return insideOutsideLimit6;
	}

	public void setInsideOutsideLimit6(double insideOutsideLimit6) {
		this.insideOutsideLimit6 = insideOutsideLimit6;
	}

	public double getInsideOutsideDeductible6() {
		return insideOutsideDeductible6;
	}

	public void setInsideOutsideDeductible6(double insideOutsideDeductible6) {
		this.insideOutsideDeductible6 = insideOutsideDeductible6;
	}

	public double getBfMoneyLimit6() {
		return bfMoneyLimit6;
	}

	public void setBfMoneyLimit6(double bfMoneyLimit6) {
		this.bfMoneyLimit6 = bfMoneyLimit6;
	}

	public double getBfMoneyDeductible6() {
		return bfMoneyDeductible6;
	}

	public void setBfMoneyDeductible6(double bfMoneyDeductible6) {
		this.bfMoneyDeductible6 = bfMoneyDeductible6;
	}

	public double getDeopistorForgeryLimit6() {
		return deopistorForgeryLimit6;
	}

	public void setDeopistorForgeryLimit6(double deopistorForgeryLimit6) {
		this.deopistorForgeryLimit6 = deopistorForgeryLimit6;
	}

	public double getDeopistorForgeryDeductible6() {
		return deopistorForgeryDeductible6;
	}

	public void setDeopistorForgeryDeductible6(double deopistorForgeryDeductible6) {
		this.deopistorForgeryDeductible6 = deopistorForgeryDeductible6;
	}

	public double getMoneyOrdersLimit6() {
		return moneyOrdersLimit6;
	}

	public void setMoneyOrdersLimit6(double moneyOrdersLimit6) {
		this.moneyOrdersLimit6 = moneyOrdersLimit6;
	}

	public double getMoneyOrdersDeductible6() {
		return moneyOrdersDeductible6;
	}

	public void setMoneyOrdersDeductible6(double moneyOrdersDeductible6) {
		this.moneyOrdersDeductible6 = moneyOrdersDeductible6;
	}

	public double getEmployDishonestyLimit6() {
		return employDishonestyLimit6;
	}

	public void setEmployDishonestyLimit6(double employDishonestyLimit6) {
		this.employDishonestyLimit6 = employDishonestyLimit6;
	}

	public double getEmployDishonestyDeductible6() {
		return employDishonestyDeductible6;
	}

	public void setEmployDishonestyDeductible6(double employDishonestyDeductible6) {
		this.employDishonestyDeductible6 = employDishonestyDeductible6;
	}

	public double getCglLimit6() {
		return cglLimit6;
	}

	public void setCglLimit6(double cglLimit6) {
		this.cglLimit6 = cglLimit6;
	}

	public double getCglDeductible6() {
		return cglDeductible6;
	}

	public void setCglDeductible6(double cglDeductible6) {
		this.cglDeductible6 = cglDeductible6;
	}

	public double getTenantsLegalLimit6() {
		return tenantsLegalLimit6;
	}

	public void setTenantsLegalLimit6(double tenantsLegalLimit6) {
		this.tenantsLegalLimit6 = tenantsLegalLimit6;
	}

	public double getTenantsLegalDeductible6() {
		return tenantsLegalDeductible6;
	}

	public void setTenantsLegalDeductible6(double tenantsLegalDeductible6) {
		this.tenantsLegalDeductible6 = tenantsLegalDeductible6;
	}

	public double getNonOwnedAutoLimit6() {
		return nonOwnedAutoLimit6;
	}

	public void setNonOwnedAutoLimit6(double nonOwnedAutoLimit6) {
		this.nonOwnedAutoLimit6 = nonOwnedAutoLimit6;
	}

	public double getNonOwnedAutoDeductible6() {
		return nonOwnedAutoDeductible6;
	}

	public void setNonOwnedAutoDeductible6(double nonOwnedAutoDeductible6) {
		this.nonOwnedAutoDeductible6 = nonOwnedAutoDeductible6;
	}

	public double getSef96Limit6() {
		return sef96Limit6;
	}

	public void setSef96Limit6(double sef96Limit6) {
		this.sef96Limit6 = sef96Limit6;
	}

	public double getSef96Deductible6() {
		return sef96Deductible6;
	}

	public void setSef96Deductible6(double sef96Deductible6) {
		this.sef96Deductible6 = sef96Deductible6;
	}

	public double getSef94Limit6() {
		return sef94Limit6;
	}

	public void setSef94Limit6(double sef94Limit6) {
		this.sef94Limit6 = sef94Limit6;
	}

	public double getSef94Deductible6() {
		return sef94Deductible6;
	}

	public void setSef94Deductible6(double sef94Deductible6) {
		this.sef94Deductible6 = sef94Deductible6;
	}

	public double getDoLimit6() {
		return doLimit6;
	}

	public void setDoLimit6(double doLimit6) {
		this.doLimit6 = doLimit6;
	}

	public double getDoDeductible6() {
		return doDeductible6;
	}

	public void setDoDeductible6(double doDeductible6) {
		this.doDeductible6 = doDeductible6;
	}

	public double getEoLimit6() {
		return eoLimit6;
	}

	public void setEoLimit6(double eoLimit6) {
		this.eoLimit6 = eoLimit6;
	}

	public double getEoDeductible6() {
		return eoDeductible6;
	}

	public void setEoDeductible6(double eoDeductible6) {
		this.eoDeductible6 = eoDeductible6;
	}

	public double getEmployerLimit6() {
		return employerLimit6;
	}

	public void setEmployerLimit6(double employerLimit6) {
		this.employerLimit6 = employerLimit6;
	}

	public double getEmployerDeductible6() {
		return employerDeductible6;
	}

	public void setEmployerDeductible6(double employerDeductible6) {
		this.employerDeductible6 = employerDeductible6;
	}

	public double getUmbrellaLimit6() {
		return umbrellaLimit6;
	}

	public void setUmbrellaLimit6(double umbrellaLimit6) {
		this.umbrellaLimit6 = umbrellaLimit6;
	}

	public double getUmbrellaDeductible6() {
		return umbrellaDeductible6;
	}

	public void setUmbrellaDeductible6(double umbrellaDeductible6) {
		this.umbrellaDeductible6 = umbrellaDeductible6;
	}

	public double getWrapUpLimit6() {
		return wrapUpLimit6;
	}

	public void setWrapUpLimit6(double wrapUpLimit6) {
		this.wrapUpLimit6 = wrapUpLimit6;
	}

	public double getWrapUpDeductible6() {
		return wrapUpDeductible6;
	}

	public void setWrapUpDeductible6(double wrapUpDeductible6) {
		this.wrapUpDeductible6 = wrapUpDeductible6;
	}

	public double getStdComprehensiveLimit6() {
		return stdComprehensiveLimit6;
	}

	public void setStdComprehensiveLimit6(double stdComprehensiveLimit6) {
		this.stdComprehensiveLimit6 = stdComprehensiveLimit6;
	}

	public double getStdComprehensiveDeductible6() {
		return stdComprehensiveDeductible6;
	}

	public void setStdComprehensiveDeductible6(double stdComprehensiveDeductible6) {
		this.stdComprehensiveDeductible6 = stdComprehensiveDeductible6;
	}

	public double getAirConditioningLimit6() {
		return airConditioningLimit6;
	}

	public void setAirConditioningLimit6(double airConditioningLimit6) {
		this.airConditioningLimit6 = airConditioningLimit6;
	}

	public double getAirConditioningDeductible6() {
		return airConditioningDeductible6;
	}

	public void setAirConditioningDeductible6(double airConditioningDeductible6) {
		this.airConditioningDeductible6 = airConditioningDeductible6;
	}

	public double getProductionMachineryLimit6() {
		return productionMachineryLimit6;
	}

	public void setProductionMachineryLimit6(double productionMachineryLimit6) {
		this.productionMachineryLimit6 = productionMachineryLimit6;
	}

	public double getProductionMachineryDeductible6() {
		return productionMachineryDeductible6;
	}

	public void setProductionMachineryDeductible6(
			double productionMachineryDeductible6) {
		this.productionMachineryDeductible6 = productionMachineryDeductible6;
	}

	public String getOthercoverage16() {
		return othercoverage16;
	}

	public void setOthercoverage16(String othercoverage16) {
		this.othercoverage16 = othercoverage16;
	}

	public String getOthercoverage26() {
		return othercoverage26;
	}

	public void setOthercoverage26(String othercoverage26) {
		this.othercoverage26 = othercoverage26;
	}

	public double getOtherCoverageLimit16() {
		return otherCoverageLimit16;
	}

	public void setOtherCoverageLimit16(double otherCoverageLimit16) {
		this.otherCoverageLimit16 = otherCoverageLimit16;
	}

	public double getOtherCoverageDeductible16() {
		return otherCoverageDeductible16;
	}

	public void setOtherCoverageDeductible16(double otherCoverageDeductible16) {
		this.otherCoverageDeductible16 = otherCoverageDeductible16;
	}

	public double getOtherCoverageLimit26() {
		return otherCoverageLimit26;
	}

	public void setOtherCoverageLimit26(double otherCoverageLimit26) {
		this.otherCoverageLimit26 = otherCoverageLimit26;
	}

	public double getOtherCoverageDeductible26() {
		return otherCoverageDeductible26;
	}

	public void setOtherCoverageDeductible26(double otherCoverageDeductible26) {
		this.otherCoverageDeductible26 = otherCoverageDeductible26;
	}

	public String getAddress6() {
		return address6;
	}

	public void setAddress6(String address6) {
		this.address6 = address6;
	}

	public int getAge6() {
		return age6;
	}

	public void setAge6(int age6) {
		this.age6 = age6;
	}

	public double getTotalSqFootage6() {
		return totalSqFootage6;
	}

	public void setTotalSqFootage6(double totalSqFootage6) {
		this.totalSqFootage6 = totalSqFootage6;
	}

	public double getInsdSqFootage6() {
		return insdSqFootage6;
	}

	public void setInsdSqFootage6(double insdSqFootage6) {
		this.insdSqFootage6 = insdSqFootage6;
	}

	public int getNoOfStories6() {
		return noOfStories6;
	}

	public void setNoOfStories6(int noOfStories6) {
		this.noOfStories6 = noOfStories6;
	}

	public String getBasement6() {
		return basement6;
	}

	public void setBasement6(String basement6) {
		this.basement6 = basement6;
	}

	public String getWallsframe6() {
		return wallsframe6;
	}

	public void setWallsframe6(String wallsframe6) {
		this.wallsframe6 = wallsframe6;
	}

	public String getWallshcb6() {
		return wallshcb6;
	}

	public void setWallshcb6(String wallshcb6) {
		this.wallshcb6 = wallshcb6;
	}

	public String getWallssteel6() {
		return wallssteel6;
	}

	public void setWallssteel6(String wallssteel6) {
		this.wallssteel6 = wallssteel6;
	}

	public String getWallsbrick6() {
		return wallsbrick6;
	}

	public void setWallsbrick6(String wallsbrick6) {
		this.wallsbrick6 = wallsbrick6;
	}

	public String getRoofwood6() {
		return roofwood6;
	}

	public void setRoofwood6(String roofwood6) {
		this.roofwood6 = roofwood6;
	}

	public String getRoofsteel6() {
		return roofsteel6;
	}

	public void setRoofsteel6(String roofsteel6) {
		this.roofsteel6 = roofsteel6;
	}

	public String getRoofconcrete6() {
		return roofconcrete6;
	}

	public void setRoofconcrete6(String roofconcrete6) {
		this.roofconcrete6 = roofconcrete6;
	}

	public String getRoofupdated6() {
		return roofupdated6;
	}

	public void setRoofupdated6(String roofupdated6) {
		this.roofupdated6 = roofupdated6;
	}

	public String getFloorsconcrete6() {
		return floorsconcrete6;
	}

	public void setFloorsconcrete6(String floorsconcrete6) {
		this.floorsconcrete6 = floorsconcrete6;
	}

	public String getFloorswood6() {
		return floorswood6;
	}

	public void setFloorswood6(String floorswood6) {
		this.floorswood6 = floorswood6;
	}

	public String getHeatinggas6() {
		return heatinggas6;
	}

	public void setHeatinggas6(String heatinggas6) {
		this.heatinggas6 = heatinggas6;
	}

	public String getHeatingoil6() {
		return heatingoil6;
	}

	public void setHeatingoil6(String heatingoil6) {
		this.heatingoil6 = heatingoil6;
	}

	public String getHeatingelectric6() {
		return heatingelectric6;
	}

	public void setHeatingelectric6(String heatingelectric6) {
		this.heatingelectric6 = heatingelectric6;
	}

	public String getHeatingother6() {
		return heatingother6;
	}

	public void setHeatingother6(String heatingother6) {
		this.heatingother6 = heatingother6;
	}

	public String getHeatingupdated6() {
		return heatingupdated6;
	}

	public void setHeatingupdated6(String heatingupdated6) {
		this.heatingupdated6 = heatingupdated6;
	}

	public String getElectricalbreakers6() {
		return electricalbreakers6;
	}

	public void setElectricalbreakers6(String electricalbreakers6) {
		this.electricalbreakers6 = electricalbreakers6;
	}

	public String getElectricalfuses6() {
		return electricalfuses6;
	}

	public void setElectricalfuses6(String electricalfuses6) {
		this.electricalfuses6 = electricalfuses6;
	}

	public String getElectricalamps6() {
		return electricalamps6;
	}

	public void setElectricalamps6(String electricalamps6) {
		this.electricalamps6 = electricalamps6;
	}

	public String getElectricalupdated6() {
		return electricalupdated6;
	}

	public void setElectricalupdated6(String electricalupdated6) {
		this.electricalupdated6 = electricalupdated6;
	}

	public String getPlumbingcopper6() {
		return plumbingcopper6;
	}

	public void setPlumbingcopper6(String plumbingcopper6) {
		this.plumbingcopper6 = plumbingcopper6;
	}

	public String getPlumbingpvc6() {
		return plumbingpvc6;
	}

	public void setPlumbingpvc6(String plumbingpvc6) {
		this.plumbingpvc6 = plumbingpvc6;
	}

	public String getPlumbingother6() {
		return plumbingother6;
	}

	public void setPlumbingother6(String plumbingother6) {
		this.plumbingother6 = plumbingother6;
	}

	public String getPlumbingupdated6() {
		return plumbingupdated6;
	}

	public void setPlumbingupdated6(String plumbingupdated6) {
		this.plumbingupdated6 = plumbingupdated6;
	}

	public String getFireProtection6() {
		return fireProtection6;
	}

	public void setFireProtection6(String fireProtection6) {
		this.fireProtection6 = fireProtection6;
	}

	public String getFireProtectiondistance6() {
		return fireProtectiondistance6;
	}

	public void setFireProtectiondistance6(String fireProtectiondistance6) {
		this.fireProtectiondistance6 = fireProtectiondistance6;
	}

	public String getSecurity6() {
		return security6;
	}

	public void setSecurity6(String security6) {
		this.security6 = security6;
	}

	public String getAdditionalcoverage6() {
		return additionalcoverage6;
	}

	public void setAdditionalcoverage6(String additionalcoverage6) {
		this.additionalcoverage6 = additionalcoverage6;
	}

	public double getBuildingLimit7() {
		return buildingLimit7;
	}

	public void setBuildingLimit7(double buildingLimit7) {
		this.buildingLimit7 = buildingLimit7;
	}

	public double getBuildingDeductible7() {
		return buildingDeductible7;
	}

	public void setBuildingDeductible7(double buildingDeductible7) {
		this.buildingDeductible7 = buildingDeductible7;
	}

	public double getContentsLimit7() {
		return contentsLimit7;
	}

	public void setContentsLimit7(double contentsLimit7) {
		this.contentsLimit7 = contentsLimit7;
	}

	public double getContentsDeductible7() {
		return contentsDeductible7;
	}

	public void setContentsDeductible7(double contentsDeductible7) {
		this.contentsDeductible7 = contentsDeductible7;
	}

	public double getStockLimit7() {
		return stockLimit7;
	}

	public void setStockLimit7(double stockLimit7) {
		this.stockLimit7 = stockLimit7;
	}

	public double getStockDeductible7() {
		return stockDeductible7;
	}

	public void setStockDeductible7(double stockDeductible7) {
		this.stockDeductible7 = stockDeductible7;
	}

	public double getOfficeContentLimit7() {
		return officeContentLimit7;
	}

	public void setOfficeContentLimit7(double officeContentLimit7) {
		this.officeContentLimit7 = officeContentLimit7;
	}

	public double getOfficeContentDeductible7() {
		return officeContentDeductible7;
	}

	public void setOfficeContentDeductible7(double officeContentDeductible7) {
		this.officeContentDeductible7 = officeContentDeductible7;
	}

	public double getEdpLimit7() {
		return edpLimit7;
	}

	public void setEdpLimit7(double edpLimit7) {
		this.edpLimit7 = edpLimit7;
	}

	public double getEdpDeductible7() {
		return edpDeductible7;
	}

	public void setEdpDeductible7(double edpDeductible7) {
		this.edpDeductible7 = edpDeductible7;
	}

	public double getEquipmentLimit7() {
		return equipmentLimit7;
	}

	public void setEquipmentLimit7(double equipmentLimit7) {
		this.equipmentLimit7 = equipmentLimit7;
	}

	public double getEquipmentDeductible7() {
		return equipmentDeductible7;
	}

	public void setEquipmentDeductible7(double equipmentDeductible7) {
		this.equipmentDeductible7 = equipmentDeductible7;
	}

	public double getOffPremisesLimit7() {
		return offPremisesLimit7;
	}

	public void setOffPremisesLimit7(double offPremisesLimit7) {
		this.offPremisesLimit7 = offPremisesLimit7;
	}

	public double getOffPremisesDeductible7() {
		return offPremisesDeductible7;
	}

	public void setOffPremisesDeductible7(double offPremisesDeductible7) {
		this.offPremisesDeductible7 = offPremisesDeductible7;
	}

	public double getTransitLimit7() {
		return transitLimit7;
	}

	public void setTransitLimit7(double transitLimit7) {
		this.transitLimit7 = transitLimit7;
	}

	public double getTransitDeductible7() {
		return transitDeductible7;
	}

	public void setTransitDeductible7(double transitDeductible7) {
		this.transitDeductible7 = transitDeductible7;
	}

	public double getMiscPropertyLimit7() {
		return miscPropertyLimit7;
	}

	public void setMiscPropertyLimit7(double miscPropertyLimit7) {
		this.miscPropertyLimit7 = miscPropertyLimit7;
	}

	public double getMiscPropertyDeductible7() {
		return miscPropertyDeductible7;
	}

	public void setMiscPropertyDeductible7(double miscPropertyDeductible7) {
		this.miscPropertyDeductible7 = miscPropertyDeductible7;
	}

	public double getContractorEquipmentLimit7() {
		return contractorEquipmentLimit7;
	}

	public void setContractorEquipmentLimit7(double contractorEquipmentLimit7) {
		this.contractorEquipmentLimit7 = contractorEquipmentLimit7;
	}

	public double getContractorEquipmentDeductible7() {
		return contractorEquipmentDeductible7;
	}

	public void setContractorEquipmentDeductible7(
			double contractorEquipmentDeductible7) {
		this.contractorEquipmentDeductible7 = contractorEquipmentDeductible7;
	}

	public double getInstallationFloaterLimit7() {
		return installationFloaterLimit7;
	}

	public void setInstallationFloaterLimit7(double installationFloaterLimit7) {
		this.installationFloaterLimit7 = installationFloaterLimit7;
	}

	public double getInstallationFloaterDeductible7() {
		return installationFloaterDeductible7;
	}

	public void setInstallationFloaterDeductible7(
			double installationFloaterDeductible7) {
		this.installationFloaterDeductible7 = installationFloaterDeductible7;
	}

	public double getToolFloaterLimit7() {
		return toolFloaterLimit7;
	}

	public void setToolFloaterLimit7(double toolFloaterLimit7) {
		this.toolFloaterLimit7 = toolFloaterLimit7;
	}

	public double getToolFloaterDeductible7() {
		return toolFloaterDeductible7;
	}

	public void setToolFloaterDeductible7(double toolFloaterDeductible7) {
		this.toolFloaterDeductible7 = toolFloaterDeductible7;
	}

	public double getSignFloaterLimit7() {
		return signFloaterLimit7;
	}

	public void setSignFloaterLimit7(double signFloaterLimit7) {
		this.signFloaterLimit7 = signFloaterLimit7;
	}

	public double getSignFloaterDeductible7() {
		return signFloaterDeductible7;
	}

	public void setSignFloaterDeductible7(double signFloaterDeductible7) {
		this.signFloaterDeductible7 = signFloaterDeductible7;
	}

	public String getTruckMan7() {
		return truckMan7;
	}

	public void setTruckMan7(String truckMan7) {
		this.truckMan7 = truckMan7;
	}

	public String getOwnercb7() {
		return ownercb7;
	}

	public void setOwnercb7(String ownercb7) {
		this.ownercb7 = ownercb7;
	}

	public double getMotorTruckLimit7() {
		return motorTruckLimit7;
	}

	public void setMotorTruckLimit7(double motorTruckLimit7) {
		this.motorTruckLimit7 = motorTruckLimit7;
	}

	public double getMotorTruckDeductible7() {
		return motorTruckDeductible7;
	}

	public void setMotorTruckDeductible7(double motorTruckDeductible7) {
		this.motorTruckDeductible7 = motorTruckDeductible7;
	}

	public double getGlassLimit7() {
		return glassLimit7;
	}

	public void setGlassLimit7(double glassLimit7) {
		this.glassLimit7 = glassLimit7;
	}

	public double getGlassDeductible7() {
		return glassDeductible7;
	}

	public void setGlassDeductible7(double glassDeductible7) {
		this.glassDeductible7 = glassDeductible7;
	}

	public double getSewerBackupLimit7() {
		return sewerBackupLimit7;
	}

	public void setSewerBackupLimit7(double sewerBackupLimit7) {
		this.sewerBackupLimit7 = sewerBackupLimit7;
	}

	public double getSewerBackupDeductible7() {
		return sewerBackupDeductible7;
	}

	public void setSewerBackupDeductible7(double sewerBackupDeductible7) {
		this.sewerBackupDeductible7 = sewerBackupDeductible7;
	}

	public double getFloodLimit7() {
		return floodLimit7;
	}

	public void setFloodLimit7(double floodLimit7) {
		this.floodLimit7 = floodLimit7;
	}

	public double getFloodDeductible7() {
		return floodDeductible7;
	}

	public void setFloodDeductible7(double floodDeductible7) {
		this.floodDeductible7 = floodDeductible7;
	}

	public double getEarthquakeLimit7() {
		return earthquakeLimit7;
	}

	public void setEarthquakeLimit7(double earthquakeLimit7) {
		this.earthquakeLimit7 = earthquakeLimit7;
	}

	public double getEarthquakeDeductible7() {
		return earthquakeDeductible7;
	}

	public void setEarthquakeDeductible7(double earthquakeDeductible7) {
		this.earthquakeDeductible7 = earthquakeDeductible7;
	}

	public double getProfitLimit7() {
		return profitLimit7;
	}

	public void setProfitLimit7(double profitLimit7) {
		this.profitLimit7 = profitLimit7;
	}

	public double getProfitDeductible7() {
		return profitDeductible7;
	}

	public void setProfitDeductible7(double profitDeductible7) {
		this.profitDeductible7 = profitDeductible7;
	}

	public String getGrossEarningCheckbox7() {
		return grossEarningCheckbox7;
	}

	public void setGrossEarningCheckbox7(String grossEarningCheckbox7) {
		this.grossEarningCheckbox7 = grossEarningCheckbox7;
	}

	public double getGrossEarningLimit7() {
		return grossEarningLimit7;
	}

	public void setGrossEarningLimit7(double grossEarningLimit7) {
		this.grossEarningLimit7 = grossEarningLimit7;
	}

	public double getGrossEarningDeductible7() {
		return grossEarningDeductible7;
	}

	public void setGrossEarningDeductible7(double grossEarningDeductible7) {
		this.grossEarningDeductible7 = grossEarningDeductible7;
	}

	public double getRentalIncomeLimit7() {
		return rentalIncomeLimit7;
	}

	public void setRentalIncomeLimit7(double rentalIncomeLimit7) {
		this.rentalIncomeLimit7 = rentalIncomeLimit7;
	}

	public double getRentalIncomeDeductible7() {
		return rentalIncomeDeductible7;
	}

	public void setRentalIncomeDeductible7(double rentalIncomeDeductible7) {
		this.rentalIncomeDeductible7 = rentalIncomeDeductible7;
	}

	public double getExtraExpenseLimit7() {
		return extraExpenseLimit7;
	}

	public void setExtraExpenseLimit7(double extraExpenseLimit7) {
		this.extraExpenseLimit7 = extraExpenseLimit7;
	}

	public double getExtraExpenseDeductible7() {
		return extraExpenseDeductible7;
	}

	public void setExtraExpenseDeductible7(double extraExpenseDeductible7) {
		this.extraExpenseDeductible7 = extraExpenseDeductible7;
	}

	public double getOffPremisesPowerLimit7() {
		return offPremisesPowerLimit7;
	}

	public void setOffPremisesPowerLimit7(double offPremisesPowerLimit7) {
		this.offPremisesPowerLimit7 = offPremisesPowerLimit7;
	}

	public double getOffPremisesPowerDeductible7() {
		return offPremisesPowerDeductible7;
	}

	public void setOffPremisesPowerDeductible7(double offPremisesPowerDeductible7) {
		this.offPremisesPowerDeductible7 = offPremisesPowerDeductible7;
	}

	public double getInsideOutsideLimit7() {
		return insideOutsideLimit7;
	}

	public void setInsideOutsideLimit7(double insideOutsideLimit7) {
		this.insideOutsideLimit7 = insideOutsideLimit7;
	}

	public double getInsideOutsideDeductible7() {
		return insideOutsideDeductible7;
	}

	public void setInsideOutsideDeductible7(double insideOutsideDeductible7) {
		this.insideOutsideDeductible7 = insideOutsideDeductible7;
	}

	public double getBfMoneyLimit7() {
		return bfMoneyLimit7;
	}

	public void setBfMoneyLimit7(double bfMoneyLimit7) {
		this.bfMoneyLimit7 = bfMoneyLimit7;
	}

	public double getBfMoneyDeductible7() {
		return bfMoneyDeductible7;
	}

	public void setBfMoneyDeductible7(double bfMoneyDeductible7) {
		this.bfMoneyDeductible7 = bfMoneyDeductible7;
	}

	public double getDeopistorForgeryLimit7() {
		return deopistorForgeryLimit7;
	}

	public void setDeopistorForgeryLimit7(double deopistorForgeryLimit7) {
		this.deopistorForgeryLimit7 = deopistorForgeryLimit7;
	}

	public double getDeopistorForgeryDeductible7() {
		return deopistorForgeryDeductible7;
	}

	public void setDeopistorForgeryDeductible7(double deopistorForgeryDeductible7) {
		this.deopistorForgeryDeductible7 = deopistorForgeryDeductible7;
	}

	public double getMoneyOrdersLimit7() {
		return moneyOrdersLimit7;
	}

	public void setMoneyOrdersLimit7(double moneyOrdersLimit7) {
		this.moneyOrdersLimit7 = moneyOrdersLimit7;
	}

	public double getMoneyOrdersDeductible7() {
		return moneyOrdersDeductible7;
	}

	public void setMoneyOrdersDeductible7(double moneyOrdersDeductible7) {
		this.moneyOrdersDeductible7 = moneyOrdersDeductible7;
	}

	public double getEmployDishonestyLimit7() {
		return employDishonestyLimit7;
	}

	public void setEmployDishonestyLimit7(double employDishonestyLimit7) {
		this.employDishonestyLimit7 = employDishonestyLimit7;
	}

	public double getEmployDishonestyDeductible7() {
		return employDishonestyDeductible7;
	}

	public void setEmployDishonestyDeductible7(double employDishonestyDeductible7) {
		this.employDishonestyDeductible7 = employDishonestyDeductible7;
	}

	public double getCglLimit7() {
		return cglLimit7;
	}

	public void setCglLimit7(double cglLimit7) {
		this.cglLimit7 = cglLimit7;
	}

	public double getCglDeductible7() {
		return cglDeductible7;
	}

	public void setCglDeductible7(double cglDeductible7) {
		this.cglDeductible7 = cglDeductible7;
	}

	public double getTenantsLegalLimit7() {
		return tenantsLegalLimit7;
	}

	public void setTenantsLegalLimit7(double tenantsLegalLimit7) {
		this.tenantsLegalLimit7 = tenantsLegalLimit7;
	}

	public double getTenantsLegalDeductible7() {
		return tenantsLegalDeductible7;
	}

	public void setTenantsLegalDeductible7(double tenantsLegalDeductible7) {
		this.tenantsLegalDeductible7 = tenantsLegalDeductible7;
	}

	public double getNonOwnedAutoLimit7() {
		return nonOwnedAutoLimit7;
	}

	public void setNonOwnedAutoLimit7(double nonOwnedAutoLimit7) {
		this.nonOwnedAutoLimit7 = nonOwnedAutoLimit7;
	}

	public double getNonOwnedAutoDeductible7() {
		return nonOwnedAutoDeductible7;
	}

	public void setNonOwnedAutoDeductible7(double nonOwnedAutoDeductible7) {
		this.nonOwnedAutoDeductible7 = nonOwnedAutoDeductible7;
	}

	public double getSef96Limit7() {
		return sef96Limit7;
	}

	public void setSef96Limit7(double sef96Limit7) {
		this.sef96Limit7 = sef96Limit7;
	}

	public double getSef96Deductible7() {
		return sef96Deductible7;
	}

	public void setSef96Deductible7(double sef96Deductible7) {
		this.sef96Deductible7 = sef96Deductible7;
	}

	public double getSef94Limit7() {
		return sef94Limit7;
	}

	public void setSef94Limit7(double sef94Limit7) {
		this.sef94Limit7 = sef94Limit7;
	}

	public double getSef94Deductible7() {
		return sef94Deductible7;
	}

	public void setSef94Deductible7(double sef94Deductible7) {
		this.sef94Deductible7 = sef94Deductible7;
	}

	public double getDoLimit7() {
		return doLimit7;
	}

	public void setDoLimit7(double doLimit7) {
		this.doLimit7 = doLimit7;
	}

	public double getDoDeductible7() {
		return doDeductible7;
	}

	public void setDoDeductible7(double doDeductible7) {
		this.doDeductible7 = doDeductible7;
	}

	public double getEoLimit7() {
		return eoLimit7;
	}

	public void setEoLimit7(double eoLimit7) {
		this.eoLimit7 = eoLimit7;
	}

	public double getEoDeductible7() {
		return eoDeductible7;
	}

	public void setEoDeductible7(double eoDeductible7) {
		this.eoDeductible7 = eoDeductible7;
	}

	public double getEmployerLimit7() {
		return employerLimit7;
	}

	public void setEmployerLimit7(double employerLimit7) {
		this.employerLimit7 = employerLimit7;
	}

	public double getEmployerDeductible7() {
		return employerDeductible7;
	}

	public void setEmployerDeductible7(double employerDeductible7) {
		this.employerDeductible7 = employerDeductible7;
	}

	public double getUmbrellaLimit7() {
		return umbrellaLimit7;
	}

	public void setUmbrellaLimit7(double umbrellaLimit7) {
		this.umbrellaLimit7 = umbrellaLimit7;
	}

	public double getUmbrellaDeductible7() {
		return umbrellaDeductible7;
	}

	public void setUmbrellaDeductible7(double umbrellaDeductible7) {
		this.umbrellaDeductible7 = umbrellaDeductible7;
	}

	public double getWrapUpLimit7() {
		return wrapUpLimit7;
	}

	public void setWrapUpLimit7(double wrapUpLimit7) {
		this.wrapUpLimit7 = wrapUpLimit7;
	}

	public double getWrapUpDeductible7() {
		return wrapUpDeductible7;
	}

	public void setWrapUpDeductible7(double wrapUpDeductible7) {
		this.wrapUpDeductible7 = wrapUpDeductible7;
	}

	public double getStdComprehensiveLimit7() {
		return stdComprehensiveLimit7;
	}

	public void setStdComprehensiveLimit7(double stdComprehensiveLimit7) {
		this.stdComprehensiveLimit7 = stdComprehensiveLimit7;
	}

	public double getStdComprehensiveDeductible7() {
		return stdComprehensiveDeductible7;
	}

	public void setStdComprehensiveDeductible7(double stdComprehensiveDeductible7) {
		this.stdComprehensiveDeductible7 = stdComprehensiveDeductible7;
	}

	public double getAirConditioningLimit7() {
		return airConditioningLimit7;
	}

	public void setAirConditioningLimit7(double airConditioningLimit7) {
		this.airConditioningLimit7 = airConditioningLimit7;
	}

	public double getAirConditioningDeductible7() {
		return airConditioningDeductible7;
	}

	public void setAirConditioningDeductible7(double airConditioningDeductible7) {
		this.airConditioningDeductible7 = airConditioningDeductible7;
	}

	public double getProductionMachineryLimit7() {
		return productionMachineryLimit7;
	}

	public void setProductionMachineryLimit7(double productionMachineryLimit7) {
		this.productionMachineryLimit7 = productionMachineryLimit7;
	}

	public double getProductionMachineryDeductible7() {
		return productionMachineryDeductible7;
	}

	public void setProductionMachineryDeductible7(
			double productionMachineryDeductible7) {
		this.productionMachineryDeductible7 = productionMachineryDeductible7;
	}

	public String getOthercoverage17() {
		return othercoverage17;
	}

	public void setOthercoverage17(String othercoverage17) {
		this.othercoverage17 = othercoverage17;
	}

	public String getOthercoverage27() {
		return othercoverage27;
	}

	public void setOthercoverage27(String othercoverage27) {
		this.othercoverage27 = othercoverage27;
	}

	public double getOtherCoverageLimit17() {
		return otherCoverageLimit17;
	}

	public void setOtherCoverageLimit17(double otherCoverageLimit17) {
		this.otherCoverageLimit17 = otherCoverageLimit17;
	}

	public double getOtherCoverageDeductible17() {
		return otherCoverageDeductible17;
	}

	public void setOtherCoverageDeductible17(double otherCoverageDeductible17) {
		this.otherCoverageDeductible17 = otherCoverageDeductible17;
	}

	public double getOtherCoverageLimit27() {
		return otherCoverageLimit27;
	}

	public void setOtherCoverageLimit27(double otherCoverageLimit27) {
		this.otherCoverageLimit27 = otherCoverageLimit27;
	}

	public double getOtherCoverageDeductible27() {
		return otherCoverageDeductible27;
	}

	public void setOtherCoverageDeductible27(double otherCoverageDeductible27) {
		this.otherCoverageDeductible27 = otherCoverageDeductible27;
	}

	public String getAddress7() {
		return address7;
	}

	public void setAddress7(String address7) {
		this.address7 = address7;
	}

	public int getAge7() {
		return age7;
	}

	public void setAge7(int age7) {
		this.age7 = age7;
	}

	public double getTotalSqFootage7() {
		return totalSqFootage7;
	}

	public void setTotalSqFootage7(double totalSqFootage7) {
		this.totalSqFootage7 = totalSqFootage7;
	}

	public double getInsdSqFootage7() {
		return insdSqFootage7;
	}

	public void setInsdSqFootage7(double insdSqFootage7) {
		this.insdSqFootage7 = insdSqFootage7;
	}

	public int getNoOfStories7() {
		return noOfStories7;
	}

	public void setNoOfStories7(int noOfStories7) {
		this.noOfStories7 = noOfStories7;
	}

	public String getBasement7() {
		return basement7;
	}

	public void setBasement7(String basement7) {
		this.basement7 = basement7;
	}

	public String getWallsframe7() {
		return wallsframe7;
	}

	public void setWallsframe7(String wallsframe7) {
		this.wallsframe7 = wallsframe7;
	}

	public String getWallshcb7() {
		return wallshcb7;
	}

	public void setWallshcb7(String wallshcb7) {
		this.wallshcb7 = wallshcb7;
	}

	public String getWallssteel7() {
		return wallssteel7;
	}

	public void setWallssteel7(String wallssteel7) {
		this.wallssteel7 = wallssteel7;
	}

	public String getWallsbrick7() {
		return wallsbrick7;
	}

	public void setWallsbrick7(String wallsbrick7) {
		this.wallsbrick7 = wallsbrick7;
	}

	public String getRoofwood7() {
		return roofwood7;
	}

	public void setRoofwood7(String roofwood7) {
		this.roofwood7 = roofwood7;
	}

	public String getRoofsteel7() {
		return roofsteel7;
	}

	public void setRoofsteel7(String roofsteel7) {
		this.roofsteel7 = roofsteel7;
	}

	public String getRoofconcrete7() {
		return roofconcrete7;
	}

	public void setRoofconcrete7(String roofconcrete7) {
		this.roofconcrete7 = roofconcrete7;
	}

	public String getRoofupdated7() {
		return roofupdated7;
	}

	public void setRoofupdated7(String roofupdated7) {
		this.roofupdated7 = roofupdated7;
	}

	public String getFloorsconcrete7() {
		return floorsconcrete7;
	}

	public void setFloorsconcrete7(String floorsconcrete7) {
		this.floorsconcrete7 = floorsconcrete7;
	}

	public String getFloorswood7() {
		return floorswood7;
	}

	public void setFloorswood7(String floorswood7) {
		this.floorswood7 = floorswood7;
	}

	public String getHeatinggas7() {
		return heatinggas7;
	}

	public void setHeatinggas7(String heatinggas7) {
		this.heatinggas7 = heatinggas7;
	}

	public String getHeatingoil7() {
		return heatingoil7;
	}

	public void setHeatingoil7(String heatingoil7) {
		this.heatingoil7 = heatingoil7;
	}

	public String getHeatingelectric7() {
		return heatingelectric7;
	}

	public void setHeatingelectric7(String heatingelectric7) {
		this.heatingelectric7 = heatingelectric7;
	}

	public String getHeatingother7() {
		return heatingother7;
	}

	public void setHeatingother7(String heatingother7) {
		this.heatingother7 = heatingother7;
	}

	public String getHeatingupdated7() {
		return heatingupdated7;
	}

	public void setHeatingupdated7(String heatingupdated7) {
		this.heatingupdated7 = heatingupdated7;
	}

	public String getElectricalbreakers7() {
		return electricalbreakers7;
	}

	public void setElectricalbreakers7(String electricalbreakers7) {
		this.electricalbreakers7 = electricalbreakers7;
	}

	public String getElectricalfuses7() {
		return electricalfuses7;
	}

	public void setElectricalfuses7(String electricalfuses7) {
		this.electricalfuses7 = electricalfuses7;
	}

	public String getElectricalamps7() {
		return electricalamps7;
	}

	public void setElectricalamps7(String electricalamps7) {
		this.electricalamps7 = electricalamps7;
	}

	public String getElectricalupdated7() {
		return electricalupdated7;
	}

	public void setElectricalupdated7(String electricalupdated7) {
		this.electricalupdated7 = electricalupdated7;
	}

	public String getPlumbingcopper7() {
		return plumbingcopper7;
	}

	public void setPlumbingcopper7(String plumbingcopper7) {
		this.plumbingcopper7 = plumbingcopper7;
	}

	public String getPlumbingpvc7() {
		return plumbingpvc7;
	}

	public void setPlumbingpvc7(String plumbingpvc7) {
		this.plumbingpvc7 = plumbingpvc7;
	}

	public String getPlumbingother7() {
		return plumbingother7;
	}

	public void setPlumbingother7(String plumbingother7) {
		this.plumbingother7 = plumbingother7;
	}

	public String getPlumbingupdated7() {
		return plumbingupdated7;
	}

	public void setPlumbingupdated7(String plumbingupdated7) {
		this.plumbingupdated7 = plumbingupdated7;
	}

	public String getFireProtection7() {
		return fireProtection7;
	}

	public void setFireProtection7(String fireProtection7) {
		this.fireProtection7 = fireProtection7;
	}

	public String getFireProtectiondistance7() {
		return fireProtectiondistance7;
	}

	public void setFireProtectiondistance7(String fireProtectiondistance7) {
		this.fireProtectiondistance7 = fireProtectiondistance7;
	}

	public String getSecurity7() {
		return security7;
	}

	public void setSecurity7(String security7) {
		this.security7 = security7;
	}

	public String getAdditionalcoverage7() {
		return additionalcoverage7;
	}

	public void setAdditionalcoverage7(String additionalcoverage7) {
		this.additionalcoverage7 = additionalcoverage7;
	}
}
