package af.gov.anar.sms.infrastructure.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigLoader {


    private static String SMS_DB_SCHEMA;


    @Value("${sms.database.schema}: sms")
    public void setDatabaseSmsSchema (String schema) {
        SMS_DB_SCHEMA = schema;
    }
}
