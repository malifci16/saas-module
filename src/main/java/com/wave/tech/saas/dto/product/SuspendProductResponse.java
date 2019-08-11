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
public class SuspendProductResponse {

    private int etisalatAccountNumber;
    private int productID;

    @JsonProperty("etisalat_account_number")
    public int getEtisalatAccountNumber() {
        return etisalatAccountNumber;
    }

    public void setEtisalatAccountNumber(int etisalatAccountNumber) {
        this.etisalatAccountNumber = etisalatAccountNumber;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

}
