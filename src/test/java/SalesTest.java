import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import requests.SaleRequest;
import response.SaleResponse;
import services.CurlService;
import services.SalesApiServiceImpl;

public class SalesTest {
    private static final String URL = "localhost:8080";
    private static final String REQUEST = "client=1;card=2";

    @Test
    public void testSalesApi() {
        //call api
        //maneger
            SaleRequest request = new SaleRequest();
            ///
        request.init(REQUEST);
        SalesApiServiceImpl service = new SalesApiServiceImpl();
        String response = service.getResponse(request, URL);
        Assertions.assertEquals(response, CurlService.CURL_RESPONSE.concat(REQUEST));
        //apply response
        SaleResponse saleResponse = new SaleResponse();
        saleResponse.applyResponse(response);
        Assertions.assertEquals(saleResponse.getMyField(), CurlService.CURL_RESPONSE.concat(REQUEST));
    }
}
