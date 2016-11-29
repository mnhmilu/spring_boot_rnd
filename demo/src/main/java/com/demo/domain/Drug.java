package com.demo.domain;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.NotBlank;


@Entity
@Table(name = "drug_info")
public class Drug {	
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;      
    
    @NotNull
    @NotBlank
    @Column(name = "drugName" ,nullable = false)
    private String drugName; 

    @Column(name = "composition",columnDefinition="LONGTEXT")
    private String composition;
    
    @Column(name = "indication",columnDefinition="LONGTEXT")
    private String indication;
    
    @Column(name = "dosagesAdministration",columnDefinition="LONGTEXT")
    private String dosagesAdministration;
       
    
    @Column(name = "contraindication",columnDefinition="LONGTEXT")
    private String contraindication;
    
    @Column(name = "sideEffect",columnDefinition="LONGTEXT")
    private String sideEffect;      
    
    
    @Column(name = "specialWarningPrecautions",columnDefinition="LONGTEXT")
    private String specialWarningPrecautions;    
    
    @Column(name = "drugInteraction",columnDefinition="LONGTEXT")
    private String drugInteraction;    
    
    
    @Column(name = "storage",columnDefinition="LONGTEXT")
    private String storage;    
    
 
    
    @Column(name = "dosageFormStrengthPackSize",columnDefinition="LONGTEXT")
    private String pregnancyLactation;    
    
    @Column(name = "drugPrice")
    private Integer drugprice;    
       
    
    @Temporal(TemporalType.DATE)
    private Date insertDate;  
    
    @Type(type="yes_no")
    @Column(name = "discontinued")
    private Boolean discontinued;
    
    
    @OneToOne
    @NotNull
    @JoinColumn(name="idgeneric")
    private DrugGeneric drugGeneric;    	
    
    
    @OneToOne
    @NotNull
    @JoinColumn(name="idManufacturer")
    private DrugManufacturer drugManufacturer;    	
     
    
    @Temporal(TemporalType.DATE)
    private Date lastUpdatedDate;    
    
    


	public DrugManufacturer getDrugManufacturer() {
		return drugManufacturer;
	}


	public void setDrugManufacturer(DrugManufacturer drugManufacturer) {
		this.drugManufacturer = drugManufacturer;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getDrugName() {
		return drugName;
	}


	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}


	public String getComposition() {
		return composition;
	}


	public void setComposition(String composition) {
		this.composition = composition;
	}


	public String getIndication() {
		return indication;
	}


	public void setIndication(String indication) {
		this.indication = indication;
	}


	public String getDosagesAdministration() {
		return dosagesAdministration;
	}


	public void setDosagesAdministration(String dosagesAdministration) {
		this.dosagesAdministration = dosagesAdministration;
	}


	public String getContraindication() {
		return contraindication;
	}


	public void setContraindication(String contraindication) {
		this.contraindication = contraindication;
	}


	public String getSideEffect() {
		return sideEffect;
	}


	public void setSideEffect(String sideEffect) {
		this.sideEffect = sideEffect;
	}


	public String getSpecialWarningPrecautions() {
		return specialWarningPrecautions;
	}


	public void setSpecialWarningPrecautions(String specialWarningPrecautions) {
		this.specialWarningPrecautions = specialWarningPrecautions;
	}


	public String getDrugInteraction() {
		return drugInteraction;
	}


	public void setDrugInteraction(String drugInteraction) {
		this.drugInteraction = drugInteraction;
	}


	public String getStorage() {
		return storage;
	}


	public void setStorage(String storage) {
		this.storage = storage;
	}



	public String getPregnancyLactation() {
		return pregnancyLactation;
	}


	public void setPregnancyLactation(String pregnancyLactation) {
		this.pregnancyLactation = pregnancyLactation;
	}


	public Integer getDrugprice() {
		return drugprice;
	}


	public void setDrugprice(Integer drugprice) {
		this.drugprice = drugprice;
	}


	public Date getInsertDate() {
		return insertDate;
	}


	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}


	public Boolean getDiscontinued() {
		return discontinued;
	}


	public void setDiscontinued(Boolean discontinued) {
		this.discontinued = discontinued;
	}


	public DrugGeneric getDrugGeneric() {
		return drugGeneric;
	}


	public void setDrugGeneric(DrugGeneric drugGeneric) {
		this.drugGeneric = drugGeneric;
	}


	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}


	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}     
   
}