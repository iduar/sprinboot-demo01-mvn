package mx.com.raudi.sprinboootdemo01mvn.controller;

public class ResponseDatailsApi {

    private String path;
    private String version;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public static ResponseDatailsApi createInstance(){

        ResponseDatailsApi responseDatailsApi  = new ResponseDatailsApi();

        responseDatailsApi.setPath("api");
        responseDatailsApi.setVersion("2.0");

        return  responseDatailsApi;
    }
}
