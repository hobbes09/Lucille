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
	
	@Column(name="home_ownership", nullable=true, columnDefinition="char(255)")
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
	
	@Column(name="other_income_nature_desc", nullable=true, columnDefinition="char(255)")
	private String otherIncomeNatureDesc;

	
	// Builder
	public static class Builder{
		
		// Required parameters
		private final Long profileId;
		private final boolean isBankEcsActivated;
		private final String employmentStatus;
		private final String aadharId;
		
		// Optional parameters
		private String currentEmployer = null;
		private String officeEmailAddress = null;
		private String memberRating = null;
		private String homeOwnership = null;
		private int annualIncome = -1;
		private Date currentEmploymentDate = null;
		private int empLengthInMonths = -1;
		private int officeStdCode = -1;
		private int officeContact = -1;
		private int rentAmount = -1;
		private int otherIncome = -1;
		private String other_income_nature = null;
		private String otherIncomeNatureDesc = null;
		
		public Builder(Long profileId, boolean isBankEcsActivated, String employmentStatus, String aadharId) {
			this.profileId = profileId;
			this.isBankEcsActivated = isBankEcsActivated;
			this.employmentStatus = employmentStatus;
			this.aadharId = aadharId;
		}

		public Builder setCurrentEmployer(String currentEmployer) {
			this.currentEmployer = currentEmployer;
			return this;
		}

		public Builder setOfficeEmailAddress(String officeEmailAddress) {
			this.officeEmailAddress = officeEmailAddress;
			return this;
		}

		public Builder setMemberRating(String memberRating) {
			this.memberRating = memberRating;
			return this;
		}

		public Builder setHomeOwnership(String homeOwnership) {
			this.homeOwnership = homeOwnership;
			return this;
		}

		public Builder setAnnualIncome(int annualIncome) {
			this.annualIncome = annualIncome;
			return this;
		}

		public Builder setCurrentEmploymentDate(Date currentEmploymentDate) {
			this.currentEmploymentDate = currentEmploymentDate;
			return this;
		}

		public Builder setEmpLengthInMonths(int empLengthInMonths) {
			this.empLengthInMonths = empLengthInMonths;
			return this;
		}

		public Builder setOfficeStdCode(int officeStdCode) {
			this.officeStdCode = officeStdCode;
			return this;
		}

		public Builder setOfficeContact(int officeContact) {
			this.officeContact = officeContact;
			return this;
		}

		public Builder setRentAmount(int rentAmount) {
			this.rentAmount = rentAmount;
			return this;
		}

		public Builder setOtherIncome(int otherIncome) {
			this.otherIncome = otherIncome;
			return this;
		}

		public Builder setOther_income_nature(String other_income_nature) {
			this.other_income_nature = other_income_nature;
			return this;
		}

		public Builder setOtherIncomeNatureDesc(String otherIncomeNatureDesc) {
			this.otherIncomeNatureDesc = otherIncomeNatureDesc;
			return this;
		}
		
		
	}


	
	public ProfileBorrower(Builder builder) {
		this.profileId = builder.profileId;
		this.isBankEcsActivated = builder.isBankEcsActivated;
		this.currentEmployer = builder.currentEmployer;
		this.officeEmailAddress = builder.officeEmailAddress;
		this.memberRating = builder.memberRating;
		this.employmentStatus = builder.employmentStatus;
		this.aadharId = builder.aadharId;
		this.homeOwnership = builder.homeOwnership;
		this.annualIncome = builder.annualIncome;
		this.currentEmploymentDate = builder.currentEmploymentDate;
		this.empLengthInMonths = builder.empLengthInMonths;
		this.officeStdCode = builder.officeStdCode;
		this.officeContact = builder.officeContact;
		this.rentAmount = builder.rentAmount;
		this.otherIncome = builder.otherIncome;
		this.other_income_nature = builder.other_income_nature;
		this.otherIncomeNatureDesc = builder.otherIncomeNatureDesc;
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
