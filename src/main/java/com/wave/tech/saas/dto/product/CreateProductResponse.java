package com.wave.tech.saas.dto.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 *
 * @author mohamed.abdelsalam
 */
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductResponse {

    private int accountID;
    private int productID;
    private int productRequested;
    private int etisalatAccountNumber;

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    @JsonProperty("product requested")
    public int getProductRequested() {
        return productRequested;
    }

    public void setProductRequested(int productRequested) {
        this.productRequested = productRequested;
    }

    @JsonProperty("etisalat_account_number")
    public int getEtisalatAccountNumber() {
        return etisalatAccountNumber;
    }

    public void setEtisalatAccountNumber(int etisalatAccountNumber) {
        this.etisalatAccountNumber = etisalatAccountNumber;
    }

}
