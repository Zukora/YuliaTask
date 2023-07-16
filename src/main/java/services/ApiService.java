package services;

import common.RequestType;
import requests.Request;
import response.Response;

public interface ApiService {
    String getResponse(Request request, String url);
}
