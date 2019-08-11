package com.wave.tech.saas.dto;

import java.util.List;
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
public class EtisalatSassServiceListResponse<T> {

    private List<T> data;

}
