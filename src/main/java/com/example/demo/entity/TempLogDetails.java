package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Id;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(value = "temperature_log_details")
@JsonIgnoreProperties(ignoreUnknown = true)

public class TempLogDetails {
	@Id
    private String id;
	private String vId;
	private String dId;
	private String assetDId;
	private String sId;
	private Integer time;
	private Double tmp;
	private  Date temperatureLogTime;
	private String temperatureLogid;
	private Integer activeTime;
	private String month;
	private String year;
	private String monthYear;
	@DateTimeFormat(style = "yyyy-MM-dd", iso = ISO.TIME)
	private String tempStringDate;
	private Integer storeId;
	private String storeName;
	private Integer badgeId;
	private String badgeName;
	private Integer statusId;
	private Integer yearOfManufacture;
	private Integer assetModelId;
	private Integer vendorId;
	private String vendorName;
	private Integer assetTypeId;
	private String assetTypeName;
	private Integer deviceTypeId;
	private Integer stateId;
	private Integer districtId;
	private String city;
	@LastModifiedDate
	private Date updatedOn;
	@CreatedDate
	private Date createdOn;
	private Boolean is_deleted;
	private Boolean is_timeCalculated;
}

