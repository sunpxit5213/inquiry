package com.ds.test.common;

import com.melloware.jintellitype.HotkeyListener;
import com.melloware.jintellitype.JIntellitype;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

//创建全局快捷键
public class CreateGHKDemo extends JFrame implements ActionListener {
    private JButton jb1, jb4;
    // 快捷键1,2,3个
    private static final int GLOBAL_HOT_KEY_1 = 0;

    private final String ADD_DOWN_END_EVENT_TIP = "监听按下Enter右键翻页";
    private final String RM_DOWN_END_EVENT_TIP = "删除按下Enter右键翻页";

    //模拟发送键盘输入
    private Robot robot = new Robot();

    // 初始化
    private CreateGHKDemo() throws AWTException {
        init();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                new CreateGHKDemo();
            } catch (AWTException e) {
                e.printStackTrace();
            }
        });
    }

    // 初始化
    private void init() {
        JPanel jp1 = new JPanel();
        jp1.setLayout(null);
        jb1 = new JButton(ADD_DOWN_END_EVENT_TIP);
        jb1.setBounds(20, 20, 260, 30);
        jb1.addActionListener(this);
        jp1.add(jb1);

        jb4 = new JButton(RM_DOWN_END_EVENT_TIP);
        jb4.setBounds(20, 140, 260, 30);
        jb4.addActionListener(this);
        jp1.add(jb4);

        // 添加热键监听器
        // 第二步：添加热键监听器
        JIntellitype.getInstance().addHotKeyListener(new HotkeyListener() {
            public void onHotKey(int markCode) {
                switch (markCode) {
                    case GLOBAL_HOT_KEY_1:
                        //监听到按键触发
                        robot.keyPress(KeyEvent.VK_RIGHT);
                        robot.keyRelease(KeyEvent.VK_RIGHT);

                        for (int i = 0; i < 6; i++) {
                            robot.keyPress(KeyEvent.VK_DOWN);
                            robot.keyRelease(KeyEvent.VK_DOWN);
                        }
//                        JOptionPane.showMessageDialog(null, "监听到了End右键翻页", "提示消息", JOptionPane.WARNING_MESSAGE);
                        break;
                }
            }
        });

        this.add(jp1);
        this.setTitle("注册全局快捷键");
        this.setSize(310, 310);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // 事件监听
    @Override
    public void actionPerformed(ActionEvent e) {
        // 监听注册全局快捷键
        if (e.getSource().equals(jb1)) {
            // 第一步：注册热键，13对应Enter
            JIntellitype.getInstance().registerHotKey(GLOBAL_HOT_KEY_1, 0, 13);
            JOptionPane.showMessageDialog(null, "恭喜注册成功:" + ADD_DOWN_END_EVENT_TIP,
                    "提示消息", JOptionPane.WARNING_MESSAGE);
        }
        // 监听删除全局快捷键
        if (e.getSource().equals(jb4)) {
            JIntellitype.getInstance().unregisterHotKey(GLOBAL_HOT_KEY_1);
            JOptionPane.showMessageDialog(null, "恭喜移除成功:" + RM_DOWN_END_EVENT_TIP,
                    "提示消息", JOptionPane.WARNING_MESSAGE);
        }
    }

}
