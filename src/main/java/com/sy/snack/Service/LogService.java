package com.sy.snack.Service;

import com.sy.snack.Controller.SwingLogController;
import com.sy.snack.Utils.L;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Administrator on 2017/10/13.
 */
public class LogService extends WindowAdapter implements ActionListener {
    private JButton theBtn;

    public LogService() {
        super();
    }

    public LogService(JButton theBtn) {
        this.theBtn = theBtn;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 按钮的 getText 方法返回按钮上显示的文字
        L.w("-------------------");
        if (theBtn.equals(SwingLogController.loginButton)) {
            String info = "你单击了按钮 : ";
            L.w("info:" + info);
            L.w("name" + SwingLogController.passwordLabel.getText());
            L.w("user" + SwingLogController.userLabel.getText());
            JOptionPane.showMessageDialog(null, info, "单击按钮提示框",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        if (theBtn.equals(SwingLogController.exitButton)) {
            System.exit(0);
        }

    }

    public void windowClosing(WindowEvent e) {
        super.windowClosing(e);
        L.w("===================");
        System.exit(0);
//加入动作
//
    }
}
