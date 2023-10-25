package com.bangbangas;

/**
 * ClassName: NoLifeValueException
 * Package: com.bangbangas
 * Description:
 *
 * @Author 王少波
 * @Create 2023/10/9 17:37
 * @Version 1.0
 */
 class NoLifeValueException extends RuntimeException{
    public NoLifeValueException() {
    }

    public NoLifeValueException(String message) {
        super(message);
    }
}
