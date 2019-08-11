package com.wave.tech.saas.controller;

import com.wave.tech.saas.defines.ApiEndPoints;
import com.wave.tech.saas.dto.EtisalatSassServiceObjectResponse;
import com.wave.tech.saas.dto.product.CreateProductRequest;
import com.wave.tech.saas.dto.product.CreateProductResponse;
import com.wave.tech.saas.dto.product.ReactivateProductRequest;
import com.wave.tech.saas.dto.product.ReactivateProductResponse;
import com.wave.tech.saas.dto.product.SuspendProductRequest;
import com.wave.tech.saas.dto.product.SuspendProductResponse;
import com.wave.tech.saas.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mohamed.abdelsalam
 */
@RestController
@RequestMapping(ApiEndPoints.PRODUCT_CONTROLLER.CONTROLLER_NAME)
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping(ApiEndPoints.PRODUCT_CONTROLLER.CREATE)
    public EtisalatSassServiceObjectResponse<CreateProductResponse>
            createProduct(@RequestBody CreateProductRequest createProductRequest) throws Exception {
        return this.productService.createProduct(createProductRequest);
    }

    @PostMapping(ApiEndPoints.PRODUCT_CONTROLLER.SUSPEND)
    public EtisalatSassServiceObjectResponse<SuspendProductResponse>
            suspendProduct(@RequestBody SuspendProductRequest suspendProductRequest) throws Exception {
        return this.productService.suspendProduct(suspendProductRequest);
    }

    @PostMapping(ApiEndPoints.PRODUCT_CONTROLLER.REACTIVATE)
    public EtisalatSassServiceObjectResponse<ReactivateProductResponse>
            reactivateAccount(@RequestBody ReactivateProductRequest reactivateAccountRequest) throws Exception {
        return this.productService.reactivateProduct(reactivateAccountRequest);
    }

}
