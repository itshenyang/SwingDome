package com.sy.snack;

import com.sy.snack.Controller.SwingLog;

import javax.swing.*;

/**
 * Created by Administrator on 2017/10/12.
 */
public class App {
    public static void main(String[] args) {
        // 创建 JFrame 实例
        JFrame frame = new JFrame("Login Example");
        // Setting the width and height of frame
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* 创建面板，这个类似于 HTML 的 div 标签
         * 我们可以创建多个面板并在 JFrame 中指定位置
         * 面板中我们可以添加文本字段，按钮及其他组件。
         */
        JPanel panel = new JPanel();
        // 添加面板
        frame.add(panel);
        /*
         * 调用用户定义的方法并添加组件到面板
         */
        SwingLog.placeComponents(panel);

        // 设置界面可见
        frame.setVisible(true);
    }
}
