package requests;

public class SaleRequest implements Request {
    private String field1;
    private String action;
    @Override
    public void init(String initString) {
        //todo init fields by string
        action = "SALE";
        field1 = initString;
    }

    @Override
    public String getRequestString() {
        //todo build request
        return field1;
    }
}
