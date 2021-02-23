package sungryuleom.core;

/**
 * 서비스 (비즈니스)가 비정상입니다 (예 : "계정 또는 비밀번호 오류"). 예외는 INFO 레벨 로깅입니다. @see WebMvcConfigurer
 */
public class ServiceException extends RuntimeException {
    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
