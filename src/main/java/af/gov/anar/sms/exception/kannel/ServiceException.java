package af.gov.anar.sms.exception.kannel;


import af.gov.anar.sms.exception.common.BaseCheckedException;

public class ServiceException extends BaseCheckedException {

    public ServiceException(String message) {
        super(message);
    }
}
