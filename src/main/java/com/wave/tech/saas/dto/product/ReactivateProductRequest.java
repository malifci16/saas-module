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
public class ReactivateProductRequest {

    private String etisalatAccountNumber;
    private String productID;

    @JsonProperty("etisalat_account_number")
    public String getEtisalatAccountNumber() {
        return etisalatAccountNumber;
    }

    public void setEtisalatAccountNumber(String etisalatAccountNumber) {
        this.etisalatAccountNumber = etisalatAccountNumber;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

}
