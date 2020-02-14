package com.jsh.erp.datasource.entities;

import java.math.BigDecimal;

public class Material {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material.Id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material.CategoryId
     *
     * @mbggenerated
     */
    private Long categoryid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material.Name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material.Mfrs
     *
     * @mbggenerated
     */
    private String mfrs;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material.Packing
     *
     * @mbggenerated
     */
    private BigDecimal packing;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material.SafetyStock
     *
     * @mbggenerated
     */
    private BigDecimal safetystock;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material.Model
     *
     * @mbggenerated
     */
    private String model;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material.Standard
     *
     * @mbggenerated
     */
    private String standard;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material.Color
     *
     * @mbggenerated
     */
    private String color;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material.Unit
     *
     * @mbggenerated
     */
    private String unit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material.Remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material.RetailPrice
     *
     * @mbggenerated
     */
    private BigDecimal retailprice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material.LowPrice
     *
     * @mbggenerated
     */
    private BigDecimal lowprice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material.PresetPriceOne
     *
     * @mbggenerated
     */
    private BigDecimal presetpriceone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material.PresetPriceTwo
     *
     * @mbggenerated
     */
    private BigDecimal presetpricetwo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material.UnitId
     *
     * @mbggenerated
     */
    private Long unitid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material.FirstOutUnit
     *
     * @mbggenerated
     */
    private String firstoutunit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material.FirstInUnit
     *
     * @mbggenerated
     */
    private String firstinunit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material.PriceStrategy
     *
     * @mbggenerated
     */
    private String pricestrategy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material.Enabled
     *
     * @mbggenerated
     */
    private Boolean enabled;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material.OtherField1
     *
     * @mbggenerated
     */
    private String otherfield1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material.OtherField2
     *
     * @mbggenerated
     */
    private String otherfield2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material.OtherField3
     *
     * @mbggenerated
     */
    private String otherfield3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material.enableSerialNumber
     *
     * @mbggenerated
     */
    private String enableserialnumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material.tenant_id
     *
     * @mbggenerated
     */
    private Long tenantId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_material.delete_Flag
     *
     * @mbggenerated
     */
    private String deleteFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material.Id
     *
     * @return the value of jsh_material.Id
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material.Id
     *
     * @param id the value for jsh_material.Id
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material.CategoryId
     *
     * @return the value of jsh_material.CategoryId
     * @mbggenerated
     */
    public Long getCategoryid() {
        return categoryid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material.CategoryId
     *
     * @param categoryid the value for jsh_material.CategoryId
     * @mbggenerated
     */
    public void setCategoryid(Long categoryid) {
        this.categoryid = categoryid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material.Name
     *
     * @return the value of jsh_material.Name
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material.Name
     *
     * @param name the value for jsh_material.Name
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material.Mfrs
     *
     * @return the value of jsh_material.Mfrs
     * @mbggenerated
     */
    public String getMfrs() {
        return mfrs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material.Mfrs
     *
     * @param mfrs the value for jsh_material.Mfrs
     * @mbggenerated
     */
    public void setMfrs(String mfrs) {
        this.mfrs = mfrs == null ? null : mfrs.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material.Packing
     *
     * @return the value of jsh_material.Packing
     * @mbggenerated
     */
    public BigDecimal getPacking() {
        return packing;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material.Packing
     *
     * @param packing the value for jsh_material.Packing
     * @mbggenerated
     */
    public void setPacking(BigDecimal packing) {
        this.packing = packing;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material.SafetyStock
     *
     * @return the value of jsh_material.SafetyStock
     * @mbggenerated
     */
    public BigDecimal getSafetystock() {
        return safetystock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material.SafetyStock
     *
     * @param safetystock the value for jsh_material.SafetyStock
     * @mbggenerated
     */
    public void setSafetystock(BigDecimal safetystock) {
        this.safetystock = safetystock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material.Model
     *
     * @return the value of jsh_material.Model
     * @mbggenerated
     */
    public String getModel() {
        return model;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material.Model
     *
     * @param model the value for jsh_material.Model
     * @mbggenerated
     */
    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material.Standard
     *
     * @return the value of jsh_material.Standard
     * @mbggenerated
     */
    public String getStandard() {
        return standard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material.Standard
     *
     * @param standard the value for jsh_material.Standard
     * @mbggenerated
     */
    public void setStandard(String standard) {
        this.standard = standard == null ? null : standard.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material.Color
     *
     * @return the value of jsh_material.Color
     * @mbggenerated
     */
    public String getColor() {
        return color;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material.Color
     *
     * @param color the value for jsh_material.Color
     * @mbggenerated
     */
    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material.Unit
     *
     * @return the value of jsh_material.Unit
     * @mbggenerated
     */
    public String getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material.Unit
     *
     * @param unit the value for jsh_material.Unit
     * @mbggenerated
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material.Remark
     *
     * @return the value of jsh_material.Remark
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material.Remark
     *
     * @param remark the value for jsh_material.Remark
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material.RetailPrice
     *
     * @return the value of jsh_material.RetailPrice
     * @mbggenerated
     */
    public BigDecimal getRetailprice() {
        return retailprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material.RetailPrice
     *
     * @param retailprice the value for jsh_material.RetailPrice
     * @mbggenerated
     */
    public void setRetailprice(BigDecimal retailprice) {
        this.retailprice = retailprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material.LowPrice
     *
     * @return the value of jsh_material.LowPrice
     * @mbggenerated
     */
    public BigDecimal getLowprice() {
        return lowprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material.LowPrice
     *
     * @param lowprice the value for jsh_material.LowPrice
     * @mbggenerated
     */
    public void setLowprice(BigDecimal lowprice) {
        this.lowprice = lowprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material.PresetPriceOne
     *
     * @return the value of jsh_material.PresetPriceOne
     * @mbggenerated
     */
    public BigDecimal getPresetpriceone() {
        return presetpriceone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material.PresetPriceOne
     *
     * @param presetpriceone the value for jsh_material.PresetPriceOne
     * @mbggenerated
     */
    public void setPresetpriceone(BigDecimal presetpriceone) {
        this.presetpriceone = presetpriceone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material.PresetPriceTwo
     *
     * @return the value of jsh_material.PresetPriceTwo
     * @mbggenerated
     */
    public BigDecimal getPresetpricetwo() {
        return presetpricetwo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material.PresetPriceTwo
     *
     * @param presetpricetwo the value for jsh_material.PresetPriceTwo
     * @mbggenerated
     */
    public void setPresetpricetwo(BigDecimal presetpricetwo) {
        this.presetpricetwo = presetpricetwo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material.UnitId
     *
     * @return the value of jsh_material.UnitId
     * @mbggenerated
     */
    public Long getUnitid() {
        return unitid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material.UnitId
     *
     * @param unitid the value for jsh_material.UnitId
     * @mbggenerated
     */
    public void setUnitid(Long unitid) {
        this.unitid = unitid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material.FirstOutUnit
     *
     * @return the value of jsh_material.FirstOutUnit
     * @mbggenerated
     */
    public String getFirstoutunit() {
        return firstoutunit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material.FirstOutUnit
     *
     * @param firstoutunit the value for jsh_material.FirstOutUnit
     * @mbggenerated
     */
    public void setFirstoutunit(String firstoutunit) {
        this.firstoutunit = firstoutunit == null ? null : firstoutunit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material.FirstInUnit
     *
     * @return the value of jsh_material.FirstInUnit
     * @mbggenerated
     */
    public String getFirstinunit() {
        return firstinunit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material.FirstInUnit
     *
     * @param firstinunit the value for jsh_material.FirstInUnit
     * @mbggenerated
     */
    public void setFirstinunit(String firstinunit) {
        this.firstinunit = firstinunit == null ? null : firstinunit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material.PriceStrategy
     *
     * @return the value of jsh_material.PriceStrategy
     * @mbggenerated
     */
    public String getPricestrategy() {
        return pricestrategy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material.PriceStrategy
     *
     * @param pricestrategy the value for jsh_material.PriceStrategy
     * @mbggenerated
     */
    public void setPricestrategy(String pricestrategy) {
        this.pricestrategy = pricestrategy == null ? null : pricestrategy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material.Enabled
     *
     * @return the value of jsh_material.Enabled
     * @mbggenerated
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material.Enabled
     *
     * @param enabled the value for jsh_material.Enabled
     * @mbggenerated
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material.OtherField1
     *
     * @return the value of jsh_material.OtherField1
     * @mbggenerated
     */
    public String getOtherfield1() {
        return otherfield1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material.OtherField1
     *
     * @param otherfield1 the value for jsh_material.OtherField1
     * @mbggenerated
     */
    public void setOtherfield1(String otherfield1) {
        this.otherfield1 = otherfield1 == null ? null : otherfield1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material.OtherField2
     *
     * @return the value of jsh_material.OtherField2
     * @mbggenerated
     */
    public String getOtherfield2() {
        return otherfield2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material.OtherField2
     *
     * @param otherfield2 the value for jsh_material.OtherField2
     * @mbggenerated
     */
    public void setOtherfield2(String otherfield2) {
        this.otherfield2 = otherfield2 == null ? null : otherfield2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material.OtherField3
     *
     * @return the value of jsh_material.OtherField3
     * @mbggenerated
     */
    public String getOtherfield3() {
        return otherfield3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material.OtherField3
     *
     * @param otherfield3 the value for jsh_material.OtherField3
     * @mbggenerated
     */
    public void setOtherfield3(String otherfield3) {
        this.otherfield3 = otherfield3 == null ? null : otherfield3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material.enableSerialNumber
     *
     * @return the value of jsh_material.enableSerialNumber
     * @mbggenerated
     */
    public String getEnableserialnumber() {
        return enableserialnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material.enableSerialNumber
     *
     * @param enableserialnumber the value for jsh_material.enableSerialNumber
     * @mbggenerated
     */
    public void setEnableserialnumber(String enableserialnumber) {
        this.enableserialnumber = enableserialnumber == null ? null : enableserialnumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material.tenant_id
     *
     * @return the value of jsh_material.tenant_id
     * @mbggenerated
     */
    public Long getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material.tenant_id
     *
     * @param tenantId the value for jsh_material.tenant_id
     * @mbggenerated
     */
    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_material.delete_Flag
     *
     * @return the value of jsh_material.delete_Flag
     * @mbggenerated
     */
    public String getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_material.delete_Flag
     *
     * @param deleteFlag the value for jsh_material.delete_Flag
     * @mbggenerated
     */
    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
    }
}