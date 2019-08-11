package com.wave.tech.saas.dto.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 *
 * @author mohamed.abdelsalam
 */
@AllArgsConstructor
@NoArgsConstructor
public class SuspendAccountResponse {

    private int accountID;
    private int etisalatAccountNumber;

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    @JsonProperty("etisalat_account_number")
    public int getEtisalatAccountNumber() {
        return etisalatAccountNumber;
    }

    public void setEtisalatAccountNumber(int etisalatAccountNumber) {
        this.etisalatAccountNumber = etisalatAccountNumber;
    }

}
