package services;

import common.RequestType;
import requests.SaleRequest;

public class CurlService {
    public static final String CURL_RESPONSE =  "json response";
    public static String callJsonRequest(RequestType requestType, String request, String url) {
        //todo implement real HTTP request
        return CURL_RESPONSE.concat(request);
    }
}
