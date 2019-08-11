package com.wave.tech.saas.dto.billing;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 *
 * @author mohamed.abdelsalam
 */
@NoArgsConstructor
@AllArgsConstructor
public class GetBillingInfoResponse {

    private String accountID;
    private String productID;
    private String etisalatAccountNumber;
    private String planID;
    private String planName;
    private String tycDate;
    private String running;

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    @JsonProperty("etisalat_account_number")
    public String getEtisalatAccountNumber() {
        return etisalatAccountNumber;
    }

    public void setEtisalatAccountNumber(String etisalatAccountNumber) {
        this.etisalatAccountNumber = etisalatAccountNumber;
    }

    public String getPlanID() {
        return planID;
    }

    public void setPlanID(String planID) {
        this.planID = planID;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    @JsonProperty("tyc_date")
    public String getTycDate() {
        return tycDate;
    }

    public void setTycDate(String tycDate) {
        this.tycDate = tycDate;
    }

    public String getRunning() {
        return running;
    }

    public void setRunning(String running) {
        this.running = running;
    }

}
