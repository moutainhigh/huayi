package com.yuchengtech.bcrm.custmanager.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * 指标事实表
 * The persistent class for the ACRM_A_TARGET_FACT database table.
 * 
 */
@Entity
@Table(name="ACRM_A_TARGET_FACT")
public class AcrmATargetFact implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="INDEX_ID")
	private String indexId;
	
	@Column(name="CUST_ID")
	private String custId;

    @Temporal( TemporalType.DATE)
	@Column(name="ETL_DATE")
	private Date etlDate;

	@Column(name="HIGH_FLAG")
	private String highFlag;

	@Column(name="INDEX_CODE")
	private String indexCode;

	@Column(name="INDEX_VALUE")
	private BigDecimal indexValue;

	@Column(name="ORG_ID")
	private String orgId;

    public AcrmATargetFact() {
    }

	public String getCustId() {
		return this.custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public Date getEtlDate() {
		return this.etlDate;
	}

	public void setEtlDate(Date etlDate) {
		this.etlDate = etlDate;
	}

	public String getHighFlag() {
		return this.highFlag;
	}

	public void setHighFlag(String highFlag) {
		this.highFlag = highFlag;
	}

	public String getIndexCode() {
		return this.indexCode;
	}

	public void setIndexCode(String indexCode) {
		this.indexCode = indexCode;
	}

	public String getIndexId() {
		return this.indexId;
	}

	public void setIndexId(String indexId) {
		this.indexId = indexId;
	}

	public BigDecimal getIndexValue() {
		return this.indexValue;
	}

	public void setIndexValue(BigDecimal indexValue) {
		this.indexValue = indexValue;
	}

	public String getOrgId() {
		return this.orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

}