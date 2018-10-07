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

public class Instrument {
    private int id;
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
    private String inventryNo;
    private String serialNo;

    public Instrument(int id, String sno, String itemCode, String category, String name, String brand) {
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

    void setSno(String sno) {
        this.sno = sno;
    }

    void setAssetCode(String assetCode) {
        this.assetCode = assetCode;
    }

    void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    void setCategory(String category) {
        this.category = category;
    }

    void setName(String name) {
        this.name = name;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    void setLocalInvoicePrice(double localInvoicePrice) {
        this.localInvoicePrice = localInvoicePrice;
    }

    void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    void setBills(String bills) {
        this.bills = bills;
    }

    void setAfterSalesServices(String afterSalesServices) {
        this.afterSalesServices = afterSalesServices;
    }

    void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    void setInventoryRegistryPage(String inventoryRegistryPage) {
        this.inventoryRegistryPage = inventoryRegistryPage;
    }

    void setInventoryRegisteredDate(DateTime inventoryRegisteredDate) {
        this.inventoryRegisteredDate = inventoryRegisteredDate;
    }

    void setInventryNo(String inventryNo) {
        this.inventryNo = inventryNo;
    }

    void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public int getId() {
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

    public String getInventryNo() {
        return inventryNo;
    }

    public String getSerialNo() {
        return serialNo;
    }
}
