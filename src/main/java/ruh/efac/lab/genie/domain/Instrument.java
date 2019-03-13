/*
 * (C) Copyright 2010-2015 hSenid Mobile Solutions (Pvt) Limited.
 * All Rights Reserved.
 *
 * These materials are unpublished, proprietary, confidential source code of
 * hSenid Mobile Solutions (Pvt) Limited and constitute a TRADE SECRET
 * of hSenid Mobile Solutions (Pvt) Limited.
 *
 * hSenid Mobile Solutions (Pvt) Limited retains all title to and intellectual
 * property rights in these materials.
 */

package ruh.efac.lab.genie.domain;
/*
 * Created by GayanB
 */

import org.joda.time.DateTime;

import java.util.List;

public class Instrument {
    private long id;
    private String sno;
    private String assetCode;
    private String itemCode;
    private String category;
    private String name;
    private String brand;
    private String supplier;
    private double localInvoicePrice;
    private double totalCost;
    private String bills;
    private String afterSalesServices;
    private String inventoryType;
    private String inventoryRegistryPage;
    private DateTime inventoryRegisteredDate;
    private String inventoryNo;
    private String serialNo;
    private List<Comment> comments;

    public Instrument(long id, String sno, String itemCode, String category, String name, String brand) {
        this.id = id;
        this.sno = sno;
        this.itemCode = itemCode;
        this.category = category;
        this.name = name;
        this.brand = brand;
    }

    void setId(int id) {
        this.id = id;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public void setAssetCode(String assetCode) {
        this.assetCode = assetCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public void setLocalInvoicePrice(double localInvoicePrice) {
        this.localInvoicePrice = localInvoicePrice;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public void setBills(String bills) {
        this.bills = bills;
    }

    public void setAfterSalesServices(String afterSalesServices) {
        this.afterSalesServices = afterSalesServices;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public void setInventoryRegistryPage(String inventoryRegistryPage) {
        this.inventoryRegistryPage = inventoryRegistryPage;
    }

    public void setInventoryRegisteredDate(DateTime inventoryRegisteredDate) {
        this.inventoryRegisteredDate = inventoryRegisteredDate;
    }

    public void setInventoryNo(String inventoryNo) {
        this.inventoryNo = inventoryNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public long getId() {
        return id;
    }

    public String getSno() {
        return sno;
    }

    public String getAssetCode() {
        return assetCode;
    }

    public String getItemCode() {
        return itemCode;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getSupplier() {
        return supplier;
    }

    public double getLocalInvoicePrice() {
        return localInvoicePrice;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public String getBills() {
        return bills;
    }

    public String getAfterSalesServices() {
        return afterSalesServices;
    }

    public String getInventoryType() {
        return inventoryType;
    }

    public String getInventoryRegistryPage() {
        return inventoryRegistryPage;
    }

    public DateTime getInventoryRegisteredDate() {
        return inventoryRegisteredDate;
    }

    public String getInventoryNo() {
        return inventoryNo;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "id=" + id +
                ", sno='" + sno + '\'' +
                ", assetCode='" + assetCode + '\'' +
                ", itemCode='" + itemCode + '\'' +
                ", category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", supplier='" + supplier + '\'' +
                ", localInvoicePrice=" + localInvoicePrice +
                ", totalCost=" + totalCost +
                ", bills='" + bills + '\'' +
                ", afterSalesServices='" + afterSalesServices + '\'' +
                ", inventoryType='" + inventoryType + '\'' +
                ", inventoryRegistryPage='" + inventoryRegistryPage + '\'' +
                ", inventoryRegisteredDate=" + inventoryRegisteredDate +
                ", inventoryNo='" + inventoryNo + '\'' +
                ", serialNo='" + serialNo + '\'' +
                ", comments=" + comments +
                '}';
    }
}
