package af.gov.anar.sms.infrastructure.exception.kannel;


import af.gov.anar.sms.infrastructure.exception.common.BaseCheckedException;

public class ServiceException extends BaseCheckedException {

    public ServiceException(String message) {
        super(message);
    }
}
