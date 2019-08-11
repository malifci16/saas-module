package com.wave.tech.saas.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author mohamed.abdelsalam
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EtisalatSassServiceObjectResponse<T> {

    private T data;

}
