package services;

import common.RequestType;
import requests.Request;
import requests.SaleRequest;
import response.Response;

public class SalesApiServiceImpl  implements ApiService{
    @Override
    public String getResponse(Request request, String url) {
        return CurlService.callJsonRequest(RequestType.POST, request.getRequestString(),url);
    }
}
