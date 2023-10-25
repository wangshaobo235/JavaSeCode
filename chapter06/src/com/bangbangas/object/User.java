package com.bangbangas.object;

/**
 * ClassName: User
 * Package: com.bangbangas.object
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/5 10:01
 * @Version 1.0
 */
public class User {
    String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login(String name, String password){
        if(username.equals(name)&&password.equals(password)){
            System.out.println("登录成功：欢迎你，" + name);
        }else{
            System.out.println("登陆失败：用户名或密码错误");
        }
    }
}
