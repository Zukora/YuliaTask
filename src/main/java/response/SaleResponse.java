package response;

public class SaleResponse implements Response {

    private String myField;


    @Override
    public void applyResponse(String apiResponse) {
        //todo analyse API response
        myField = apiResponse;
    }
    public String getMyField() {
        return myField;
    }

    public void setMyField(String myField) {
        this.myField = myField;
    }

}
