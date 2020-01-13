package af.gov.anar.sms.infrastructure.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigLoader {

    @Value("${sms.database.schema}: sms")
    private static String DB_SCHEMA;
}
