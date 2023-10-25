package com.bangbangas.decision;

/**
 * ClassName: BookTest
 * Package: com.bangbangas.decision
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/5 15:48
 * @Version 1.0
 */
public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        book.setBookname("java");
        book.setAuthor("sgg");
        book.setPrice(180.0);
        book.showInfo();
    }
}
