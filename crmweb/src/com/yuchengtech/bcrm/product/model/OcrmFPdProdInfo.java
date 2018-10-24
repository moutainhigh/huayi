package com.yuchengtech.bcrm.product.model;

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
 * @describtion: autogenerated by lhqheli's Tools
 *
 * @author : lhqheli (email: lhqheli@gmail.com)
 * @date : 2014-04-30 10:21:21
 */
@Entity
@Table(name="OCRM_F_PD_PROD_INFO")
public class OcrmFPdProdInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
//    @SequenceGenerator(name="OCRM_F_PD_PROD_INFO_GENERATOR", sequenceName="ID_SEQUENCE", allocationSize=1)
//    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="OCRM_F_PD_PROD_INFO_GENERATOR")
    @Column(name="PRODUCT_ID")
    private String productId;

    @Column(name="PROD_NAME")
    private String prodName;

    @Column(name="CATL_CODE")
    private BigDecimal catlCode;

    @Column(name="TJKJ")
    private String tjkj;

    @Column(name="PROD_TYPE_ID")
    private BigDecimal prodTypeId;

    @Column(name="PROD_DESC")
    private String prodDesc;

    @Column(name="DISPLAY_FLAG")
    private String displayFlag;

    @Temporal(TemporalType.DATE)
    @Column(name="PROD_START_DATE")
    private Date prodStartDate;

    @Temporal(TemporalType.DATE)
    @Column(name="PROD_END_DATE")
    private Date prodEndDate;

    @Column(name="PROD_STATE")
    private String prodState;

    @Column(name="PROD_CREATOR")
    private String prodCreator;

    @Temporal(TemporalType.DATE)
    @Column(name="CREATE_DATE")
    private Date createDate;

    @Column(name="PROD_SHOW_URL")
    private String prodShowUrl;

    @Column(name="PROD_QUERY_URL")
    private String prodQueryUrl;

    @Column(name="PROD_SEQ")
    private String prodSeq;

    @Column(name="PROD_DEPT")
    private String prodDept;

    @Column(name="RATE")
    private String rate;

    @Column(name="COST_RATE")
    private String costRate;

    @Column(name="LIMIT_TIME")
    private String limitTime;

    @Column(name="PROD_CHARACT")
    private String prodCharact;

    @Column(name="OBJ_CUST_DISC")
    private String objCustDisc;

    @Column(name="DANGER_DISC")
    private String dangerDisc;

    @Column(name="CHANNEL_DISC")
    private String channelDisc;

    @Column(name="ASSURE_DISC")
    private String assureDisc;

    @Column(name="PROD_SWITCH")
    private String prodSwitch;

    @Column(name="RISK_LEVEL")
    private String riskLevel;

    @Column(name="PROD_BUS_ID")
    private String prodBusId;
    
    @Column(name="OTHER_INFO")
    private String otherInfo;
    
    @Column(name="TYPE_FIT_CUST")
    private String typeFitCust;
    
    
    @Column(name="SPECIAL_INFO")
    private String specialInfo;

    
    @Column(name="PROD_FITCUST_INFO")
    private String prodFitcustInfo;

    public String getProdFitcustInfo() {
		return prodFitcustInfo;
	}

	public void setProdFitcustInfo(String prodFitcustInfo) {
		this.prodFitcustInfo = prodFitcustInfo;
	}

	public String getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}

	public String getTypeFitCust() {
		return typeFitCust;
	}

	public void setTypeFitCust(String typeFitCust) {
		this.typeFitCust = typeFitCust;
	}

	public String getSpecialInfo() {
		return specialInfo;
	}

	public void setSpecialInfo(String specialInfo) {
		this.specialInfo = specialInfo;
	}

	public String getProductId(){
        return this.productId;
    }

    public void setProductId(String productId){
        this.productId = productId;
    }

    public String getProdName(){
        return this.prodName;
    }

    public void setProdName(String prodName){
        this.prodName = prodName;
    }

    public BigDecimal getCatlCode(){
        return this.catlCode;
    }

    public void setCatlCode(BigDecimal catlCode){
        this.catlCode = catlCode;
    }

    public String getTjkj(){
        return this.tjkj;
    }

    public void setTjkj(String tjkj){
        this.tjkj = tjkj;
    }

    public BigDecimal getProdTypeId(){
        return this.prodTypeId;
    }

    public void setProdTypeId(BigDecimal prodTypeId){
        this.prodTypeId = prodTypeId;
    }

    public String getProdDesc(){
        return this.prodDesc;
    }

    public void setProdDesc(String prodDesc){
        this.prodDesc = prodDesc;
    }

    public String getDisplayFlag(){
        return this.displayFlag;
    }

    public void setDisplayFlag(String displayFlag){
        this.displayFlag = displayFlag;
    }

    public Date getProdStartDate(){
        return this.prodStartDate;
    }

    public void setProdStartDate(Date prodStartDate){
        this.prodStartDate = prodStartDate;
    }

    public Date getProdEndDate(){
        return this.prodEndDate;
    }

    public void setProdEndDate(Date prodEndDate){
        this.prodEndDate = prodEndDate;
    }

    public String getProdState(){
        return this.prodState;
    }

    public void setProdState(String prodState){
        this.prodState = prodState;
    }

    public String getProdCreator(){
        return this.prodCreator;
    }

    public void setProdCreator(String prodCreator){
        this.prodCreator = prodCreator;
    }

    public Date getCreateDate(){
        return this.createDate;
    }

    public void setCreateDate(Date createDate){
        this.createDate = createDate;
    }

    public String getProdShowUrl(){
        return this.prodShowUrl;
    }

    public void setProdShowUrl(String prodShowUrl){
        this.prodShowUrl = prodShowUrl;
    }

    public String getProdQueryUrl(){
        return this.prodQueryUrl;
    }

    public void setProdQueryUrl(String prodQueryUrl){
        this.prodQueryUrl = prodQueryUrl;
    }

    public String getProdSeq(){
        return this.prodSeq;
    }

    public void setProdSeq(String prodSeq){
        this.prodSeq = prodSeq;
    }

    public String getProdDept(){
        return this.prodDept;
    }

    public void setProdDept(String prodDept){
        this.prodDept = prodDept;
    }

    public String getRate(){
        return this.rate;
    }

    public void setRate(String rate){
        this.rate = rate;
    }

    public String getCostRate(){
        return this.costRate;
    }

    public void setCostRate(String costRate){
        this.costRate = costRate;
    }

    public String getLimitTime(){
        return this.limitTime;
    }

    public void setLimitTime(String limitTime){
        this.limitTime = limitTime;
    }

    public String getProdCharact(){
        return this.prodCharact;
    }

    public void setProdCharact(String prodCharact){
        this.prodCharact = prodCharact;
    }

    public String getObjCustDisc(){
        return this.objCustDisc;
    }

    public void setObjCustDisc(String objCustDisc){
        this.objCustDisc = objCustDisc;
    }

    public String getDangerDisc(){
        return this.dangerDisc;
    }

    public void setDangerDisc(String dangerDisc){
        this.dangerDisc = dangerDisc;
    }

    public String getChannelDisc(){
        return this.channelDisc;
    }

    public void setChannelDisc(String channelDisc){
        this.channelDisc = channelDisc;
    }

    public String getAssureDisc(){
        return this.assureDisc;
    }

    public void setAssureDisc(String assureDisc){
        this.assureDisc = assureDisc;
    }

    public String getProdSwitch(){
        return this.prodSwitch;
    }

    public void setProdSwitch(String prodSwitch){
        this.prodSwitch = prodSwitch;
    }

    public String getRiskLevel(){
        return this.riskLevel;
    }

    public void setRiskLevel(String riskLevel){
        this.riskLevel = riskLevel;
    }

    public String getProdBusId(){
        return this.prodBusId;
    }

    public void setProdBusId(String prodBusId){
        this.prodBusId = prodBusId;
    }


}