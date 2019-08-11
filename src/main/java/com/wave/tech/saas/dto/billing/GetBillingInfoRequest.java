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
public class GetBillingInfoRequest {

    private String etisalatAccountNumber;

    @JsonProperty("etisalat_account_number")
    public String getEtisalatAccountNumber() {
        return etisalatAccountNumber;
    }

    public void setEtisalatAccountNumber(String etisalatAccountNumber) {
        this.etisalatAccountNumber = etisalatAccountNumber;
    }

}
