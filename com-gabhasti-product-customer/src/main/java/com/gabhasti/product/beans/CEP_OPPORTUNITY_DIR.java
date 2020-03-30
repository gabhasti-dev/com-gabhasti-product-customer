package com.gabhasti.product.beans;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;

@Entity
public class CEP_OPPORTUNITY_DIR {

	public CEP_OPPORTUNITY_DIR() {
	
	}
	//@Column(length = 50,nullable = false,unique = true,updatable = false)
	//private String OPPORTUNITY_ID;
	@Id
	@GeneratedValue
	@Column(length = 20,nullable = false,updatable=true)
	private String directorId;
	
	private BigInteger randomId;
	@Column(length = 20,nullable = false,updatable=true)
	private String directorName;
	@Column(length = 20,nullable = false,updatable=true)
	private String panNo;
	@Column(length = 20,nullable = false,updatable=true)
	private String aadharId;
	@Column(length = 20,nullable = false,updatable=true)
	private String voterId;
	@Column(length = 15,nullable = false,updatable=true)
	private String passportNo;
	@Column(length = 15,nullable = false,updatable=true)
	private String cibilScore;
	@Column(length = 15,nullable = false,updatable=true)
	private String mobileNo;
	@Column(length = 15,nullable = false,updatable=false)
	@Email
	private String email;
	//@Column(length = 1,nullable = false,updatable=true)
	//private String FLAG;
	@Column(length = 20,nullable = false)
	private String makerId;
	@Column(nullable = false)
	private Date makerDate;
	@ManyToOne
	@JoinColumn(columnDefinition = "opportunityId")
	private CEP_OPPORTUNITY_MASTER cepOpportunityMaster;
	public String getDirectorId() {
		return directorId;
	}
	public void setDirectorId(String directorId) {
		this.directorId = directorId;
	}
	public BigInteger getRandomId() {
		return randomId;
	}
	public void setRandomId(BigInteger randomId) {
		this.randomId = randomId;
	}
	public String getDirectorName() {
		return directorName;
	}
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getAadharId() {
		return aadharId;
	}
	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}
	public String getVoterId() {
		return voterId;
	}
	public void setVoterId(String voterId) {
		this.voterId = voterId;
	}
	public String getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	public String getCibilScore() {
		return cibilScore;
	}
	public void setCibilScore(String cibilScore) {
		this.cibilScore = cibilScore;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMakerId() {
		return makerId;
	}
	public void setMakerId(String makerId) {
		this.makerId = makerId;
	}
	public Date getMakerDate() {
		return makerDate;
	}
	public void setMakerDate(Date makerDate) {
		this.makerDate = makerDate;
	}
	public CEP_OPPORTUNITY_MASTER getCepOpportunityMaster() {
		return cepOpportunityMaster;
	}
	public void setCepOpportunityMaster(CEP_OPPORTUNITY_MASTER cepOpportunityMaster) {
		this.cepOpportunityMaster = cepOpportunityMaster;
	} 
	
	
		
}
