package com.ytec.mdm.domain.biz;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 * @describtion: autogenerated by lhqheli's Tools
 * 客户风险特性评估表 OCRM_F_FIN_CUST_RISK
 * @author : lhqheli (email: lhqheli@gmail.com)
 * @date : 2014-06-19 17:36:10
 */
@Entity
@Table(name="OCRM_F_FIN_CUST_RISK")
public class OcrmFFinCustRisk implements Serializable {

    @Id
   //  注意问卷ID 由对方提供不自动生成 SequenceGenerator(name="OCRM_F_FIN_CUST_RISK_CUST_Q_ID_GENERATOR", sequenceName="SEQUENCE_OFFIN_CUST_RISK", allocationSize=1)
   // GeneratedValue(strategy=GenerationType.SEQUENCE, generator="OCRM_F_FIN_CUST_RISK_CUST_Q_ID_GENERATOR")
    @Column(name="CUST_Q_ID")
    private Long custQId;

    @Column(name="CUST_NAME")
    private String custName;

    @Column(name="CUST_ID")
    private String custId;

    @Column(name="CUST_RISK_CHARACT")
    private String custRiskCharact;

    @Column(name="EVALUATE_NAME")
    private String evaluateName;

    @Temporal(TemporalType.DATE)
    @Column(name="EVALUATE_DATE")
    private Date evaluateDate;

    @Column(name="INDAGETE_QA_SCORING")
    private BigDecimal indageteQaScoring;
    
    @Column(name="SCORING")
    private BigDecimal scoring;
    
   

    public BigDecimal getScoring() {
		return scoring;
	}

	public void setScoring(BigDecimal scoring) {
		this.scoring = scoring;
	}

	@Column(name="Q_STAT")
    private String qStat;

    @Column(name="CUST_OTHER_INFO")
    private String custOtherInfo;

    @Column(name="ADJUSTMENT_VALUE")
    private BigDecimal adjustmentValue;

    @Column(name="RISK_CHARACT_TYPE")
    private String riskCharactType;

    @Column(name="EVALUATE_RELAT_TELEPHONE")
    private String evaluateRelatTelephone;

    @Column(name="EVALUATE_INST")
    private String evaluateInst;

    @Column(name="HIS_FLAG")
    private String hisFlag;

    @Temporal(TemporalType.DATE)
    @Column(name="LIMIT_DATE")
    private Date limitDate;
    
    @Column(name="RISK_BEAR_ABILITY")
    private String riskBearAbility;
    
    @Column(name="EVALUATE_SOURCE")
    private String evaluateSource;
    
    public String getEvaluateSource() {
		return evaluateSource;
	}

	public void setEvaluateSource(String evaluateSource) {
		this.evaluateSource = evaluateSource;
	}

	public String getRiskBearAbility() {
		return riskBearAbility;
	}

	public void setRiskBearAbility(String riskBearAbility) {
		this.riskBearAbility = riskBearAbility;
	}

	public Long getCustQId(){
        return this.custQId;
    }

    public void setCustQId(Long custQId){
        this.custQId = custQId;
    }

    public String getCustName(){
        return this.custName;
    }

    public void setCustName(String custName){
        this.custName = custName;
    }

    public String getCustId(){
        return this.custId;
    }

    public void setCustId(String custId){
        this.custId = custId;
    }

    public String getCustRiskCharact(){
        return this.custRiskCharact;
    }

    public void setCustRiskCharact(String custRiskCharact){
        this.custRiskCharact = custRiskCharact;
    }

    public String getEvaluateName(){
        return this.evaluateName;
    }

    public void setEvaluateName(String evaluateName){
        this.evaluateName = evaluateName;
    }

    public Date getEvaluateDate(){
        return this.evaluateDate;
    }

    public void setEvaluateDate(Date evaluateDate){
        this.evaluateDate = evaluateDate;
    }

    public BigDecimal getIndageteQaScoring(){
        return this.indageteQaScoring;
    }

    public void setIndageteQaScoring(BigDecimal indageteQaScoring){
        this.indageteQaScoring = indageteQaScoring;
    }

    public String getQStat(){
        return this.qStat;
    }

    public void setQStat(String qStat){
        this.qStat = qStat;
    }

    public String getCustOtherInfo(){
        return this.custOtherInfo;
    }

    public void setCustOtherInfo(String custOtherInfo){
        this.custOtherInfo = custOtherInfo;
    }

    public BigDecimal getAdjustmentValue(){
        return this.adjustmentValue;
    }

    public void setAdjustmentValue(BigDecimal adjustmentValue){
        this.adjustmentValue = adjustmentValue;
    }

    public String getRiskCharactType(){
        return this.riskCharactType;
    }

    public void setRiskCharactType(String riskCharactType){
        this.riskCharactType = riskCharactType;
    }

    public String getEvaluateRelatTelephone(){
        return this.evaluateRelatTelephone;
    }

    public void setEvaluateRelatTelephone(String evaluateRelatTelephone){
        this.evaluateRelatTelephone = evaluateRelatTelephone;
    }

    public String getEvaluateInst(){
        return this.evaluateInst;
    }

    public void setEvaluateInst(String evaluateInst){
        this.evaluateInst = evaluateInst;
    }

    public String getHisFlag(){
        return this.hisFlag;
    }

    public void setHisFlag(String hisFlag){
        this.hisFlag = hisFlag;
    }

    public Date getLimitDate(){
        return this.limitDate;
    }

    public void setLimitDate(Date limitDate){
        this.limitDate = limitDate;
    }


}
