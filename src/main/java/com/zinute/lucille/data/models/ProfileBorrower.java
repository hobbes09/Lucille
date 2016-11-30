package com.zinute.lucille.data.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity  
@Table(name= "profile_borrower") 
public class ProfileBorrower {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="profile_id", nullable=false, unique=true, columnDefinition="bigint")
	private Long profileId;

	@Column(name="bank_ecs_activated", nullable=false, columnDefinition="boolean default false")
	private boolean isBankEcsActivated;
	
	@Column(name="current_employer", nullable=true, columnDefinition="char(255)")
	private String currentEmployer;
	
	@Column(name="office_email_address", nullable=true, columnDefinition="char(255)")
	private String officeEmailAddress;
	
	@Column(name="member_rating", nullable=true, columnDefinition="char(255)")
	private String memberRating;
	
	@Column(name="employment_status", nullable=false, columnDefinition="char(255)")
	private String employmentStatus;
	
	@Column(name="aadhar_id", nullable=false, unique=true, columnDefinition="char(255)")
	private String aadharId;
	
	@Column(name="home_ownership", nullable=false, columnDefinition="char(255)")
	private String homeOwnership;
	
	@Column(name="annual_income", nullable=true, columnDefinition="integer")
	private int annualIncome;
	
	@Column(name="current_employment_date", nullable=true, columnDefinition="date")
	@Temporal(TemporalType.DATE)
	private Date currentEmploymentDate;
	
	@Column(name="total_employment_length", nullable=true, columnDefinition="integer")
	private int empLengthInMonths;
	
	@Column(name="office_std_code", nullable=true, columnDefinition="integer")
	private int officeStdCode;
	
	@Column(name="office_contact", nullable=true, columnDefinition="integer")
	private int officeContact;
	
	@Column(name="rent_amount", nullable=true, columnDefinition="integer")
	private int rentAmount;
	
	@Column(name="other_income", nullable=true, columnDefinition="integer")
	private int otherIncome;
	
	@Column(name="other_income_nature", nullable=true, columnDefinition="char(255)")
	private String other_income_nature;
	
	@Column(name="other_income_nature_desc", nullable=false, columnDefinition="char(255)")
	private String otherIncomeNatureDesc;

	public ProfileBorrower(Long profileId, boolean isBankEcsActivated, String currentEmployer,
			String officeEmailAddress, String memberRating, String employmentStatus, String aadharId,
			String homeOwnership, int annualIncome, Date currentEmploymentDate, int empLengthInMonths,
			int officeStdCode, int officeContact, int rentAmount, int otherIncome, String other_income_nature,
			String otherIncomeNatureDesc) {
		super();
		this.profileId = profileId;
		this.isBankEcsActivated = isBankEcsActivated;
		this.currentEmployer = currentEmployer;
		this.officeEmailAddress = officeEmailAddress;
		this.memberRating = memberRating;
		this.employmentStatus = employmentStatus;
		this.aadharId = aadharId;
		this.homeOwnership = homeOwnership;
		this.annualIncome = annualIncome;
		this.currentEmploymentDate = currentEmploymentDate;
		this.empLengthInMonths = empLengthInMonths;
		this.officeStdCode = officeStdCode;
		this.officeContact = officeContact;
		this.rentAmount = rentAmount;
		this.otherIncome = otherIncome;
		this.other_income_nature = other_income_nature;
		this.otherIncomeNatureDesc = otherIncomeNatureDesc;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProfileId() {
		return profileId;
	}

	public void setProfileId(Long profileId) {
		this.profileId = profileId;
	}

	public boolean isBankEcsActivated() {
		return isBankEcsActivated;
	}

	public void setBankEcsActivated(boolean isBankEcsActivated) {
		this.isBankEcsActivated = isBankEcsActivated;
	}

	public String getCurrentEmployer() {
		return currentEmployer;
	}

	public void setCurrentEmployer(String currentEmployer) {
		this.currentEmployer = currentEmployer;
	}

	public String getOfficeEmailAddress() {
		return officeEmailAddress;
	}

	public void setOfficeEmailAddress(String officeEmailAddress) {
		this.officeEmailAddress = officeEmailAddress;
	}

	public String getMemberRating() {
		return memberRating;
	}

	public void setMemberRating(String memberRating) {
		this.memberRating = memberRating;
	}

	public String getEmploymentStatus() {
		return employmentStatus;
	}

	public void setEmploymentStatus(String employmentStatus) {
		this.employmentStatus = employmentStatus;
	}

	public String getAadharId() {
		return aadharId;
	}

	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}

	public String getHomeOwnership() {
		return homeOwnership;
	}

	public void setHomeOwnership(String homeOwnership) {
		this.homeOwnership = homeOwnership;
	}

	public int getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(int annualIncome) {
		this.annualIncome = annualIncome;
	}

	public Date getCurrentEmploymentDate() {
		return currentEmploymentDate;
	}

	public void setCurrentEmploymentDate(Date currentEmploymentDate) {
		this.currentEmploymentDate = currentEmploymentDate;
	}

	public int getEmpLengthInMonths() {
		return empLengthInMonths;
	}

	public void setEmpLengthInMonths(int empLengthInMonths) {
		this.empLengthInMonths = empLengthInMonths;
	}

	public int getOfficeStdCode() {
		return officeStdCode;
	}

	public void setOfficeStdCode(int officeStdCode) {
		this.officeStdCode = officeStdCode;
	}

	public int getOfficeContact() {
		return officeContact;
	}

	public void setOfficeContact(int officeContact) {
		this.officeContact = officeContact;
	}

	public int getRentAmount() {
		return rentAmount;
	}

	public void setRentAmount(int rentAmount) {
		this.rentAmount = rentAmount;
	}

	public int getOtherIncome() {
		return otherIncome;
	}

	public void setOtherIncome(int otherIncome) {
		this.otherIncome = otherIncome;
	}

	public String getOther_income_nature() {
		return other_income_nature;
	}

	public void setOther_income_nature(String other_income_nature) {
		this.other_income_nature = other_income_nature;
	}

	public String getOtherIncomeNatureDesc() {
		return otherIncomeNatureDesc;
	}

	public void setOtherIncomeNatureDesc(String otherIncomeNatureDesc) {
		this.otherIncomeNatureDesc = otherIncomeNatureDesc;
	}
	
	
}
