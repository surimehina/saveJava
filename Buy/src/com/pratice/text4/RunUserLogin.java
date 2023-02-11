package com.pratice.text4;

import java.util.Scanner;

public class RunUserLogin {
    public static int MAX_USER_LOGIN = 3;   // 该变量用于main中限制reLogin方法的调用次数

    public static void main(String[] args) {
        UserInformation LiHua = new UserInformation("LiHUa", "12345");
        String oriUsername = LiHua.getUserName();
        String oriUserPassword = LiHua.getUserPassword();

        // 承接isUser返回结果，判断是否需要重新登录
        boolean result = isUser(oriUsername, oriUserPassword);
        if (result) {
            System.out.println("登录成功！");
        } else {

            // 限制重新登录次数
            if (MAX_USER_LOGIN > 0)
            {
                System.out.println(reLogin(oriUsername, oriUserPassword));
            } else {
                System.out.println("登录失败，次数已用尽！");
            }
        }
    }

    /**
     * 该方法用于判断用户输入的用户名与密码是否正确
     * @param oriUserName 用户设置的原始用户名
     * @param oriUserPassword 用户设置的原始密码
     * @return 用户输入的用户名和密码是否正确
     */
   public static boolean isUser(String oriUserName, String oriUserPassword) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("请输入用户名");
        String userInputName = userInput.nextLine();
        System.out.println("请输入密码");
        String userInputPassword = userInput.nextLine();

        return userInputName.equals(oriUserName) && userInputPassword.equals(oriUserPassword);
    }

    /**
     * 该方法用于用户重新输入用户名与密码，并对输入的用户名与密码再次进行正误判断
     * @param oriUserName 该变量为用户设置的原始用户名
     * @param oriUserPassword 该变量为用户设置的原始密码
     * @return 返回值为重新的登录结果
     */
    public static String reLogin(String oriUserName, String oriUserPassword) {
        System.out.println("用户名或密码错误，请重新输入！");
        Scanner userInput = new Scanner(System.in);

        System.out.println("请输入用户名");
        String userInputName = userInput.nextLine();
        System.out.println("请输入密码");
        String userInputPassword = userInput.nextLine();

        // 判断用户重新输入结果是否正确
        for (int i = 0; i < 3; i++) {
            if (userInputName.equals(oriUserName) && userInputPassword.equals(oriUserPassword)) {
                return "登入成功";
            }
        }

        MAX_USER_LOGIN--;   // 记录用户重新输入次数
        if (MAX_USER_LOGIN > 0) {
            System.out.println("用户名或密码错误，请重新登入（还剩" + MAX_USER_LOGIN + "次）");
            return reLogin(oriUserName, oriUserPassword);
        } else {
            return "登入失败";
        }
    }
}
