package com.selrain.model;


import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by user on 2016/8/19.
 */
public class Distributor implements Serializable {
	private static final long serialVersionUID = -1755561608212907313L;
	private Long id;
    private String sellerId;//���۾�����
    private String partnerId;//������ID
    private String partnerName;//����������
    private String partnerKey;//������key
    private String partnerType;//����������
    private String accountId;//�ʽ��˻�ID
    private String groupId;//����
    private Timestamp contractStartTime;//��ͬ��ʼʱ��
    private Timestamp contractEndTime;//��ͬ����ʱ��
    private Long annualquota;//�걣���
    private String businessMobile;//�̼ҶԽ����ֻ�
    private String businessName;//�̼ҶԽ�����
    private String sellerMobile;//���۾����ֻ�
    private String sellerName;//���۾���
    private Long technologyFee;//���������
    private Long maintainFee;//ά����
    private String runSub;//����
    private String status;//״̬ 0 ��Ч 1 Ԥ�� 2 ���� 3 ɾ��
    private Timestamp addTime;//���ʱ��
    private Timestamp updateTime;//����ʱ��
    private Timestamp synchTime;//ͬ��ʱ��

    private Long balance;//Ԥ�������
    private Long recharge;//��ʷ��ֵ�ܶ�
    private Long consume;//�����ܶ�
    private Long totalRefund;//�˿��ܶ�
    private Long totalTechnologyFee;//������ܶ�
    private Long totalMaintainFee;//ά�����ܶ�
    private Long totalShare;//�����ܶ�
    private String advanceCharge;//��ֵ����{'m1':50,'m2':100}��λΪ��
    private String taxatfee;//˰�ѱ���5 Ϊ5%
    
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
