package com.wave.tech.saas.defines;

/**
 *
 * @author mohamed.abdelsalam
 */
public class ApiEndPoints {

    public static final class BILLING_CONTROLLER {

        public static final String CONTROLLER_NAME = "/api/billing";
        public static final String GET_INFO = "/getInfo";
    }

    public static final class ACCOUNT_CONTROLLER {

        public static final String CONTROLLER_NAME = "/api/account";
        public static final String CREATE = "/create";
        public static final String SUSPEND = "/suspend";
    }

    public static final class PRODUCT_CONTROLLER {

        public static final String CONTROLLER_NAME = "/api/product";
        public static final String CREATE = "/create";
        public static final String SUSPEND = "/suspend";
        public static final String REACTIVATE = "/reactivate";
    }

}
