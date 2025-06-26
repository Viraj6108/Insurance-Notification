package com.notification.mapper;

import java.util.HashMap;
import java.util.Map;

import com.notification.entity.Policy;

public class Mapper {

	public Map<String,Object> toMap(Policy policy)
	{
		Map<String,Object>data = new HashMap<>();
		data.put("vehicleNumber", policy.getVehicleNumber());
		data.put("registrationState", policy.getRegistrationState());
		data.put("manufacturer", policy.getManufacturer());
		data.put("model", policy.getModel());
		data.put("yearOfManufacture", policy.getYearOfManufacture());
		data.put("engineNumber", policy.getEngineNumber());
		data.put("chassisNumber", policy.getChassisNumber());
		data.put("engineCapacity", policy.getEngineCapacity());
		data.put("showroomPrice", policy.getShowroomPrice());
		
		data.put("coverageType", policy.getCoverageType());
		data.put("sumInsured", policy.getSumInsured());
		
		data.put("policyNumber", policy.getPolicyNumber());
		data.put("startDate", policy.getStartDate());
		data.put("endDate", policy.getEndDate());
		data.put("policyStatus", policy.getPolicyStatus());
		
		data.put("premiumAmount", policy.getPremiumAmount());
		data.put("paymentStatus", policy.getPaymentStatus());
		
		data.put("createdAt", policy.getCreatedAt());
		data.put("updatedAt", policy.getUpdatedAt());
		
		data.put("nFirstName", policy.getnFirstName());
		data.put("nLastName", policy.getnLastName());
		data.put("nDOB", policy.getnDOB());
		data.put("nAddress", policy.getnAddress());
		data.put("nAadharNumber", policy.getnAadharNumber());
		data.put("nRelation", policy.getnRelation());
		
		return data;
		
	}
}
