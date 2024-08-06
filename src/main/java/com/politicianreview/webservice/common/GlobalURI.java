package com.politicianreview.webservice.common;

public class GlobalURI {

    public static final String REDIRECT = "redirect:";

    public static final String ROOT_URI = "/";


    /*
     * error
     */
    public static final String ERROR_URI_ROOT = ROOT_URI + "error";
    public static final String ERROR_URI_403 = ERROR_URI_ROOT + "/403";
    public static final String ERROR_URI_404 = ERROR_URI_ROOT + "/404";
    public static final String ERROR_URI_500 = ERROR_URI_ROOT + "/500";
    public static final String ERROR_URI_ETC = ERROR_URI_ROOT + "/error";
}
