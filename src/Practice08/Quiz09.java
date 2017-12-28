package Practice08;

class UnsupportedOperationException extends RuntimeException {
    private final int ERR_CODE = 100;

    UnsupportedOperationException(String msg, int error) {
        super(msg);
    }

    public int getErrorCode() {
        return ERR_CODE;
    }

    @Override
    public String getMessage() {
        return "["+getErrorCode()+"]"+super.getMessage();
    }
}

public class Quiz09 {
    public static void main(String[] args) throws Exception{
        throw new UnsupportedOperationException("지원하지 않는 기능입니다.",100);
    }
}
