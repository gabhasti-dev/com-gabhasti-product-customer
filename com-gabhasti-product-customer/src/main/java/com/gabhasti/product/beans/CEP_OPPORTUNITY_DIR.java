package com.gabhasti.product.beans;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Email;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class CEP_OPPORTUNITY_DIR implements Serializable {

	private static final long serialVersionUID = 1L;

	public CEP_OPPORTUNITY_DIR() {

	}

	@Id
	@SequenceGenerator(sequenceName = "SEQ_CEP_OPPORTUNITY_DIR", name = "SEQ_CEP_OPPORTUNITY_DIR", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "SEQ_CEP_OPPORTUNITY_DIR", strategy = GenerationType.SEQUENCE)
	@Column(length = 20,updatable = false, unique = true,nullable = false)
	private long directorId;
	@Column(length = 20)
	private String directorName;
	@Column(length = 20)
	private String panNo;
	@Column(length = 20)
	private String aadharId;
	@Column(length = 20)
	private String voterId;
	@Column(length = 15)
	private String passportNo;
	@Column(length = 15)
	private String cibilScore;
	@Column(length = 20)
	private String mobileNo;
	@Column(length = 20,unique = true)
	@Email()
	private String email;
	@Column(length = 20)
	private String makerId;
	
	private Date makerDate;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "opportunityId", nullable = false)
	@JsonBackReference
	private CEP_OPPORTUNITY_MASTER cepOpportunityMaster;

	public CEP_OPPORTUNITY_MASTER getCepOpportunityMaster() {
		return cepOpportunityMaster;
	}

	public void setCepOpportunityMaster(CEP_OPPORTUNITY_MASTER cepOpportunityMaster) {
		this.cepOpportunityMaster = cepOpportunityMaster;
	}

	public long getDirectorId() {
		return directorId;
	}

	public void setDirectorId(long directorId) {
		this.directorId = directorId;
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

}
