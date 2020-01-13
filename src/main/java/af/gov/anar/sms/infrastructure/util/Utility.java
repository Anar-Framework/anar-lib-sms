package af.gov.anar.sms.infrastructure.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Utility {

    private static final Logger LOGGER = LoggerFactory.getLogger(Utility.class);

    public static String[] parseResponse(String response) {
        LOGGER.info("Request parse response:{}", response);
        String [] parseResponse = new String[2];
        String status = response.substring(0, 1);
        String statusMessage=response.substring(3, response.length());
        parseResponse[0]=status;
        parseResponse[1]=statusMessage;
        LOGGER.info("Response after status:{} message:{}", status, statusMessage);
        return parseResponse;
    }
}