package com.selrain.model;


import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by user on 2016/8/19.
 */
public class Distributor implements Serializable {
	private static final long serialVersionUID = -1755561608212907313L;
	private Long id;
    private String sellerId;//销售经理编号
    private String partnerId;//合作商ID
    private String partnerName;//合作商名称
    private String partnerKey;//合作商key
    private String partnerType;//合作商类型
    private String accountId;//资金账户ID
    private String groupId;//分组
    private Timestamp contractStartTime;//合同开始时间
    private Timestamp contractEndTime;//合同结束时间
    private Long annualquota;//年保额度
    private String businessMobile;//商家对接人手机
    private String businessName;//商家对接人名
    private String sellerMobile;//销售经理手机
    private String sellerName;//销售经理
    private Long technologyFee;//技术服务费
    private Long maintainFee;//维护费
    private String runSub;//分润
    private String status;//状态 0 有效 1 预警 2 锁定 3 删除
    private Timestamp addTime;//添加时间
    private Timestamp updateTime;//更新时间
    private Timestamp synchTime;//同步时间

    private Long balance;//预付款余额
    private Long recharge;//历史充值总额
    private Long consume;//消费总额
    private Long totalRefund;//退款总额
    private Long totalTechnologyFee;//服务费总额
    private Long totalMaintainFee;//维护费总额
    private Long totalShare;//分润总额
    private String advanceCharge;//充值配置{'m1':50,'m2':100}单位为万
    private String taxatfee;//税费比率5 为5%
    
    public Distributor(String partnerName,String partnerId,Long balance){
    	this.partnerName=partnerName;
    	this.partnerId=partnerId;
    	this.balance=balance;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public String getPartnerKey() {
        return partnerKey;
    }

    public void setPartnerKey(String partnerKey) {
        this.partnerKey = partnerKey;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Timestamp getContractStartTime() {
        return contractStartTime;
    }

    public void setContractStartTime(Timestamp contractStartTime) {
        this.contractStartTime = contractStartTime;
    }

    public Timestamp getContractEndTime() {
        return contractEndTime;
    }

    public void setContractEndTime(Timestamp contractEndTime) {
        this.contractEndTime = contractEndTime;
    }

    public Long getAnnualquota() {
        return annualquota;
    }

    public void setAnnualquota(Long annualquota) {
        this.annualquota = annualquota;
    }

    public String getBusinessMobile() {
        return businessMobile;
    }

    public void setBusinessMobile(String businessMobile) {
        this.businessMobile = businessMobile;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getSellerMobile() {
        return sellerMobile;
    }

    public void setSellerMobile(String sellerMobile) {
        this.sellerMobile = sellerMobile;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Long getTechnologyFee() {
        return technologyFee;
    }

    public void setTechnologyFee(Long technologyFee) {
        this.technologyFee = technologyFee;
    }

    public Long getMaintainFee() {
        return maintainFee;
    }

    public void setMaintainFee(Long maintainFee) {
        this.maintainFee = maintainFee;
    }

    public String getRunSub() {
        return runSub;
    }

    public void setRunSub(String runSub) {
        this.runSub = runSub;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getAddTime() {
        return addTime;
    }

    public void setAddTime(Timestamp addTime) {
        this.addTime = addTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Timestamp getSynchTime() {
        return synchTime;
    }

    public void setSynchTime(Timestamp synchTime) {
        this.synchTime = synchTime;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public Long getRecharge() {
        return recharge;
    }

    public void setRecharge(Long recharge) {
        this.recharge = recharge;
    }

    public Long getConsume() {
        return consume;
    }

    public void setConsume(Long consume) {
        this.consume = consume;
    }

    public Long getTotalRefund() {
        return totalRefund;
    }

    public void setTotalRefund(Long totalRefund) {
        this.totalRefund = totalRefund;
    }

    public Long getTotalTechnologyFee() {
        return totalTechnologyFee;
    }

    public void setTotalTechnologyFee(Long totalTechnologyFee) {
        this.totalTechnologyFee = totalTechnologyFee;
    }

    public Long getTotalMaintainFee() {
        return totalMaintainFee;
    }

    public void setTotalMaintainFee(Long totalMaintainFee) {
        this.totalMaintainFee = totalMaintainFee;
    }

    public Long getTotalShare() {
        return totalShare;
    }

    public void setTotalShare(Long totalShare) {
        this.totalShare = totalShare;
    }

    public String getPartnerType() {
        return partnerType;
    }

    public void setPartnerType(String partnerType) {
        this.partnerType = partnerType;
    }

    public String getAdvanceCharge() {
        return advanceCharge;
    }

    public void setAdvanceCharge(String advanceCharge) {
        this.advanceCharge = advanceCharge;
    }

    public String getTaxatfee() {
        return taxatfee;
    }

    public void setTaxatfee(String taxatfee) {
        this.taxatfee = taxatfee;
    }
}
