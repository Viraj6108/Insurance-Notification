package com.notification.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Policy {

	private UUID policyId;
	private UUID userId;
	private UUID quoteID;
    private String vehicleNumber;
    private String registrationState;

    //Vehicle details
    private String manufacturer;
    private String model;
    private int yearOfManufacture;
    private String engineNumber;
    private String chassisNumber;
    private int engineCapacity;
    private double showroomPrice;

    //    coverage
    private String coverageType;
    private double sumInsured;

//    policy Details
    private String policyNumber;
    private LocalDate startDate;
    private LocalDate endDate;
    private String policyStatus;

    //Premium
    private double premiumAmount;
    private String paymentStatus;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    
    private String nFirstName;
	private String nLastName;
	private String nDOB;
	private String nAddress;
	private String nAadharNumber;
	private String nRelation;
	
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getRegistrationState() {
		return registrationState;
	}
	public void setRegistrationState(String registrationState) {
		this.registrationState = registrationState;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYearOfManufacture() {
		return yearOfManufacture;
	}
	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}
	public String getEngineNumber() {
		return engineNumber;
	}
	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}
	public String getChassisNumber() {
		return chassisNumber;
	}
	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}
	public int getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	public double getShowroomPrice() {
		return showroomPrice;
	}
	public void setShowroomPrice(double showroomPrice) {
		this.showroomPrice = showroomPrice;
	}
	public String getCoverageType() {
		return coverageType;
	}
	public void setCoverageType(String coverageType) {
		this.coverageType = coverageType;
	}
	public double getSumInsured() {
		return sumInsured;
	}
	public void setSumInsured(double sumInsured) {
		this.sumInsured = sumInsured;
	}
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public String getPolicyStatus() {
		return policyStatus;
	}
	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}
	public double getPremiumAmount() {
		return premiumAmount;
	}
	public void setPremiumAmount(double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getnFirstName() {
		return nFirstName;
	}
	public void setnFirstName(String nFirstName) {
		this.nFirstName = nFirstName;
	}
	public String getnLastName() {
		return nLastName;
	}
	public void setnLastName(String nLastName) {
		this.nLastName = nLastName;
	}
	public String getnDOB() {
		return nDOB;
	}
	public void setnDOB(String nDOB) {
		this.nDOB = nDOB;
	}
	public String getnAddress() {
		return nAddress;
	}
	public void setnAddress(String nAddress) {
		this.nAddress = nAddress;
	}
	public String getnAadharNumber() {
		return nAadharNumber;
	}
	public void setnAadharNumber(String nAadharNumber) {
		this.nAadharNumber = nAadharNumber;
	}
	public String getnRelation() {
		return nRelation;
	}
	public void setnRelation(String nRelation) {
		this.nRelation = nRelation;
	}
	public UUID getPolicyId() {
		return policyId;
	}
	public void setPolicyId(UUID policyId) {
		this.policyId = policyId;
	}
	public UUID getUserId() {
		return userId;
	}
	public void setUserId(UUID userId) {
		this.userId = userId;
	}
	
	
	
}
