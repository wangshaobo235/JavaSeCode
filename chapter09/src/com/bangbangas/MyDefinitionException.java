package com.bangbangas;

/**
 * ClassName: MyDefinitionException
 * Package: com.bangbangas
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/15 16:10
 * @Version 1.0
 */
public class MyDefinitionException extends RuntimeException{
  static final long serialVersionUID =16993124229948L;

    public MyDefinitionException() {
    }

    public MyDefinitionException(String message) {
        super(message);
    }
}
