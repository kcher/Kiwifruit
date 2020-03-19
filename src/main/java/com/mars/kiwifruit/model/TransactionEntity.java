package com.mars.kiwifruit.model;

import lombok.Data;
import org.springframework.data.jpa.domain.AbstractAuditable;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
@Entity
@Table(name = "tt_transaction", schema = "public", catalog = "kiwifruit")
public class TransactionEntity {

    @Id
    @Column(name = "txn_id")
    private Long txnId;

    @Basic
    @Column(name = "txn_num")
    private String txnNum;

    @Basic
    @Column(name = "order_num")
    private String orderNum;

    @Basic
    @Column(name = "txn_time")
    private LocalDateTime txnTime;

    @Basic
    @Column(name = "pay_time")
    private LocalDateTime payTime;

    @Basic
    @Column(name = "modify_time")
    private LocalDateTime modifyTime;

    @Basic
    @Column(name = "txn_source")
    private String txnSource;

    @Basic
    @Column(name = "txn_type")
    private String txnType;

    @Basic
    @Column(name = "business_name")
    private String businessName;

    @Basic
    @Column(name = "product_name")
    private String productName;

    @Basic
    @Column(name = "amount")
    private BigDecimal amount;

    @Basic
    @Column(name = "payment_type")
    private String paymentType;

    @Basic
    @Column(name = "txn_status")
    private String txnStatus;

    @Basic
    @Column(name = "service_fee")
    private BigDecimal serviceFee;

    @Basic
    @Column(name = "refund")
    private BigDecimal refund;

    @Basic
    @Column(name = "remark")
    private String remark;

    @Basic
    @Column(name = "fund_status")
    private String fundStatus;

    @Column(name = "create_time")
    private LocalDateTime createTime;

    @Column(name = "update_time")
    private LocalDateTime updateTime;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionEntity that = (TransactionEntity) o;
        return Objects.equals(txnId, that.txnId) &&
                Objects.equals(txnNum, that.txnNum) &&
                Objects.equals(orderNum, that.orderNum) &&
                Objects.equals(txnTime, that.txnTime) &&
                Objects.equals(payTime, that.payTime) &&
                Objects.equals(modifyTime, that.modifyTime) &&
                Objects.equals(txnSource, that.txnSource) &&
                Objects.equals(txnType, that.txnType) &&
                Objects.equals(businessName, that.businessName) &&
                Objects.equals(productName, that.productName) &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(paymentType, that.paymentType) &&
                Objects.equals(txnStatus, that.txnStatus) &&
                Objects.equals(serviceFee, that.serviceFee) &&
                Objects.equals(refund, that.refund) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(fundStatus, that.fundStatus) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(txnId, txnNum, orderNum, txnTime, payTime, modifyTime, txnSource, txnType, businessName, productName, amount, paymentType, txnStatus, serviceFee, refund, remark, fundStatus, createTime, updateTime);
    }
}
