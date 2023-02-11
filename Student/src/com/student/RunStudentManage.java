package com.student;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RunStudentManage {

    public static void main(String[] args) {

        ArrayList<UserLogin> userList = new ArrayList<>();
        ArrayList<Student> arrayList = new ArrayList<>();

        System.out.println("---欢迎来到学生管理系统---");
        System.out.println("请选择操作：1.登录 2.注册 3.忘记密码");

        Scanner userChoice = new Scanner(System.in);

        UserLogin backFlag = new UserLogin();
        userList.add(backFlag);

        int choice = userChoice.nextInt();

        switch (choice) {
            case 1:
                userLogin(userList);
                break;
            case 2:
                userRegister(userList);
                break;
            case 3:
                forgetPassword(userList);
                break;
            default:
                System.out.println("输入错误，请重新输入");
                main(args);
                break;
        }

        Student flag = new Student();
        arrayList.add(flag);

        System.out.println("---学生管理系统---");
        System.out.println("1.添加学生");
        System.out.println("2.删除学生");
        System.out.println("3.修改学生");
        System.out.println("4.查询学生");
        System.out.println("5.退出");

        int ChoiceNum = userChoice.nextInt();
        while (true) {
            switch (ChoiceNum) {
                case 1:
                    addStudent(arrayList);
                    ChoiceNum = 0;
                    break;
                case 2:
                    delStudent(arrayList);
                    ChoiceNum = 0;
                    break;
                case 3:
                    modifyStudent(arrayList);
                    ChoiceNum = 0;
                    break;
                case 4:
                    findStudent(arrayList);
                    ChoiceNum = 0;
                    break;
                case 0:
                    main(args);
                    break;
                default:
                    System.out.println("系统已关闭，感谢使用");
                    System.exit(0);
                    break;
            }
        }
    }

    /**
     * 该方法用于增加新学生
     *
     * @param arrayList 该变量为传入的集合空间
     */
    public static void addStudent(ArrayList<Student> arrayList) {

        Scanner userInputInformation = new Scanner(System.in);

        System.out.println("输入学生ID");
        int inputID = userInputInformation.nextInt();
        boolean flag = false;
        for (int i = 0; i < arrayList.size(); i++) {
            Student temp = arrayList.get(i);
            if (temp.getID() == inputID) {
                flag = false;
            } else {
                flag = true;
            }
            break;
        }
        if (flag) {
            System.out.println("输入学生姓名");
            String inputName = userInputInformation.next();
            System.out.println("输入学生年龄");
            int inputAge = userInputInformation.nextInt();
            System.out.println("输入学生住址");
            String inputAddress = userInputInformation.next();

            Student student = new Student(inputName, inputID, inputAge, inputAddress);
            arrayList.add(student);
            System.out.println("添加学生成功");

            return;
        } else {
            System.out.println("该学生已再系统内，请确认是否输入错误");
        }

    }

    /**
     * 该方法用于删除学生
     *
     * @param arrayList 该变量为传入的集合空间
     */
    public static void delStudent(ArrayList<Student> arrayList) {
        System.out.println("请输入要删除的学生ID");
        Scanner userInput = new Scanner(System.in);
        int inputID = userInput.nextInt();
        int index = -1;
        for (int i = 2; i < arrayList.size(); i++) {
            Student arrayOut = arrayList.get(i);
            if (inputID == arrayOut.getID()) {
                index = i;
            } else {
                System.out.println("找不到该学生");
            }
        }
        String inputDecide = null;
        if (index == -1) {
            System.out.println("是否继续删除？若要继续，输入“YES”，若要退出，输入“NO”");
            inputDecide = userInput.nextLine();
            if (inputDecide.equals("YSE")) {
                delStudent(arrayList);
            } else {
                System.out.println("输入信息有误，返回主界面");
                return;
            }
        } else {
            arrayList.remove(index);
            return;
        }
    }

    /**
     * 该方法用于修改学生信息
     *
     * @param arrayList 该变量为传入的数组空间
     */
    public static void modifyStudent(ArrayList<Student> arrayList) {
        System.out.println("输入要修改的学生ID");
        Scanner userInput = new Scanner(System.in);
        int inputID = userInput.nextInt();
        int index = -1;

        for (int i = 0; i < arrayList.size(); i++) {
            Student stu = arrayList.get(i);
            if (inputID == stu.getID()) {
                index = i;
            } else {
                System.out.println("找不到该学生，请重新输入！");
            }
        }

        if (index == -1) {
            modifyStudent(arrayList);
        } else {
            Student student = arrayList.get(index);
            System.out.println("请输入要修改的信息(输入所对应的序号):");
            System.out.println("1.姓名");
            System.out.println("2.住址");
            int Choice = userInput.nextInt();
            switch (Choice) {
                case 1:
                    System.out.println("输入新姓名:");
                    student.setName(userInput.nextLine());
                    System.out.println("再次输入新姓名确认:");
                    String newName = userInput.nextLine();
                    if (newName.equals(student.getName())) {
                        System.out.println("修改成功！即将返回主界面");
                    } else {
                        System.out.println("修改失败！二次输入不一致！请重新输入！");
                        modifyStudent(arrayList);
                    }
                    break;

                case 2:
                    System.out.println("输入新住址:");
                    student.setLocate(userInput.nextLine());
                    System.out.println("再次输入新住址确认:");
                    String newAddress = userInput.nextLine();
                    if (newAddress.equals(student.getLocate())) {
                        System.out.println("修改成功！即将返回主界面！");
                    } else {
                        System.out.println("修改失败！二次输入不一致！请重新输入！");
                        modifyStudent(arrayList);
                    }
                    break;

                default:
                    System.out.println("输入有误！请重新输入！");
                    modifyStudent(arrayList);
            }
        }
    }

    /**
     * 该方法用于查照学生
     *
     * @param arrayList 该方法为传入的集合空间
     */
    public static void findStudent(ArrayList<Student> arrayList) {
        System.out.println("请输入要查找的学生学号:");
        Scanner userInput = new Scanner(System.in);
        int inputID = userInput.nextInt();

        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            if (inputID == student.getID()) {
                System.out.println(student);
                break;
            } else {
                System.out.println("未找到该学生！请重新输入！");
                findStudent(arrayList);
            }
        }
    }

    /**
     * 该方法用于用户登录
     *
     * @param userList 该参数用于传入集合空间
     */
    public static void userLogin(ArrayList<UserLogin> userList) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("请输入用户名：");
        String userInputName = userInput.nextLine();
        System.out.println("请输入密码：");
        String userInputPassword = userInput.nextLine();

        for (int i = 0; i < userList.size(); i++) {
            if (userInputName.equals(userList.get(i).getUserName()) && userInputPassword.equals(userList.get(i).getUserPassword())) {
                System.out.println("登录成功！");
            } else {
                System.out.println("用户名或密码错误！请重新登录！");
                userLogin(userList);
            }
        }
    }

    /**
     * 该方法用于用户注册
     *
     * @param userList 该参数为传入的集合空间
     */
    public static void userRegister(ArrayList<UserLogin> userList) {
        System.out.println("请设置用户名：");

        Scanner userInput = new Scanner(System.in);
        String userSetName = "";
        if (userInput.hasNextInt() && userInput.hasNext()) {
            if (userInput.next().length() <= 15 && userInput.next().length() >= 3) {
                userSetName = userInput.nextLine();
            } else {
                System.out.println("输入不合法！请重新输入！");
                userRegister(userList);
            }
        }
        String nameCheck = userInput.nextLine();
        if (userSetName.equals(nameCheck)) {
            for (int i = 0; i < userList.size(); i++) {
                if (userSetName.equals(userList.get(i).getUserName())) {
                    System.out.println("已存在该用户，注册失败！");
                    System.exit(0);
                } else {
                    System.out.println("用户名设置成功！");
                }
            }
        }

        String setPhoneNumberTemp = "";
        out:
        do {
            System.out.println("设置手机号：");
            String userSetPhoneNumber = userInput.nextLine();
            if (userInput.hasNextInt()) {
                if (userSetPhoneNumber.length() <= 11 && userSetPhoneNumber.length() > 0) {
                    if (userSetPhoneNumber.charAt(0) != 0) {
                        System.out.println("手机号设置成功！");
                        setPhoneNumberTemp = userSetPhoneNumber;
                    } else {
                        System.out.println("输入错误！请重新设置手机号");
                        break out;
                    }

                }
            }
        } while (true);

        String passwordTemp = "12345";
        outer:
        do {
            System.out.println("请设置密码：");
            String userSetPassword = userInput.nextLine();
            System.out.println("请再次输入密码：");
            String userSetPasswordCheck = userInput.nextLine();
            if (userSetPassword.equals(userSetPasswordCheck)) {
                System.out.println("注册成功！");
                passwordTemp = userSetPassword;
                break;
            } else {
                System.out.println("注册失败！输入密码不一致，请重新输入！");
                break outer;
            }
        } while (true);
        UserLogin user = new UserLogin();
        user.setUserName(userSetName);
        user.setUserPhoneNumber(setPhoneNumberTemp);
        user.setUserPassword(passwordTemp);
        userList.add(user);
    }

    public static void forgetPassword(ArrayList<UserLogin> userList) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("请输入手机号：");
        String userInputPhoneNumber = userInput.nextLine();
        for (int i = 0; i < userList.size(); i++) {
            if (userInputPhoneNumber.equals(userList.get(i).getUserPhoneNumber())) {

                String randomCode = getRandomString(4);
                System.out.println("请输入验证码：");
                System.out.println(randomCode);
                String userInputCode = userInput.nextLine();

                if (userInputCode.equals(randomCode)) {

                    System.out.println("请输入新密码：");
                    String newPassword = userInput.nextLine();
                    System.out.println("请再次输入密码：");
                    String newPasswordCheck = userInput.nextLine();

                    if (newPassword.equals(newPasswordCheck)) {
                        userList.get(i).setUserPassword(newPassword);
                        System.out.println("密码已修改！");
                    }
                }
            } else {
                System.out.println("手机号输入错误，请重新输入！");
                forgetPassword(userList);
                break;
            }
        }
    }

    /**
     * 该方法用于生成一段随机的字符串
     *
     * @param length 该参数用于设置生成的字符串的长度
     * @return 返回值为生成结果
     */
    public static String getRandomString(int length) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }
}