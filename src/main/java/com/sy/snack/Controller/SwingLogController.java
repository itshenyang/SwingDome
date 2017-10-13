package com.sy.snack.Controller;


import com.sy.snack.Service.LogService;
import com.sy.snack.Utils.L;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Administrator on 2017/10/12.
 */
public class SwingLogController {

    public static int width=350,height=200;

    public static JButton loginButton, exitButton;

    public static JPasswordField passwordText;

    public static JTextField userText;

    public static JLabel passwordLabel, userLabel;

    public static JFrame frame;

    public static JPanel panel;

    public static void placeComponents(JPanel panel) {

        /* 布局部分我们这边不多做介绍
         * 这边设置布局为 null
         */
        panel.setLayout(null);

        // 创建 JLabel
        userLabel = new JLabel("User:");
        /* 这个方法定义了组件的位置。
         * setBounds(x, y, width, height)
         * x 和 y 指定左上角的新位置，由 width 和 height 指定新的大小。
         */
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        /*
         * 创建文本域用于用户输入
         */
        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        // 输入密码的文本域
        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        /*
         *这个类似用于输入的文本域
         * 但是输入的信息会以点号代替，用于包含密码的安全性
         */
        passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        // 创建登录按钮
        loginButton = new JButton("login");
        loginButton.setBounds(30, 80, 80, 25);
        panel.add(loginButton);
        loginButton.addActionListener(new LogService(loginButton));


        // 创建退出按钮
        exitButton = new JButton("exit");
        exitButton.setBounds(150, 80, 80, 25);
        panel.add(exitButton);
        exitButton.addActionListener(new LogService(exitButton));

    }

    public static void mian() {
         frame = new JFrame("Login Example");
        // Setting the width and height of frame
        frame.setSize(width, height);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addWindowListener(new LogService());

        /* 创建面板，这个类似于 HTML 的 div 标签
         * 我们可以创建多个面板并在 JFrame 中指定位置
         * 面板中我们可以添加文本字段，按钮及其他组件。
         */
         panel = new JPanel();
        // 添加面板
        frame.add(panel);
        /*
         * 调用用户定义的方法并添加组件到面板
         */
        SwingLogController.placeComponents(panel);

        // 设置界面可见
        frame.setVisible(true);
    }


}
