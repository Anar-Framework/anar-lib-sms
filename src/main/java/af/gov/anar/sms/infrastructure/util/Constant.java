package af.gov.anar.sms.infrastructure.util;

import java.util.HashMap;


public class Constant {

//    :::::::::::::::::::::::::::::::::: SCHEMA Params ::::::::::::::::::::::::::::::
    public static  final String SERVICE_SCHEMA = "sms";

    public static String BASE_URL = "http://localhost:13013/cgi-bin/sendsms?";
    public static String USERNAME = "badar";
    public static String PASSWORD = "tester";

    public static String createUrl(HashMap<String, String> parameter) {
        StringBuilder url = new StringBuilder(BASE_URL);
        url.append("username=").append(USERNAME)
                .append("&password=").append(PASSWORD);
        parameter.keySet().forEach((param) -> {
            url.append("&").append(param).append("=").append(parameter.get(param));
        });
        return url.toString();
    }
}