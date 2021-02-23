package sungryuleom.core;

/**
 * HTTP 상태 코드에 대한 설명
 */
public enum ResultCode {
    SUCCESS(200),//성공
    FAIL(400),//실패
    UNAUTHORIZED(401),//서명오류
    NOT_FOUND(404),//인터페이스가 존재하지 않습니다.
    INTERNAL_SERVER_ERROR(500);//서버 내부 오류
	
    private final int code;

    ResultCode(int code) {
        this.code = code;
    }

    public int code() {
        return code;
    }
}
