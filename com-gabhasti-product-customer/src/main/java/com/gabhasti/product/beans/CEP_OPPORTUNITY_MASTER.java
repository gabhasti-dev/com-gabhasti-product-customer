package com.gabhasti.product.beans;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class CEP_OPPORTUNITY_MASTER{

	@Column(length = 20, nullable = false, unique = true, updatable = false)
	@Id
	@GeneratedValue
	private Long opportunityId;
	@Column(length = 200, unique = true)
	private String companyName;
	@Column(length = 100)
	private String typeCompany;
	@Column(length = 100)
	private String address;
	@Column(length = 50)
	private String state;
	@Column(length = 6)
	private String pincode;
	@Column(length = 100)
	private String cin;
	//@Column(length = 50, unique = true)
	private String pan;
	//@Column(length = 20, unique = true)
	private String gstNo;
	@Column(length = 10)
	private String cersai;
	@Column(length = 15, updatable = true)
	private String cibilScore;
	//@Column(nullable = false, updatable = false)
	private Date incorporationDate;
	@Column(length = 50)
	@Email(message = "Email should be valid {privateLtd@gmail.com}")
	private String emailId;
	//@Column(length = 2)
	//private int NO_OF_DIRECTORS;
	@Column(length = 50)
	private BigDecimal currentBusinessValue;
	@Column(length = 10)
	private long mobileNo;
	@Column(length = 20)
	private long officeLandlineNo;
	@Column(length = 1)

	private String flag = "O";
	@Column(length = 20)
	private String makerId;
	//@Column(nullable = false)
	private Date makerDate;

	@OneToMany(mappedBy =  "cepOpportunityMaster", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonProperty("cepOpportunityDir")
	private List<CEP_OPPORTUNITY_DIR> cepOpportunityDir = new ArrayList<>();

	public Long getOpportunityId() {
		return opportunityId;
	}

	public void setOpportunityId(Long opportunityId) {
		this.opportunityId = opportunityId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTypeCompany() {
		return typeCompany;
	}

	public void setTypeCompany(String typeCompany) {
		this.typeCompany = typeCompany;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getGstNo() {
		return gstNo;
	}

	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}

	public String getCersai() {
		return cersai;
	}

	public void setCersai(String cersai) {
		this.cersai = cersai;
	}

	public String getCibilScore() {
		return cibilScore;
	}

	public void setCibilScore(String cibilScore) {
		this.cibilScore = cibilScore;
	}

	public Date getIncorporationDate() {
		return incorporationDate;
	}

	public void setIncorporationDate(Date incorporationDate) {
		this.incorporationDate = incorporationDate;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public BigDecimal getCurrentBusinessValue() {
		return currentBusinessValue;
	}

	public void setCurrentBusinessValue(BigDecimal currentBusinessValue) {
		this.currentBusinessValue = currentBusinessValue;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public long getOfficeLandlineNo() {
		return officeLandlineNo;
	}

	public void setOfficeLandlineNo(long officeLandlineNo) {
		this.officeLandlineNo = officeLandlineNo;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
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
